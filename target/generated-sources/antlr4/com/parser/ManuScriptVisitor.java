// Generated from C:/INTELLIJ Projects/PROGLAN_MP/src/com/parser\ManuScript.g4 by ANTLR 4.7
package com.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ManuScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ManuScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(ManuScriptParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#bodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBodyDeclaration(ManuScriptParser.BodyDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#typeBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeBound(ManuScriptParser.TypeBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(ManuScriptParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#memberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemberDeclaration(ManuScriptParser.MemberDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#startFieldStruct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartFieldStruct(ManuScriptParser.StartFieldStructContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#startMethodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartMethodDeclaration(ManuScriptParser.StartMethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(ManuScriptParser.FieldDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#constDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstDeclaration(ManuScriptParser.ConstDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#constantDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDeclarator(ManuScriptParser.ConstantDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(ManuScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(ManuScriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(ManuScriptParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ManuScriptParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(ManuScriptParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#pointerType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointerType(ManuScriptParser.PointerTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#structType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructType(ManuScriptParser.StructTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(ManuScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#structDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDefinition(ManuScriptParser.StructDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#structDeclarationList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarationList(ManuScriptParser.StructDeclarationListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(ManuScriptParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorList(ManuScriptParser.StructDeclaratorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#structDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclarator(ManuScriptParser.StructDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#structDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaratorId(ManuScriptParser.StructDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#typeDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDefinition(ManuScriptParser.TypeDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArguments(ManuScriptParser.TypeArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeArgument(ManuScriptParser.TypeArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(ManuScriptParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#formalParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameters(ManuScriptParser.FormalParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameterList(ManuScriptParser.FormalParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParameter(ManuScriptParser.FormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParameter(ManuScriptParser.LastFormalParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(ManuScriptParser.MethodBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(ManuScriptParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ManuScriptParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(ManuScriptParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(ManuScriptParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclarationStatement(ManuScriptParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalVariableDeclaration(ManuScriptParser.LocalVariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(ManuScriptParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(ManuScriptParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStmt(ManuScriptParser.ForStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(ManuScriptParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doWhileStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStmt(ManuScriptParser.DoWhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code switchStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStmt(ManuScriptParser.SwitchStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(ManuScriptParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreakStmt(ManuScriptParser.BreakStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code semicolonStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSemicolonStmt(ManuScriptParser.SemicolonStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStmt(ManuScriptParser.ExprStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outputStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStmt(ManuScriptParser.OutputStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inputStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStmt(ManuScriptParser.InputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchBlockStatementGroup(ManuScriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#switchLabel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchLabel(ManuScriptParser.SwitchLabelContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#forControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForControl(ManuScriptParser.ForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(ManuScriptParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#enhancedForControl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForControl(ManuScriptParser.EnhancedForControlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#forUpdate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForUpdate(ManuScriptParser.ForUpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#outputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputStatement(ManuScriptParser.OutputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#inputStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStatement(ManuScriptParser.InputStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(ManuScriptParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(ManuScriptParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#statementExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementExpression(ManuScriptParser.StatementExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#constantExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpression(ManuScriptParser.ConstantExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negationExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationExpr(ManuScriptParser.NegationExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(ManuScriptParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayInitExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitExpr(ManuScriptParser.ArrayInitExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(ManuScriptParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code oneLineIfExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOneLineIfExpr(ManuScriptParser.OneLineIfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonExpr(ManuScriptParser.ComparisonExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionExpr(ManuScriptParser.FunctionExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code postIncDecExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPostIncDecExpr(ManuScriptParser.PostIncDecExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExpr(ManuScriptParser.PrimaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDivModExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDivModExpr(ManuScriptParser.MultDivModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(ManuScriptParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preIncDecSignExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreIncDecSignExpr(ManuScriptParser.PreIncDecSignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(ManuScriptParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(ManuScriptParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#structExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructExpr(ManuScriptParser.StructExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#structMember}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructMember(ManuScriptParser.StructMemberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#structName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructName(ManuScriptParser.StructNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#variableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpr(ManuScriptParser.VariableExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#equationExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquationExpr(ManuScriptParser.EquationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(ManuScriptParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#creator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreator(ManuScriptParser.CreatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#createdName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreatedName(ManuScriptParser.CreatedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayCreatorRest(ManuScriptParser.ArrayCreatorRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link ManuScriptParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ManuScriptParser.ArgumentsContext ctx);
}