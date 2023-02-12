package ast.definitions;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.Definition;
import ast.Type;

public class AbstractDefinition extends AbstractASTNode implements Definition {

    private Type type;
    private String name;

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
}
