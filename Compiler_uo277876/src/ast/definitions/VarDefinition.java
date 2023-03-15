package ast.definitions;

import ast.Type;
import semantic.Visitor;

public class VarDefinition extends AbstractDefinition {

    private int offset;

    public VarDefinition(Type type, String name, int line, int column) {
        super(type, name, line, column);
    }

    public int getOffset(){
        return offset;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
