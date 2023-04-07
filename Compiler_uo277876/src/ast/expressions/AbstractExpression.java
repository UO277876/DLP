package ast.expressions;

import ast.AbstractASTNode;
import ast.Expression;
import ast.Type;

public abstract class AbstractExpression extends AbstractASTNode implements Expression {

    private boolean lValue;
    private Type type;

    public AbstractExpression(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean getLValue(){
        return lValue;
    }

    @Override
    public void setLValue(boolean lvalue){
        this.lValue = lValue;
}

    public void setType(Type type){
        this.type = type;
    }

    public Type getType(){ return type; }
}
