package ast;

import semantic.Visitor;

import java.util.List;

public  class Program extends AbstractASTNode {

    private List<Definition> definitions;

    public Program(List<Definition> definitions, int line, int column){
        super(line,column);
        this.definitions = definitions;
    }

    public List<Definition> getDefinitions(){ return definitions; }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }

}
