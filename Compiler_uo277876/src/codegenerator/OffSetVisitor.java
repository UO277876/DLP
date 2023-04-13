package codegenerator;

import ast.Statement;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.types.FunctionType;
import ast.types.RecordField;
import ast.types.RecordType;
import semantic.AbstractVisitor;

public class OffSetVisitor extends AbstractVisitor<Integer, Integer> {

    private int globalVarOffset=0; // Para las variables globales, se usa un parámetro global en el Visitor

    @Override
    public Integer visit(RecordField rf, Integer params) {
        rf.getType().accept(this, params);
        rf.setOffset(params);
        return rf.getOffset() + rf.getType().numberOfBytes();
    }

    @Override
    public Integer visit(RecordType rt, Integer params) {
        // El offset es el sumatorio de todos los campos anteriores
        int offset = 0;

        for (RecordField f : rt.getFields()) {
            offset = f.accept(this, offset);
        }

        return null;
    }

    @Override
    public Integer visit(VarDefinition vd, Integer params) {
        super.visit(vd, params);

        if (vd.getScope() == 0) {
            // Para las variables globales que empiezan en 0
            vd.setOffset(globalVarOffset);
            globalVarOffset += params.getType().numberOfBytes();
            return null;
        } else {
            if (vd.getScope() == 1) {
                Integer i = null;
                if (params > 0) {
                    // Es paramentro
                    vd.setOffset(params);
                    i = params + vd.getType().numberOfBytes();
                } else {
                    // Es local
                    i = params - vd.getType().numberOfBytes();
                    vd.setOffset(i);
                }
                return i;
            }
        }

        return null;
    }

    @Override
    public Integer visit(FuncDefinition fd, Integer params) {
        int sumBytesScope = 4;
        fd.setParamsBytes(fd.getType().accept(this, sumBytesScope));
        sumBytesScope = 0;
        Integer bytesLocalVars = null;
        for (Statement s :fd.getStatements()) { // VARIABLES LOCALES: BP - sumatorio variables anteriores (y ella misma)
            bytesLocalVars = s.accept(this, sumBytesScope);
            if (bytesLocalVars != null) // En caso de que sean sentencias
                sumBytesScope = bytesLocalVars;
        }


        params.setLocalVariablesBytes(sumBytesScope);

        return null;
    }

    @Override
    public Integer visit(FunctionType ft, Integer params) {
        // BP + Sumatorio de los parámetros posteriores declarados (parámetros a su derecha)
        ft.getReturnType().accept(this, params);
        for (int i = ft.getParameters().size() - 1; i >= 0; i--) {
            params = ft.getParameters().get(i).accept(this, params);
        }

        return params-4;
    }

}
