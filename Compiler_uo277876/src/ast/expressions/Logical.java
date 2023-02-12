package ast.expressions;

import ast.Expression;

public class Logical extends AbstractExpression{

    private String operator;
    private Expression right, left;

    public Logical(String operator, Expression right,
                   Expression left, int line, int column) {
        super(line, column);
        this.operator = operator;
        this.right = right;
        this.left = left;
    }

    public String getOperator(){
        return operator;
    }

    public Expression getRight(){
        return right;
    }

    public Expression getLeft(){
        return left;
    }
}
