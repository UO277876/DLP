package codegenerator;

import ast.definitions.VarDefinition;
import ast.expressions.Variable;

public class AddressCGVisitor extends AbstractCGVisitor<Void,Void> {

    private ValueCGVisitor vv;

    public AddressCGVisitor(CodeGenerator cg, ValueCGVisitor vv) {
        super(cg);
        this.vv = vv;
    }

    /**
     address[[Variable: expression -> ID]]()=
        if(expression.definition.scope == 0){
            <pusha> expression.definition.offset
        } else {
            <pusha>
            <pushi> expression.definition.offset
            <add> expression.type.suffix
        }
     **/
    @Override
    public Void visit(Variable v, Void params) {
        if(v.getDefinition().getScope() == 0){ // SI ES UNA VARIABLE GLOBAL
            cg.pusha(((VarDefinition) v.getDefinition()).getOffset());
        } else {
            cg.pushBP();
            cg.pushi(((VarDefinition) v.getDefinition()).getOffset());
            cg.add(v.getType());
        }
        return null;
    }


}
