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
	 * Enter a parse tree produced by {@link ManuScriptParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPackageDeclaration(ManuScriptParser.PackageDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#packageDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPackageDeclaration(ManuScriptParser.PackageDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(ManuScriptParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(ManuScriptParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypeDeclaration(ManuScriptParser.TypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#typeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypeDeclaration(ManuScriptParser.TypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#modifier}.
	 * @param ctx the parse tree
	 */
	void enterModifier(ManuScriptParser.ModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#modifier}.
	 * @param ctx the parse tree
	 */
	void exitModifier(ManuScriptParser.ModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceModifier(ManuScriptParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#classOrInterfaceModifier}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceModifier(ManuScriptParser.ClassOrInterfaceModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(ManuScriptParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(ManuScriptParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(ManuScriptParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(ManuScriptParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameters(ManuScriptParser.TypeParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#typeParameters}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameters(ManuScriptParser.TypeParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeParameter(ManuScriptParser.TypeParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#typeParameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeParameter(ManuScriptParser.TypeParameterContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(ManuScriptParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(ManuScriptParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstants(ManuScriptParser.EnumConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#enumConstants}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstants(ManuScriptParser.EnumConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstant(ManuScriptParser.EnumConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#enumConstant}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstant(ManuScriptParser.EnumConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void enterEnumBodyDeclarations(ManuScriptParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#enumBodyDeclarations}.
	 * @param ctx the parse tree
	 */
	void exitEnumBodyDeclarations(ManuScriptParser.EnumBodyDeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceDeclaration(ManuScriptParser.InterfaceDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#interfaceDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceDeclaration(ManuScriptParser.InterfaceDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(ManuScriptParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(ManuScriptParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBody(ManuScriptParser.InterfaceBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#interfaceBody}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBody(ManuScriptParser.InterfaceBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(ManuScriptParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(ManuScriptParser.ClassBodyDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void enterMethodModifier(ManuScriptParser.MethodModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#methodModifier}.
	 * @param ctx the parse tree
	 */
	void exitMethodModifier(ManuScriptParser.MethodModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericMethodDeclaration(ManuScriptParser.GenericMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#genericMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericMethodDeclaration(ManuScriptParser.GenericMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclaration(ManuScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#constructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclaration(ManuScriptParser.ConstructorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void enterConstructorModifier(ManuScriptParser.ConstructorModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#constructorModifier}.
	 * @param ctx the parse tree
	 */
	void exitConstructorModifier(ManuScriptParser.ConstructorModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericConstructorDeclaration(ManuScriptParser.GenericConstructorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#genericConstructorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericConstructorDeclaration(ManuScriptParser.GenericConstructorDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void enterFieldModifier(ManuScriptParser.FieldModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#fieldModifier}.
	 * @param ctx the parse tree
	 */
	void exitFieldModifier(ManuScriptParser.FieldModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceBodyDeclaration(ManuScriptParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#interfaceBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceBodyDeclaration(ManuScriptParser.InterfaceBodyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMemberDeclaration(ManuScriptParser.InterfaceMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#interfaceMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMemberDeclaration(ManuScriptParser.InterfaceMemberDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInterfaceMethodDeclaration(ManuScriptParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#interfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInterfaceMethodDeclaration(ManuScriptParser.InterfaceMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterGenericInterfaceMethodDeclaration(ManuScriptParser.GenericInterfaceMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#genericInterfaceMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitGenericInterfaceMethodDeclaration(ManuScriptParser.GenericInterfaceMethodDeclarationContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void enterEnumConstantName(ManuScriptParser.EnumConstantNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#enumConstantName}.
	 * @param ctx the parse tree
	 */
	void exitEnumConstantName(ManuScriptParser.EnumConstantNameContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(ManuScriptParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(ManuScriptParser.ClassOrInterfaceTypeContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#qualifierSpecifierList}.
	 * @param ctx the parse tree
	 */
	void enterQualifierSpecifierList(ManuScriptParser.QualifierSpecifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#qualifierSpecifierList}.
	 * @param ctx the parse tree
	 */
	void exitQualifierSpecifierList(ManuScriptParser.QualifierSpecifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#qualifierList}.
	 * @param ctx the parse tree
	 */
	void enterQualifierList(ManuScriptParser.QualifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#qualifierList}.
	 * @param ctx the parse tree
	 */
	void exitQualifierList(ManuScriptParser.QualifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifier(ManuScriptParser.QualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#qualifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifier(ManuScriptParser.QualifierContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void enterConstructorBody(ManuScriptParser.ConstructorBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#constructorBody}.
	 * @param ctx the parse tree
	 */
	void exitConstructorBody(ManuScriptParser.ConstructorBodyContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(ManuScriptParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(ManuScriptParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(ManuScriptParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(ManuScriptParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#catchType}.
	 * @param ctx the parse tree
	 */
	void enterCatchType(ManuScriptParser.CatchTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#catchType}.
	 * @param ctx the parse tree
	 */
	void exitCatchType(ManuScriptParser.CatchTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void enterFinallyBlock(ManuScriptParser.FinallyBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#finallyBlock}.
	 * @param ctx the parse tree
	 */
	void exitFinallyBlock(ManuScriptParser.FinallyBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterResourceSpecification(ManuScriptParser.ResourceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#resourceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitResourceSpecification(ManuScriptParser.ResourceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#resources}.
	 * @param ctx the parse tree
	 */
	void enterResources(ManuScriptParser.ResourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#resources}.
	 * @param ctx the parse tree
	 */
	void exitResources(ManuScriptParser.ResourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(ManuScriptParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(ManuScriptParser.ResourceContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(ManuScriptParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(ManuScriptParser.ExpressionContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void enterInnerCreator(ManuScriptParser.InnerCreatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#innerCreator}.
	 * @param ctx the parse tree
	 */
	void exitInnerCreator(ManuScriptParser.InnerCreatorContext ctx);
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
	 * Enter a parse tree produced by {@link ManuScriptParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void enterClassCreatorRest(ManuScriptParser.ClassCreatorRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#classCreatorRest}.
	 * @param ctx the parse tree
	 */
	void exitClassCreatorRest(ManuScriptParser.ClassCreatorRestContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocation(ManuScriptParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#explicitGenericInvocation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocation(ManuScriptParser.ExplicitGenericInvocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArguments(ManuScriptParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#nonWildcardTypeArguments}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArguments(ManuScriptParser.NonWildcardTypeArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterTypeArgumentsOrDiamond(ManuScriptParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#typeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitTypeArgumentsOrDiamond(ManuScriptParser.TypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void enterNonWildcardTypeArgumentsOrDiamond(ManuScriptParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#nonWildcardTypeArgumentsOrDiamond}.
	 * @param ctx the parse tree
	 */
	void exitNonWildcardTypeArgumentsOrDiamond(ManuScriptParser.NonWildcardTypeArgumentsOrDiamondContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void enterSuperSuffix(ManuScriptParser.SuperSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#superSuffix}.
	 * @param ctx the parse tree
	 */
	void exitSuperSuffix(ManuScriptParser.SuperSuffixContext ctx);
	/**
	 * Enter a parse tree produced by {@link ManuScriptParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void enterExplicitGenericInvocationSuffix(ManuScriptParser.ExplicitGenericInvocationSuffixContext ctx);
	/**
	 * Exit a parse tree produced by {@link ManuScriptParser#explicitGenericInvocationSuffix}.
	 * @param ctx the parse tree
	 */
	void exitExplicitGenericInvocationSuffix(ManuScriptParser.ExplicitGenericInvocationSuffixContext ctx);
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