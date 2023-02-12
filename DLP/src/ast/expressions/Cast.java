package ast.expressions;

import ast.Expression;
import ast.Type;

public class Cast extends AbstractExpression{

    private Type type;
    private Expression expression;

    public Cast(Type type, Expression expression, int line, int column) {
        super(line, column);
        this.type = type;
        this.expression = expression;
    }

    public Type getType(){
        return type;
    }

    public Expression getExpression(){
        return expression;
    }
}
