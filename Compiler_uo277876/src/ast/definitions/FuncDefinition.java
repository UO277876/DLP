package ast.definitions;

import ast.Statement;
import ast.Type;

import java.util.List;

public class FuncDefinition extends AbstractDefinition {

    private List<Statement> statements;
    private List<VarDefinition> definitions;

    public FuncDefinition(Type type, String name, List<VarDefinition> definitions,
                          List<Statement> statements, int line, int column) {
        super(type, name, line, column);
        this.statements = statements;
        this.definitions = definitions;
    }

    public List<Statement> getStatements(){
        return statements;
    }
    public List<VarDefinition> getDefinitions(){
        return definitions;
    }
}
