package ast.program;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.Definition;

import java.util.List;

public class Program extends AbstractASTNode {

    private List<Definition> definitions;

    public Program(List<Definition> definitions, int line, int column){
        super(line,column);
        this.definitions = definitions;
    }

}
