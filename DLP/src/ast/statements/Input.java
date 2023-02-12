package ast.statements;

import ast.Expression;

public class Input extends AbstractStatement{

    private Expression expression;

    public Input(Expression expression, int line, int column) {
        super(line, column);
    }

    public Expression getExpression(){
        return expression;
    }
}
