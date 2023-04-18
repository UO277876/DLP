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
        // Para comprobar que hay el número de parámetros que necesita la función
        if (params.size() != parameters.size()) {
            return new ErrorType("Missing a parameter", a.getLine(), a.getColumn());
        }

        // Para comprobar que el tipo de los parámetros pasados son coincidentes con los de la función
        for (int i = 0; i < params.size(); i++) {
            Type type_parameter = params.get(i).getType().mustBePromoteTo(parameters.get(i).getType(),a);
            if(type_parameter instanceof ErrorType) {
                //return new ErrorType("The type of the parameters don't are the same",
                //        a.getLine(), a.getColumn());
                return type_parameter;
            }
        }

        return returnType;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }

}
