package ast.expressions;

import semantic.Visitor;

public class Variable extends AbstractExpression {

    private String name;

    public Variable(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
