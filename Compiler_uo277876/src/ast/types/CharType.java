package ast.types;

import ast.ASTNode;
import ast.Type;
import semantic.Visitor;

public class CharType extends AbstractType {

    public CharType() {
        super(0, 0);
    }

    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public Type arithmetic(Type t, ASTNode node){
        if (t instanceof CharType) {
            return new IntType();
        }

        return super.arithmetic(t,node);
    }

    @Override
    public Type arithmeticUnary(ASTNode node){
        return new CharType();
    }

    @Override
    public Type comparison(Type t, ASTNode node){
        if (t instanceof CharType) {
            return new IntType();
        }

        if (t instanceof CharType) {
            return new IntType();
        }

        return super.comparison(t,node);
    }

    @Override
    public Type canBeCastTo(Type t, ASTNode node){
        if(t instanceof CharType || t instanceof ErrorType)
            return t;
        return super.canBeCastTo(t,node);
    }

    @Override
    public Type mustBePromoteTo(Type t, ASTNode node){
        if(t instanceof ErrorType || t instanceof CharType) {
            return t;
        }

        return super.mustBePromoteTo(t,node);
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
