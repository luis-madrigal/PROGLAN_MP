// Generated from ManuScript.g4 by ANTLR 4.7
package com.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ManuScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, ABSTRACT=14, ASSERT=15, BOOLEAN=16, 
		BREAK=17, BYTE=18, CASE=19, CATCH=20, CHAR=21, CLASS=22, CONST=23, CONTINUE=24, 
		DEFAULT=25, DO=26, DOUBLE=27, ELSE=28, ENUM=29, EXTENDS=30, FINAL=31, 
		FINALLY=32, FLOAT=33, FOR=34, IF=35, GOTO=36, IMPLEMENTS=37, IMPORT=38, 
		INSTANCEOF=39, INT=40, INTERFACE=41, LONG=42, NATIVE=43, NEW=44, PACKAGE=45, 
		PRINT=46, PRIVATE=47, PROTECTED=48, PUBLIC=49, RETURN=50, SCAN=51, SCANTO=52, 
		SHORT=53, STARTING=54, STATIC=55, STRICTFP=56, STRING=57, STRUCT=58, SUPER=59, 
		SWITCH=60, SYNCHRONIZED=61, THIS=62, THROW=63, THROWS=64, TRANSIENT=65, 
		TRY=66, VOID=67, WHILE=68, IntegerLiteral=69, FloatingPointLiteral=70, 
		BooleanLiteral=71, CharacterLiteral=72, StringLiteral=73, NullLiteral=74, 
		LPAREN=75, RPAREN=76, LBRACE=77, RBRACE=78, LBRACK=79, RBRACK=80, SEMI=81, 
		COMMA=82, DOT=83, ASSIGN=84, GT=85, LT=86, BANG=87, TILDE=88, QUESTION=89, 
		COLON=90, EQUAL=91, LE=92, GE=93, NOTEQUAL=94, AND=95, OR=96, INC=97, 
		DEC=98, ADD=99, SUB=100, MUL=101, DIV=102, BITAND=103, BITOR=104, CARET=105, 
		MOD=106, ADD_ASSIGN=107, SUB_ASSIGN=108, MUL_ASSIGN=109, DIV_ASSIGN=110, 
		AND_ASSIGN=111, OR_ASSIGN=112, XOR_ASSIGN=113, MOD_ASSIGN=114, LSHIFT_ASSIGN=115, 
		RSHIFT_ASSIGN=116, URSHIFT_ASSIGN=117, Identifier=118, AT=119, ELLIPSIS=120, 
		WS=121, COMMENT=122, LINE_COMMENT=123;
	public static final int
		RULE_compilationUnit = 0, RULE_packageDeclaration = 1, RULE_importDeclaration = 2, 
		RULE_typeDeclaration = 3, RULE_modifier = 4, RULE_classOrInterfaceModifier = 5, 
		RULE_variableModifier = 6, RULE_classDeclaration = 7, RULE_typeParameters = 8, 
		RULE_typeParameter = 9, RULE_typeBound = 10, RULE_enumDeclaration = 11, 
		RULE_enumConstants = 12, RULE_enumConstant = 13, RULE_enumBodyDeclarations = 14, 
		RULE_interfaceDeclaration = 15, RULE_typeList = 16, RULE_classBody = 17, 
		RULE_interfaceBody = 18, RULE_classBodyDeclaration = 19, RULE_memberDeclaration = 20, 
		RULE_methodDeclaration = 21, RULE_methodModifier = 22, RULE_genericMethodDeclaration = 23, 
		RULE_constructorDeclaration = 24, RULE_constructorModifier = 25, RULE_genericConstructorDeclaration = 26, 
		RULE_fieldDeclaration = 27, RULE_fieldModifier = 28, RULE_interfaceBodyDeclaration = 29, 
		RULE_interfaceMemberDeclaration = 30, RULE_constDeclaration = 31, RULE_constantDeclarator = 32, 
		RULE_interfaceMethodDeclaration = 33, RULE_genericInterfaceMethodDeclaration = 34, 
		RULE_variableDeclarators = 35, RULE_variableDeclarator = 36, RULE_variableDeclaratorId = 37, 
		RULE_variableInitializer = 38, RULE_arrayInitializer = 39, RULE_enumConstantName = 40, 
		RULE_typeType = 41, RULE_pointerType = 42, RULE_structType = 43, RULE_classOrInterfaceType = 44, 
		RULE_primitiveType = 45, RULE_structDefinition = 46, RULE_structDeclarationList = 47, 
		RULE_structDeclaration = 48, RULE_qualifierSpecifierList = 49, RULE_qualifierList = 50, 
		RULE_qualifier = 51, RULE_structDeclaratorList = 52, RULE_structDeclarator = 53, 
		RULE_structDeclaratorId = 54, RULE_typeDefinition = 55, RULE_typeArguments = 56, 
		RULE_typeArgument = 57, RULE_qualifiedNameList = 58, RULE_formalParameters = 59, 
		RULE_formalParameterList = 60, RULE_formalParameter = 61, RULE_lastFormalParameter = 62, 
		RULE_methodBody = 63, RULE_constructorBody = 64, RULE_qualifiedName = 65, 
		RULE_literal = 66, RULE_block = 67, RULE_blockStatement = 68, RULE_localVariableDeclarationStatement = 69, 
		RULE_localVariableDeclaration = 70, RULE_statement = 71, RULE_catchClause = 72, 
		RULE_catchType = 73, RULE_finallyBlock = 74, RULE_resourceSpecification = 75, 
		RULE_resources = 76, RULE_resource = 77, RULE_switchBlockStatementGroup = 78, 
		RULE_switchLabel = 79, RULE_forControl = 80, RULE_forInit = 81, RULE_enhancedForControl = 82, 
		RULE_forUpdate = 83, RULE_outputStatement = 84, RULE_outputValue = 85, 
		RULE_inputStatement = 86, RULE_parExpression = 87, RULE_expressionList = 88, 
		RULE_statementExpression = 89, RULE_constantExpression = 90, RULE_expression = 91, 
		RULE_primary = 92, RULE_creator = 93, RULE_createdName = 94, RULE_innerCreator = 95, 
		RULE_arrayCreatorRest = 96, RULE_classCreatorRest = 97, RULE_explicitGenericInvocation = 98, 
		RULE_nonWildcardTypeArguments = 99, RULE_typeArgumentsOrDiamond = 100, 
		RULE_nonWildcardTypeArgumentsOrDiamond = 101, RULE_superSuffix = 102, 
		RULE_explicitGenericInvocationSuffix = 103, RULE_arguments = 104;
	public static final String[] ruleNames = {
		"compilationUnit", "packageDeclaration", "importDeclaration", "typeDeclaration", 
		"modifier", "classOrInterfaceModifier", "variableModifier", "classDeclaration", 
		"typeParameters", "typeParameter", "typeBound", "enumDeclaration", "enumConstants", 
		"enumConstant", "enumBodyDeclarations", "interfaceDeclaration", "typeList", 
		"classBody", "interfaceBody", "classBodyDeclaration", "memberDeclaration", 
		"methodDeclaration", "methodModifier", "genericMethodDeclaration", "constructorDeclaration", 
		"constructorModifier", "genericConstructorDeclaration", "fieldDeclaration", 
		"fieldModifier", "interfaceBodyDeclaration", "interfaceMemberDeclaration", 
		"constDeclaration", "constantDeclarator", "interfaceMethodDeclaration", 
		"genericInterfaceMethodDeclaration", "variableDeclarators", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "arrayInitializer", "enumConstantName", 
		"typeType", "pointerType", "structType", "classOrInterfaceType", "primitiveType", 
		"structDefinition", "structDeclarationList", "structDeclaration", "qualifierSpecifierList", 
		"qualifierList", "qualifier", "structDeclaratorList", "structDeclarator", 
		"structDeclaratorId", "typeDefinition", "typeArguments", "typeArgument", 
		"qualifiedNameList", "formalParameters", "formalParameterList", "formalParameter", 
		"lastFormalParameter", "methodBody", "constructorBody", "qualifiedName", 
		"literal", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "catchClause", "catchType", "finallyBlock", 
		"resourceSpecification", "resources", "resource", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"outputStatement", "outputValue", "inputStatement", "parExpression", "expressionList", 
		"statementExpression", "constantExpression", "expression", "primary", 
		"creator", "createdName", "innerCreator", "arrayCreatorRest", "classCreatorRest", 
		"explicitGenericInvocation", "nonWildcardTypeArguments", "typeArgumentsOrDiamond", 
		"nonWildcardTypeArgumentsOrDiamond", "superSuffix", "explicitGenericInvocationSuffix", 
		"arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'take everything'", "'final'", "'implements'", "'{A}'", "'{Z}'", 
		"'{SCENE'", "'{END'", "'SCENE'", "'END'", "'ACT'", "'starring'", "'cast'", 
		"'as'", "'template'", "'assert'", "'boolean'", "'break'", "'byte'", "'version'", 
		"'catch'", "'char'", "'script'", "'const'", "'continue'", "'original'", 
		"'rehearse'", "'double'", "'else'", "'enum'", null, "'permanent'", "'finally'", 
		"'float'", "'replay'", "'if'", "'goto'", "'that can'", "'take'", "'can act as'", 
		"'int'", "'interface'", "'long'", "'native'", "'new'", "'from'", "'Say'", 
		"'secret'", "'hereditary'", "'universal'", "'give'", "'Write'", "'to'", 
		"'short'", "'The'", "'static'", "'strictfp'", "'string'", "'composition'", 
		"'super'", "'switch'", "'synchronized'", "'this'", "'ignore'", "'ignores'", 
		"'transient'", "'audition'", "'void'", "'when'", null, null, null, null, 
		null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
		"'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", "'=='", "'<='", 
		"'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'*'", "'/'", 
		"'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
		"'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", 
		"CATCH", "CHAR", "CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", 
		"ELSE", "ENUM", "EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", 
		"IMPLEMENTS", "IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", 
		"NEW", "PACKAGE", "PRINT", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", 
		"SCAN", "SCANTO", "SHORT", "STARTING", "STATIC", "STRICTFP", "STRING", 
		"STRUCT", "SUPER", "SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", 
		"TRANSIENT", "TRY", "VOID", "WHILE", "IntegerLiteral", "FloatingPointLiteral", 
		"BooleanLiteral", "CharacterLiteral", "StringLiteral", "NullLiteral", 
		"LPAREN", "RPAREN", "LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", 
		"DOT", "ASSIGN", "GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", 
		"LE", "GE", "NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", 
		"DIV", "BITAND", "BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", 
		"MUL_ASSIGN", "DIV_ASSIGN", "AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", 
		"LSHIFT_ASSIGN", "RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", 
		"ELLIPSIS", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "ManuScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ManuScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ManuScriptParser.EOF, 0); }
		public PackageDeclarationContext packageDeclaration() {
			return getRuleContext(PackageDeclarationContext.class,0);
		}
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitCompilationUnit(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PACKAGE) {
				{
				setState(210);
				packageDeclaration();
				}
			}

			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(213);
				importDeclaration();
				}
				}
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << ENUM) | (1L << FINAL) | (1L << INTERFACE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STARTING) | (1L << STATIC) | (1L << STRICTFP))) != 0) || _la==SEMI) {
				{
				setState(219);
				typeDeclaration();
				}
			}

			setState(222);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PackageDeclarationContext extends ParserRuleContext {
		public TerminalNode PACKAGE() { return getToken(ManuScriptParser.PACKAGE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public PackageDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_packageDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterPackageDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitPackageDeclaration(this);
		}
	}

	public final PackageDeclarationContext packageDeclaration() throws RecognitionException {
		PackageDeclarationContext _localctx = new PackageDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_packageDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(PACKAGE);
			setState(225);
			qualifiedName();
			setState(226);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(ManuScriptParser.IMPORT, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(IMPORT);
			setState(229);
			qualifiedName();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(230);
				match(T__0);
				}
			}

			setState(233);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public List<ClassOrInterfaceModifierContext> classOrInterfaceModifier() {
			return getRuleContexts(ClassOrInterfaceModifierContext.class);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier(int i) {
			return getRuleContext(ClassOrInterfaceModifierContext.class,i);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public TypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitTypeDeclaration(this);
		}
	}

	public final TypeDeclarationContext typeDeclaration() throws RecognitionException {
		TypeDeclarationContext _localctx = new TypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeDeclaration);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) {
					{
					{
					setState(235);
					classOrInterfaceModifier();
					}
					}
					setState(240);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(241);
				classDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) {
					{
					{
					setState(242);
					classOrInterfaceModifier();
					}
					}
					setState(247);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(248);
				enumDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) {
					{
					{
					setState(249);
					classOrInterfaceModifier();
					}
					}
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(255);
				interfaceDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(256);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ModifierContext extends ParserRuleContext {
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TerminalNode NATIVE() { return getToken(ManuScriptParser.NATIVE, 0); }
		public TerminalNode SYNCHRONIZED() { return getToken(ManuScriptParser.SYNCHRONIZED, 0); }
		public TerminalNode TRANSIENT() { return getToken(ManuScriptParser.TRANSIENT, 0); }
		public ModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitModifier(this);
		}
	}

	public final ModifierContext modifier() throws RecognitionException {
		ModifierContext _localctx = new ModifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_modifier);
		int _la;
		try {
			setState(261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ABSTRACT:
			case FINAL:
			case PRIVATE:
			case PROTECTED:
			case PUBLIC:
			case STATIC:
			case STRICTFP:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				classOrInterfaceModifier();
				}
				break;
			case NATIVE:
			case SYNCHRONIZED:
			case TRANSIENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(260);
				_la = _input.LA(1);
				if ( !(((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (NATIVE - 43)) | (1L << (SYNCHRONIZED - 43)) | (1L << (TRANSIENT - 43)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ManuScriptParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(ManuScriptParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(ManuScriptParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(ManuScriptParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(ManuScriptParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(ManuScriptParser.FINAL, 0); }
		public TerminalNode STRICTFP() { return getToken(ManuScriptParser.STRICTFP, 0); }
		public ClassOrInterfaceModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterClassOrInterfaceModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitClassOrInterfaceModifier(this);
		}
	}

	public final ClassOrInterfaceModifierContext classOrInterfaceModifier() throws RecognitionException {
		ClassOrInterfaceModifierContext _localctx = new ClassOrInterfaceModifierContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_classOrInterfaceModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableModifierContext extends ParserRuleContext {
		public VariableModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterVariableModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitVariableModifier(this);
		}
	}

	public final VariableModifierContext variableModifier() throws RecognitionException {
		VariableModifierContext _localctx = new VariableModifierContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode STARTING() { return getToken(ManuScriptParser.STARTING, 0); }
		public TerminalNode CLASS() { return getToken(ManuScriptParser.CLASS, 0); }
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassOrInterfaceModifierContext classOrInterfaceModifier() {
			return getRuleContext(ClassOrInterfaceModifierContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode IMPLEMENTS() { return getToken(ManuScriptParser.IMPLEMENTS, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ManuScriptParser.EXTENDS, 0); }
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(STARTING);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC) | (1L << STRICTFP))) != 0)) {
				{
				setState(268);
				classOrInterfaceModifier();
				}
			}

			setState(271);
			match(CLASS);
			setState(272);
			match(Identifier);
			setState(274);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(273);
				typeParameters();
				}
			}

			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				{
				setState(276);
				match(EXTENDS);
				}
				setState(277);
				typeType();
				}
			}

			setState(282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPLEMENTS) {
				{
				setState(280);
				match(IMPLEMENTS);
				setState(281);
				typeList();
				}
			}

			setState(284);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParametersContext extends ParserRuleContext {
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterTypeParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitTypeParameters(this);
		}
	}

	public final TypeParametersContext typeParameters() throws RecognitionException {
		TypeParametersContext _localctx = new TypeParametersContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(LT);
			setState(287);
			typeParameter();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(288);
				match(COMMA);
				setState(289);
				typeParameter();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public TypeBoundContext typeBound() {
			return getRuleContext(TypeBoundContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ManuScriptParser.EXTENDS, 0); }
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitTypeParameter(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_typeParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(Identifier);
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				{
				setState(298);
				match(EXTENDS);
				}
				setState(299);
				typeBound();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeBoundContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterTypeBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitTypeBound(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			typeType();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(303);
				match(BITAND);
				setState(304);
				typeType();
				}
				}
				setState(309);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public TerminalNode ENUM() { return getToken(ManuScriptParser.ENUM, 0); }
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public EnumConstantsContext enumConstants() {
			return getRuleContext(EnumConstantsContext.class,0);
		}
		public EnumBodyDeclarationsContext enumBodyDeclarations() {
			return getRuleContext(EnumBodyDeclarationsContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(ENUM);
			setState(311);
			match(Identifier);
			setState(314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(312);
				match(T__2);
				setState(313);
				typeList();
				}
			}

			setState(316);
			match(LBRACE);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(317);
				enumConstants();
				}
			}

			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(320);
				match(COMMA);
				}
			}

			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(323);
				enumBodyDeclarations();
				}
			}

			setState(326);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantsContext extends ParserRuleContext {
		public List<EnumConstantContext> enumConstant() {
			return getRuleContexts(EnumConstantContext.class);
		}
		public EnumConstantContext enumConstant(int i) {
			return getRuleContext(EnumConstantContext.class,i);
		}
		public EnumConstantsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstants; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterEnumConstants(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitEnumConstants(this);
		}
	}

	public final EnumConstantsContext enumConstants() throws RecognitionException {
		EnumConstantsContext _localctx = new EnumConstantsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_enumConstants);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			enumConstant();
			setState(333);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(329);
					match(COMMA);
					setState(330);
					enumConstant();
					}
					} 
				}
				setState(335);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public EnumConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterEnumConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitEnumConstant(this);
		}
	}

	public final EnumConstantContext enumConstant() throws RecognitionException {
		EnumConstantContext _localctx = new EnumConstantContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_enumConstant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(Identifier);
			setState(338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(337);
				arguments();
				}
			}

			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7))) != 0) || _la==LBRACE) {
				{
				setState(340);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumBodyDeclarationsContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public EnumBodyDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBodyDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterEnumBodyDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitEnumBodyDeclarations(this);
		}
	}

	public final EnumBodyDeclarationsContext enumBodyDeclarations() throws RecognitionException {
		EnumBodyDeclarationsContext _localctx = new EnumBodyDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_enumBodyDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			match(SEMI);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__9) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STARTING) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << STRUCT) | (1L << SYNCHRONIZED))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TRANSIENT - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				{
				setState(344);
				classBodyDeclaration();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceDeclarationContext extends ParserRuleContext {
		public TerminalNode INTERFACE() { return getToken(ManuScriptParser.INTERFACE, 0); }
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public InterfaceBodyContext interfaceBody() {
			return getRuleContext(InterfaceBodyContext.class,0);
		}
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ManuScriptParser.EXTENDS, 0); }
		public InterfaceDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterInterfaceDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitInterfaceDeclaration(this);
		}
	}

	public final InterfaceDeclarationContext interfaceDeclaration() throws RecognitionException {
		InterfaceDeclarationContext _localctx = new InterfaceDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_interfaceDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(INTERFACE);
			setState(351);
			match(Identifier);
			setState(353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(352);
				typeParameters();
				}
			}

			setState(357);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTENDS) {
				{
				{
				setState(355);
				match(EXTENDS);
				}
				setState(356);
				typeList();
				}
			}

			setState(359);
			interfaceBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeListContext extends ParserRuleContext {
		public List<TypeTypeContext> typeType() {
			return getRuleContexts(TypeTypeContext.class);
		}
		public TypeTypeContext typeType(int i) {
			return getRuleContext(TypeTypeContext.class,i);
		}
		public TypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitTypeList(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
			typeType();
			setState(366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(362);
				match(COMMA);
				setState(363);
				typeType();
				}
				}
				setState(368);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public List<ClassBodyDeclarationContext> classBodyDeclaration() {
			return getRuleContexts(ClassBodyDeclarationContext.class);
		}
		public ClassBodyDeclarationContext classBodyDeclaration(int i) {
			return getRuleContext(ClassBodyDeclarationContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(ManuScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ManuScriptParser.Identifier, i);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_classBody);
		int _la;
		try {
			setState(409);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				match(LBRACE);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__9) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STARTING) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << STRUCT) | (1L << SYNCHRONIZED))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TRANSIENT - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					{
					setState(370);
					classBodyDeclaration();
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				match(RBRACE);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(T__3);
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__9) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STARTING) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << STRUCT) | (1L << SYNCHRONIZED))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TRANSIENT - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					{
					setState(378);
					classBodyDeclaration();
					}
					}
					setState(383);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(384);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(T__5);
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(386);
					match(Identifier);
					}
				}

				setState(389);
				match(RBRACE);
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__9) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STARTING) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << STRUCT) | (1L << SYNCHRONIZED))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TRANSIENT - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					{
					setState(390);
					classBodyDeclaration();
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(396);
				match(T__6);
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(397);
					match(Identifier);
					}
				}

				setState(400);
				match(RBRACE);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(401);
				match(T__7);
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__9) | (1L << ABSTRACT) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << NATIVE) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << SHORT) | (1L << STARTING) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << STRUCT) | (1L << SYNCHRONIZED))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (TRANSIENT - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (LT - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					{
					setState(402);
					classBodyDeclaration();
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyContext extends ParserRuleContext {
		public List<InterfaceBodyDeclarationContext> interfaceBodyDeclaration() {
			return getRuleContexts(InterfaceBodyDeclarationContext.class);
		}
		public InterfaceBodyDeclarationContext interfaceBodyDeclaration(int i) {
			return getRuleContext(InterfaceBodyDeclarationContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(ManuScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ManuScriptParser.Identifier, i);
		}
		public InterfaceBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterInterfaceBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitInterfaceBody(this);
		}
	}

	public final InterfaceBodyContext interfaceBody() throws RecognitionException {
		InterfaceBodyContext _localctx = new InterfaceBodyContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_interfaceBody);
		int _la;
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(411);
				match(T__3);
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7))) != 0) || _la==LBRACE || _la==SEMI) {
					{
					{
					setState(412);
					interfaceBodyDeclaration();
					}
					}
					setState(417);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(418);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(419);
				match(T__5);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(420);
					match(Identifier);
					}
				}

				setState(423);
				match(RBRACE);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7))) != 0) || _la==LBRACE || _la==SEMI) {
					{
					{
					setState(424);
					interfaceBodyDeclaration();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				match(T__6);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(431);
					match(Identifier);
					}
				}

				setState(434);
				match(RBRACE);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(435);
				match(T__7);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7))) != 0) || _la==LBRACE || _la==SEMI) {
					{
					{
					setState(436);
					interfaceBodyDeclaration();
					}
					}
					setState(441);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(442);
				match(T__8);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyDeclarationContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode STATIC() { return getToken(ManuScriptParser.STATIC, 0); }
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public ClassBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterClassBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitClassBodyDeclaration(this);
		}
	}

	public final ClassBodyDeclarationContext classBodyDeclaration() throws RecognitionException {
		ClassBodyDeclarationContext _localctx = new ClassBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_classBodyDeclaration);
		int _la;
		try {
			int _alt;
			setState(458);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STATIC) {
					{
					setState(446);
					match(STATIC);
					}
				}

				setState(449);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(450);
				structDefinition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(454);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(451);
						modifier();
						}
						} 
					}
					setState(456);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				setState(457);
				memberDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext genericMethodDeclaration() {
			return getRuleContext(GenericMethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext genericConstructorDeclaration() {
			return getRuleContext(GenericConstructorDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public MemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitMemberDeclaration(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_memberDeclaration);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(461);
				genericMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(462);
				fieldDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(463);
				constructorDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(464);
				genericConstructorDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(465);
				interfaceDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(466);
				classDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(467);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
		}
		public List<MethodModifierContext> methodModifier() {
			return getRuleContexts(MethodModifierContext.class);
		}
		public MethodModifierContext methodModifier(int i) {
			return getRuleContext(MethodModifierContext.class,i);
		}
		public TerminalNode THROWS() { return getToken(ManuScriptParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitMethodDeclaration(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
				{
				{
				setState(470);
				methodModifier();
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(476);
			match(T__9);
			setState(477);
			match(Identifier);
			setState(478);
			match(T__10);
			setState(479);
			formalParameters();
			setState(484);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(480);
				match(LBRACK);
				setState(481);
				match(RBRACK);
				}
				}
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(487);
				match(THROWS);
				setState(488);
				qualifiedNameList();
				}
			}

			setState(493);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__5:
			case LBRACE:
				{
				setState(491);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(492);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ManuScriptParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(ManuScriptParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(ManuScriptParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(ManuScriptParser.STATIC, 0); }
		public TerminalNode ABSTRACT() { return getToken(ManuScriptParser.ABSTRACT, 0); }
		public TerminalNode FINAL() { return getToken(ManuScriptParser.FINAL, 0); }
		public MethodModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterMethodModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitMethodModifier(this);
		}
	}

	public final MethodModifierContext methodModifier() throws RecognitionException {
		MethodModifierContext _localctx = new MethodModifierContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_methodModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(495);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ABSTRACT) | (1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public GenericMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterGenericMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitGenericMethodDeclaration(this);
		}
	}

	public final GenericMethodDeclarationContext genericMethodDeclaration() throws RecognitionException {
		GenericMethodDeclarationContext _localctx = new GenericMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_genericMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			typeParameters();
			setState(498);
			methodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public ConstructorBodyContext constructorBody() {
			return getRuleContext(ConstructorBodyContext.class,0);
		}
		public List<ConstructorModifierContext> constructorModifier() {
			return getRuleContexts(ConstructorModifierContext.class);
		}
		public ConstructorModifierContext constructorModifier(int i) {
			return getRuleContext(ConstructorModifierContext.class,i);
		}
		public TerminalNode THROWS() { return getToken(ManuScriptParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public ConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitConstructorDeclaration(this);
		}
	}

	public final ConstructorDeclarationContext constructorDeclaration() throws RecognitionException {
		ConstructorDeclarationContext _localctx = new ConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constructorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) {
				{
				{
				setState(500);
				constructorModifier();
				}
				}
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(506);
			match(Identifier);
			setState(507);
			match(T__10);
			setState(508);
			formalParameters();
			setState(511);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(509);
				match(THROWS);
				setState(510);
				qualifiedNameList();
				}
			}

			setState(513);
			constructorBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ManuScriptParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(ManuScriptParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(ManuScriptParser.PRIVATE, 0); }
		public ConstructorModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterConstructorModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitConstructorModifier(this);
		}
	}

	public final ConstructorModifierContext constructorModifier() throws RecognitionException {
		ConstructorModifierContext _localctx = new ConstructorModifierContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constructorModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericConstructorDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public ConstructorDeclarationContext constructorDeclaration() {
			return getRuleContext(ConstructorDeclarationContext.class,0);
		}
		public GenericConstructorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericConstructorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterGenericConstructorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitGenericConstructorDeclaration(this);
		}
	}

	public final GenericConstructorDeclarationContext genericConstructorDeclaration() throws RecognitionException {
		GenericConstructorDeclarationContext _localctx = new GenericConstructorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_genericConstructorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			typeParameters();
			setState(518);
			constructorDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public List<FieldModifierContext> fieldModifier() {
			return getRuleContexts(FieldModifierContext.class);
		}
		public FieldModifierContext fieldModifier(int i) {
			return getRuleContext(FieldModifierContext.class,i);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) {
				{
				{
				setState(520);
				fieldModifier();
				}
				}
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(526);
			typeType();
			setState(527);
			variableDeclarators();
			setState(528);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldModifierContext extends ParserRuleContext {
		public TerminalNode PUBLIC() { return getToken(ManuScriptParser.PUBLIC, 0); }
		public TerminalNode PROTECTED() { return getToken(ManuScriptParser.PROTECTED, 0); }
		public TerminalNode PRIVATE() { return getToken(ManuScriptParser.PRIVATE, 0); }
		public TerminalNode STATIC() { return getToken(ManuScriptParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(ManuScriptParser.FINAL, 0); }
		public FieldModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterFieldModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitFieldModifier(this);
		}
	}

	public final FieldModifierContext fieldModifier() throws RecognitionException {
		FieldModifierContext _localctx = new FieldModifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_fieldModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(530);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << FINAL) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << STATIC))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceBodyDeclarationContext extends ParserRuleContext {
		public InterfaceMemberDeclarationContext interfaceMemberDeclaration() {
			return getRuleContext(InterfaceMemberDeclarationContext.class,0);
		}
		public List<ModifierContext> modifier() {
			return getRuleContexts(ModifierContext.class);
		}
		public ModifierContext modifier(int i) {
			return getRuleContext(ModifierContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(ManuScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ManuScriptParser.Identifier, i);
		}
		public InterfaceBodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceBodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterInterfaceBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitInterfaceBodyDeclaration(this);
		}
	}

	public final InterfaceBodyDeclarationContext interfaceBodyDeclaration() throws RecognitionException {
		InterfaceBodyDeclarationContext _localctx = new InterfaceBodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_interfaceBodyDeclaration);
		int _la;
		try {
			setState(581);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				match(T__3);
				setState(536);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (ABSTRACT - 14)) | (1L << (FINAL - 14)) | (1L << (NATIVE - 14)) | (1L << (PRIVATE - 14)) | (1L << (PROTECTED - 14)) | (1L << (PUBLIC - 14)) | (1L << (STATIC - 14)) | (1L << (STRICTFP - 14)) | (1L << (SYNCHRONIZED - 14)) | (1L << (TRANSIENT - 14)))) != 0)) {
					{
					{
					setState(533);
					modifier();
					}
					}
					setState(538);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(539);
				interfaceMemberDeclaration();
				setState(540);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(542);
				match(T__5);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(543);
					match(Identifier);
					}
				}

				setState(546);
				match(RBRACE);
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (ABSTRACT - 14)) | (1L << (FINAL - 14)) | (1L << (NATIVE - 14)) | (1L << (PRIVATE - 14)) | (1L << (PROTECTED - 14)) | (1L << (PUBLIC - 14)) | (1L << (STATIC - 14)) | (1L << (STRICTFP - 14)) | (1L << (SYNCHRONIZED - 14)) | (1L << (TRANSIENT - 14)))) != 0)) {
					{
					{
					setState(547);
					modifier();
					}
					}
					setState(552);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(553);
				interfaceMemberDeclaration();
				setState(554);
				match(T__6);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(555);
					match(Identifier);
					}
				}

				setState(558);
				match(RBRACE);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 3);
				{
				setState(560);
				match(T__7);
				setState(564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (ABSTRACT - 14)) | (1L << (FINAL - 14)) | (1L << (NATIVE - 14)) | (1L << (PRIVATE - 14)) | (1L << (PROTECTED - 14)) | (1L << (PUBLIC - 14)) | (1L << (STATIC - 14)) | (1L << (STRICTFP - 14)) | (1L << (SYNCHRONIZED - 14)) | (1L << (TRANSIENT - 14)))) != 0)) {
					{
					{
					setState(561);
					modifier();
					}
					}
					setState(566);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(567);
				interfaceMemberDeclaration();
				setState(568);
				match(T__8);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 4);
				{
				setState(570);
				match(LBRACE);
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 14)) & ~0x3f) == 0 && ((1L << (_la - 14)) & ((1L << (ABSTRACT - 14)) | (1L << (FINAL - 14)) | (1L << (NATIVE - 14)) | (1L << (PRIVATE - 14)) | (1L << (PROTECTED - 14)) | (1L << (PUBLIC - 14)) | (1L << (STATIC - 14)) | (1L << (STRICTFP - 14)) | (1L << (SYNCHRONIZED - 14)) | (1L << (TRANSIENT - 14)))) != 0)) {
					{
					{
					setState(571);
					modifier();
					}
					}
					setState(576);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(577);
				interfaceMemberDeclaration();
				setState(578);
				match(RBRACE);
				}
				break;
			case SEMI:
				enterOuterAlt(_localctx, 5);
				{
				setState(580);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMemberDeclarationContext extends ParserRuleContext {
		public ConstDeclarationContext constDeclaration() {
			return getRuleContext(ConstDeclarationContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() {
			return getRuleContext(GenericInterfaceMethodDeclarationContext.class,0);
		}
		public InterfaceDeclarationContext interfaceDeclaration() {
			return getRuleContext(InterfaceDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public InterfaceMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterInterfaceMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitInterfaceMemberDeclaration(this);
		}
	}

	public final InterfaceMemberDeclarationContext interfaceMemberDeclaration() throws RecognitionException {
		InterfaceMemberDeclarationContext _localctx = new InterfaceMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interfaceMemberDeclaration);
		try {
			setState(589);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				constDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				interfaceMethodDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				genericInterfaceMethodDeclaration();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(586);
				interfaceDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(587);
				classDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(588);
				enumDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public List<ConstantDeclaratorContext> constantDeclarator() {
			return getRuleContexts(ConstantDeclaratorContext.class);
		}
		public ConstantDeclaratorContext constantDeclarator(int i) {
			return getRuleContext(ConstantDeclaratorContext.class,i);
		}
		public ConstDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterConstDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitConstDeclaration(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(591);
			typeType();
			setState(592);
			constantDeclarator();
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(593);
				match(COMMA);
				setState(594);
				constantDeclarator();
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(600);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public ConstantDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterConstantDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitConstantDeclarator(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			match(Identifier);
			setState(607);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(603);
				match(LBRACK);
				setState(604);
				match(RBRACK);
				}
				}
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(610);
			match(ASSIGN);
			setState(611);
			variableInitializer();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public TerminalNode THROWS() { return getToken(ManuScriptParser.THROWS, 0); }
		public QualifiedNameListContext qualifiedNameList() {
			return getRuleContext(QualifiedNameListContext.class,0);
		}
		public InterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitInterfaceMethodDeclaration(this);
		}
	}

	public final InterfaceMethodDeclarationContext interfaceMethodDeclaration() throws RecognitionException {
		InterfaceMethodDeclarationContext _localctx = new InterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_interfaceMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			typeType();
			setState(614);
			match(Identifier);
			setState(615);
			formalParameters();
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(616);
				match(LBRACK);
				setState(617);
				match(RBRACK);
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(625);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(623);
				match(THROWS);
				setState(624);
				qualifiedNameList();
				}
			}

			setState(627);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericInterfaceMethodDeclarationContext extends ParserRuleContext {
		public TypeParametersContext typeParameters() {
			return getRuleContext(TypeParametersContext.class,0);
		}
		public InterfaceMethodDeclarationContext interfaceMethodDeclaration() {
			return getRuleContext(InterfaceMethodDeclarationContext.class,0);
		}
		public GenericInterfaceMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericInterfaceMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterGenericInterfaceMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitGenericInterfaceMethodDeclaration(this);
		}
	}

	public final GenericInterfaceMethodDeclarationContext genericInterfaceMethodDeclaration() throws RecognitionException {
		GenericInterfaceMethodDeclarationContext _localctx = new GenericInterfaceMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_genericInterfaceMethodDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			typeParameters();
			setState(630);
			interfaceMethodDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorsContext extends ParserRuleContext {
		public List<VariableDeclaratorContext> variableDeclarator() {
			return getRuleContexts(VariableDeclaratorContext.class);
		}
		public VariableDeclaratorContext variableDeclarator(int i) {
			return getRuleContext(VariableDeclaratorContext.class,i);
		}
		public VariableDeclaratorsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarators; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterVariableDeclarators(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitVariableDeclarators(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			variableDeclarator();
			setState(637);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(633);
				match(COMMA);
				setState(634);
				variableDeclarator();
				}
				}
				setState(639);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorContext extends ParserRuleContext {
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public VariableInitializerContext variableInitializer() {
			return getRuleContext(VariableInitializerContext.class,0);
		}
		public VariableDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterVariableDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitVariableDeclarator(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			variableDeclaratorId();
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(641);
				match(ASSIGN);
				setState(642);
				variableInitializer();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public VariableDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterVariableDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitVariableDeclaratorId(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(645);
			match(Identifier);
			setState(650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(646);
				match(LBRACK);
				setState(647);
				match(RBRACK);
				}
				}
				setState(652);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableInitializerContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VariableInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterVariableInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitVariableInitializer(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableInitializer);
		try {
			setState(655);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				arrayInitializer();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case MUL:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				expression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<VariableInitializerContext> variableInitializer() {
			return getRuleContexts(VariableInitializerContext.class);
		}
		public VariableInitializerContext variableInitializer(int i) {
			return getRuleContext(VariableInitializerContext.class,i);
		}
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitArrayInitializer(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			match(LBRACE);
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (LBRACE - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(658);
				variableInitializer();
				setState(663);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(659);
						match(COMMA);
						setState(660);
						variableInitializer();
						}
						} 
					}
					setState(665);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,67,_ctx);
				}
				setState(667);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(666);
					match(COMMA);
					}
				}

				}
			}

			setState(671);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumConstantNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public EnumConstantNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumConstantName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterEnumConstantName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitEnumConstantName(this);
		}
	}

	public final EnumConstantNameContext enumConstantName() throws RecognitionException {
		EnumConstantNameContext _localctx = new EnumConstantNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_enumConstantName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(673);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeTypeContext extends ParserRuleContext {
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public TypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterTypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitTypeType(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_typeType);
		int _la;
		try {
			setState(707);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(675);
				pointerType();
				setState(680);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(676);
					match(LBRACK);
					setState(677);
					match(RBRACK);
					}
					}
					setState(682);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(683);
				classOrInterfaceType();
				setState(688);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(684);
					match(LBRACK);
					setState(685);
					match(RBRACK);
					}
					}
					setState(690);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(691);
				primitiveType();
				setState(696);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(692);
					match(LBRACK);
					setState(693);
					match(RBRACK);
					}
					}
					setState(698);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(699);
				structType();
				setState(704);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(700);
					match(LBRACK);
					setState(701);
					match(RBRACK);
					}
					}
					setState(706);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public PointerTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointerType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterPointerType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitPointerType(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(712);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
				{
				setState(709);
				primitiveType();
				}
				break;
			case Identifier:
				{
				setState(710);
				classOrInterfaceType();
				}
				break;
			case STRUCT:
				{
				setState(711);
				structType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(714);
			match(MUL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructTypeContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(ManuScriptParser.STRUCT, 0); }
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitStructType(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(716);
			match(STRUCT);
			setState(717);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassOrInterfaceTypeContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ManuScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ManuScriptParser.Identifier, i);
		}
		public List<TypeArgumentsContext> typeArguments() {
			return getRuleContexts(TypeArgumentsContext.class);
		}
		public TypeArgumentsContext typeArguments(int i) {
			return getRuleContext(TypeArgumentsContext.class,i);
		}
		public ClassOrInterfaceTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classOrInterfaceType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterClassOrInterfaceType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitClassOrInterfaceType(this);
		}
	}

	public final ClassOrInterfaceTypeContext classOrInterfaceType() throws RecognitionException {
		ClassOrInterfaceTypeContext _localctx = new ClassOrInterfaceTypeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			match(Identifier);
			setState(721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(720);
				typeArguments();
				}
			}

			setState(730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(723);
				match(DOT);
				setState(724);
				match(Identifier);
				setState(726);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(725);
					typeArguments();
					}
				}

				}
				}
				setState(732);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ManuScriptParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(ManuScriptParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(ManuScriptParser.STRING, 0); }
		public TerminalNode BYTE() { return getToken(ManuScriptParser.BYTE, 0); }
		public TerminalNode SHORT() { return getToken(ManuScriptParser.SHORT, 0); }
		public TerminalNode INT() { return getToken(ManuScriptParser.INT, 0); }
		public TerminalNode LONG() { return getToken(ManuScriptParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(ManuScriptParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(ManuScriptParser.DOUBLE, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(733);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDefinitionContext extends ParserRuleContext {
		public TerminalNode STRUCT() { return getToken(ManuScriptParser.STRUCT, 0); }
		public List<TerminalNode> Identifier() { return getTokens(ManuScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ManuScriptParser.Identifier, i);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterStructDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitStructDefinition(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_structDefinition);
		int _la;
		try {
			setState(767);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(735);
				match(STRUCT);
				setState(736);
				match(Identifier);
				setState(737);
				match(T__3);
				setState(738);
				structDeclarationList();
				setState(739);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(741);
				match(STRUCT);
				setState(742);
				match(Identifier);
				setState(743);
				match(T__5);
				setState(745);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(744);
					match(Identifier);
					}
				}

				setState(747);
				match(RBRACE);
				setState(748);
				structDeclarationList();
				setState(749);
				match(T__6);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(750);
					match(Identifier);
					}
				}

				setState(753);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(755);
				match(STRUCT);
				setState(756);
				match(Identifier);
				setState(757);
				match(T__7);
				setState(758);
				structDeclarationList();
				setState(759);
				match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(761);
				match(STRUCT);
				setState(762);
				match(Identifier);
				setState(763);
				match(LBRACE);
				setState(764);
				structDeclarationList();
				setState(765);
				match(RBRACE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationListContext extends ParserRuleContext {
		public List<StructDeclarationContext> structDeclaration() {
			return getRuleContexts(StructDeclarationContext.class);
		}
		public StructDeclarationContext structDeclaration(int i) {
			return getRuleContext(StructDeclarationContext.class,i);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterStructDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitStructDeclarationList(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STATIC) | (1L << STRING) | (1L << STRUCT))) != 0) || _la==Identifier) {
				{
				{
				setState(769);
				structDeclaration();
				}
				}
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public QualifierSpecifierListContext qualifierSpecifierList() {
			return getRuleContext(QualifierSpecifierListContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_structDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			qualifierSpecifierList();
			setState(776);
			structDeclaratorList();
			setState(777);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifierSpecifierListContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public QualifierListContext qualifierList() {
			return getRuleContext(QualifierListContext.class,0);
		}
		public QualifierSpecifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifierSpecifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterQualifierSpecifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitQualifierSpecifierList(this);
		}
	}

	public final QualifierSpecifierListContext qualifierSpecifierList() throws RecognitionException {
		QualifierSpecifierListContext _localctx = new QualifierSpecifierListContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_qualifierSpecifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(780);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				{
				setState(779);
				qualifierList();
				}
				break;
			}
			setState(782);
			typeType();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifierListContext extends ParserRuleContext {
		public List<QualifierContext> qualifier() {
			return getRuleContexts(QualifierContext.class);
		}
		public QualifierContext qualifier(int i) {
			return getRuleContext(QualifierContext.class,i);
		}
		public QualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitQualifierList(this);
		}
	}

	public final QualifierListContext qualifierList() throws RecognitionException {
		QualifierListContext _localctx = new QualifierListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_qualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(787);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==STATIC) {
				{
				{
				setState(784);
				qualifier();
				}
				}
				setState(789);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifierContext extends ParserRuleContext {
		public TerminalNode STATIC() { return getToken(ManuScriptParser.STATIC, 0); }
		public TerminalNode FINAL() { return getToken(ManuScriptParser.FINAL, 0); }
		public QualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitQualifier(this);
		}
	}

	public final QualifierContext qualifier() throws RecognitionException {
		QualifierContext _localctx = new QualifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(790);
			_la = _input.LA(1);
			if ( !(_la==FINAL || _la==STATIC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public List<StructDeclaratorContext> structDeclarator() {
			return getRuleContexts(StructDeclaratorContext.class);
		}
		public StructDeclaratorContext structDeclarator(int i) {
			return getRuleContext(StructDeclaratorContext.class,i);
		}
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitStructDeclaratorList(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(792);
				structDeclarator();
				}
				}
				setState(797);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorContext extends ParserRuleContext {
		public StructDeclaratorIdContext structDeclaratorId() {
			return getRuleContext(StructDeclaratorIdContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitStructDeclarator(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_structDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			structDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorIdContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public StructDeclaratorIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterStructDeclaratorId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitStructDeclaratorId(this);
		}
	}

	public final StructDeclaratorIdContext structDeclaratorId() throws RecognitionException {
		StructDeclaratorIdContext _localctx = new StructDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_structDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeDefinitionContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public TypeDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterTypeDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitTypeDefinition(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_typeDefinition);
		try {
			setState(814);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(802);
				match(T__11);
				setState(803);
				typeType();
				setState(804);
				match(T__12);
				setState(805);
				match(Identifier);
				setState(806);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(808);
				match(T__11);
				setState(809);
				structDefinition();
				setState(810);
				match(T__12);
				setState(811);
				match(Identifier);
				setState(812);
				match(SEMI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsContext extends ParserRuleContext {
		public List<TypeArgumentContext> typeArgument() {
			return getRuleContexts(TypeArgumentContext.class);
		}
		public TypeArgumentContext typeArgument(int i) {
			return getRuleContext(TypeArgumentContext.class,i);
		}
		public TypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitTypeArguments(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(816);
			match(LT);
			setState(817);
			typeArgument();
			setState(822);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(818);
				match(COMMA);
				setState(819);
				typeArgument();
				}
				}
				setState(824);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(825);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public TerminalNode EXTENDS() { return getToken(ManuScriptParser.EXTENDS, 0); }
		public TerminalNode SUPER() { return getToken(ManuScriptParser.SUPER, 0); }
		public TypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitTypeArgument(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_typeArgument);
		int _la;
		try {
			setState(833);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case STRUCT:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(827);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(828);
				match(QUESTION);
				setState(831);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(829);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(830);
					typeType();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitQualifiedNameList(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(835);
			qualifiedName();
			setState(840);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(836);
				match(COMMA);
				setState(837);
				qualifiedName();
				}
				}
				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParametersContext extends ParserRuleContext {
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FormalParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterFormalParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitFormalParameters(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(843);
			match(LPAREN);
			setState(845);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0) || _la==Identifier) {
				{
				setState(844);
				formalParameterList();
				}
			}

			setState(847);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterContext> formalParameter() {
			return getRuleContexts(FormalParameterContext.class);
		}
		public FormalParameterContext formalParameter(int i) {
			return getRuleContext(FormalParameterContext.class,i);
		}
		public LastFormalParameterContext lastFormalParameter() {
			return getRuleContext(LastFormalParameterContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterFormalParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitFormalParameterList(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(862);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(849);
				formalParameter();
				setState(854);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(850);
						match(COMMA);
						setState(851);
						formalParameter();
						}
						} 
					}
					setState(856);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,92,_ctx);
				}
				setState(859);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(857);
					match(COMMA);
					setState(858);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(861);
				lastFormalParameter();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public FormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitFormalParameter(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(864);
				variableModifier();
				}
				}
				setState(869);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(870);
			typeType();
			setState(871);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LastFormalParameterContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public LastFormalParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterLastFormalParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitLastFormalParameter(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(873);
				variableModifier();
				}
				}
				setState(878);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(879);
			typeType();
			setState(880);
			match(ELLIPSIS);
			setState(881);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MethodBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MethodBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterMethodBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitMethodBody(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(883);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstructorBodyContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ConstructorBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constructorBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterConstructorBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitConstructorBody(this);
		}
	}

	public final ConstructorBodyContext constructorBody() throws RecognitionException {
		ConstructorBodyContext _localctx = new ConstructorBodyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_constructorBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(885);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ManuScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ManuScriptParser.Identifier, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(887);
			match(Identifier);
			setState(892);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(888);
				match(DOT);
				setState(889);
				match(Identifier);
				}
				}
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode IntegerLiteral() { return getToken(ManuScriptParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(ManuScriptParser.FloatingPointLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(ManuScriptParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(ManuScriptParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(ManuScriptParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(895);
			_la = _input.LA(1);
			if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(ManuScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ManuScriptParser.Identifier, i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_block);
		int _la;
		try {
			setState(929);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(897);
				match(T__3);
				setState(901);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRINT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STARTING) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THROW))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRY - 66)) | (1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(898);
					blockStatement();
					}
					}
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(904);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(905);
				match(T__5);
				setState(907);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(906);
					match(Identifier);
					}
				}

				setState(909);
				match(RBRACE);
				setState(913);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRINT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STARTING) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THROW))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRY - 66)) | (1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(910);
					blockStatement();
					}
					}
					setState(915);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(916);
				match(T__6);
				setState(918);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(917);
					match(Identifier);
					}
				}

				setState(920);
				match(RBRACE);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(921);
				match(LBRACE);
				setState(925);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRINT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STARTING) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THROW))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRY - 66)) | (1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(922);
					blockStatement();
					}
					}
					setState(927);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(928);
				match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationStatementContext localVariableDeclarationStatement() {
			return getRuleContext(LocalVariableDeclarationStatementContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TypeDeclarationContext typeDeclaration() {
			return getRuleContext(TypeDeclarationContext.class,0);
		}
		public BlockStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterBlockStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitBlockStatement(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_blockStatement);
		try {
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(931);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(932);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(933);
				typeDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationStatementContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public LocalVariableDeclarationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclarationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterLocalVariableDeclarationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitLocalVariableDeclarationStatement(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(936);
			localVariableDeclaration();
			setState(937);
			match(SEMI);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalVariableDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public LocalVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterLocalVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitLocalVariableDeclaration(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			typeType();
			setState(940);
			variableDeclarators();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode ASSERT() { return getToken(ManuScriptParser.ASSERT, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(ManuScriptParser.IF, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(ManuScriptParser.ELSE, 0); }
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public TerminalNode FOR() { return getToken(ManuScriptParser.FOR, 0); }
		public TerminalNode DO() { return getToken(ManuScriptParser.DO, 0); }
		public TerminalNode TRY() { return getToken(ManuScriptParser.TRY, 0); }
		public FinallyBlockContext finallyBlock() {
			return getRuleContext(FinallyBlockContext.class,0);
		}
		public List<CatchClauseContext> catchClause() {
			return getRuleContexts(CatchClauseContext.class);
		}
		public CatchClauseContext catchClause(int i) {
			return getRuleContext(CatchClauseContext.class,i);
		}
		public ResourceSpecificationContext resourceSpecification() {
			return getRuleContext(ResourceSpecificationContext.class,0);
		}
		public TerminalNode SWITCH() { return getToken(ManuScriptParser.SWITCH, 0); }
		public List<SwitchBlockStatementGroupContext> switchBlockStatementGroup() {
			return getRuleContexts(SwitchBlockStatementGroupContext.class);
		}
		public SwitchBlockStatementGroupContext switchBlockStatementGroup(int i) {
			return getRuleContext(SwitchBlockStatementGroupContext.class,i);
		}
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(ManuScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ManuScriptParser.Identifier, i);
		}
		public TerminalNode SYNCHRONIZED() { return getToken(ManuScriptParser.SYNCHRONIZED, 0); }
		public TerminalNode RETURN() { return getToken(ManuScriptParser.RETURN, 0); }
		public TerminalNode THROW() { return getToken(ManuScriptParser.THROW, 0); }
		public TerminalNode BREAK() { return getToken(ManuScriptParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(ManuScriptParser.CONTINUE, 0); }
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(942);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(943);
				match(ASSERT);
				setState(944);
				expression(0);
				setState(947);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COLON) {
					{
					setState(945);
					match(COLON);
					setState(946);
					expression(0);
					}
				}

				setState(949);
				match(SEMI);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(951);
				match(IF);
				setState(952);
				parExpression();
				setState(953);
				statement();
				setState(956);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(954);
					match(ELSE);
					setState(955);
					statement();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(959);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(958);
					match(FOR);
					}
				}

				setState(961);
				match(LPAREN);
				setState(962);
				forControl();
				setState(963);
				match(RPAREN);
				setState(964);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(966);
				match(WHILE);
				setState(967);
				parExpression();
				setState(968);
				statement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(970);
				match(DO);
				setState(971);
				statement();
				setState(972);
				match(WHILE);
				setState(973);
				parExpression();
				setState(974);
				match(SEMI);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(976);
				match(TRY);
				setState(977);
				block();
				setState(987);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CATCH:
					{
					setState(979); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(978);
						catchClause();
						}
						}
						setState(981); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( _la==CATCH );
					setState(984);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==FINALLY) {
						{
						setState(983);
						finallyBlock();
						}
					}

					}
					break;
				case FINALLY:
					{
					setState(986);
					finallyBlock();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(989);
				match(TRY);
				setState(990);
				resourceSpecification();
				setState(991);
				block();
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CATCH) {
					{
					{
					setState(992);
					catchClause();
					}
					}
					setState(997);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(999);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FINALLY) {
					{
					setState(998);
					finallyBlock();
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1001);
				match(SWITCH);
				setState(1002);
				parExpression();
				setState(1010);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(1003);
					match(LBRACE);
					}
					break;
				case T__3:
					{
					setState(1004);
					match(T__3);
					}
					break;
				case T__5:
					{
					setState(1005);
					match(T__5);
					setState(1007);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(1006);
						match(Identifier);
						}
					}

					setState(1009);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1015);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1012);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(1017);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
				}
				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(1018);
					switchLabel();
					}
					}
					setState(1023);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1031);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE:
					{
					setState(1024);
					match(RBRACE);
					}
					break;
				case T__4:
					{
					setState(1025);
					match(T__4);
					}
					break;
				case T__6:
					{
					setState(1026);
					match(T__6);
					setState(1028);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(1027);
						match(Identifier);
						}
					}

					setState(1030);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1033);
				match(SYNCHRONIZED);
				setState(1034);
				parExpression();
				setState(1035);
				block();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1037);
				match(RETURN);
				setState(1039);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1038);
					expression(0);
					}
				}

				setState(1041);
				match(SEMI);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1042);
				match(THROW);
				setState(1043);
				expression(0);
				setState(1044);
				match(SEMI);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1046);
				match(BREAK);
				setState(1048);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1047);
					match(Identifier);
					}
				}

				setState(1050);
				match(SEMI);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1051);
				match(CONTINUE);
				setState(1053);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(1052);
					match(Identifier);
					}
				}

				setState(1055);
				match(SEMI);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1056);
				match(SEMI);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1057);
				statementExpression();
				setState(1058);
				match(SEMI);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1060);
				match(Identifier);
				setState(1061);
				match(COLON);
				setState(1062);
				statement();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1063);
				outputStatement();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1064);
				inputStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public TerminalNode CATCH() { return getToken(ManuScriptParser.CATCH, 0); }
		public CatchTypeContext catchType() {
			return getRuleContext(CatchTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(CATCH);
			setState(1068);
			match(LPAREN);
			setState(1072);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1069);
				variableModifier();
				}
				}
				setState(1074);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1075);
			catchType();
			setState(1076);
			match(Identifier);
			setState(1077);
			match(RPAREN);
			setState(1078);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchTypeContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CatchTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterCatchType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitCatchType(this);
		}
	}

	public final CatchTypeContext catchType() throws RecognitionException {
		CatchTypeContext _localctx = new CatchTypeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_catchType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1080);
			qualifiedName();
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITOR) {
				{
				{
				setState(1081);
				match(BITOR);
				setState(1082);
				qualifiedName();
				}
				}
				setState(1087);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FinallyBlockContext extends ParserRuleContext {
		public TerminalNode FINALLY() { return getToken(ManuScriptParser.FINALLY, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FinallyBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_finallyBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterFinallyBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitFinallyBlock(this);
		}
	}

	public final FinallyBlockContext finallyBlock() throws RecognitionException {
		FinallyBlockContext _localctx = new FinallyBlockContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_finallyBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1088);
			match(FINALLY);
			setState(1089);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceSpecificationContext extends ParserRuleContext {
		public ResourcesContext resources() {
			return getRuleContext(ResourcesContext.class,0);
		}
		public ResourceSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resourceSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterResourceSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitResourceSpecification(this);
		}
	}

	public final ResourceSpecificationContext resourceSpecification() throws RecognitionException {
		ResourceSpecificationContext _localctx = new ResourceSpecificationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_resourceSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(LPAREN);
			setState(1092);
			resources();
			setState(1094);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMI) {
				{
				setState(1093);
				match(SEMI);
				}
			}

			setState(1096);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourcesContext extends ParserRuleContext {
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public ResourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterResources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitResources(this);
		}
	}

	public final ResourcesContext resources() throws RecognitionException {
		ResourcesContext _localctx = new ResourcesContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_resources);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1098);
			resource();
			setState(1103);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1099);
					match(SEMI);
					setState(1100);
					resource();
					}
					} 
				}
				setState(1105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public ClassOrInterfaceTypeContext classOrInterfaceType() {
			return getRuleContext(ClassOrInterfaceTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitResource(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_resource);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1106);
				variableModifier();
				}
				}
				setState(1111);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1112);
			classOrInterfaceType();
			setState(1113);
			variableDeclaratorId();
			setState(1114);
			match(ASSIGN);
			setState(1115);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchBlockStatementGroupContext extends ParserRuleContext {
		public List<SwitchLabelContext> switchLabel() {
			return getRuleContexts(SwitchLabelContext.class);
		}
		public SwitchLabelContext switchLabel(int i) {
			return getRuleContext(SwitchLabelContext.class,i);
		}
		public List<BlockStatementContext> blockStatement() {
			return getRuleContexts(BlockStatementContext.class);
		}
		public BlockStatementContext blockStatement(int i) {
			return getRuleContext(BlockStatementContext.class,i);
		}
		public SwitchBlockStatementGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchBlockStatementGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterSwitchBlockStatementGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitSwitchBlockStatementGroup(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1117);
				switchLabel();
				}
				}
				setState(1120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(1123); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1122);
				blockStatement();
				}
				}
				setState(1125); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << ABSTRACT) | (1L << ASSERT) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << CONTINUE) | (1L << DO) | (1L << DOUBLE) | (1L << ENUM) | (1L << FINAL) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << INTERFACE) | (1L << LONG) | (1L << PRINT) | (1L << PRIVATE) | (1L << PROTECTED) | (1L << PUBLIC) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STARTING) | (1L << STATIC) | (1L << STRICTFP) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH) | (1L << SYNCHRONIZED) | (1L << THROW))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (TRY - 66)) | (1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchLabelContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(ManuScriptParser.CASE, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumConstantNameContext enumConstantName() {
			return getRuleContext(EnumConstantNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(ManuScriptParser.DEFAULT, 0); }
		public SwitchLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterSwitchLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitSwitchLabel(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_switchLabel);
		try {
			setState(1137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1127);
				match(CASE);
				setState(1128);
				constantExpression();
				setState(1129);
				match(COLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				match(CASE);
				setState(1132);
				enumConstantName();
				setState(1133);
				match(COLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1135);
				match(DEFAULT);
				setState(1136);
				match(COLON);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForControlContext extends ParserRuleContext {
		public EnhancedForControlContext enhancedForControl() {
			return getRuleContext(EnhancedForControlContext.class,0);
		}
		public ForInitContext forInit() {
			return getRuleContext(ForInitContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForUpdateContext forUpdate() {
			return getRuleContext(ForUpdateContext.class,0);
		}
		public ForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitForControl(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_forControl);
		int _la;
		try {
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1139);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1140);
					forInit();
					}
				}

				setState(1143);
				match(SEMI);
				setState(1145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1144);
					expression(0);
					}
				}

				setState(1147);
				match(SEMI);
				setState(1149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (Identifier - 69)))) != 0)) {
					{
					setState(1148);
					forUpdate();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInitContext extends ParserRuleContext {
		public LocalVariableDeclarationContext localVariableDeclaration() {
			return getRuleContext(LocalVariableDeclarationContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterForInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitForInit(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_forInit);
		try {
			setState(1155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1153);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1154);
				expressionList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnhancedForControlContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VariableModifierContext> variableModifier() {
			return getRuleContexts(VariableModifierContext.class);
		}
		public VariableModifierContext variableModifier(int i) {
			return getRuleContext(VariableModifierContext.class,i);
		}
		public EnhancedForControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enhancedForControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterEnhancedForControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitEnhancedForControl(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(1157);
				variableModifier();
				}
				}
				setState(1162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1163);
			typeType();
			setState(1164);
			variableDeclaratorId();
			setState(1165);
			match(COLON);
			setState(1166);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForUpdateContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ForUpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forUpdate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterForUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitForUpdate(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			expressionList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(ManuScriptParser.PRINT, 0); }
		public List<OutputValueContext> outputValue() {
			return getRuleContexts(OutputValueContext.class);
		}
		public OutputValueContext outputValue(int i) {
			return getRuleContext(OutputValueContext.class,i);
		}
		public OutputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterOutputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitOutputStatement(this);
		}
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_outputStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			match(PRINT);
			setState(1171);
			outputValue();
			setState(1176);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1172);
					match(ADD);
					setState(1173);
					outputValue();
					}
					} 
				}
				setState(1178);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,137,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputValueContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(ManuScriptParser.StringLiteral, 0); }
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public OutputValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterOutputValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitOutputValue(this);
		}
	}

	public final OutputValueContext outputValue() throws RecognitionException {
		OutputValueContext _localctx = new OutputValueContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_outputValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1179);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputStatementContext extends ParserRuleContext {
		public TerminalNode SCAN() { return getToken(ManuScriptParser.SCAN, 0); }
		public TerminalNode SCANTO() { return getToken(ManuScriptParser.SCANTO, 0); }
		public VariableDeclaratorIdContext variableDeclaratorId() {
			return getRuleContext(VariableDeclaratorIdContext.class,0);
		}
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public InputStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterInputStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitInputStatement(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_inputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			match(SCAN);
			setState(1183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0) || _la==Identifier) {
				{
				setState(1182);
				typeType();
				}
			}

			setState(1185);
			match(SCANTO);
			setState(1186);
			variableDeclaratorId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterParExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitParExpression(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(LPAREN);
			setState(1189);
			expression(0);
			setState(1190);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitExpressionList(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			expression(0);
			setState(1197);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1193);
				match(COMMA);
				setState(1194);
				expression(0);
				}
				}
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterStatementExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitStatementExpression(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitConstantExpression(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NegationExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NegationExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterNegationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitNegationExpr(this);
		}
	}
	public static class AddSubExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AddSubExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterAddSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitAddSubExpr(this);
		}
	}
	public static class ArrayExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterArrayExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitArrayExpr(this);
		}
	}
	public static class OrExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitOrExpr(this);
		}
	}
	public static class OneLineIfExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OneLineIfExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterOneLineIfExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitOneLineIfExpr(this);
		}
	}
	public static class ComparisonExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ComparisonExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterComparisonExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitComparisonExpr(this);
		}
	}
	public static class FunctionExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public FunctionExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterFunctionExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitFunctionExpr(this);
		}
	}
	public static class PostIncDecExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PostIncDecExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterPostIncDecExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitPostIncDecExpr(this);
		}
	}
	public static class PrimaryExprContext extends ExpressionContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public PrimaryExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterPrimaryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitPrimaryExpr(this);
		}
	}
	public static class MultDivModExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultDivModExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterMultDivModExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitMultDivModExpr(this);
		}
	}
	public static class AssignExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AssignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterAssignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitAssignExpr(this);
		}
	}
	public static class PreIncDecSignExprContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PreIncDecSignExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterPreIncDecSignExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitPreIncDecSignExpr(this);
		}
	}
	public static class EqualityExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EqualityExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitEqualityExpr(this);
		}
	}
	public static class AndExprContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitAndExpr(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 182;
		enterRecursionRule(_localctx, 182, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case MUL:
			case Identifier:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1205);
				primary();
				}
				break;
			case INC:
			case DEC:
			case ADD:
			case SUB:
				{
				_localctx = new PreIncDecSignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1206);
				_la = _input.LA(1);
				if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (INC - 97)) | (1L << (DEC - 97)) | (1L << (ADD - 97)) | (1L << (SUB - 97)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1207);
				expression(10);
				}
				break;
			case BANG:
			case TILDE:
				{
				_localctx = new NegationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1208);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1209);
				expression(9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(1254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1252);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1212);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1213);
						_la = _input.LA(1);
						if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (MUL - 101)) | (1L << (DIV - 101)) | (1L << (MOD - 101)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1214);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1215);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1216);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1217);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1218);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1219);
						_la = _input.LA(1);
						if ( !(((((_la - 85)) & ~0x3f) == 0 && ((1L << (_la - 85)) & ((1L << (GT - 85)) | (1L << (LT - 85)) | (1L << (LE - 85)) | (1L << (GE - 85)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1220);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1221);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1222);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1223);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1224);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1225);
						match(AND);
						setState(1226);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1227);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1228);
						match(OR);
						setState(1229);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new OneLineIfExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1230);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1231);
						match(QUESTION);
						setState(1232);
						expression(0);
						setState(1233);
						match(COLON);
						setState(1234);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1236);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1237);
						_la = _input.LA(1);
						if ( !(((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (ASSIGN - 84)) | (1L << (ADD_ASSIGN - 84)) | (1L << (SUB_ASSIGN - 84)) | (1L << (MUL_ASSIGN - 84)) | (1L << (DIV_ASSIGN - 84)) | (1L << (MOD_ASSIGN - 84)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1238);
						expression(1);
						}
						break;
					case 9:
						{
						_localctx = new ArrayExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1239);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(1240);
						match(LBRACK);
						setState(1241);
						expression(0);
						setState(1242);
						match(RBRACK);
						}
						break;
					case 10:
						{
						_localctx = new FunctionExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1244);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1245);
						match(LPAREN);
						setState(1247);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (Identifier - 69)))) != 0)) {
							{
							setState(1246);
							expressionList();
							}
						}

						setState(1249);
						match(RPAREN);
						}
						break;
					case 11:
						{
						_localctx = new PostIncDecExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(1250);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(1251);
						_la = _input.LA(1);
						if ( !(_la==INC || _la==DEC) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					}
					} 
				}
				setState(1256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,143,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitPrimary(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_primary);
		try {
			setState(1265);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1257);
				match(LPAREN);
				setState(1258);
				expression(0);
				setState(1259);
				match(RPAREN);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(1261);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(1262);
				match(Identifier);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(1263);
				match(MUL);
				setState(1264);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatorContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
		}
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public ArrayCreatorRestContext arrayCreatorRest() {
			return getRuleContext(ArrayCreatorRestContext.class,0);
		}
		public CreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitCreator(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_creator);
		try {
			setState(1276);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1267);
				nonWildcardTypeArguments();
				setState(1268);
				createdName();
				setState(1269);
				classCreatorRest();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1271);
				createdName();
				setState(1274);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACK:
					{
					setState(1272);
					arrayCreatorRest();
					}
					break;
				case LPAREN:
					{
					setState(1273);
					classCreatorRest();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreatedNameContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(ManuScriptParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(ManuScriptParser.Identifier, i);
		}
		public List<TypeArgumentsOrDiamondContext> typeArgumentsOrDiamond() {
			return getRuleContexts(TypeArgumentsOrDiamondContext.class);
		}
		public TypeArgumentsOrDiamondContext typeArgumentsOrDiamond(int i) {
			return getRuleContext(TypeArgumentsOrDiamondContext.class,i);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public CreatedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createdName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterCreatedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitCreatedName(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_createdName);
		int _la;
		try {
			setState(1293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1278);
				match(Identifier);
				setState(1280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(1279);
					typeArgumentsOrDiamond();
					}
				}

				setState(1289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1282);
					match(DOT);
					setState(1283);
					match(Identifier);
					setState(1285);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LT) {
						{
						setState(1284);
						typeArgumentsOrDiamond();
						}
					}

					}
					}
					setState(1291);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(1292);
				primitiveType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InnerCreatorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public ClassCreatorRestContext classCreatorRest() {
			return getRuleContext(ClassCreatorRestContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() {
			return getRuleContext(NonWildcardTypeArgumentsOrDiamondContext.class,0);
		}
		public InnerCreatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerCreator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterInnerCreator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitInnerCreator(this);
		}
	}

	public final InnerCreatorContext innerCreator() throws RecognitionException {
		InnerCreatorContext _localctx = new InnerCreatorContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_innerCreator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1295);
			match(Identifier);
			setState(1297);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(1296);
				nonWildcardTypeArgumentsOrDiamond();
				}
			}

			setState(1299);
			classCreatorRest();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayCreatorRestContext extends ParserRuleContext {
		public ArrayInitializerContext arrayInitializer() {
			return getRuleContext(ArrayInitializerContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterArrayCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitArrayCreatorRest(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1301);
			match(LBRACK);
			setState(1329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(1302);
				match(RBRACK);
				setState(1307);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1303);
					match(LBRACK);
					setState(1304);
					match(RBRACK);
					}
					}
					setState(1309);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1310);
				arrayInitializer();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case BANG:
			case TILDE:
			case INC:
			case DEC:
			case ADD:
			case SUB:
			case MUL:
			case Identifier:
				{
				setState(1311);
				expression(0);
				setState(1312);
				match(RBRACK);
				setState(1319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1313);
						match(LBRACK);
						setState(1314);
						expression(0);
						setState(1315);
						match(RBRACK);
						}
						} 
					}
					setState(1321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
				}
				setState(1326);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(1322);
					match(LBRACK);
					setState(1323);
					match(RBRACK);
					}
					}
					setState(1328);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassCreatorRestContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public ClassCreatorRestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classCreatorRest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterClassCreatorRest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitClassCreatorRest(this);
		}
	}

	public final ClassCreatorRestContext classCreatorRest() throws RecognitionException {
		ClassCreatorRestContext _localctx = new ClassCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_classCreatorRest);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1331);
			arguments();
			setState(1333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__7))) != 0) || _la==LBRACE) {
				{
				setState(1332);
				classBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() {
			return getRuleContext(ExplicitGenericInvocationSuffixContext.class,0);
		}
		public ExplicitGenericInvocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterExplicitGenericInvocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitExplicitGenericInvocation(this);
		}
	}

	public final ExplicitGenericInvocationContext explicitGenericInvocation() throws RecognitionException {
		ExplicitGenericInvocationContext _localctx = new ExplicitGenericInvocationContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_explicitGenericInvocation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1335);
			nonWildcardTypeArguments();
			setState(1336);
			explicitGenericInvocationSuffix();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsContext extends ParserRuleContext {
		public TypeListContext typeList() {
			return getRuleContext(TypeListContext.class,0);
		}
		public NonWildcardTypeArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterNonWildcardTypeArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitNonWildcardTypeArguments(this);
		}
	}

	public final NonWildcardTypeArgumentsContext nonWildcardTypeArguments() throws RecognitionException {
		NonWildcardTypeArgumentsContext _localctx = new NonWildcardTypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_nonWildcardTypeArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1338);
			match(LT);
			setState(1339);
			typeList();
			setState(1340);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeArgumentsOrDiamondContext extends ParserRuleContext {
		public TypeArgumentsContext typeArguments() {
			return getRuleContext(TypeArgumentsContext.class,0);
		}
		public TypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitTypeArgumentsOrDiamond(this);
		}
	}

	public final TypeArgumentsOrDiamondContext typeArgumentsOrDiamond() throws RecognitionException {
		TypeArgumentsOrDiamondContext _localctx = new TypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_typeArgumentsOrDiamond);
		try {
			setState(1345);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1342);
				match(LT);
				setState(1343);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1344);
				typeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonWildcardTypeArgumentsOrDiamondContext extends ParserRuleContext {
		public NonWildcardTypeArgumentsContext nonWildcardTypeArguments() {
			return getRuleContext(NonWildcardTypeArgumentsContext.class,0);
		}
		public NonWildcardTypeArgumentsOrDiamondContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonWildcardTypeArgumentsOrDiamond; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterNonWildcardTypeArgumentsOrDiamond(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitNonWildcardTypeArgumentsOrDiamond(this);
		}
	}

	public final NonWildcardTypeArgumentsOrDiamondContext nonWildcardTypeArgumentsOrDiamond() throws RecognitionException {
		NonWildcardTypeArgumentsOrDiamondContext _localctx = new NonWildcardTypeArgumentsOrDiamondContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_nonWildcardTypeArgumentsOrDiamond);
		try {
			setState(1350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1347);
				match(LT);
				setState(1348);
				match(GT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1349);
				nonWildcardTypeArguments();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperSuffixContext extends ParserRuleContext {
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public SuperSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterSuperSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitSuperSuffix(this);
		}
	}

	public final SuperSuffixContext superSuffix() throws RecognitionException {
		SuperSuffixContext _localctx = new SuperSuffixContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_superSuffix);
		int _la;
		try {
			setState(1358);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1352);
				arguments();
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1353);
				match(DOT);
				setState(1354);
				match(Identifier);
				setState(1356);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAREN) {
					{
					setState(1355);
					arguments();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplicitGenericInvocationSuffixContext extends ParserRuleContext {
		public TerminalNode SUPER() { return getToken(ManuScriptParser.SUPER, 0); }
		public SuperSuffixContext superSuffix() {
			return getRuleContext(SuperSuffixContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ExplicitGenericInvocationSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explicitGenericInvocationSuffix; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterExplicitGenericInvocationSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitExplicitGenericInvocationSuffix(this);
		}
	}

	public final ExplicitGenericInvocationSuffixContext explicitGenericInvocationSuffix() throws RecognitionException {
		ExplicitGenericInvocationSuffixContext _localctx = new ExplicitGenericInvocationSuffixContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_explicitGenericInvocationSuffix);
		try {
			setState(1364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SUPER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				match(SUPER);
				setState(1361);
				superSuffix();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1362);
				match(Identifier);
				setState(1363);
				arguments();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentsContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			match(LPAREN);
			setState(1368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (IntegerLiteral - 69)) | (1L << (FloatingPointLiteral - 69)) | (1L << (BooleanLiteral - 69)) | (1L << (CharacterLiteral - 69)) | (1L << (StringLiteral - 69)) | (1L << (NullLiteral - 69)) | (1L << (LPAREN - 69)) | (1L << (BANG - 69)) | (1L << (TILDE - 69)) | (1L << (INC - 69)) | (1L << (DEC - 69)) | (1L << (ADD - 69)) | (1L << (SUB - 69)) | (1L << (MUL - 69)) | (1L << (Identifier - 69)))) != 0)) {
				{
				setState(1367);
				expressionList();
				}
			}

			setState(1370);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 91:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3}\u055f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\3\2\5"+
		"\2\u00d6\n\2\3\2\7\2\u00d9\n\2\f\2\16\2\u00dc\13\2\3\2\5\2\u00df\n\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\5\4\u00ea\n\4\3\4\3\4\3\5\7\5\u00ef"+
		"\n\5\f\5\16\5\u00f2\13\5\3\5\3\5\7\5\u00f6\n\5\f\5\16\5\u00f9\13\5\3\5"+
		"\3\5\7\5\u00fd\n\5\f\5\16\5\u0100\13\5\3\5\3\5\5\5\u0104\n\5\3\6\3\6\5"+
		"\6\u0108\n\6\3\7\3\7\3\b\3\b\3\t\3\t\5\t\u0110\n\t\3\t\3\t\3\t\5\t\u0115"+
		"\n\t\3\t\3\t\5\t\u0119\n\t\3\t\3\t\5\t\u011d\n\t\3\t\3\t\3\n\3\n\3\n\3"+
		"\n\7\n\u0125\n\n\f\n\16\n\u0128\13\n\3\n\3\n\3\13\3\13\3\13\5\13\u012f"+
		"\n\13\3\f\3\f\3\f\7\f\u0134\n\f\f\f\16\f\u0137\13\f\3\r\3\r\3\r\3\r\5"+
		"\r\u013d\n\r\3\r\3\r\5\r\u0141\n\r\3\r\5\r\u0144\n\r\3\r\5\r\u0147\n\r"+
		"\3\r\3\r\3\16\3\16\3\16\7\16\u014e\n\16\f\16\16\16\u0151\13\16\3\17\3"+
		"\17\5\17\u0155\n\17\3\17\5\17\u0158\n\17\3\20\3\20\7\20\u015c\n\20\f\20"+
		"\16\20\u015f\13\20\3\21\3\21\3\21\5\21\u0164\n\21\3\21\3\21\5\21\u0168"+
		"\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u016f\n\22\f\22\16\22\u0172\13\22"+
		"\3\23\3\23\7\23\u0176\n\23\f\23\16\23\u0179\13\23\3\23\3\23\3\23\7\23"+
		"\u017e\n\23\f\23\16\23\u0181\13\23\3\23\3\23\3\23\5\23\u0186\n\23\3\23"+
		"\3\23\7\23\u018a\n\23\f\23\16\23\u018d\13\23\3\23\3\23\5\23\u0191\n\23"+
		"\3\23\3\23\3\23\7\23\u0196\n\23\f\23\16\23\u0199\13\23\3\23\5\23\u019c"+
		"\n\23\3\24\3\24\7\24\u01a0\n\24\f\24\16\24\u01a3\13\24\3\24\3\24\3\24"+
		"\5\24\u01a8\n\24\3\24\3\24\7\24\u01ac\n\24\f\24\16\24\u01af\13\24\3\24"+
		"\3\24\5\24\u01b3\n\24\3\24\3\24\3\24\7\24\u01b8\n\24\f\24\16\24\u01bb"+
		"\13\24\3\24\5\24\u01be\n\24\3\25\3\25\5\25\u01c2\n\25\3\25\3\25\3\25\7"+
		"\25\u01c7\n\25\f\25\16\25\u01ca\13\25\3\25\5\25\u01cd\n\25\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u01d7\n\26\3\27\7\27\u01da\n\27\f\27"+
		"\16\27\u01dd\13\27\3\27\3\27\3\27\3\27\3\27\3\27\7\27\u01e5\n\27\f\27"+
		"\16\27\u01e8\13\27\3\27\3\27\5\27\u01ec\n\27\3\27\3\27\5\27\u01f0\n\27"+
		"\3\30\3\30\3\31\3\31\3\31\3\32\7\32\u01f8\n\32\f\32\16\32\u01fb\13\32"+
		"\3\32\3\32\3\32\3\32\3\32\5\32\u0202\n\32\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\7\35\u020c\n\35\f\35\16\35\u020f\13\35\3\35\3\35\3\35\3\35"+
		"\3\36\3\36\3\37\3\37\7\37\u0219\n\37\f\37\16\37\u021c\13\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0223\n\37\3\37\3\37\7\37\u0227\n\37\f\37\16\37\u022a"+
		"\13\37\3\37\3\37\3\37\5\37\u022f\n\37\3\37\3\37\3\37\3\37\7\37\u0235\n"+
		"\37\f\37\16\37\u0238\13\37\3\37\3\37\3\37\3\37\3\37\7\37\u023f\n\37\f"+
		"\37\16\37\u0242\13\37\3\37\3\37\3\37\3\37\5\37\u0248\n\37\3 \3 \3 \3 "+
		"\3 \3 \5 \u0250\n \3!\3!\3!\3!\7!\u0256\n!\f!\16!\u0259\13!\3!\3!\3\""+
		"\3\"\3\"\7\"\u0260\n\"\f\"\16\"\u0263\13\"\3\"\3\"\3\"\3#\3#\3#\3#\3#"+
		"\7#\u026d\n#\f#\16#\u0270\13#\3#\3#\5#\u0274\n#\3#\3#\3$\3$\3$\3%\3%\3"+
		"%\7%\u027e\n%\f%\16%\u0281\13%\3&\3&\3&\5&\u0286\n&\3\'\3\'\3\'\7\'\u028b"+
		"\n\'\f\'\16\'\u028e\13\'\3(\3(\5(\u0292\n(\3)\3)\3)\3)\7)\u0298\n)\f)"+
		"\16)\u029b\13)\3)\5)\u029e\n)\5)\u02a0\n)\3)\3)\3*\3*\3+\3+\3+\7+\u02a9"+
		"\n+\f+\16+\u02ac\13+\3+\3+\3+\7+\u02b1\n+\f+\16+\u02b4\13+\3+\3+\3+\7"+
		"+\u02b9\n+\f+\16+\u02bc\13+\3+\3+\3+\7+\u02c1\n+\f+\16+\u02c4\13+\5+\u02c6"+
		"\n+\3,\3,\3,\5,\u02cb\n,\3,\3,\3-\3-\3-\3.\3.\5.\u02d4\n.\3.\3.\3.\5."+
		"\u02d9\n.\7.\u02db\n.\f.\16.\u02de\13.\3/\3/\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\5\60\u02ec\n\60\3\60\3\60\3\60\3\60\5\60\u02f2"+
		"\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\5\60\u0302\n\60\3\61\7\61\u0305\n\61\f\61\16\61\u0308\13\61\3\62"+
		"\3\62\3\62\3\62\3\63\5\63\u030f\n\63\3\63\3\63\3\64\7\64\u0314\n\64\f"+
		"\64\16\64\u0317\13\64\3\65\3\65\3\66\7\66\u031c\n\66\f\66\16\66\u031f"+
		"\13\66\3\67\3\67\38\38\39\39\39\39\39\39\39\39\39\39\39\39\59\u0331\n"+
		"9\3:\3:\3:\3:\7:\u0337\n:\f:\16:\u033a\13:\3:\3:\3;\3;\3;\3;\5;\u0342"+
		"\n;\5;\u0344\n;\3<\3<\3<\7<\u0349\n<\f<\16<\u034c\13<\3=\3=\5=\u0350\n"+
		"=\3=\3=\3>\3>\3>\7>\u0357\n>\f>\16>\u035a\13>\3>\3>\5>\u035e\n>\3>\5>"+
		"\u0361\n>\3?\7?\u0364\n?\f?\16?\u0367\13?\3?\3?\3?\3@\7@\u036d\n@\f@\16"+
		"@\u0370\13@\3@\3@\3@\3@\3A\3A\3B\3B\3C\3C\3C\7C\u037d\nC\fC\16C\u0380"+
		"\13C\3D\3D\3E\3E\7E\u0386\nE\fE\16E\u0389\13E\3E\3E\3E\5E\u038e\nE\3E"+
		"\3E\7E\u0392\nE\fE\16E\u0395\13E\3E\3E\5E\u0399\nE\3E\3E\3E\7E\u039e\n"+
		"E\fE\16E\u03a1\13E\3E\5E\u03a4\nE\3F\3F\3F\5F\u03a9\nF\3G\3G\3G\3H\3H"+
		"\3H\3I\3I\3I\3I\3I\5I\u03b6\nI\3I\3I\3I\3I\3I\3I\3I\5I\u03bf\nI\3I\5I"+
		"\u03c2\nI\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\3I\6I\u03d6"+
		"\nI\rI\16I\u03d7\3I\5I\u03db\nI\3I\5I\u03de\nI\3I\3I\3I\3I\7I\u03e4\n"+
		"I\fI\16I\u03e7\13I\3I\5I\u03ea\nI\3I\3I\3I\3I\3I\3I\5I\u03f2\nI\3I\5I"+
		"\u03f5\nI\3I\7I\u03f8\nI\fI\16I\u03fb\13I\3I\7I\u03fe\nI\fI\16I\u0401"+
		"\13I\3I\3I\3I\3I\5I\u0407\nI\3I\5I\u040a\nI\3I\3I\3I\3I\3I\3I\5I\u0412"+
		"\nI\3I\3I\3I\3I\3I\3I\3I\5I\u041b\nI\3I\3I\3I\5I\u0420\nI\3I\3I\3I\3I"+
		"\3I\3I\3I\3I\3I\3I\5I\u042c\nI\3J\3J\3J\7J\u0431\nJ\fJ\16J\u0434\13J\3"+
		"J\3J\3J\3J\3J\3K\3K\3K\7K\u043e\nK\fK\16K\u0441\13K\3L\3L\3L\3M\3M\3M"+
		"\5M\u0449\nM\3M\3M\3N\3N\3N\7N\u0450\nN\fN\16N\u0453\13N\3O\7O\u0456\n"+
		"O\fO\16O\u0459\13O\3O\3O\3O\3O\3O\3P\6P\u0461\nP\rP\16P\u0462\3P\6P\u0466"+
		"\nP\rP\16P\u0467\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0474\nQ\3R\3R\5R\u0478"+
		"\nR\3R\3R\5R\u047c\nR\3R\3R\5R\u0480\nR\5R\u0482\nR\3S\3S\5S\u0486\nS"+
		"\3T\7T\u0489\nT\fT\16T\u048c\13T\3T\3T\3T\3T\3T\3U\3U\3V\3V\3V\3V\7V\u0499"+
		"\nV\fV\16V\u049c\13V\3W\3W\3X\3X\5X\u04a2\nX\3X\3X\3X\3Y\3Y\3Y\3Y\3Z\3"+
		"Z\3Z\7Z\u04ae\nZ\fZ\16Z\u04b1\13Z\3[\3[\3\\\3\\\3]\3]\3]\3]\3]\3]\5]\u04bd"+
		"\n]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]"+
		"\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\3]\5]\u04e2\n]\3]\3]\3]\7]\u04e7"+
		"\n]\f]\16]\u04ea\13]\3^\3^\3^\3^\3^\3^\3^\3^\5^\u04f4\n^\3_\3_\3_\3_\3"+
		"_\3_\3_\5_\u04fd\n_\5_\u04ff\n_\3`\3`\5`\u0503\n`\3`\3`\3`\5`\u0508\n"+
		"`\7`\u050a\n`\f`\16`\u050d\13`\3`\5`\u0510\n`\3a\3a\5a\u0514\na\3a\3a"+
		"\3b\3b\3b\3b\7b\u051c\nb\fb\16b\u051f\13b\3b\3b\3b\3b\3b\3b\3b\7b\u0528"+
		"\nb\fb\16b\u052b\13b\3b\3b\7b\u052f\nb\fb\16b\u0532\13b\5b\u0534\nb\3"+
		"c\3c\5c\u0538\nc\3d\3d\3d\3e\3e\3e\3e\3f\3f\3f\5f\u0544\nf\3g\3g\3g\5"+
		"g\u0549\ng\3h\3h\3h\3h\5h\u054f\nh\5h\u0551\nh\3i\3i\3i\3i\5i\u0557\n"+
		"i\3j\3j\5j\u055b\nj\3j\3j\3j\2\3\u00b8k\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\2\24\5\2--??CC\6\2\20\20!!\61\639:\6\2"+
		"\20\20!!\61\6399\3\2\61\63\5\2!!\61\6399\13\2\22\22\24\24\27\27\35\35"+
		"##**,,\67\67;;\4\2!!99\4\2  ==\3\2GL\4\2KKxx\3\2cf\3\2YZ\4\2ghll\3\2e"+
		"f\4\2WX^_\4\2]]``\5\2VVmptt\3\2cd\2\u05d3\2\u00d5\3\2\2\2\4\u00e2\3\2"+
		"\2\2\6\u00e6\3\2\2\2\b\u0103\3\2\2\2\n\u0107\3\2\2\2\f\u0109\3\2\2\2\16"+
		"\u010b\3\2\2\2\20\u010d\3\2\2\2\22\u0120\3\2\2\2\24\u012b\3\2\2\2\26\u0130"+
		"\3\2\2\2\30\u0138\3\2\2\2\32\u014a\3\2\2\2\34\u0152\3\2\2\2\36\u0159\3"+
		"\2\2\2 \u0160\3\2\2\2\"\u016b\3\2\2\2$\u019b\3\2\2\2&\u01bd\3\2\2\2(\u01cc"+
		"\3\2\2\2*\u01d6\3\2\2\2,\u01db\3\2\2\2.\u01f1\3\2\2\2\60\u01f3\3\2\2\2"+
		"\62\u01f9\3\2\2\2\64\u0205\3\2\2\2\66\u0207\3\2\2\28\u020d\3\2\2\2:\u0214"+
		"\3\2\2\2<\u0247\3\2\2\2>\u024f\3\2\2\2@\u0251\3\2\2\2B\u025c\3\2\2\2D"+
		"\u0267\3\2\2\2F\u0277\3\2\2\2H\u027a\3\2\2\2J\u0282\3\2\2\2L\u0287\3\2"+
		"\2\2N\u0291\3\2\2\2P\u0293\3\2\2\2R\u02a3\3\2\2\2T\u02c5\3\2\2\2V\u02ca"+
		"\3\2\2\2X\u02ce\3\2\2\2Z\u02d1\3\2\2\2\\\u02df\3\2\2\2^\u0301\3\2\2\2"+
		"`\u0306\3\2\2\2b\u0309\3\2\2\2d\u030e\3\2\2\2f\u0315\3\2\2\2h\u0318\3"+
		"\2\2\2j\u031d\3\2\2\2l\u0320\3\2\2\2n\u0322\3\2\2\2p\u0330\3\2\2\2r\u0332"+
		"\3\2\2\2t\u0343\3\2\2\2v\u0345\3\2\2\2x\u034d\3\2\2\2z\u0360\3\2\2\2|"+
		"\u0365\3\2\2\2~\u036e\3\2\2\2\u0080\u0375\3\2\2\2\u0082\u0377\3\2\2\2"+
		"\u0084\u0379\3\2\2\2\u0086\u0381\3\2\2\2\u0088\u03a3\3\2\2\2\u008a\u03a8"+
		"\3\2\2\2\u008c\u03aa\3\2\2\2\u008e\u03ad\3\2\2\2\u0090\u042b\3\2\2\2\u0092"+
		"\u042d\3\2\2\2\u0094\u043a\3\2\2\2\u0096\u0442\3\2\2\2\u0098\u0445\3\2"+
		"\2\2\u009a\u044c\3\2\2\2\u009c\u0457\3\2\2\2\u009e\u0460\3\2\2\2\u00a0"+
		"\u0473\3\2\2\2\u00a2\u0481\3\2\2\2\u00a4\u0485\3\2\2\2\u00a6\u048a\3\2"+
		"\2\2\u00a8\u0492\3\2\2\2\u00aa\u0494\3\2\2\2\u00ac\u049d\3\2\2\2\u00ae"+
		"\u049f\3\2\2\2\u00b0\u04a6\3\2\2\2\u00b2\u04aa\3\2\2\2\u00b4\u04b2\3\2"+
		"\2\2\u00b6\u04b4\3\2\2\2\u00b8\u04bc\3\2\2\2\u00ba\u04f3\3\2\2\2\u00bc"+
		"\u04fe\3\2\2\2\u00be\u050f\3\2\2\2\u00c0\u0511\3\2\2\2\u00c2\u0517\3\2"+
		"\2\2\u00c4\u0535\3\2\2\2\u00c6\u0539\3\2\2\2\u00c8\u053c\3\2\2\2\u00ca"+
		"\u0543\3\2\2\2\u00cc\u0548\3\2\2\2\u00ce\u0550\3\2\2\2\u00d0\u0556\3\2"+
		"\2\2\u00d2\u0558\3\2\2\2\u00d4\u00d6\5\4\3\2\u00d5\u00d4\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00da\3\2\2\2\u00d7\u00d9\5\6\4\2\u00d8\u00d7\3\2"+
		"\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00df\5\b\5\2\u00de\u00dd\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7\2\2\3\u00e1"+
		"\3\3\2\2\2\u00e2\u00e3\7/\2\2\u00e3\u00e4\5\u0084C\2\u00e4\u00e5\7S\2"+
		"\2\u00e5\5\3\2\2\2\u00e6\u00e7\7(\2\2\u00e7\u00e9\5\u0084C\2\u00e8\u00ea"+
		"\7\3\2\2\u00e9\u00e8\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb"+
		"\u00ec\7S\2\2\u00ec\7\3\2\2\2\u00ed\u00ef\5\f\7\2\u00ee\u00ed\3\2\2\2"+
		"\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f3"+
		"\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f3\u0104\5\20\t\2\u00f4\u00f6\5\f\7\2"+
		"\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8"+
		"\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u0104\5\30\r\2"+
		"\u00fb\u00fd\5\f\7\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe\u00fc"+
		"\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2\2\2\u0101"+
		"\u0104\5 \21\2\u0102\u0104\7S\2\2\u0103\u00f0\3\2\2\2\u0103\u00f7\3\2"+
		"\2\2\u0103\u00fe\3\2\2\2\u0103\u0102\3\2\2\2\u0104\t\3\2\2\2\u0105\u0108"+
		"\5\f\7\2\u0106\u0108\t\2\2\2\u0107\u0105\3\2\2\2\u0107\u0106\3\2\2\2\u0108"+
		"\13\3\2\2\2\u0109\u010a\t\3\2\2\u010a\r\3\2\2\2\u010b\u010c\7\4\2\2\u010c"+
		"\17\3\2\2\2\u010d\u010f\78\2\2\u010e\u0110\5\f\7\2\u010f\u010e\3\2\2\2"+
		"\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0112\7\30\2\2\u0112\u0114"+
		"\7x\2\2\u0113\u0115\5\22\n\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115"+
		"\u0118\3\2\2\2\u0116\u0117\7 \2\2\u0117\u0119\5T+\2\u0118\u0116\3\2\2"+
		"\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u011b\7\'\2\2\u011b\u011d"+
		"\5\"\22\2\u011c\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u011e\3\2\2\2"+
		"\u011e\u011f\5$\23\2\u011f\21\3\2\2\2\u0120\u0121\7X\2\2\u0121\u0126\5"+
		"\24\13\2\u0122\u0123\7T\2\2\u0123\u0125\5\24\13\2\u0124\u0122\3\2\2\2"+
		"\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0129"+
		"\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u012a\7W\2\2\u012a\23\3\2\2\2\u012b"+
		"\u012e\7x\2\2\u012c\u012d\7 \2\2\u012d\u012f\5\26\f\2\u012e\u012c\3\2"+
		"\2\2\u012e\u012f\3\2\2\2\u012f\25\3\2\2\2\u0130\u0135\5T+\2\u0131\u0132"+
		"\7i\2\2\u0132\u0134\5T+\2\u0133\u0131\3\2\2\2\u0134\u0137\3\2\2\2\u0135"+
		"\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136\27\3\2\2\2\u0137\u0135\3\2\2"+
		"\2\u0138\u0139\7\37\2\2\u0139\u013c\7x\2\2\u013a\u013b\7\5\2\2\u013b\u013d"+
		"\5\"\22\2\u013c\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2"+
		"\u013e\u0140\7O\2\2\u013f\u0141\5\32\16\2\u0140\u013f\3\2\2\2\u0140\u0141"+
		"\3\2\2\2\u0141\u0143\3\2\2\2\u0142\u0144\7T\2\2\u0143\u0142\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0146\3\2\2\2\u0145\u0147\5\36\20\2\u0146\u0145\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\7P\2\2\u0149"+
		"\31\3\2\2\2\u014a\u014f\5\34\17\2\u014b\u014c\7T\2\2\u014c\u014e\5\34"+
		"\17\2\u014d\u014b\3\2\2\2\u014e\u0151\3\2\2\2\u014f\u014d\3\2\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\33\3\2\2\2\u0151\u014f\3\2\2\2\u0152\u0154\7x\2\2"+
		"\u0153\u0155\5\u00d2j\2\u0154\u0153\3\2\2\2\u0154\u0155\3\2\2\2\u0155"+
		"\u0157\3\2\2\2\u0156\u0158\5$\23\2\u0157\u0156\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\35\3\2\2\2\u0159\u015d\7S\2\2\u015a\u015c\5(\25\2\u015b\u015a"+
		"\3\2\2\2\u015c\u015f\3\2\2\2\u015d\u015b\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\37\3\2\2\2\u015f\u015d\3\2\2\2\u0160\u0161\7+\2\2\u0161\u0163\7x\2\2"+
		"\u0162\u0164\5\22\n\2\u0163\u0162\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0167"+
		"\3\2\2\2\u0165\u0166\7 \2\2\u0166\u0168\5\"\22\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\5&\24\2\u016a!\3\2\2\2"+
		"\u016b\u0170\5T+\2\u016c\u016d\7T\2\2\u016d\u016f\5T+\2\u016e\u016c\3"+
		"\2\2\2\u016f\u0172\3\2\2\2\u0170\u016e\3\2\2\2\u0170\u0171\3\2\2\2\u0171"+
		"#\3\2\2\2\u0172\u0170\3\2\2\2\u0173\u0177\7O\2\2\u0174\u0176\5(\25\2\u0175"+
		"\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u019c\7P\2\2\u017b"+
		"\u017f\7\6\2\2\u017c\u017e\5(\25\2\u017d\u017c\3\2\2\2\u017e\u0181\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0182\3\2\2\2\u0181"+
		"\u017f\3\2\2\2\u0182\u019c\7\7\2\2\u0183\u0185\7\b\2\2\u0184\u0186\7x"+
		"\2\2\u0185\u0184\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u018b\7P\2\2\u0188\u018a\5(\25\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2"+
		"\2\2\u018b\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d"+
		"\u018b\3\2\2\2\u018e\u0190\7\t\2\2\u018f\u0191\7x\2\2\u0190\u018f\3\2"+
		"\2\2\u0190\u0191\3\2\2\2\u0191\u0192\3\2\2\2\u0192\u019c\7P\2\2\u0193"+
		"\u0197\7\n\2\2\u0194\u0196\5(\25\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2"+
		"\2\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u019a\u019c\7\13\2\2\u019b\u0173\3\2\2\2\u019b\u017b\3"+
		"\2\2\2\u019b\u0183\3\2\2\2\u019b\u0193\3\2\2\2\u019c%\3\2\2\2\u019d\u01a1"+
		"\7\6\2\2\u019e\u01a0\5<\37\2\u019f\u019e\3\2\2\2\u01a0\u01a3\3\2\2\2\u01a1"+
		"\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a4\3\2\2\2\u01a3\u01a1\3\2"+
		"\2\2\u01a4\u01be\7\7\2\2\u01a5\u01a7\7\b\2\2\u01a6\u01a8\7x\2\2\u01a7"+
		"\u01a6\3\2\2\2\u01a7\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ad\7P"+
		"\2\2\u01aa\u01ac\5<\37\2\u01ab\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad"+
		"\u01ab\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2"+
		"\2\2\u01b0\u01b2\7\t\2\2\u01b1\u01b3\7x\2\2\u01b2\u01b1\3\2\2\2\u01b2"+
		"\u01b3\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01be\7P\2\2\u01b5\u01b9\7\n"+
		"\2\2\u01b6\u01b8\5<\37\2\u01b7\u01b6\3\2\2\2\u01b8\u01bb\3\2\2\2\u01b9"+
		"\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc\3\2\2\2\u01bb\u01b9\3\2"+
		"\2\2\u01bc\u01be\7\13\2\2\u01bd\u019d\3\2\2\2\u01bd\u01a5\3\2\2\2\u01bd"+
		"\u01b5\3\2\2\2\u01be\'\3\2\2\2\u01bf\u01cd\7S\2\2\u01c0\u01c2\79\2\2\u01c1"+
		"\u01c0\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01cd\5\u0088"+
		"E\2\u01c4\u01cd\5^\60\2\u01c5\u01c7\5\n\6\2\u01c6\u01c5\3\2\2\2\u01c7"+
		"\u01ca\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2"+
		"\2\2\u01ca\u01c8\3\2\2\2\u01cb\u01cd\5*\26\2\u01cc\u01bf\3\2\2\2\u01cc"+
		"\u01c1\3\2\2\2\u01cc\u01c4\3\2\2\2\u01cc\u01c8\3\2\2\2\u01cd)\3\2\2\2"+
		"\u01ce\u01d7\5,\27\2\u01cf\u01d7\5\60\31\2\u01d0\u01d7\58\35\2\u01d1\u01d7"+
		"\5\62\32\2\u01d2\u01d7\5\66\34\2\u01d3\u01d7\5 \21\2\u01d4\u01d7\5\20"+
		"\t\2\u01d5\u01d7\5\30\r\2\u01d6\u01ce\3\2\2\2\u01d6\u01cf\3\2\2\2\u01d6"+
		"\u01d0\3\2\2\2\u01d6\u01d1\3\2\2\2\u01d6\u01d2\3\2\2\2\u01d6\u01d3\3\2"+
		"\2\2\u01d6\u01d4\3\2\2\2\u01d6\u01d5\3\2\2\2\u01d7+\3\2\2\2\u01d8\u01da"+
		"\5.\30\2\u01d9\u01d8\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9\3\2\2\2\u01db"+
		"\u01dc\3\2\2\2\u01dc\u01de\3\2\2\2\u01dd\u01db\3\2\2\2\u01de\u01df\7\f"+
		"\2\2\u01df\u01e0\7x\2\2\u01e0\u01e1\7\r\2\2\u01e1\u01e6\5x=\2\u01e2\u01e3"+
		"\7Q\2\2\u01e3\u01e5\7R\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01eb\3\2\2\2\u01e8\u01e6\3\2"+
		"\2\2\u01e9\u01ea\7B\2\2\u01ea\u01ec\5v<\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec\u01ef\3\2\2\2\u01ed\u01f0\5\u0080A\2\u01ee\u01f0\7S\2\2"+
		"\u01ef\u01ed\3\2\2\2\u01ef\u01ee\3\2\2\2\u01f0-\3\2\2\2\u01f1\u01f2\t"+
		"\4\2\2\u01f2/\3\2\2\2\u01f3\u01f4\5\22\n\2\u01f4\u01f5\5,\27\2\u01f5\61"+
		"\3\2\2\2\u01f6\u01f8\5\64\33\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2"+
		"\u01f9\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fc\3\2\2\2\u01fb\u01f9"+
		"\3\2\2\2\u01fc\u01fd\7x\2\2\u01fd\u01fe\7\r\2\2\u01fe\u0201\5x=\2\u01ff"+
		"\u0200\7B\2\2\u0200\u0202\5v<\2\u0201\u01ff\3\2\2\2\u0201\u0202\3\2\2"+
		"\2\u0202\u0203\3\2\2\2\u0203\u0204\5\u0082B\2\u0204\63\3\2\2\2\u0205\u0206"+
		"\t\5\2\2\u0206\65\3\2\2\2\u0207\u0208\5\22\n\2\u0208\u0209\5\62\32\2\u0209"+
		"\67\3\2\2\2\u020a\u020c\5:\36\2\u020b\u020a\3\2\2\2\u020c\u020f\3\2\2"+
		"\2\u020d\u020b\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\3\2\2\2\u020f\u020d"+
		"\3\2\2\2\u0210\u0211\5T+\2\u0211\u0212\5H%\2\u0212\u0213\7S\2\2\u0213"+
		"9\3\2\2\2\u0214\u0215\t\6\2\2\u0215;\3\2\2\2\u0216\u021a\7\6\2\2\u0217"+
		"\u0219\5\n\6\2\u0218\u0217\3\2\2\2\u0219\u021c\3\2\2\2\u021a\u0218\3\2"+
		"\2\2\u021a\u021b\3\2\2\2\u021b\u021d\3\2\2\2\u021c\u021a\3\2\2\2\u021d"+
		"\u021e\5> \2\u021e\u021f\7\7\2\2\u021f\u0248\3\2\2\2\u0220\u0222\7\b\2"+
		"\2\u0221\u0223\7x\2\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224"+
		"\3\2\2\2\u0224\u0228\7P\2\2\u0225\u0227\5\n\6\2\u0226\u0225\3\2\2\2\u0227"+
		"\u022a\3\2\2\2\u0228\u0226\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022b\3\2"+
		"\2\2\u022a\u0228\3\2\2\2\u022b\u022c\5> \2\u022c\u022e\7\t\2\2\u022d\u022f"+
		"\7x\2\2\u022e\u022d\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0230\3\2\2\2\u0230"+
		"\u0231\7P\2\2\u0231\u0248\3\2\2\2\u0232\u0236\7\n\2\2\u0233\u0235\5\n"+
		"\6\2\u0234\u0233\3\2\2\2\u0235\u0238\3\2\2\2\u0236\u0234\3\2\2\2\u0236"+
		"\u0237\3\2\2\2\u0237\u0239\3\2\2\2\u0238\u0236\3\2\2\2\u0239\u023a\5>"+
		" \2\u023a\u023b\7\13\2\2\u023b\u0248\3\2\2\2\u023c\u0240\7O\2\2\u023d"+
		"\u023f\5\n\6\2\u023e\u023d\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241\u0243\3\2\2\2\u0242\u0240\3\2\2\2\u0243"+
		"\u0244\5> \2\u0244\u0245\7P\2\2\u0245\u0248\3\2\2\2\u0246\u0248\7S\2\2"+
		"\u0247\u0216\3\2\2\2\u0247\u0220\3\2\2\2\u0247\u0232\3\2\2\2\u0247\u023c"+
		"\3\2\2\2\u0247\u0246\3\2\2\2\u0248=\3\2\2\2\u0249\u0250\5@!\2\u024a\u0250"+
		"\5D#\2\u024b\u0250\5F$\2\u024c\u0250\5 \21\2\u024d\u0250\5\20\t\2\u024e"+
		"\u0250\5\30\r\2\u024f\u0249\3\2\2\2\u024f\u024a\3\2\2\2\u024f\u024b\3"+
		"\2\2\2\u024f\u024c\3\2\2\2\u024f\u024d\3\2\2\2\u024f\u024e\3\2\2\2\u0250"+
		"?\3\2\2\2\u0251\u0252\5T+\2\u0252\u0257\5B\"\2\u0253\u0254\7T\2\2\u0254"+
		"\u0256\5B\"\2\u0255\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2"+
		"\2\2\u0257\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u0257\3\2\2\2\u025a"+
		"\u025b\7S\2\2\u025bA\3\2\2\2\u025c\u0261\7x\2\2\u025d\u025e\7Q\2\2\u025e"+
		"\u0260\7R\2\2\u025f\u025d\3\2\2\2\u0260\u0263\3\2\2\2\u0261\u025f\3\2"+
		"\2\2\u0261\u0262\3\2\2\2\u0262\u0264\3\2\2\2\u0263\u0261\3\2\2\2\u0264"+
		"\u0265\7V\2\2\u0265\u0266\5N(\2\u0266C\3\2\2\2\u0267\u0268\5T+\2\u0268"+
		"\u0269\7x\2\2\u0269\u026e\5x=\2\u026a\u026b\7Q\2\2\u026b\u026d\7R\2\2"+
		"\u026c\u026a\3\2\2\2\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f"+
		"\3\2\2\2\u026f\u0273\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\7B\2\2\u0272"+
		"\u0274\5v<\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2\2\2\u0274\u0275\3\2\2"+
		"\2\u0275\u0276\7S\2\2\u0276E\3\2\2\2\u0277\u0278\5\22\n\2\u0278\u0279"+
		"\5D#\2\u0279G\3\2\2\2\u027a\u027f\5J&\2\u027b\u027c\7T\2\2\u027c\u027e"+
		"\5J&\2\u027d\u027b\3\2\2\2\u027e\u0281\3\2\2\2\u027f\u027d\3\2\2\2\u027f"+
		"\u0280\3\2\2\2\u0280I\3\2\2\2\u0281\u027f\3\2\2\2\u0282\u0285\5L\'\2\u0283"+
		"\u0284\7V\2\2\u0284\u0286\5N(\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2"+
		"\2\u0286K\3\2\2\2\u0287\u028c\7x\2\2\u0288\u0289\7Q\2\2\u0289\u028b\7"+
		"R\2\2\u028a\u0288\3\2\2\2\u028b\u028e\3\2\2\2\u028c\u028a\3\2\2\2\u028c"+
		"\u028d\3\2\2\2\u028dM\3\2\2\2\u028e\u028c\3\2\2\2\u028f\u0292\5P)\2\u0290"+
		"\u0292\5\u00b8]\2\u0291\u028f\3\2\2\2\u0291\u0290\3\2\2\2\u0292O\3\2\2"+
		"\2\u0293\u029f\7O\2\2\u0294\u0299\5N(\2\u0295\u0296\7T\2\2\u0296\u0298"+
		"\5N(\2\u0297\u0295\3\2\2\2\u0298\u029b\3\2\2\2\u0299\u0297\3\2\2\2\u0299"+
		"\u029a\3\2\2\2\u029a\u029d\3\2\2\2\u029b\u0299\3\2\2\2\u029c\u029e\7T"+
		"\2\2\u029d\u029c\3\2\2\2\u029d\u029e\3\2\2\2\u029e\u02a0\3\2\2\2\u029f"+
		"\u0294\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\7P"+
		"\2\2\u02a2Q\3\2\2\2\u02a3\u02a4\7x\2\2\u02a4S\3\2\2\2\u02a5\u02aa\5V,"+
		"\2\u02a6\u02a7\7Q\2\2\u02a7\u02a9\7R\2\2\u02a8\u02a6\3\2\2\2\u02a9\u02ac"+
		"\3\2\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02c6\3\2\2\2\u02ac"+
		"\u02aa\3\2\2\2\u02ad\u02b2\5Z.\2\u02ae\u02af\7Q\2\2\u02af\u02b1\7R\2\2"+
		"\u02b0\u02ae\3\2\2\2\u02b1\u02b4\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b2\u02b3"+
		"\3\2\2\2\u02b3\u02c6\3\2\2\2\u02b4\u02b2\3\2\2\2\u02b5\u02ba\5\\/\2\u02b6"+
		"\u02b7\7Q\2\2\u02b7\u02b9\7R\2\2\u02b8\u02b6\3\2\2\2\u02b9\u02bc\3\2\2"+
		"\2\u02ba\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02c6\3\2\2\2\u02bc\u02ba"+
		"\3\2\2\2\u02bd\u02c2\5X-\2\u02be\u02bf\7Q\2\2\u02bf\u02c1\7R\2\2\u02c0"+
		"\u02be\3\2\2\2\u02c1\u02c4\3\2\2\2\u02c2\u02c0\3\2\2\2\u02c2\u02c3\3\2"+
		"\2\2\u02c3\u02c6\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u02a5\3\2\2\2\u02c5"+
		"\u02ad\3\2\2\2\u02c5\u02b5\3\2\2\2\u02c5\u02bd\3\2\2\2\u02c6U\3\2\2\2"+
		"\u02c7\u02cb\5\\/\2\u02c8\u02cb\5Z.\2\u02c9\u02cb\5X-\2\u02ca\u02c7\3"+
		"\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc"+
		"\u02cd\7g\2\2\u02cdW\3\2\2\2\u02ce\u02cf\7<\2\2\u02cf\u02d0\7x\2\2\u02d0"+
		"Y\3\2\2\2\u02d1\u02d3\7x\2\2\u02d2\u02d4\5r:\2\u02d3\u02d2\3\2\2\2\u02d3"+
		"\u02d4\3\2\2\2\u02d4\u02dc\3\2\2\2\u02d5\u02d6\7U\2\2\u02d6\u02d8\7x\2"+
		"\2\u02d7\u02d9\5r:\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2\2\2\u02d9\u02db"+
		"\3\2\2\2\u02da\u02d5\3\2\2\2\u02db\u02de\3\2\2\2\u02dc\u02da\3\2\2\2\u02dc"+
		"\u02dd\3\2\2\2\u02dd[\3\2\2\2\u02de\u02dc\3\2\2\2\u02df\u02e0\t\7\2\2"+
		"\u02e0]\3\2\2\2\u02e1\u02e2\7<\2\2\u02e2\u02e3\7x\2\2\u02e3\u02e4\7\6"+
		"\2\2\u02e4\u02e5\5`\61\2\u02e5\u02e6\7\7\2\2\u02e6\u0302\3\2\2\2\u02e7"+
		"\u02e8\7<\2\2\u02e8\u02e9\7x\2\2\u02e9\u02eb\7\b\2\2\u02ea\u02ec\7x\2"+
		"\2\u02eb\u02ea\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee"+
		"\7P\2\2\u02ee\u02ef\5`\61\2\u02ef\u02f1\7\t\2\2\u02f0\u02f2\7x\2\2\u02f1"+
		"\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\7P"+
		"\2\2\u02f4\u0302\3\2\2\2\u02f5\u02f6\7<\2\2\u02f6\u02f7\7x\2\2\u02f7\u02f8"+
		"\7\n\2\2\u02f8\u02f9\5`\61\2\u02f9\u02fa\7\13\2\2\u02fa\u0302\3\2\2\2"+
		"\u02fb\u02fc\7<\2\2\u02fc\u02fd\7x\2\2\u02fd\u02fe\7O\2\2\u02fe\u02ff"+
		"\5`\61\2\u02ff\u0300\7P\2\2\u0300\u0302\3\2\2\2\u0301\u02e1\3\2\2\2\u0301"+
		"\u02e7\3\2\2\2\u0301\u02f5\3\2\2\2\u0301\u02fb\3\2\2\2\u0302_\3\2\2\2"+
		"\u0303\u0305\5b\62\2\u0304\u0303\3\2\2\2\u0305\u0308\3\2\2\2\u0306\u0304"+
		"\3\2\2\2\u0306\u0307\3\2\2\2\u0307a\3\2\2\2\u0308\u0306\3\2\2\2\u0309"+
		"\u030a\5d\63\2\u030a\u030b\5j\66\2\u030b\u030c\7S\2\2\u030cc\3\2\2\2\u030d"+
		"\u030f\5f\64\2\u030e\u030d\3\2\2\2\u030e\u030f\3\2\2\2\u030f\u0310\3\2"+
		"\2\2\u0310\u0311\5T+\2\u0311e\3\2\2\2\u0312\u0314\5h\65\2\u0313\u0312"+
		"\3\2\2\2\u0314\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316"+
		"g\3\2\2\2\u0317\u0315\3\2\2\2\u0318\u0319\t\b\2\2\u0319i\3\2\2\2\u031a"+
		"\u031c\5l\67\2\u031b\u031a\3\2\2\2\u031c\u031f\3\2\2\2\u031d\u031b\3\2"+
		"\2\2\u031d\u031e\3\2\2\2\u031ek\3\2\2\2\u031f\u031d\3\2\2\2\u0320\u0321"+
		"\5n8\2\u0321m\3\2\2\2\u0322\u0323\7x\2\2\u0323o\3\2\2\2\u0324\u0325\7"+
		"\16\2\2\u0325\u0326\5T+\2\u0326\u0327\7\17\2\2\u0327\u0328\7x\2\2\u0328"+
		"\u0329\7S\2\2\u0329\u0331\3\2\2\2\u032a\u032b\7\16\2\2\u032b\u032c\5^"+
		"\60\2\u032c\u032d\7\17\2\2\u032d\u032e\7x\2\2\u032e\u032f\7S\2\2\u032f"+
		"\u0331\3\2\2\2\u0330\u0324\3\2\2\2\u0330\u032a\3\2\2\2\u0331q\3\2\2\2"+
		"\u0332\u0333\7X\2\2\u0333\u0338\5t;\2\u0334\u0335\7T\2\2\u0335\u0337\5"+
		"t;\2\u0336\u0334\3\2\2\2\u0337\u033a\3\2\2\2\u0338\u0336\3\2\2\2\u0338"+
		"\u0339\3\2\2\2\u0339\u033b\3\2\2\2\u033a\u0338\3\2\2\2\u033b\u033c\7W"+
		"\2\2\u033cs\3\2\2\2\u033d\u0344\5T+\2\u033e\u0341\7[\2\2\u033f\u0340\t"+
		"\t\2\2\u0340\u0342\5T+\2\u0341\u033f\3\2\2\2\u0341\u0342\3\2\2\2\u0342"+
		"\u0344\3\2\2\2\u0343\u033d\3\2\2\2\u0343\u033e\3\2\2\2\u0344u\3\2\2\2"+
		"\u0345\u034a\5\u0084C\2\u0346\u0347\7T\2\2\u0347\u0349\5\u0084C\2\u0348"+
		"\u0346\3\2\2\2\u0349\u034c\3\2\2\2\u034a\u0348\3\2\2\2\u034a\u034b\3\2"+
		"\2\2\u034bw\3\2\2\2\u034c\u034a\3\2\2\2\u034d\u034f\7M\2\2\u034e\u0350"+
		"\5z>\2\u034f\u034e\3\2\2\2\u034f\u0350\3\2\2\2\u0350\u0351\3\2\2\2\u0351"+
		"\u0352\7N\2\2\u0352y\3\2\2\2\u0353\u0358\5|?\2\u0354\u0355\7T\2\2\u0355"+
		"\u0357\5|?\2\u0356\u0354\3\2\2\2\u0357\u035a\3\2\2\2\u0358\u0356\3\2\2"+
		"\2\u0358\u0359\3\2\2\2\u0359\u035d\3\2\2\2\u035a\u0358\3\2\2\2\u035b\u035c"+
		"\7T\2\2\u035c\u035e\5~@\2\u035d\u035b\3\2\2\2\u035d\u035e\3\2\2\2\u035e"+
		"\u0361\3\2\2\2\u035f\u0361\5~@\2\u0360\u0353\3\2\2\2\u0360\u035f\3\2\2"+
		"\2\u0361{\3\2\2\2\u0362\u0364\5\16\b\2\u0363\u0362\3\2\2\2\u0364\u0367"+
		"\3\2\2\2\u0365\u0363\3\2\2\2\u0365\u0366\3\2\2\2\u0366\u0368\3\2\2\2\u0367"+
		"\u0365\3\2\2\2\u0368\u0369\5T+\2\u0369\u036a\5L\'\2\u036a}\3\2\2\2\u036b"+
		"\u036d\5\16\b\2\u036c\u036b\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c\3"+
		"\2\2\2\u036e\u036f\3\2\2\2\u036f\u0371\3\2\2\2\u0370\u036e\3\2\2\2\u0371"+
		"\u0372\5T+\2\u0372\u0373\7z\2\2\u0373\u0374\5L\'\2\u0374\177\3\2\2\2\u0375"+
		"\u0376\5\u0088E\2\u0376\u0081\3\2\2\2\u0377\u0378\5\u0088E\2\u0378\u0083"+
		"\3\2\2\2\u0379\u037e\7x\2\2\u037a\u037b\7U\2\2\u037b\u037d\7x\2\2\u037c"+
		"\u037a\3\2\2\2\u037d\u0380\3\2\2\2\u037e\u037c\3\2\2\2\u037e\u037f\3\2"+
		"\2\2\u037f\u0085\3\2\2\2\u0380\u037e\3\2\2\2\u0381\u0382\t\n\2\2\u0382"+
		"\u0087\3\2\2\2\u0383\u0387\7\6\2\2\u0384\u0386\5\u008aF\2\u0385\u0384"+
		"\3\2\2\2\u0386\u0389\3\2\2\2\u0387\u0385\3\2\2\2\u0387\u0388\3\2\2\2\u0388"+
		"\u038a\3\2\2\2\u0389\u0387\3\2\2\2\u038a\u03a4\7\7\2\2\u038b\u038d\7\b"+
		"\2\2\u038c\u038e\7x\2\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e"+
		"\u038f\3\2\2\2\u038f\u0393\7P\2\2\u0390\u0392\5\u008aF\2\u0391\u0390\3"+
		"\2\2\2\u0392\u0395\3\2\2\2\u0393\u0391\3\2\2\2\u0393\u0394\3\2\2\2\u0394"+
		"\u0396\3\2\2\2\u0395\u0393\3\2\2\2\u0396\u0398\7\t\2\2\u0397\u0399\7x"+
		"\2\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u039a\3\2\2\2\u039a"+
		"\u03a4\7P\2\2\u039b\u039f\7O\2\2\u039c\u039e\5\u008aF\2\u039d\u039c\3"+
		"\2\2\2\u039e\u03a1\3\2\2\2\u039f\u039d\3\2\2\2\u039f\u03a0\3\2\2\2\u03a0"+
		"\u03a2\3\2\2\2\u03a1\u039f\3\2\2\2\u03a2\u03a4\7P\2\2\u03a3\u0383\3\2"+
		"\2\2\u03a3\u038b\3\2\2\2\u03a3\u039b\3\2\2\2\u03a4\u0089\3\2\2\2\u03a5"+
		"\u03a9\5\u008cG\2\u03a6\u03a9\5\u0090I\2\u03a7\u03a9\5\b\5\2\u03a8\u03a5"+
		"\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8\u03a7\3\2\2\2\u03a9\u008b\3\2\2\2\u03aa"+
		"\u03ab\5\u008eH\2\u03ab\u03ac\7S\2\2\u03ac\u008d\3\2\2\2\u03ad\u03ae\5"+
		"T+\2\u03ae\u03af\5H%\2\u03af\u008f\3\2\2\2\u03b0\u042c\5\u0088E\2\u03b1"+
		"\u03b2\7\21\2\2\u03b2\u03b5\5\u00b8]\2\u03b3\u03b4\7\\\2\2\u03b4\u03b6"+
		"\5\u00b8]\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6\u03b7\3\2\2"+
		"\2\u03b7\u03b8\7S\2\2\u03b8\u042c\3\2\2\2\u03b9\u03ba\7%\2\2\u03ba\u03bb"+
		"\5\u00b0Y\2\u03bb\u03be\5\u0090I\2\u03bc\u03bd\7\36\2\2\u03bd\u03bf\5"+
		"\u0090I\2\u03be\u03bc\3\2\2\2\u03be\u03bf\3\2\2\2\u03bf\u042c\3\2\2\2"+
		"\u03c0\u03c2\7$\2\2\u03c1\u03c0\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3"+
		"\3\2\2\2\u03c3\u03c4\7M\2\2\u03c4\u03c5\5\u00a2R\2\u03c5\u03c6\7N\2\2"+
		"\u03c6\u03c7\5\u0090I\2\u03c7\u042c\3\2\2\2\u03c8\u03c9\7F\2\2\u03c9\u03ca"+
		"\5\u00b0Y\2\u03ca\u03cb\5\u0090I\2\u03cb\u042c\3\2\2\2\u03cc\u03cd\7\34"+
		"\2\2\u03cd\u03ce\5\u0090I\2\u03ce\u03cf\7F\2\2\u03cf\u03d0\5\u00b0Y\2"+
		"\u03d0\u03d1\7S\2\2\u03d1\u042c\3\2\2\2\u03d2\u03d3\7D\2\2\u03d3\u03dd"+
		"\5\u0088E\2\u03d4\u03d6\5\u0092J\2\u03d5\u03d4\3\2\2\2\u03d6\u03d7\3\2"+
		"\2\2\u03d7\u03d5\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8\u03da\3\2\2\2\u03d9"+
		"\u03db\5\u0096L\2\u03da\u03d9\3\2\2\2\u03da\u03db\3\2\2\2\u03db\u03de"+
		"\3\2\2\2\u03dc\u03de\5\u0096L\2\u03dd\u03d5\3\2\2\2\u03dd\u03dc\3\2\2"+
		"\2\u03de\u042c\3\2\2\2\u03df\u03e0\7D\2\2\u03e0\u03e1\5\u0098M\2\u03e1"+
		"\u03e5\5\u0088E\2\u03e2\u03e4\5\u0092J\2\u03e3\u03e2\3\2\2\2\u03e4\u03e7"+
		"\3\2\2\2\u03e5\u03e3\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6\u03e9\3\2\2\2\u03e7"+
		"\u03e5\3\2\2\2\u03e8\u03ea\5\u0096L\2\u03e9\u03e8\3\2\2\2\u03e9\u03ea"+
		"\3\2\2\2\u03ea\u042c\3\2\2\2\u03eb\u03ec\7>\2\2\u03ec\u03f4\5\u00b0Y\2"+
		"\u03ed\u03f5\7O\2\2\u03ee\u03f5\7\6\2\2\u03ef\u03f1\7\b\2\2\u03f0\u03f2"+
		"\7x\2\2\u03f1\u03f0\3\2\2\2\u03f1\u03f2\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3"+
		"\u03f5\7P\2\2\u03f4\u03ed\3\2\2\2\u03f4\u03ee\3\2\2\2\u03f4\u03ef\3\2"+
		"\2\2\u03f5\u03f9\3\2\2\2\u03f6\u03f8\5\u009eP\2\u03f7\u03f6\3\2\2\2\u03f8"+
		"\u03fb\3\2\2\2\u03f9\u03f7\3\2\2\2\u03f9\u03fa\3\2\2\2\u03fa\u03ff\3\2"+
		"\2\2\u03fb\u03f9\3\2\2\2\u03fc\u03fe\5\u00a0Q\2\u03fd\u03fc\3\2\2\2\u03fe"+
		"\u0401\3\2\2\2\u03ff\u03fd\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0409\3\2"+
		"\2\2\u0401\u03ff\3\2\2\2\u0402\u040a\7P\2\2\u0403\u040a\7\7\2\2\u0404"+
		"\u0406\7\t\2\2\u0405\u0407\7x\2\2\u0406\u0405\3\2\2\2\u0406\u0407\3\2"+
		"\2\2\u0407\u0408\3\2\2\2\u0408\u040a\7P\2\2\u0409\u0402\3\2\2\2\u0409"+
		"\u0403\3\2\2\2\u0409\u0404\3\2\2\2\u040a\u042c\3\2\2\2\u040b\u040c\7?"+
		"\2\2\u040c\u040d\5\u00b0Y\2\u040d\u040e\5\u0088E\2\u040e\u042c\3\2\2\2"+
		"\u040f\u0411\7\64\2\2\u0410\u0412\5\u00b8]\2\u0411\u0410\3\2\2\2\u0411"+
		"\u0412\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u042c\7S\2\2\u0414\u0415\7A\2"+
		"\2\u0415\u0416\5\u00b8]\2\u0416\u0417\7S\2\2\u0417\u042c\3\2\2\2\u0418"+
		"\u041a\7\23\2\2\u0419\u041b\7x\2\2\u041a\u0419\3\2\2\2\u041a\u041b\3\2"+
		"\2\2\u041b\u041c\3\2\2\2\u041c\u042c\7S\2\2\u041d\u041f\7\32\2\2\u041e"+
		"\u0420\7x\2\2\u041f\u041e\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u0421\3\2"+
		"\2\2\u0421\u042c\7S\2\2\u0422\u042c\7S\2\2\u0423\u0424\5\u00b4[\2\u0424"+
		"\u0425\7S\2\2\u0425\u042c\3\2\2\2\u0426\u0427\7x\2\2\u0427\u0428\7\\\2"+
		"\2\u0428\u042c\5\u0090I\2\u0429\u042c\5\u00aaV\2\u042a\u042c\5\u00aeX"+
		"\2\u042b\u03b0\3\2\2\2\u042b\u03b1\3\2\2\2\u042b\u03b9\3\2\2\2\u042b\u03c1"+
		"\3\2\2\2\u042b\u03c8\3\2\2\2\u042b\u03cc\3\2\2\2\u042b\u03d2\3\2\2\2\u042b"+
		"\u03df\3\2\2\2\u042b\u03eb\3\2\2\2\u042b\u040b\3\2\2\2\u042b\u040f\3\2"+
		"\2\2\u042b\u0414\3\2\2\2\u042b\u0418\3\2\2\2\u042b\u041d\3\2\2\2\u042b"+
		"\u0422\3\2\2\2\u042b\u0423\3\2\2\2\u042b\u0426\3\2\2\2\u042b\u0429\3\2"+
		"\2\2\u042b\u042a\3\2\2\2\u042c\u0091\3\2\2\2\u042d\u042e\7\26\2\2\u042e"+
		"\u0432\7M\2\2\u042f\u0431\5\16\b\2\u0430\u042f\3\2\2\2\u0431\u0434\3\2"+
		"\2\2\u0432\u0430\3\2\2\2\u0432\u0433\3\2\2\2\u0433\u0435\3\2\2\2\u0434"+
		"\u0432\3\2\2\2\u0435\u0436\5\u0094K\2\u0436\u0437\7x\2\2\u0437\u0438\7"+
		"N\2\2\u0438\u0439\5\u0088E\2\u0439\u0093\3\2\2\2\u043a\u043f\5\u0084C"+
		"\2\u043b\u043c\7j\2\2\u043c\u043e\5\u0084C\2\u043d\u043b\3\2\2\2\u043e"+
		"\u0441\3\2\2\2\u043f\u043d\3\2\2\2\u043f\u0440\3\2\2\2\u0440\u0095\3\2"+
		"\2\2\u0441\u043f\3\2\2\2\u0442\u0443\7\"\2\2\u0443\u0444\5\u0088E\2\u0444"+
		"\u0097\3\2\2\2\u0445\u0446\7M\2\2\u0446\u0448\5\u009aN\2\u0447\u0449\7"+
		"S\2\2\u0448\u0447\3\2\2\2\u0448\u0449\3\2\2\2\u0449\u044a\3\2\2\2\u044a"+
		"\u044b\7N\2\2\u044b\u0099\3\2\2\2\u044c\u0451\5\u009cO\2\u044d\u044e\7"+
		"S\2\2\u044e\u0450\5\u009cO\2\u044f\u044d\3\2\2\2\u0450\u0453\3\2\2\2\u0451"+
		"\u044f\3\2\2\2\u0451\u0452\3\2\2\2\u0452\u009b\3\2\2\2\u0453\u0451\3\2"+
		"\2\2\u0454\u0456\5\16\b\2\u0455\u0454\3\2\2\2\u0456\u0459\3\2\2\2\u0457"+
		"\u0455\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u045a\3\2\2\2\u0459\u0457\3\2"+
		"\2\2\u045a\u045b\5Z.\2\u045b\u045c\5L\'\2\u045c\u045d\7V\2\2\u045d\u045e"+
		"\5\u00b8]\2\u045e\u009d\3\2\2\2\u045f\u0461\5\u00a0Q\2\u0460\u045f\3\2"+
		"\2\2\u0461\u0462\3\2\2\2\u0462\u0460\3\2\2\2\u0462\u0463\3\2\2\2\u0463"+
		"\u0465\3\2\2\2\u0464\u0466\5\u008aF\2\u0465\u0464\3\2\2\2\u0466\u0467"+
		"\3\2\2\2\u0467\u0465\3\2\2\2\u0467\u0468\3\2\2\2\u0468\u009f\3\2\2\2\u0469"+
		"\u046a\7\25\2\2\u046a\u046b\5\u00b6\\\2\u046b\u046c\7\\\2\2\u046c\u0474"+
		"\3\2\2\2\u046d\u046e\7\25\2\2\u046e\u046f\5R*\2\u046f\u0470\7\\\2\2\u0470"+
		"\u0474\3\2\2\2\u0471\u0472\7\33\2\2\u0472\u0474\7\\\2\2\u0473\u0469\3"+
		"\2\2\2\u0473\u046d\3\2\2\2\u0473\u0471\3\2\2\2\u0474\u00a1\3\2\2\2\u0475"+
		"\u0482\5\u00a6T\2\u0476\u0478\5\u00a4S\2\u0477\u0476\3\2\2\2\u0477\u0478"+
		"\3\2\2\2\u0478\u0479\3\2\2\2\u0479\u047b\7S\2\2\u047a\u047c\5\u00b8]\2"+
		"\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d\3\2\2\2\u047d\u047f"+
		"\7S\2\2\u047e\u0480\5\u00a8U\2\u047f\u047e\3\2\2\2\u047f\u0480\3\2\2\2"+
		"\u0480\u0482\3\2\2\2\u0481\u0475\3\2\2\2\u0481\u0477\3\2\2\2\u0482\u00a3"+
		"\3\2\2\2\u0483\u0486\5\u008eH\2\u0484\u0486\5\u00b2Z\2\u0485\u0483\3\2"+
		"\2\2\u0485\u0484\3\2\2\2\u0486\u00a5\3\2\2\2\u0487\u0489\5\16\b\2\u0488"+
		"\u0487\3\2\2\2\u0489\u048c\3\2\2\2\u048a\u0488\3\2\2\2\u048a\u048b\3\2"+
		"\2\2\u048b\u048d\3\2\2\2\u048c\u048a\3\2\2\2\u048d\u048e\5T+\2\u048e\u048f"+
		"\5L\'\2\u048f\u0490\7\\\2\2\u0490\u0491\5\u00b8]\2\u0491\u00a7\3\2\2\2"+
		"\u0492\u0493\5\u00b2Z\2\u0493\u00a9\3\2\2\2\u0494\u0495\7\60\2\2\u0495"+
		"\u049a\5\u00acW\2\u0496\u0497\7e\2\2\u0497\u0499\5\u00acW\2\u0498\u0496"+
		"\3\2\2\2\u0499\u049c\3\2\2\2\u049a\u0498\3\2\2\2\u049a\u049b\3\2\2\2\u049b"+
		"\u00ab\3\2\2\2\u049c\u049a\3\2\2\2\u049d\u049e\t\13\2\2\u049e\u00ad\3"+
		"\2\2\2\u049f\u04a1\7\65\2\2\u04a0\u04a2\5T+\2\u04a1\u04a0\3\2\2\2\u04a1"+
		"\u04a2\3\2\2\2\u04a2\u04a3\3\2\2\2\u04a3\u04a4\7\66\2\2\u04a4\u04a5\5"+
		"L\'\2\u04a5\u00af\3\2\2\2\u04a6\u04a7\7M\2\2\u04a7\u04a8\5\u00b8]\2\u04a8"+
		"\u04a9\7N\2\2\u04a9\u00b1\3\2\2\2\u04aa\u04af\5\u00b8]\2\u04ab\u04ac\7"+
		"T\2\2\u04ac\u04ae\5\u00b8]\2\u04ad\u04ab\3\2\2\2\u04ae\u04b1\3\2\2\2\u04af"+
		"\u04ad\3\2\2\2\u04af\u04b0\3\2\2\2\u04b0\u00b3\3\2\2\2\u04b1\u04af\3\2"+
		"\2\2\u04b2\u04b3\5\u00b8]\2\u04b3\u00b5\3\2\2\2\u04b4\u04b5\5\u00b8]\2"+
		"\u04b5\u00b7\3\2\2\2\u04b6\u04b7\b]\1\2\u04b7\u04bd\5\u00ba^\2\u04b8\u04b9"+
		"\t\f\2\2\u04b9\u04bd\5\u00b8]\f\u04ba\u04bb\t\r\2\2\u04bb\u04bd\5\u00b8"+
		"]\13\u04bc\u04b6\3\2\2\2\u04bc\u04b8\3\2\2\2\u04bc\u04ba\3\2\2\2\u04bd"+
		"\u04e8\3\2\2\2\u04be\u04bf\f\n\2\2\u04bf\u04c0\t\16\2\2\u04c0\u04e7\5"+
		"\u00b8]\13\u04c1\u04c2\f\t\2\2\u04c2\u04c3\t\17\2\2\u04c3\u04e7\5\u00b8"+
		"]\n\u04c4\u04c5\f\b\2\2\u04c5\u04c6\t\20\2\2\u04c6\u04e7\5\u00b8]\t\u04c7"+
		"\u04c8\f\7\2\2\u04c8\u04c9\t\21\2\2\u04c9\u04e7\5\u00b8]\b\u04ca\u04cb"+
		"\f\6\2\2\u04cb\u04cc\7a\2\2\u04cc\u04e7\5\u00b8]\7\u04cd\u04ce\f\5\2\2"+
		"\u04ce\u04cf\7b\2\2\u04cf\u04e7\5\u00b8]\6\u04d0\u04d1\f\4\2\2\u04d1\u04d2"+
		"\7[\2\2\u04d2\u04d3\5\u00b8]\2\u04d3\u04d4\7\\\2\2\u04d4\u04d5\5\u00b8"+
		"]\5\u04d5\u04e7\3\2\2\2\u04d6\u04d7\f\3\2\2\u04d7\u04d8\t\22\2\2\u04d8"+
		"\u04e7\5\u00b8]\3\u04d9\u04da\f\17\2\2\u04da\u04db\7Q\2\2\u04db\u04dc"+
		"\5\u00b8]\2\u04dc\u04dd\7R\2\2\u04dd\u04e7\3\2\2\2\u04de\u04df\f\16\2"+
		"\2\u04df\u04e1\7M\2\2\u04e0\u04e2\5\u00b2Z\2\u04e1\u04e0\3\2\2\2\u04e1"+
		"\u04e2\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e7\7N\2\2\u04e4\u04e5\f\r"+
		"\2\2\u04e5\u04e7\t\23\2\2\u04e6\u04be\3\2\2\2\u04e6\u04c1\3\2\2\2\u04e6"+
		"\u04c4\3\2\2\2\u04e6\u04c7\3\2\2\2\u04e6\u04ca\3\2\2\2\u04e6\u04cd\3\2"+
		"\2\2\u04e6\u04d0\3\2\2\2\u04e6\u04d6\3\2\2\2\u04e6\u04d9\3\2\2\2\u04e6"+
		"\u04de\3\2\2\2\u04e6\u04e4\3\2\2\2\u04e7\u04ea\3\2\2\2\u04e8\u04e6\3\2"+
		"\2\2\u04e8\u04e9\3\2\2\2\u04e9\u00b9\3\2\2\2\u04ea\u04e8\3\2\2\2\u04eb"+
		"\u04ec\7M\2\2\u04ec\u04ed\5\u00b8]\2\u04ed\u04ee\7N\2\2\u04ee\u04f4\3"+
		"\2\2\2\u04ef\u04f4\5\u0086D\2\u04f0\u04f4\7x\2\2\u04f1\u04f2\7g\2\2\u04f2"+
		"\u04f4\7x\2\2\u04f3\u04eb\3\2\2\2\u04f3\u04ef\3\2\2\2\u04f3\u04f0\3\2"+
		"\2\2\u04f3\u04f1\3\2\2\2\u04f4\u00bb\3\2\2\2\u04f5\u04f6\5\u00c8e\2\u04f6"+
		"\u04f7\5\u00be`\2\u04f7\u04f8\5\u00c4c\2\u04f8\u04ff\3\2\2\2\u04f9\u04fc"+
		"\5\u00be`\2\u04fa\u04fd\5\u00c2b\2\u04fb\u04fd\5\u00c4c\2\u04fc\u04fa"+
		"\3\2\2\2\u04fc\u04fb\3\2\2\2\u04fd\u04ff\3\2\2\2\u04fe\u04f5\3\2\2\2\u04fe"+
		"\u04f9\3\2\2\2\u04ff\u00bd\3\2\2\2\u0500\u0502\7x\2\2\u0501\u0503\5\u00ca"+
		"f\2\u0502\u0501\3\2\2\2\u0502\u0503\3\2\2\2\u0503\u050b\3\2\2\2\u0504"+
		"\u0505\7U\2\2\u0505\u0507\7x\2\2\u0506\u0508\5\u00caf\2\u0507\u0506\3"+
		"\2\2\2\u0507\u0508\3\2\2\2\u0508\u050a\3\2\2\2\u0509\u0504\3\2\2\2\u050a"+
		"\u050d\3\2\2\2\u050b\u0509\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u0510\3\2"+
		"\2\2\u050d\u050b\3\2\2\2\u050e\u0510\5\\/\2\u050f\u0500\3\2\2\2\u050f"+
		"\u050e\3\2\2\2\u0510\u00bf\3\2\2\2\u0511\u0513\7x\2\2\u0512\u0514\5\u00cc"+
		"g\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0515\3\2\2\2\u0515"+
		"\u0516\5\u00c4c\2\u0516\u00c1\3\2\2\2\u0517\u0533\7Q\2\2\u0518\u051d\7"+
		"R\2\2\u0519\u051a\7Q\2\2\u051a\u051c\7R\2\2\u051b\u0519\3\2\2\2\u051c"+
		"\u051f\3\2\2\2\u051d\u051b\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u0520\3\2"+
		"\2\2\u051f\u051d\3\2\2\2\u0520\u0534\5P)\2\u0521\u0522\5\u00b8]\2\u0522"+
		"\u0529\7R\2\2\u0523\u0524\7Q\2\2\u0524\u0525\5\u00b8]\2\u0525\u0526\7"+
		"R\2\2\u0526\u0528\3\2\2\2\u0527\u0523\3\2\2\2\u0528\u052b\3\2\2\2\u0529"+
		"\u0527\3\2\2\2\u0529\u052a\3\2\2\2\u052a\u0530\3\2\2\2\u052b\u0529\3\2"+
		"\2\2\u052c\u052d\7Q\2\2\u052d\u052f\7R\2\2\u052e\u052c\3\2\2\2\u052f\u0532"+
		"\3\2\2\2\u0530\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0534\3\2\2\2\u0532"+
		"\u0530\3\2\2\2\u0533\u0518\3\2\2\2\u0533\u0521\3\2\2\2\u0534\u00c3\3\2"+
		"\2\2\u0535\u0537\5\u00d2j\2\u0536\u0538\5$\23\2\u0537\u0536\3\2\2\2\u0537"+
		"\u0538\3\2\2\2\u0538\u00c5\3\2\2\2\u0539\u053a\5\u00c8e\2\u053a\u053b"+
		"\5\u00d0i\2\u053b\u00c7\3\2\2\2\u053c\u053d\7X\2\2\u053d\u053e\5\"\22"+
		"\2\u053e\u053f\7W\2\2\u053f\u00c9\3\2\2\2\u0540\u0541\7X\2\2\u0541\u0544"+
		"\7W\2\2\u0542\u0544\5r:\2\u0543\u0540\3\2\2\2\u0543\u0542\3\2\2\2\u0544"+
		"\u00cb\3\2\2\2\u0545\u0546\7X\2\2\u0546\u0549\7W\2\2\u0547\u0549\5\u00c8"+
		"e\2\u0548\u0545\3\2\2\2\u0548\u0547\3\2\2\2\u0549\u00cd\3\2\2\2\u054a"+
		"\u0551\5\u00d2j\2\u054b\u054c\7U\2\2\u054c\u054e\7x\2\2\u054d\u054f\5"+
		"\u00d2j\2\u054e\u054d\3\2\2\2\u054e\u054f\3\2\2\2\u054f\u0551\3\2\2\2"+
		"\u0550\u054a\3\2\2\2\u0550\u054b\3\2\2\2\u0551\u00cf\3\2\2\2\u0552\u0553"+
		"\7=\2\2\u0553\u0557\5\u00ceh\2\u0554\u0555\7x\2\2\u0555\u0557\5\u00d2"+
		"j\2\u0556\u0552\3\2\2\2\u0556\u0554\3\2\2\2\u0557\u00d1\3\2\2\2\u0558"+
		"\u055a\7M\2\2\u0559\u055b\5\u00b2Z\2\u055a\u0559\3\2\2\2\u055a\u055b\3"+
		"\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\7N\2\2\u055d\u00d3\3\2\2\2\u00a5"+
		"\u00d5\u00da\u00de\u00e9\u00f0\u00f7\u00fe\u0103\u0107\u010f\u0114\u0118"+
		"\u011c\u0126\u012e\u0135\u013c\u0140\u0143\u0146\u014f\u0154\u0157\u015d"+
		"\u0163\u0167\u0170\u0177\u017f\u0185\u018b\u0190\u0197\u019b\u01a1\u01a7"+
		"\u01ad\u01b2\u01b9\u01bd\u01c1\u01c8\u01cc\u01d6\u01db\u01e6\u01eb\u01ef"+
		"\u01f9\u0201\u020d\u021a\u0222\u0228\u022e\u0236\u0240\u0247\u024f\u0257"+
		"\u0261\u026e\u0273\u027f\u0285\u028c\u0291\u0299\u029d\u029f\u02aa\u02b2"+
		"\u02ba\u02c2\u02c5\u02ca\u02d3\u02d8\u02dc\u02eb\u02f1\u0301\u0306\u030e"+
		"\u0315\u031d\u0330\u0338\u0341\u0343\u034a\u034f\u0358\u035d\u0360\u0365"+
		"\u036e\u037e\u0387\u038d\u0393\u0398\u039f\u03a3\u03a8\u03b5\u03be\u03c1"+
		"\u03d7\u03da\u03dd\u03e5\u03e9\u03f1\u03f4\u03f9\u03ff\u0406\u0409\u0411"+
		"\u041a\u041f\u042b\u0432\u043f\u0448\u0451\u0457\u0462\u0467\u0473\u0477"+
		"\u047b\u047f\u0481\u0485\u048a\u049a\u04a1\u04af\u04bc\u04e1\u04e6\u04e8"+
		"\u04f3\u04fc\u04fe\u0502\u0507\u050b\u050f\u0513\u051d\u0529\u0530\u0533"+
		"\u0537\u0543\u0548\u054e\u0550\u0556\u055a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}