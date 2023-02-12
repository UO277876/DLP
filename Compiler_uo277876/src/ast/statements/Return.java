package ast.statements;

import ast.Expression;

public class Return extends AbstractStatement{

    private Expression expression;

    public Return(Expression expression, int line, int column) {
        super(line, column);
        this.expression = expression;
    }

    public Expression getExpression(){
        return expression;
    }
}
