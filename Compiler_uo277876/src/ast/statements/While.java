package ast.statements;

import ast.Expression;
import ast.Statement;
import semantic.Visitor;

import java.util.List;

public class While extends AbstractStatement {

    private Expression condition;
    private List<Statement> statements;

    public While(Expression condition, List<Statement> statements, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.statements = statements;
    }

    public Expression getCondition(){
        return condition;
    }

    public List<Statement> getStatements() {
        return statements;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
