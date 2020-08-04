// Generated from ctf.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ctfParser}.
 */
public interface ctfListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ctfParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ctfParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ctfParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ctfParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ctfParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(ctfParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(ctfParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(ctfParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(ctfParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(ctfParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(ctfParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(ctfParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(ctfParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ctfParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ctfParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ctfParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ctfParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ctfParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ctfParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ctfParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ctfParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ctfParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ctfParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ctfParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ctfParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(ctfParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(ctfParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ctfParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ctfParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ctfParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ctfParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ctfParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ctfParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(ctfParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(ctfParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(ctfParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(ctfParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(ctfParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(ctfParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ctfParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ctfParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(ctfParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(ctfParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ctfParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ctfParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ctfParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ctfParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ctfParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ctfParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ctfParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ctfParser.PrimitiveTypeContext ctx);
}