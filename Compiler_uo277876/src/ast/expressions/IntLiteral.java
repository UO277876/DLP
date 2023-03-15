package ast.expressions;

import semantic.Visitor;

public class IntLiteral extends AbstractExpression{

    private int value;

    public IntLiteral(int value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
