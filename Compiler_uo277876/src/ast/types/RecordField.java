package ast.types;

import ast.AbstractASTNode;
import ast.Type;

import java.util.List;

public class RecordField extends AbstractASTNode {
    private String name;
    private Type typeOf;

    public RecordField(String name, Type typeOf, int line, int column) {
        super(line, column);
        this.name = name;
        this.typeOf =typeOf;
    }

    public Type getType() {
        return typeOf;
    }
    public String getName() {
        return name;
    }
}
