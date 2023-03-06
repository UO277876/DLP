package ast.expressions;

import ast.Expression;

public class UnaryNot extends AbstractExpression{

    private Expression expression;

    public UnaryNot(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression(){
        return expression;
    }
}
