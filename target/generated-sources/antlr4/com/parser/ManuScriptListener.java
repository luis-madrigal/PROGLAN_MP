// Generated from ManuScript.g4 by ANTLR 4.7
package com.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ManuScriptParser}.
 */
public interface ManuScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(ManuScriptParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(ManuScriptParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#bodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBodyDeclaration(ManuScriptParser.BodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#bodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBodyDeclaration(ManuScriptParser.BodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void enterTypeBound(ManuScriptParser.TypeBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#typeBound}.
	 * @param ctx the parse tree
	 */
	void exitTypeBound(ManuScriptParser.TypeBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(ManuScriptParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(ManuScriptParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberDeclaration(ManuScriptParser.MemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#memberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberDeclaration(ManuScriptParser.MemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#startFieldStruct}.
	 * @param ctx the parse tree
	 */
	void enterStartFieldStruct(ManuScriptParser.StartFieldStructContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#startFieldStruct}.
	 * @param ctx the parse tree
	 */
	void exitStartFieldStruct(ManuScriptParser.StartFieldStructContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#startMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStartMethodDeclaration(ManuScriptParser.StartMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#startMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStartMethodDeclaration(ManuScriptParser.StartMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(ManuScriptParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(ManuScriptParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(ManuScriptParser.FieldDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstDeclaration(ManuScriptParser.ConstDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#constDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstDeclaration(ManuScriptParser.ConstDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclarator(ManuScriptParser.ConstantDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#constantDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclarator(ManuScriptParser.ConstantDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(ManuScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(ManuScriptParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(ManuScriptParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(ManuScriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(ManuScriptParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(ManuScriptParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(ManuScriptParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(ManuScriptParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(ManuScriptParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(ManuScriptParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(ManuScriptParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void enterPointerType(ManuScriptParser.PointerTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#pointerType}.
	 * @param ctx the parse tree
	 */
	void exitPointerType(ManuScriptParser.PointerTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#structType}.
	 * @param ctx the parse tree
	 */
	void enterStructType(ManuScriptParser.StructTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#structType}.
	 * @param ctx the parse tree
	 */
	void exitStructType(ManuScriptParser.StructTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(ManuScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(ManuScriptParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void enterStructDefinition(ManuScriptParser.StructDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#structDefinition}.
	 * @param ctx the parse tree
	 */
	void exitStructDefinition(ManuScriptParser.StructDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarationList(ManuScriptParser.StructDeclarationListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#structDeclarationList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarationList(ManuScriptParser.StructDeclarationListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(ManuScriptParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(ManuScriptParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorList(ManuScriptParser.StructDeclaratorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#structDeclaratorList}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorList(ManuScriptParser.StructDeclaratorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclarator(ManuScriptParser.StructDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#structDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclarator(ManuScriptParser.StructDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#structDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaratorId(ManuScriptParser.StructDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#structDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaratorId(ManuScriptParser.StructDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(ManuScriptParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(ManuScriptParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void enterTypeArguments(ManuScriptParser.TypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#typeArguments}.
	 * @param ctx the parse tree
	 */
	void exitTypeArguments(ManuScriptParser.TypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgument(ManuScriptParser.TypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#typeArgument}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgument(ManuScriptParser.TypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(ManuScriptParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(ManuScriptParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(ManuScriptParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(ManuScriptParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(ManuScriptParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(ManuScriptParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(ManuScriptParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(ManuScriptParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParameter(ManuScriptParser.LastFormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#lastFormalParameter}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParameter(ManuScriptParser.LastFormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(ManuScriptParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(ManuScriptParser.MethodBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(ManuScriptParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(ManuScriptParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ManuScriptParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ManuScriptParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(ManuScriptParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(ManuScriptParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(ManuScriptParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(ManuScriptParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclarationStatement(ManuScriptParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#localVariableDeclarationStatement}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclarationStatement(ManuScriptParser.LocalVariableDeclarationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterLocalVariableDeclaration(ManuScriptParser.LocalVariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#localVariableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitLocalVariableDeclaration(ManuScriptParser.LocalVariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(ManuScriptParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(ManuScriptParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfElseStmt(ManuScriptParser.IfElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifElseStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfElseStmt(ManuScriptParser.IfElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterForStmt(ManuScriptParser.ForStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitForStmt(ManuScriptParser.ForStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(ManuScriptParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(ManuScriptParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doWhileStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStmt(ManuScriptParser.DoWhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doWhileStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStmt(ManuScriptParser.DoWhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code switchStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStmt(ManuScriptParser.SwitchStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code switchStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStmt(ManuScriptParser.SwitchStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(ManuScriptParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(ManuScriptParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStmt(ManuScriptParser.BreakStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code breakStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStmt(ManuScriptParser.BreakStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code semicolonStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSemicolonStmt(ManuScriptParser.SemicolonStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code semicolonStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSemicolonStmt(ManuScriptParser.SemicolonStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExprStmt(ManuScriptParser.ExprStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExprStmt(ManuScriptParser.ExprStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outputStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStmt(ManuScriptParser.OutputStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outputStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStmt(ManuScriptParser.OutputStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inputStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(ManuScriptParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inputStmt}
	 * labeled alternative in {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(ManuScriptParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void enterSwitchBlockStatementGroup(ManuScriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#switchBlockStatementGroup}.
	 * @param ctx the parse tree
	 */
	void exitSwitchBlockStatementGroup(ManuScriptParser.SwitchBlockStatementGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void enterSwitchLabel(ManuScriptParser.SwitchLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#switchLabel}.
	 * @param ctx the parse tree
	 */
	void exitSwitchLabel(ManuScriptParser.SwitchLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#forControl}.
	 * @param ctx the parse tree
	 */
	void enterForControl(ManuScriptParser.ForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#forControl}.
	 * @param ctx the parse tree
	 */
	void exitForControl(ManuScriptParser.ForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(ManuScriptParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(ManuScriptParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForControl(ManuScriptParser.EnhancedForControlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#enhancedForControl}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForControl(ManuScriptParser.EnhancedForControlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void enterForUpdate(ManuScriptParser.ForUpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#forUpdate}.
	 * @param ctx the parse tree
	 */
	void exitForUpdate(ManuScriptParser.ForUpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void enterOutputStatement(ManuScriptParser.OutputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#outputStatement}.
	 * @param ctx the parse tree
	 */
	void exitOutputStatement(ManuScriptParser.OutputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void enterInputStatement(ManuScriptParser.InputStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#inputStatement}.
	 * @param ctx the parse tree
	 */
	void exitInputStatement(ManuScriptParser.InputStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(ManuScriptParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(ManuScriptParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(ManuScriptParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(ManuScriptParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void enterStatementExpression(ManuScriptParser.StatementExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#statementExpression}.
	 * @param ctx the parse tree
	 */
	void exitStatementExpression(ManuScriptParser.StatementExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpression(ManuScriptParser.ConstantExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#constantExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpression(ManuScriptParser.ConstantExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negationExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegationExpr(ManuScriptParser.NegationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negationExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegationExpr(ManuScriptParser.NegationExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(ManuScriptParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(ManuScriptParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayInitExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitExpr(ManuScriptParser.ArrayInitExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayInitExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitExpr(ManuScriptParser.ArrayInitExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(ManuScriptParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(ManuScriptParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code oneLineIfExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOneLineIfExpr(ManuScriptParser.OneLineIfExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code oneLineIfExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOneLineIfExpr(ManuScriptParser.OneLineIfExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComparisonExpr(ManuScriptParser.ComparisonExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComparisonExpr(ManuScriptParser.ComparisonExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionExpr(ManuScriptParser.FunctionExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionExpr(ManuScriptParser.FunctionExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postIncDecExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPostIncDecExpr(ManuScriptParser.PostIncDecExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postIncDecExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPostIncDecExpr(ManuScriptParser.PostIncDecExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpr(ManuScriptParser.PrimaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpr(ManuScriptParser.PrimaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDivModExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDivModExpr(ManuScriptParser.MultDivModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDivModExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDivModExpr(ManuScriptParser.MultDivModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(ManuScriptParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(ManuScriptParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preIncDecSignExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPreIncDecSignExpr(ManuScriptParser.PreIncDecSignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preIncDecSignExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPreIncDecSignExpr(ManuScriptParser.PreIncDecSignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(ManuScriptParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(ManuScriptParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(ManuScriptParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(ManuScriptParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#structExpr}.
	 * @param ctx the parse tree
	 */
	void enterStructExpr(ManuScriptParser.StructExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#structExpr}.
	 * @param ctx the parse tree
	 */
	void exitStructExpr(ManuScriptParser.StructExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#structMember}.
	 * @param ctx the parse tree
	 */
	void enterStructMember(ManuScriptParser.StructMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#structMember}.
	 * @param ctx the parse tree
	 */
	void exitStructMember(ManuScriptParser.StructMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#structName}.
	 * @param ctx the parse tree
	 */
	void enterStructName(ManuScriptParser.StructNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#structName}.
	 * @param ctx the parse tree
	 */
	void exitStructName(ManuScriptParser.StructNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#variableExpr}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpr(ManuScriptParser.VariableExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#variableExpr}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpr(ManuScriptParser.VariableExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#equationExpr}.
	 * @param ctx the parse tree
	 */
	void enterEquationExpr(ManuScriptParser.EquationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#equationExpr}.
	 * @param ctx the parse tree
	 */
	void exitEquationExpr(ManuScriptParser.EquationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(ManuScriptParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(ManuScriptParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#creator}.
	 * @param ctx the parse tree
	 */
	void enterCreator(ManuScriptParser.CreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#creator}.
	 * @param ctx the parse tree
	 */
	void exitCreator(ManuScriptParser.CreatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#createdName}.
	 * @param ctx the parse tree
	 */
	void enterCreatedName(ManuScriptParser.CreatedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#createdName}.
	 * @param ctx the parse tree
	 */
	void exitCreatedName(ManuScriptParser.CreatedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterArrayCreatorRest(ManuScriptParser.ArrayCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#arrayCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitArrayCreatorRest(ManuScriptParser.ArrayCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(ManuScriptParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(ManuScriptParser.ArgumentsContext ctx);
}