package ast.expressions;

import semantic.Visitor;

public class CharLiteral extends AbstractExpression{

    private char value;

    public CharLiteral(char value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public char getValue(){
        return value;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
