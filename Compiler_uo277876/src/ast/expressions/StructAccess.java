package ast.expressions;

import ast.Expression;

public class StructAccess extends  AbstractExpression {

    private String name;
    private Expression expression;

    public StructAccess(String name,
                        Expression expression, int line, int column) {
        super(line, column);
        this.name = name;
        this.expression = expression;
    }

    public String getName(){
        return name;
    }

    public Expression getExpression(){
        return expression;
    }
}
