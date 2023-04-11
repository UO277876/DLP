package semantic;

import ast.Definition;
import ast.Statement;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.types.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor<TP, TR> extends AbstractVisitor<TP, TR>{

    SymbolTable st = new SymbolTable();

    @Override
    public TR visit(Variable v, TP params) {
        super.visit(v, params);

        Definition definition = st.find(v.getName());
        if(definition == null){
            v.setDefinition(new VarDefinition(new ErrorType("Variable not found", v.getLine(), v.getColumn()),
                    "error", v.getLine(), v.getColumn()));
        } else {
            v.setDefinition(definition);
        }

        return null;
    }

    @Override
    public TR visit(VarDefinition vd, TP params) {
        super.visit(vd, params);
        boolean canInsert = st.insert(vd);
        if(!canInsert){
            new ErrorType("Variable " + vd.getName() + " already defined",
                    vd.getLine(), vd.getColumn());
        }

        return null;
    }

    @Override
    public TR visit(FuncDefinition fd, TP params) {
        boolean canInsert = st.insert(fd);
        if(!canInsert){
            new ErrorType("Function name " + fd.getName() + " already defined",
                    fd.getLine(), fd.getColumn());
        }

        st.set(); // Se crea un nuevo scope, para el ámbito de la función
        super.visit(fd,params);
        st.reset();

        return null;
    }
}
