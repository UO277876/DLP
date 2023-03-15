package ast.expressions;

import semantic.Visitor;

public class RealLiteral extends AbstractExpression{

    private double value;

    public RealLiteral(double value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public double getValue(){
        return value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
