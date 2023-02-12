package ast.expressions;

import ast.Expression;

public class UnaryMinus extends AbstractExpression{

    private Expression expression;

    public UnaryMinus(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }
}
