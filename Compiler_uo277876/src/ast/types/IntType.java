package ast.types;

import ast.ASTNode;
import ast.Type;
import semantic.Visitor;

public class IntType extends AbstractType{

    private static IntType instance;

    public IntType() {
        super(0, 0);
    }

    @Override
    public boolean isLogical() {
        return true;
    }

    @Override
    public Type arithmetic(Type t, ASTNode node){
        if(t instanceof IntType) {
            return t;
        }

        return super.arithmetic(t,node);
    }

    @Override
    public Type arithmeticUnary(ASTNode node){
        return new IntType();
    }

    @Override
    public Type comparison(Type t, ASTNode node){
        if (t instanceof IntType) {
            return t;
        }

        return super.comparison(t,node);
    }

    @Override
    public Type canBeCastTo(Type t, ASTNode node){
        if(t instanceof CharType || t instanceof DoubleType) {
            return t;
        }

        return super.canBeCastTo(t,node);
    }

    @Override
    public Type mustBePromoteTo(Type t, ASTNode node){
        if(t instanceof IntType) {
            return t;
        }

        return super.mustBePromoteTo(t,node);
    }

    @Override
    public Type logic(Type t, ASTNode node){
        if(t.isLogical()) {
            return t;
        }

        return super.logic(t,node);
    }

    @Override
    public Type logic(ASTNode node){
        return this;
    }

    @Override
    public int numberOfBytes(){
        return 2;
    }

    @Override
    public char suffix(){
        return 'i'; // pushi
    }

    @Override
    public String toString(){
        return "IntType";
    }

    public static IntType getInstance() {
        if (instance == null)
            instance = new IntType();
        return instance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
