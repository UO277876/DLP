package ast.types;

import semantic.Visitor;

public class VoidType extends AbstractType {

    public VoidType() {
        super(0, 0);
    }

    @Override
    public int numberOfBytes() throws IllegalStateException {
        return 0;
    }

    @Override
    public String toString(){
        return "VoidType";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
