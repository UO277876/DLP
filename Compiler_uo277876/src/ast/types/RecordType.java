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
        for (RecordField rf : fields) {
            if (rf.getName().equals(field))
                return rf.getType();
        }

        return super.dot(field,node);
    }

    @Override
    public int numberOfBytes() {
        // El número de bytes es el sumatorio de todos los RecordFields
        int numBytes = 0;

        for(RecordField rf: fields) {
            numBytes += rf.getType().numberOfBytes();
        }

        return numBytes;
    }

    public int getField(String name){
        for(RecordField field : fields){
            if(field.getName().equals(name)){
                return field.getOffset();
            }
        }

        return -1;
    }

    public void actualizeOffset(){
        int bytesFields = 0;

        for(RecordField field : fields){
            field.setOffset(bytesFields);
            bytesFields += field.getType().numberOfBytes();
        }
    }

    @Override
    public String toString(){
        return "RecordType[" +
                "fields:" + fields +
                "]";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
