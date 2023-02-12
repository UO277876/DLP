package ast.types.recordField;

import ast.AbstractASTNode;

public class RecordField extends AbstractASTNode {

    private String name;

    public RecordField(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }
}
