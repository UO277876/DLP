package codegenerator;

import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.types.FunctionType;
import ast.types.RecordType;
import semantic.AbstractVisitor;

public class OffSetVisitor extends AbstractVisitor<Integer, Integer> {

    // Para las variables globales se usa un parámetro global en el Visitor
    private int sumBytesGlVar = 0;

    @Override
    public Integer visit(RecordType rt, Integer params) {
        super.visit(rt, params);
        // Opción 1 (implementada): Iterar desde el nodo principal cambiando el offset de los RecordField
        // Opción 2: En los nodos secundarios de RecordField modificar una variable
        // pasada como parametro en el Visitor
        rt.actualizeOffset();

        return null;
    }


    @Override
    public Integer visit(VarDefinition vd, Integer params) {
        super.visit(vd, params);

        if (vd.getScope() == 0) {
            // Para las variables globales que empiezan en 0, no devuelve nada porque se queda en al variable
            // del Visitor
            vd.setOffset(sumBytesGlVar);
            sumBytesGlVar += vd.getType().numberOfBytes();
        }

        return null;
    }

    @Override
    public Integer visit(FunctionType ft, Integer params) {
        // PARAMETROS: BP + Sumatorio de los parámetros posteriores declarados (parámetros a su derecha)
        // El primer parámetro declarado despues de la suma de 4 es el ÚLTIMO parámetro declarado
        int sumBytesParams = 0;

        for (int i = ft.getParameters().size() - 1; i >= 0; i--) {
            VarDefinition vd = ft.getParameters().get(i);
            vd.setOffset(4 + sumBytesParams);
            sumBytesParams += vd.getType().numberOfBytes();
        }

        return sumBytesParams;
    }

    @Override
    public Integer visit(FuncDefinition fd, Integer params) {
        fd.getType().accept(this, params); // Para los parametros

        int sumBytesLocalVar = 0;

        for (VarDefinition vf :fd.getVarDefinitions()) {
            // VARIABLES LOCALES: BP - sumatorio variables anteriores (y ella misma)
            sumBytesLocalVar += vf.getType().numberOfBytes();
            vf.setOffset(-sumBytesLocalVar);
        }

        return null;
    }

}
