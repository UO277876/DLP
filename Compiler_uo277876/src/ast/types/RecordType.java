package ast.types;

import ast.ASTNode;
import ast.Type;
import semantic.Visitor;

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

    @Override
    public Type dot(String field, ASTNode node) {
        for (RecordField f : fields) {
            if (f.getName().equals(field))
                return f.getType();
        }

        return super.dot(field,node);
    }

    @Override
    public int numberOfBytes() {
        // El número de bytes es el sumatorio de todos los RecordFields del struct
        int numBytes = 0;

        for(RecordField rf: fields) {
            numBytes += rf.getType().numberOfBytes();
        }

        return numBytes;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
