package ast.types;

import ast.ASTNode;
import ast.Expression;
import ast.Type;
import ast.definitions.VarDefinition;
import semantic.Visitor;

import java.util.List;

public class FunctionType extends AbstractType {

    private Type returnType;
    private List<VarDefinition> parameters;

    public FunctionType(Type returnType, List<VarDefinition> parameters) {
        super(0, 0);
        this.returnType = returnType;
        this.parameters = parameters;
    }

    public Type getReturnType(){
        return returnType;
    }

    public List<VarDefinition> getParameters(){
        return parameters;
    }

    @Override
    public Type parenthesis(List<Expression> params, ASTNode a){
        if (params.size() != parameters.size()) {
            return new ErrorType("Missing a parameter", a.getLine(), a.getColumn());
        }

        for (int i = 0; i < params.size(); i++) {
            if(!params.get(i).getType().equals(parameters.get(i).getType()))
                return new ErrorType("The type of the parameters don't are the same",
                        a.getLine(),a.getColumn());
        }

        return returnType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }

}
