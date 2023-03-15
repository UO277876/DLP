package ast.expressions;

import ast.Expression;
import semantic.Visitor;

public class UnaryMinus extends AbstractExpression{

    private Expression expression;

    public UnaryMinus(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression(){
        return expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
