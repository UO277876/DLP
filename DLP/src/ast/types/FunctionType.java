package ast.types;

import ast.Type;
import ast.definitions.VarDefinition;

import java.util.List;

public class FunctionType extends AbstractType {

    private Type returnType;
    private List<VarDefinition> varDefinitions;

    public FunctionType(Type returnType, List<VarDefinition> varDefinitions) {
        super(0, 0);
        this.returnType = returnType;
        this.varDefinitions = varDefinitions;
    }

    public Type getReturnType(){
        return returnType;
    }

    public List<VarDefinition> getVarDefinitions(){
        return varDefinitions;
    }

}
