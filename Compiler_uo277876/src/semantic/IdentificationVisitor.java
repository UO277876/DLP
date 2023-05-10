package semantic;

import ast.Definition;
import ast.definitions.FuncDefinition;
import ast.definitions.VarDefinition;
import ast.expressions.Variable;
import ast.types.ErrorType;
import symboltable.SymbolTable;

public class IdentificationVisitor extends AbstractVisitor<Void, Void>{

    SymbolTable st = new SymbolTable();

    @Override
    public Void visit(Variable v, Void params) {
        super.visit(v, params);

        Definition definition = st.find(v.getName());
        if(definition == null){
            v.setDefinition(new VarDefinition(new ErrorType("Variable " + v.getName() + " not found",
                    v.getLine(), v.getColumn()),
                    "error", v.getLine(), v.getColumn()));
        } else {
            v.setDefinition(definition);
        }

        return null;
    }

    @Override
    public Void visit(VarDefinition vd, Void params) {
        super.visit(vd, params);
        boolean canInsert = st.insert(vd);
        if(!canInsert){
            new ErrorType("Variable " + vd.getName() + " already defined",
                    vd.getLine(), vd.getColumn());
        }

        super.visit(vd, params);
        return null;
    }

    @Override
    public Void visit(FuncDefinition fd, Void params) {
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
