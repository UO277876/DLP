package ast.types;

import ast.types.recordField.RecordField;

import java.util.List;

public class RecordType extends AbstractType {

    private List<RecordField> fields;
    public RecordType(List<RecordField> fields) {
        super(0, 0);
        this.fields = fields;
    }

    public List<RecordField> getFields() {
        return fields;
    }
}
