package ast.types;

import semantic.Visitor;

public class CharType extends AbstractType {
    public CharType() {
        super(0, 0);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
