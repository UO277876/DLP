package ast.statements;

import ast.Expression;
import ast.Statement;

import java.util.List;

public class Conditional extends AbstractStatement{

    private Expression condition;
    private List<Statement> if_statements;
    private List<Statement> else_statements;

    public Conditional(Expression condition, List<Statement> if_statements,
                       List<Statement> else_statements, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.if_statements = if_statements;
        this.else_statements = else_statements;
    }

    public Expression getCondition(){
        return condition;
    }

    public List<Statement> getIfStatements() {
        return if_statements;
    }

    public List<Statement> getElseStatements(){
        return else_statements;
    }
}
