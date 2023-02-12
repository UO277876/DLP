package ast.statements;

import ast.Expression;
import ast.Statement;

public class Print extends AbstractStatement {

    private Expression expression;

    public Print(Expression expression, int line, int column) {
        super(line, column);
    }

    public Expression getExpression(){
        return expression;
    }
}
