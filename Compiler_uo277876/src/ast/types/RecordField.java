package ast.types;

import ast.AbstractASTNode;
import ast.Type;
import semantic.Visitor;

public class RecordField extends AbstractASTNode {
    private String name;
    private Type typeOf;
    private int offset;

    public RecordField(String name, Type typeOf, int line, int column) {
        super(line, column);
        this.name = name;
        this.typeOf =typeOf;
    }

    public void setType(Type type){
        this.typeOf = type;
    }
    public Type getType() {
        return typeOf;
    }
    public String getName() {
        return name;
    }
    public void setOffset(int offset){this.offset = offset;}
    public int getOffset(){
        return offset;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
