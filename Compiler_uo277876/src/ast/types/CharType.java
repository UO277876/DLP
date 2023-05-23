package ast.types;

import ast.ASTNode;
import ast.Type;
import semantic.Visitor;

public class CharType extends AbstractType {

    private static CharType instance;

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

        return super.comparison(t,node);
    }

    @Override
    public Type canBeCastTo(Type t, ASTNode node){
        if(t instanceof IntType || t instanceof DoubleType) {
            return t;
        }

        return super.canBeCastTo(t,node);
    }

    @Override
    public Type mustBePromoteTo(Type t, ASTNode node){
        if(t instanceof CharType) {
            return t;
        }

        return super.mustBePromoteTo(t,node);
    }

    @Override
    public int numberOfBytes(){
        return 1;
    }

    @Override
    public char suffix(){
        return 'b'; // pushb
    }

    @Override
    public String toString(){
        return "char";
    }

    public static CharType getInstance() {
        if (instance == null)
            instance = new CharType();
        return instance;
    }

    @Override
    public <TP, TR> TR accept(Visitor<TP, TR> visitor, TP parameters) {
        return visitor.visit(this,parameters);
    }
}
