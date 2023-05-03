package ast.types;

import ast.ASTNode;
import ast.Type;
import semantic.Visitor;

public class DoubleType extends AbstractType{
    public DoubleType() {
        super(0, 0);
    }

    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public Type arithmetic(Type t, ASTNode node){
        if(t instanceof DoubleType) {
            return t;
        }

        return super.arithmetic(t,node);
    }

    @Override
    public Type arithmeticUnary(ASTNode node){
        return new DoubleType();
    }

    @Override
    public Type comparison(Type t, ASTNode node){
        if (t instanceof DoubleType) {
            return t;
        }

        return super.comparison(t,node);
    }

    @Override
    public Type canBeCastTo(Type t, ASTNode node){
        if(t instanceof IntType || t instanceof CharType) {
            return t;
        }

        return super.canBeCastTo(t,node);
    }

    @Override
    public Type mustBePromoteTo(Type t, ASTNode node){
        if(t instanceof DoubleType) {
            return t;
        }

        return super.mustBePromoteTo(t,node);
    }

    @Override
    public int numberOfBytes(){
        return 4;
    }

    @Override
    public char suffix(){
        return 'f'; // pushf
    }

    @Override
    public String toString(){
        return "DoubleType";
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
