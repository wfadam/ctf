// Generated from ctf.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ctfParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ctfVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ctfParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ctfParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ctfParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(ctfParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(ctfParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(ctfParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(ctfParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(ctfParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(ctfParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ctfParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(ctfParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ctfParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(ctfParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ctfParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(ctfParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ctfParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ctfParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(ctfParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ctfParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(ctfParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(ctfParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(ctfParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(ctfParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ctfParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(ctfParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ctfParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ctfParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ctfParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ctfParser.PrimitiveTypeContext ctx);
}