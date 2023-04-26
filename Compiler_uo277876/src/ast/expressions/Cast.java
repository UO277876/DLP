package ast.expressions;

import ast.Expression;
import ast.Type;
import semantic.Visitor;

public class Cast extends AbstractExpression{

    private Type typeCast;
    private Expression expression;

    public Cast(Type typeCast, Expression expression, int line, int column) {
        super(line, column);
        this.typeCast = typeCast;
        this.expression = expression;
    }

    public Type getTypeCast(){
        return typeCast;
    }

    public Expression getExpression(){
        return expression;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
