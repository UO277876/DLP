package ast.types;

import ast.ASTNode;
import ast.Type;
import semantic.Visitor;

public class IntType extends AbstractType{
    public IntType() {
        super(0, 0);
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public Type arithmetic(Type t, ASTNode node){
        if(t instanceof ErrorType || t instanceof IntType) {
            return this;
        }

        return super.arithmetic(t,node);
    }

    @Override
    public Type arithmeticUnary(ASTNode node){
        return new IntType();
    }

    @Override
    public Type comparison(Type t, ASTNode node){
        if (t instanceof IntType || t instanceof ErrorType) {
            return this;
        }

        return super.comparison(t,node);
    }

    @Override
    public Type canBeCastTo(Type t, ASTNode node){
        if(t instanceof ErrorType || t instanceof IntType) {
            return this;
        }

        return super.canBeCastTo(t,node);
    }

    @Override
    public Type mustBePromoteTo(Type t, ASTNode node){
        if(t instanceof ErrorType || t instanceof IntType) {
            return this;
        }

        return super.mustBePromoteTo(t,node);
    }

    @Override
    public Type logic(Type t, ASTNode node){
        if(t.isLogical()) {
            return this;
        }

        return super.logic(t,node);
    }

    @Override
    public Type logic(ASTNode node){
        return this;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
