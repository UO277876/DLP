package ast.expressions;

import ast.Expression;
import semantic.Visitor;

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

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
