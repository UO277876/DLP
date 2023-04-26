package codegenerator;

import ast.definitions.VarDefinition;
import ast.expressions.ArrayAccess;
import ast.expressions.StructAccess;
import ast.expressions.Variable;
import ast.types.RecordType;

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

    /**
     address[[ArrayAccess: expression1 -> expression2 expression3]]()=
        address[[expression2]]
        value[[expression3]]
        <pushi> expression1.type.numberofBytes
        <mul>
        <add>
     **/
    @Override
    public Void visit(ArrayAccess ac, Void params) {
        ac.getExpression1().accept(this,params); // Primero se necesita la dirección base del array
        // Se obtiene el valor en v[i] de i para saber cuanto tiene que
        // saltar
        ac.getExpression2().accept(vv,params);
        cg.pushi(ac.getType().numberOfBytes());
        cg.muli();
        cg.addi();
        return null;
    }

    /**
     address[[StructAccess: expression1 -> ID expression2]]()=
         address[[expression2]]
         <pushi> expression2.type.getField(ID).offset
         <addi>
     **/
    @Override
    public Void visit(StructAccess sc, Void params) {
        sc.getExpression().accept(this,params);
        cg.pushi(((RecordType) sc.getExpression().getType()).getField(sc.getName()));
        cg.addi();
        return null;
    }

}
