package ast.types;

import ast.ASTNode;
import ast.AbstractASTNode;
import ast.Expression;
import ast.Type;

import java.util.List;

public abstract class AbstractType extends AbstractASTNode implements Type {

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean isLogical() {
        return false;
    }

    @Override
    public Type arithmetic(Type t, ASTNode node) {
        if(t instanceof ErrorType) {
            return t;
        }

        return new ErrorType("Incompatible type",node.getLine(),node.getColumn());
    }

    @Override
    public Type arithmeticUnary(ASTNode node) {
        return new ErrorType("Only can apply primitive types",node.getLine(),node.getColumn());
    }

    @Override
    public Type comparison(Type t, ASTNode node) {
        if(t instanceof ErrorType) {
            return t;
        }

        return new ErrorType("Incompatible types in the comparison", node.getLine(),node.getColumn());
    }

    @Override
    public Type logic(Type t, ASTNode node) {
        if(t instanceof ErrorType) {
            return t;
        }

        return new ErrorType("There isn't a logical type",node.getLine(),node.getColumn());
    }

    @Override
    public Type logic(ASTNode node) {
        return new ErrorType("There isn't a logical type",node.getLine(),node.getColumn());
    }

    @Override
    public Type dot(String field, ASTNode node) {
        return new ErrorType("Missing field " + field,node.getLine(),node.getColumn());
    }

    @Override
    public Type squareBrackets(Type t, ASTNode node) {
        if(t instanceof ErrorType) {
            return t;
        }

        return new ErrorType("The array acces is not allowed",node.getLine(),node.getColumn());
    }

    @Override
    public Type mustBePromoteTo(Type t, ASTNode node) {
        if(t instanceof ErrorType) {
            return t;
        }

        return new ErrorType("Incompatible type",node.getLine(),node.getColumn());
    }

    @Override
    public Type canBeCastTo(Type t, ASTNode node) {
        if(t instanceof ErrorType) {
            return t;
        }

        return new ErrorType("Only can cast primitive types",node.getLine(),node.getColumn());
    }

    @Override
    public Type parenthesis(List<Expression> params, ASTNode node) {
        return null;
    }

    @Override
    public int numberOfBytes() throws IllegalStateException {
        throw new IllegalStateException("NumberOfBytes not found");
    }

    @Override
    public char suffix() throws IllegalStateException {
        throw new IllegalStateException("Suffix not found");
    }

}
