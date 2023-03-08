// Generated from java-escape by ANTLR 4.11.1
package parser;

import ast.*;
import ast.definitions.*;
import ast.expressions.*;
import ast.statements.*;
import ast.types.*;
import errorhandler.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#simple_types}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_types(PmmParser.Simple_typesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#recordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordFields(PmmParser.RecordFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#varDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDefinition(PmmParser.VarDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funcDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDefinition(PmmParser.FuncDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#mainDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainDefinition(PmmParser.MainDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(PmmParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#returnType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnType(PmmParser.ReturnTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funcParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParameters(PmmParser.FuncParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PmmParser.BlockContext ctx);
}