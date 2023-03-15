package ast.definitions;

import ast.Statement;
import ast.Type;
import semantic.Visitor;

import java.util.List;

public class FuncDefinition extends AbstractDefinition {

    private List<Statement> statements;
    private List<VarDefinition> varDefinitions;

    public FuncDefinition(Type type, String name, List<VarDefinition> varDefinitions,
                          List<Statement> statements, int line, int column) {
        super(type, name, line, column);
        this.statements = statements;
        this.varDefinitions = varDefinitions;
    }

    public List<Statement> getStatements(){
        return statements;
    }
    public List<VarDefinition> getVarDefinitions(){
        return varDefinitions;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
