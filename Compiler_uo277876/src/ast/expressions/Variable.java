package ast.expressions;

import ast.Definition;
import semantic.Visitor;

public class Variable extends AbstractExpression {

    private String name;
    private Definition definition;

    public Variable(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public Definition getDefinition(){
        return definition;
    }

    public void setDefinition(Definition definition){
        this.definition = definition;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
