package ast.definitions;

import ast.Type;
import ast.types.AbstractType;

public class VarDefinition extends AbstractDefinition {

    private int offset;

    public VarDefinition(Type type, String name, int line, int column) {
        super(type, name, line, column);
    }

    public int getOffset(){
        return offset;
    }
}
