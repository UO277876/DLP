package ast.types;

import semantic.Visitor;

public class DoubleType extends AbstractType{
    public DoubleType() {
        super(0, 0);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
