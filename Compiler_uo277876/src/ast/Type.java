package ast;

import java.util.List;

public interface Type extends ASTNode {
    // ---------- Para el TypeCheckingVisitor ----------
    public boolean isLogical();

    public Type arithmetic(Type t, ASTNode node); // Operaciones aritméticas
    public Type arithmeticUnary(ASTNode node); // Unario

    public Type logic(Type t, ASTNode node); // || And y or
    public Type logic(ASTNode node); // Not

    public Type comparison(Type t, ASTNode node);

    public Type dot(String field, ASTNode node);

    public Type squareBrackets(Type t, ASTNode node);

    public Type mustBePromoteTo(Type t, ASTNode node);

    public Type canBeCastTo(Type t, ASTNode node);

    public Type parenthesis(List<Expression> params, ASTNode node);

    // ---------- Para calcular el offset ----------
    public int numberOfBytes();

    // ---------- Para la generacion de codigo ----------
    public char suffix();
}
