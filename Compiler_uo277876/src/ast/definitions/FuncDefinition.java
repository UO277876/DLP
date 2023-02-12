package ast.definitions;

import ast.Statement;
import ast.Type;

import java.util.List;

public class FuncDefinition extends AbstractDefinition {

    private List<Statement> statements;

    public FuncDefinition(Type type, String name, int line, int column) {
        super(type, name, line, column);
    }

    public List<Statement> getStatements(){
        return statements;
    }
}
