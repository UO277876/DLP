package ast.definitions;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.Definition;
import ast.Type;

public abstract class AbstractDefinition extends AbstractASTNode implements Definition {

    private Type type;
    private String name;
    private int scope;

    public AbstractDefinition(Type type, String name, int line, int column) {
        super(line, column);
        this.type = type;
        this.name = name;
    }

    public Type getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public void setType(Type type){
        this.type = type;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getScope(){return scope;}
    public void setScope(int scope){this.scope = scope;}
}
