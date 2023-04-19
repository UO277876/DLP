package codegenerator;

import ast.Statement;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.types.FunctionType;
import ast.types.RecordField;
import ast.types.RecordType;
import semantic.AbstractVisitor;

public class OffSetVisitor extends AbstractVisitor<Integer, Integer> {

    private int bytesGlobalSum=0; // Para las variables globales, se usa un parámetro global en el Visitor

    @Override
    public Integer visit(RecordType rt, Integer params) {
        // Para el sumatorio de todos los campos que lo componen
        int bytesFieldsSum = 0;

        for (RecordField rf : rt.getFields()) {
            bytesFieldsSum = params + rf.accept(this, bytesFieldsSum);
        }

        return null;
    }

    @Override
    public Integer visit(RecordField rf, Integer params) {
        rf.getType().accept(this, params);
        rf.setOffset(params); // El offset de los recordFields anteriores
        return rf.getType().numberOfBytes(); // Se devuelve el actual
    }


    @Override
    public Integer visit(VarDefinition vd, Integer params) {
        super.visit(vd, params);

        if (vd.getScope() == 0) {
            // Para las variables globales que empiezan en 0, no devuelve nada porque se queda en al variable
            // del Visitor
            vd.setOffset(bytesGlobalSum);
            bytesGlobalSum += vd.getType().numberOfBytes();
        } else {
                Integer offset = null;
                if(vd.getScope() == 1){
                    if (params > 0) { // porque es positivo
                        // Es un paramentro
                        vd.setOffset(params);
                        offset = params + vd.getType().numberOfBytes();
                    } else {
                        // Es una variable local, tiene que ir en NEGATIVO
                        offset = params - vd.getType().numberOfBytes();
                        vd.setOffset(offset);
                    }
                    return offset;
                }
        }

        return null;
    }

    @Override
    public Integer visit(FunctionType ft, Integer params) {
        // BP + Sumatorio de los parámetros posteriores declarados (parámetros a su derecha)
        // El primer parámetro declarado despues de la suma de 4 es el ÚLTIMO parámetro declarado
        ft.getReturnType().accept(this, params);
        int paramsBytesSum = 0;
        for (int i = ft.getParameters().size() - 1; i >= 0; i--) {
            VarDefinition vardef = ft.getParameters().get(i);
            vardef.setOffset(4+paramsBytesSum);
            paramsBytesSum += vardef.getType().numberOfBytes();
        }

        return paramsBytesSum;
    }

    @Override
    public Integer visit(FuncDefinition fd, Integer params) {
        fd.getType().accept(this, 4); // Hay que cambiar el ámbito

        int sumBytesScope = 0;
        Integer localVarBytes = null;

        for (VarDefinition vf :fd.getVarDefinitions()) { // VARIABLES LOCALES: BP - sumatorio variables anteriores (y ella misma)
            localVarBytes = vf.accept(this, sumBytesScope);
            if (localVarBytes != null) // En caso de que sean sentencias
                sumBytesScope = localVarBytes;
        }

        //fd.setBytesParams(sumBytesScope);
        return null;
    }

}
