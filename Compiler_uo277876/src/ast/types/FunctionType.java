package ast.types;

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
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }

}
