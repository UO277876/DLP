package ast.statements;

import ast.Expression;

public class Assignment extends AbstractStatement{

    private Expression right;
    private Expression left;

    public Assignment(Expression right, Expression left, int line, int column) {
        super(line, column);
        this.right = right;
        this.left = left;
    }

    public Expression getRight(){
        return right;
    }

    public Expression getLeft(){
        return left;
    }
}
