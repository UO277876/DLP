package ast.expressions;

import ast.Expression;

public class ArrayAccess extends AbstractExpression{

    private Expression expr1;
    private Expression expr2;

    public ArrayAccess(Expression expr1,
                       Expression expr2, int line, int column) {
        super(line, column);
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    public Expression getExpression1(){
        return expr1;
    }

    public Expression getExpression2(){
        return expr2;
    }

}
