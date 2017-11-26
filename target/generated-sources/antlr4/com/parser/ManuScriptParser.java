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
		T__9=10, T__10=11, ABSTRACT=12, ASSERT=13, BOOLEAN=14, BREAK=15, BYTE=16, 
		CASE=17, CATCH=18, CHAR=19, CLASS=20, CONST=21, CONTINUE=22, DEFAULT=23, 
		DO=24, DOUBLE=25, ELSE=26, ENUM=27, EXTENDS=28, FINAL=29, FINALLY=30, 
		FLOAT=31, FOR=32, IF=33, GOTO=34, IMPLEMENTS=35, IMPORT=36, INSTANCEOF=37, 
		INT=38, INTERFACE=39, LONG=40, NATIVE=41, NEW=42, PACKAGE=43, PRINT=44, 
		PRIVATE=45, PROTECTED=46, PUBLIC=47, RETURN=48, SCAN=49, SCANTO=50, SHORT=51, 
		STARTING=52, STATIC=53, STRICTFP=54, STRING=55, STRUCT=56, SUPER=57, SWITCH=58, 
		SYNCHRONIZED=59, THIS=60, THROW=61, THROWS=62, TRANSIENT=63, TRY=64, VOID=65, 
		WHILE=66, IntegerLiteral=67, FloatingPointLiteral=68, BooleanLiteral=69, 
		CharacterLiteral=70, StringLiteral=71, NullLiteral=72, LPAREN=73, RPAREN=74, 
		LBRACE=75, RBRACE=76, LBRACK=77, RBRACK=78, SEMI=79, COMMA=80, DOT=81, 
		ASSIGN=82, GT=83, LT=84, BANG=85, TILDE=86, QUESTION=87, COLON=88, EQUAL=89, 
		LE=90, GE=91, NOTEQUAL=92, AND=93, OR=94, INC=95, DEC=96, ADD=97, SUB=98, 
		MUL=99, DIV=100, BITAND=101, BITOR=102, CARET=103, MOD=104, ADD_ASSIGN=105, 
		SUB_ASSIGN=106, MUL_ASSIGN=107, DIV_ASSIGN=108, AND_ASSIGN=109, OR_ASSIGN=110, 
		XOR_ASSIGN=111, MOD_ASSIGN=112, LSHIFT_ASSIGN=113, RSHIFT_ASSIGN=114, 
		URSHIFT_ASSIGN=115, Identifier=116, AT=117, ELLIPSIS=118, WS=119, COMMENT=120, 
		LINE_COMMENT=121;
	public static final int
		RULE_compilationUnit = 0, RULE_bodyDeclaration = 1, RULE_typeBound = 2, 
		RULE_typeList = 3, RULE_memberDeclaration = 4, RULE_startFieldStruct = 5, 
		RULE_startMethodDeclaration = 6, RULE_methodDeclaration = 7, RULE_fieldDeclaration = 8, 
		RULE_constDeclaration = 9, RULE_constantDeclarator = 10, RULE_variableDeclarators = 11, 
		RULE_variableDeclarator = 12, RULE_variableDeclaratorId = 13, RULE_variableInitializer = 14, 
		RULE_arrayInitializer = 15, RULE_typeType = 16, RULE_pointerType = 17, 
		RULE_structType = 18, RULE_primitiveType = 19, RULE_structDefinition = 20, 
		RULE_structDeclarationList = 21, RULE_structDeclaration = 22, RULE_structDeclaratorList = 23, 
		RULE_structDeclarator = 24, RULE_structDeclaratorId = 25, RULE_typeDefinition = 26, 
		RULE_typeArguments = 27, RULE_typeArgument = 28, RULE_qualifiedNameList = 29, 
		RULE_formalParameters = 30, RULE_formalParameterList = 31, RULE_formalParameter = 32, 
		RULE_lastFormalParameter = 33, RULE_methodBody = 34, RULE_qualifiedName = 35, 
		RULE_literal = 36, RULE_block = 37, RULE_blockStatement = 38, RULE_localVariableDeclarationStatement = 39, 
		RULE_localVariableDeclaration = 40, RULE_statement = 41, RULE_switchBlockStatementGroup = 42, 
		RULE_switchLabel = 43, RULE_forControl = 44, RULE_forInit = 45, RULE_enhancedForControl = 46, 
		RULE_forUpdate = 47, RULE_outputStatement = 48, RULE_inputStatement = 49, 
		RULE_parExpression = 50, RULE_expressionList = 51, RULE_statementExpression = 52, 
		RULE_constantExpression = 53, RULE_expression = 54, RULE_structExpr = 55, 
		RULE_variableExpr = 56, RULE_equationExpr = 57, RULE_primary = 58, RULE_creator = 59, 
		RULE_createdName = 60, RULE_arrayCreatorRest = 61, RULE_arguments = 62;
	public static final String[] ruleNames = {
		"compilationUnit", "bodyDeclaration", "typeBound", "typeList", "memberDeclaration", 
		"startFieldStruct", "startMethodDeclaration", "methodDeclaration", "fieldDeclaration", 
		"constDeclaration", "constantDeclarator", "variableDeclarators", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "arrayInitializer", "typeType", 
		"pointerType", "structType", "primitiveType", "structDefinition", "structDeclarationList", 
		"structDeclaration", "structDeclaratorList", "structDeclarator", "structDeclaratorId", 
		"typeDefinition", "typeArguments", "typeArgument", "qualifiedNameList", 
		"formalParameters", "formalParameterList", "formalParameter", "lastFormalParameter", 
		"methodBody", "qualifiedName", "literal", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"outputStatement", "inputStatement", "parExpression", "expressionList", 
		"statementExpression", "constantExpression", "expression", "structExpr", 
		"variableExpr", "equationExpr", "primary", "creator", "createdName", "arrayCreatorRest", 
		"arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ACT'", "'starring'", "'{A}'", "'{Z}'", "'{SCENE'", "'{END'", "'SCENE'", 
		"'END'", "'cast'", "'as'", "'->'", "'template'", "'assert'", "'boolean'", 
		"'break'", "'byte'", "'version'", "'catch'", "'char'", "'script'", "'const'", 
		"'continue'", "'original'", "'rehearse'", "'double'", "'else'", "'enum'", 
		null, "'permanent'", "'finally'", "'float'", "'replay'", "'if'", "'goto'", 
		"'that can'", "'take'", "'can act as'", "'int'", "'interface'", "'long'", 
		"'native'", "'new'", "'from'", "'Say'", "'secret'", "'hereditary'", "'universal'", 
		"'give'", "'Write'", "'to'", "'short'", "'The'", "'static'", "'strictfp'", 
		"'string'", "'composition'", "'super'", "'switch'", "'synchronized'", 
		"'this'", "'ignore'", "'ignores'", "'transient'", "'audition'", "'void'", 
		"'when'", null, null, null, null, null, "'null'", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", 
		"'~'", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", 
		"'--'", "'+'", "'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", 
		"'-='", "'*='", "'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", 
		"'>>>='", null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"ABSTRACT", "ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", 
		"CLASS", "CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", 
		"EXTENDS", "FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", 
		"IMPORT", "INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
		"PRINT", "PRIVATE", "PROTECTED", "PUBLIC", "RETURN", "SCAN", "SCANTO", 
		"SHORT", "STARTING", "STATIC", "STRICTFP", "STRING", "STRUCT", "SUPER", 
		"SWITCH", "SYNCHRONIZED", "THIS", "THROW", "THROWS", "TRANSIENT", "TRY", 
		"VOID", "WHILE", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "NullLiteral", "LPAREN", "RPAREN", 
		"LBRACE", "RBRACE", "LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ASSIGN", 
		"GT", "LT", "BANG", "TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", 
		"NOTEQUAL", "AND", "OR", "INC", "DEC", "ADD", "SUB", "MUL", "DIV", "BITAND", 
		"BITOR", "CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AT", "ELLIPSIS", "WS", 
		"COMMENT", "LINE_COMMENT"
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
		public BodyDeclarationContext bodyDeclaration() {
			return getRuleContext(BodyDeclarationContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0)) {
				{
				setState(126);
				bodyDeclaration();
				}
			}

			setState(129);
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

	public static class BodyDeclarationContext extends ParserRuleContext {
		public MemberDeclarationContext memberDeclaration() {
			return getRuleContext(MemberDeclarationContext.class,0);
		}
		public BodyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterBodyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitBodyDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitBodyDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyDeclarationContext bodyDeclaration() throws RecognitionException {
		BodyDeclarationContext _localctx = new BodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bodyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			memberDeclaration();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitTypeBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeBoundContext typeBound() throws RecognitionException {
		TypeBoundContext _localctx = new TypeBoundContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			typeType();
			setState(138);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(134);
				match(BITAND);
				setState(135);
				typeType();
				}
				}
				setState(140);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			typeType();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(142);
				match(COMMA);
				setState(143);
				typeType();
				}
				}
				setState(148);
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

	public static class MemberDeclarationContext extends ParserRuleContext {
		public StartMethodDeclarationContext startMethodDeclaration() {
			return getRuleContext(StartMethodDeclarationContext.class,0);
		}
		public List<StartFieldStructContext> startFieldStruct() {
			return getRuleContexts(StartFieldStructContext.class);
		}
		public StartFieldStructContext startFieldStruct(int i) {
			return getRuleContext(StartFieldStructContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitMemberDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemberDeclarationContext memberDeclaration() throws RecognitionException {
		MemberDeclarationContext _localctx = new MemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_memberDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(149);
				startFieldStruct();
				}
				}
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(155);
			startMethodDeclaration();
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

	public static class StartFieldStructContext extends ParserRuleContext {
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
		}
		public StartFieldStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startFieldStruct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterStartFieldStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitStartFieldStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitStartFieldStruct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartFieldStructContext startFieldStruct() throws RecognitionException {
		StartFieldStructContext _localctx = new StartFieldStructContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_startFieldStruct);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				fieldDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				structDefinition();
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

	public static class StartMethodDeclarationContext extends ParserRuleContext {
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public StartMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterStartMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitStartMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitStartMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartMethodDeclarationContext startMethodDeclaration() throws RecognitionException {
		StartMethodDeclarationContext _localctx = new StartMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_startMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			methodDeclaration();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(162);
				methodDeclaration();
				}
				}
				setState(167);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public FormalParametersContext formalParameters() {
			return getRuleContext(FormalParametersContext.class,0);
		}
		public MethodBodyContext methodBody() {
			return getRuleContext(MethodBodyContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__0);
			setState(169);
			match(Identifier);
			setState(170);
			match(T__1);
			setState(171);
			formalParameters();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(172);
				match(LBRACK);
				setState(173);
				match(RBRACK);
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(179);
				match(THROWS);
				setState(180);
				qualifiedNameList();
				}
			}

			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
			case LBRACE:
				{
				setState(183);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(184);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
		}
		public VariableDeclaratorsContext variableDeclarators() {
			return getRuleContext(VariableDeclaratorsContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(ManuScriptParser.FINAL, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitFieldDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(187);
				match(FINAL);
				}
			}

			setState(190);
			typeType();
			setState(191);
			variableDeclarators();
			setState(192);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitConstDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			typeType();
			setState(195);
			constantDeclarator();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(196);
				match(COMMA);
				setState(197);
				constantDeclarator();
				}
				}
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(203);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitConstantDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDeclaratorContext constantDeclarator() throws RecognitionException {
		ConstantDeclaratorContext _localctx = new ConstantDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(Identifier);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(206);
				match(LBRACK);
				setState(207);
				match(RBRACK);
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(ASSIGN);
			setState(214);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitVariableDeclarators(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			variableDeclarator();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(217);
				match(COMMA);
				setState(218);
				variableDeclarator();
				}
				}
				setState(223);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitVariableDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorContext variableDeclarator() throws RecognitionException {
		VariableDeclaratorContext _localctx = new VariableDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			variableDeclaratorId();
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(225);
				match(ASSIGN);
				setState(226);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitVariableDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDeclaratorIdContext variableDeclaratorId() throws RecognitionException {
		VariableDeclaratorIdContext _localctx = new VariableDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_variableDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitVariableInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableInitializerContext variableInitializer() throws RecognitionException {
		VariableInitializerContext _localctx = new VariableInitializerContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variableInitializer);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(231);
				arrayInitializer();
				}
				break;
			case NEW:
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
				setState(232);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(LBRACE);
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(236);
				variableInitializer();
				setState(241);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(237);
						match(COMMA);
						setState(238);
						variableInitializer();
						}
						} 
					}
					setState(243);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(244);
					match(COMMA);
					}
				}

				}
			}

			setState(249);
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

	public static class TypeTypeContext extends ParserRuleContext {
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitTypeType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_typeType);
		int _la;
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(251);
				pointerType();
				setState(256);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(252);
					match(LBRACK);
					setState(253);
					match(RBRACK);
					}
					}
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(259);
				primitiveType();
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(260);
					match(LBRACK);
					setState(261);
					match(RBRACK);
					}
					}
					setState(266);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(267);
				structType();
				setState(272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(268);
					match(LBRACK);
					setState(269);
					match(RBRACK);
					}
					}
					setState(274);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitPointerType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerTypeContext pointerType() throws RecognitionException {
		PointerTypeContext _localctx = new PointerTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
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
				setState(277);
				primitiveType();
				}
				break;
			case STRUCT:
				{
				setState(278);
				structType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(281);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitStructType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(283);
			match(STRUCT);
			setState(284);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitStructDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDefinitionContext structDefinition() throws RecognitionException {
		StructDefinitionContext _localctx = new StructDefinitionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_structDefinition);
		int _la;
		try {
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(288);
				match(STRUCT);
				setState(289);
				match(Identifier);
				setState(290);
				match(T__2);
				setState(291);
				structDeclarationList();
				setState(292);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(STRUCT);
				setState(295);
				match(Identifier);
				setState(296);
				match(T__4);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(297);
					match(Identifier);
					}
				}

				setState(300);
				match(RBRACE);
				setState(301);
				structDeclarationList();
				setState(302);
				match(T__5);
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(303);
					match(Identifier);
					}
				}

				setState(306);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(308);
				match(STRUCT);
				setState(309);
				match(Identifier);
				setState(310);
				match(T__6);
				setState(311);
				structDeclarationList();
				setState(312);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(314);
				match(STRUCT);
				setState(315);
				match(Identifier);
				setState(316);
				match(LBRACE);
				setState(317);
				structDeclarationList();
				setState(318);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitStructDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(322);
				structDeclaration();
				}
				}
				setState(327);
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
		public TypeTypeContext typeType() {
			return getRuleContext(TypeTypeContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_structDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			typeType();
			setState(329);
			structDeclaratorList();
			setState(330);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitStructDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			structDeclarator();
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(333);
				match(COMMA);
				setState(334);
				structDeclarator();
				}
				}
				setState(339);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_structDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitStructDeclaratorId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorIdContext structDeclaratorId() throws RecognitionException {
		StructDeclaratorIdContext _localctx = new StructDeclaratorIdContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_structDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitTypeDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDefinitionContext typeDefinition() throws RecognitionException {
		TypeDefinitionContext _localctx = new TypeDefinitionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_typeDefinition);
		try {
			setState(356);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(344);
				match(T__8);
				setState(345);
				typeType();
				setState(346);
				match(T__9);
				setState(347);
				match(Identifier);
				setState(348);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				match(T__8);
				setState(351);
				structDefinition();
				setState(352);
				match(T__9);
				setState(353);
				match(Identifier);
				setState(354);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitTypeArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentsContext typeArguments() throws RecognitionException {
		TypeArgumentsContext _localctx = new TypeArgumentsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(LT);
			setState(359);
			typeArgument();
			setState(364);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(360);
				match(COMMA);
				setState(361);
				typeArgument();
				}
				}
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(367);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitTypeArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeArgumentContext typeArgument() throws RecognitionException {
		TypeArgumentContext _localctx = new TypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_typeArgument);
		int _la;
		try {
			setState(375);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(370);
				match(QUESTION);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(371);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(372);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(377);
			qualifiedName();
			setState(382);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(378);
				match(COMMA);
				setState(379);
				qualifiedName();
				}
				}
				setState(384);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitFormalParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParametersContext formalParameters() throws RecognitionException {
		FormalParametersContext _localctx = new FormalParametersContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			match(LPAREN);
			setState(387);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0)) {
				{
				setState(386);
				formalParameterList();
				}
			}

			setState(389);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitFormalParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(404);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				formalParameter();
				setState(396);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(392);
						match(COMMA);
						setState(393);
						formalParameter();
						}
						} 
					}
					setState(398);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(401);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(399);
					match(COMMA);
					setState(400);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalParameterContext formalParameter() throws RecognitionException {
		FormalParameterContext _localctx = new FormalParameterContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			typeType();
			setState(407);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitLastFormalParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LastFormalParameterContext lastFormalParameter() throws RecognitionException {
		LastFormalParameterContext _localctx = new LastFormalParameterContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_lastFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			typeType();
			setState(410);
			match(ELLIPSIS);
			setState(411);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitMethodBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodBodyContext methodBody() throws RecognitionException {
		MethodBodyContext _localctx = new MethodBodyContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(Identifier);
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(416);
				match(DOT);
				setState(417);
				match(Identifier);
				}
				}
				setState(422);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)))) != 0)) ) {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_block);
		int _la;
		try {
			setState(457);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(T__2);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(426);
					blockStatement();
					}
					}
					setState(431);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(432);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(T__4);
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(434);
					match(Identifier);
					}
				}

				setState(437);
				match(RBRACE);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(438);
					blockStatement();
					}
					}
					setState(443);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(444);
				match(T__5);
				setState(446);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(445);
					match(Identifier);
					}
				}

				setState(448);
				match(RBRACE);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(449);
				match(LBRACE);
				setState(453);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(450);
					blockStatement();
					}
					}
					setState(455);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(456);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitBlockStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_blockStatement);
		try {
			setState(461);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				localVariableDeclarationStatement();
				}
				break;
			case T__2:
			case T__4:
			case BREAK:
			case DO:
			case FOR:
			case IF:
			case NEW:
			case PRINT:
			case RETURN:
			case SCAN:
			case SWITCH:
			case WHILE:
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case LBRACE:
			case SEMI:
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
				setState(460);
				statement();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitLocalVariableDeclarationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationStatementContext localVariableDeclarationStatement() throws RecognitionException {
		LocalVariableDeclarationStatementContext _localctx = new LocalVariableDeclarationStatementContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			localVariableDeclaration();
			setState(464);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitLocalVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocalVariableDeclarationContext localVariableDeclaration() throws RecognitionException {
		LocalVariableDeclarationContext _localctx = new LocalVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			typeType();
			setState(467);
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SwitchStmtContext extends StatementContext {
		public TerminalNode SWITCH() { return getToken(ManuScriptParser.SWITCH, 0); }
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
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
		public SwitchStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterSwitchStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitSwitchStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitSwitchStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStmtContext extends StatementContext {
		public ForControlContext forControl() {
			return getRuleContext(ForControlContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode FOR() { return getToken(ManuScriptParser.FOR, 0); }
		public ForStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterForStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitForStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitForStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SemicolonStmtContext extends StatementContext {
		public SemicolonStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterSemicolonStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitSemicolonStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitSemicolonStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStmtContext extends StatementContext {
		public StatementExpressionContext statementExpression() {
			return getRuleContext(StatementExpressionContext.class,0);
		}
		public ExprStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterExprStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitExprStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitExprStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileStmtContext extends StatementContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoWhileStmtContext extends StatementContext {
		public TerminalNode DO() { return getToken(ManuScriptParser.DO, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public DoWhileStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterDoWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitDoWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitDoWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockStmtContext extends StatementContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public BlockStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfElseStmtContext extends StatementContext {
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
		public IfElseStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakStmtContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(ManuScriptParser.BREAK, 0); }
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public BreakStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterBreakStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitBreakStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitBreakStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStmtContext extends StatementContext {
		public TerminalNode RETURN() { return getToken(ManuScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitReturnStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitReturnStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OutputStmtContext extends StatementContext {
		public OutputStatementContext outputStatement() {
			return getRuleContext(OutputStatementContext.class,0);
		}
		public OutputStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterOutputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitOutputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitOutputStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputStmtContext extends StatementContext {
		public InputStatementContext inputStatement() {
			return getRuleContext(InputStatementContext.class,0);
		}
		public InputStmtContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterInputStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitInputStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitInputStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(547);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(469);
				block();
				}
				break;
			case 2:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(470);
				match(IF);
				setState(471);
				parExpression();
				setState(472);
				statement();
				setState(475);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(473);
					match(ELSE);
					setState(474);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new ForStmtContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(478);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(477);
					match(FOR);
					}
				}

				setState(480);
				match(LPAREN);
				setState(481);
				forControl();
				setState(482);
				match(RPAREN);
				setState(483);
				statement();
				}
				break;
			case 4:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(485);
				match(WHILE);
				setState(486);
				parExpression();
				setState(487);
				statement();
				}
				break;
			case 5:
				_localctx = new DoWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(489);
				match(DO);
				setState(490);
				statement();
				setState(491);
				match(WHILE);
				setState(492);
				parExpression();
				setState(493);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(495);
				match(SWITCH);
				setState(496);
				parExpression();
				setState(504);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(497);
					match(LBRACE);
					}
					break;
				case T__2:
					{
					setState(498);
					match(T__2);
					}
					break;
				case T__4:
					{
					setState(499);
					match(T__4);
					setState(501);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(500);
						match(Identifier);
						}
					}

					setState(503);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(506);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(511);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(515);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(512);
					switchLabel();
					}
					}
					setState(517);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(525);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE:
					{
					setState(518);
					match(RBRACE);
					}
					break;
				case T__3:
					{
					setState(519);
					match(T__3);
					}
					break;
				case T__5:
					{
					setState(520);
					match(T__5);
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(521);
						match(Identifier);
						}
					}

					setState(524);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				_localctx = new ReturnStmtContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(527);
				match(RETURN);
				setState(529);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(528);
					expression(0);
					}
				}

				setState(531);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(532);
				match(BREAK);
				setState(534);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(533);
					match(Identifier);
					}
				}

				setState(536);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new SemicolonStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(537);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(538);
				statementExpression();
				setState(539);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new OutputStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(541);
				outputStatement();
				setState(542);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new InputStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(544);
				inputStatement();
				setState(545);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitSwitchBlockStatementGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchBlockStatementGroupContext switchBlockStatementGroup() throws RecognitionException {
		SwitchBlockStatementGroupContext _localctx = new SwitchBlockStatementGroupContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(549);
				switchLabel();
				}
				}
				setState(552); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(555); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(554);
				blockStatement();
				}
				}
				setState(557); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0) );
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitSwitchLabel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_switchLabel);
		try {
			setState(565);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(559);
				match(CASE);
				setState(560);
				constantExpression();
				setState(561);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(563);
				match(DEFAULT);
				setState(564);
				match(COLON);
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

	public static class ForControlContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_forControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			forInit();
			setState(568);
			match(SEMI);
			setState(570);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(569);
				expression(0);
				}
			}

			setState(572);
			match(SEMI);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(573);
				forUpdate();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_forInit);
		try {
			setState(578);
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
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				localVariableDeclaration();
				}
				break;
			case NEW:
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
				setState(577);
				expressionList();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitEnhancedForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnhancedForControlContext enhancedForControl() throws RecognitionException {
		EnhancedForControlContext _localctx = new EnhancedForControlContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			typeType();
			setState(581);
			variableDeclaratorId();
			setState(582);
			match(COLON);
			setState(583);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitForUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForUpdateContext forUpdate() throws RecognitionException {
		ForUpdateContext _localctx = new ForUpdateContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(585);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitOutputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputStatementContext outputStatement() throws RecognitionException {
		OutputStatementContext _localctx = new OutputStatementContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_outputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(587);
			match(PRINT);
			setState(588);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitInputStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputStatementContext inputStatement() throws RecognitionException {
		InputStatementContext _localctx = new InputStatementContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_inputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(SCAN);
			setState(592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0)) {
				{
				setState(591);
				typeType();
				}
			}

			setState(594);
			match(SCANTO);
			setState(595);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitParExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParExpressionContext parExpression() throws RecognitionException {
		ParExpressionContext _localctx = new ParExpressionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			match(LPAREN);
			setState(598);
			expression(0);
			setState(599);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
			expression(0);
			setState(606);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(602);
				match(COMMA);
				setState(603);
				expression(0);
				}
				}
				setState(608);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitStatementExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementExpressionContext statementExpression() throws RecognitionException {
		StatementExpressionContext _localctx = new StatementExpressionContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(611);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitNegationExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitAddSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayExprContext extends ExpressionContext {
		public VariableExprContext variableExpr() {
			return getRuleContext(VariableExprContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitArrayExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayInitExprContext extends ExpressionContext {
		public TerminalNode NEW() { return getToken(ManuScriptParser.NEW, 0); }
		public CreatorContext creator() {
			return getRuleContext(CreatorContext.class,0);
		}
		public ArrayInitExprContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterArrayInitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitArrayInitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitArrayInitExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitOneLineIfExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitComparisonExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionExprContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncDecExprContext extends ExpressionContext {
		public EquationExprContext equationExpr() {
			return getRuleContext(EquationExprContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitPostIncDecExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitPrimaryExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitMultDivModExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignExprContext extends ExpressionContext {
		public EquationExprContext equationExpr() {
			return getRuleContext(EquationExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitAssignExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PreIncDecSignExprContext extends ExpressionContext {
		public EquationExprContext equationExpr() {
			return getRuleContext(EquationExprContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitPreIncDecSignExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitEqualityExpr(this);
			else return visitor.visitChildren(this);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
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
		int _startState = 108;
		enterRecursionRule(_localctx, 108, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(614);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(615);
				variableExpr();
				setState(616);
				match(LBRACK);
				setState(617);
				expression(0);
				setState(618);
				match(RBRACK);
				setState(625);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(619);
						match(LBRACK);
						setState(620);
						expression(0);
						setState(621);
						match(RBRACK);
						}
						} 
					}
					setState(627);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,64,_ctx);
				}
				}
				break;
			case 3:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(628);
				match(Identifier);
				setState(629);
				match(LPAREN);
				setState(631);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(630);
					expressionList();
					}
				}

				setState(633);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new ArrayInitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(634);
				match(NEW);
				setState(635);
				creator();
				}
				break;
			case 5:
				{
				_localctx = new PostIncDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(636);
				equationExpr();
				setState(637);
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
			case 6:
				{
				_localctx = new PreIncDecSignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(639);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (INC - 95)) | (1L << (DEC - 95)) | (1L << (ADD - 95)) | (1L << (SUB - 95)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(640);
				equationExpr();
				}
				break;
			case 7:
				{
				_localctx = new NegationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(641);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(642);
				expression(9);
				}
				break;
			case 8:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(643);
				equationExpr();
				setState(644);
				_la = _input.LA(1);
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ASSIGN - 82)) | (1L << (ADD_ASSIGN - 82)) | (1L << (SUB_ASSIGN - 82)) | (1L << (MUL_ASSIGN - 82)) | (1L << (DIV_ASSIGN - 82)) | (1L << (MOD_ASSIGN - 82)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(645);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(675);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(673);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(649);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(650);
						_la = _input.LA(1);
						if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (MUL - 99)) | (1L << (DIV - 99)) | (1L << (MOD - 99)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(651);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(652);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(653);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(654);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(655);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(656);
						_la = _input.LA(1);
						if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (GT - 83)) | (1L << (LT - 83)) | (1L << (LE - 83)) | (1L << (GE - 83)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(657);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(658);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(659);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(660);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(661);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(662);
						match(AND);
						setState(663);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(664);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(665);
						match(OR);
						setState(666);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new OneLineIfExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(667);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(668);
						match(QUESTION);
						setState(669);
						expression(0);
						setState(670);
						match(COLON);
						setState(671);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(677);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
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

	public static class StructExprContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public StructExprContext structExpr() {
			return getRuleContext(StructExprContext.class,0);
		}
		public StructExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterStructExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitStructExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitStructExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructExprContext structExpr() throws RecognitionException {
		return structExpr(0);
	}

	private StructExprContext structExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructExprContext _localctx = new StructExprContext(_ctx, _parentState);
		StructExprContext _prevctx = _localctx;
		int _startState = 110;
		enterRecursionRule(_localctx, 110, RULE_structExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(679);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(689);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(687);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new StructExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_structExpr);
						setState(681);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(682);
						match(DOT);
						setState(683);
						match(Identifier);
						}
						break;
					case 2:
						{
						_localctx = new StructExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_structExpr);
						setState(684);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(685);
						match(T__10);
						setState(686);
						match(Identifier);
						}
						break;
					}
					} 
				}
				setState(691);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class VariableExprContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public StructExprContext structExpr() {
			return getRuleContext(StructExprContext.class,0);
		}
		public VariableExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterVariableExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitVariableExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitVariableExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableExprContext variableExpr() throws RecognitionException {
		VariableExprContext _localctx = new VariableExprContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_variableExpr);
		try {
			setState(696);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(692);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(693);
				match(MUL);
				setState(694);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(695);
				structExpr(0);
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

	public static class EquationExprContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public VariableExprContext variableExpr() {
			return getRuleContext(VariableExprContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StructExprContext structExpr() {
			return getRuleContext(StructExprContext.class,0);
		}
		public EquationExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equationExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).enterEquationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ManuScriptListener ) ((ManuScriptListener)listener).exitEquationExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitEquationExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationExprContext equationExpr() throws RecognitionException {
		EquationExprContext _localctx = new EquationExprContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_equationExpr);
		try {
			int _alt;
			setState(712);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(699);
				match(MUL);
				setState(700);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(701);
				variableExpr();
				setState(708);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(702);
						match(LBRACK);
						setState(703);
						expression(0);
						setState(704);
						match(RBRACK);
						}
						} 
					}
					setState(710);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(711);
				structExpr(0);
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

	public static class PrimaryContext extends ParserRuleContext {
		public ParExpressionContext parExpression() {
			return getRuleContext(ParExpressionContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public EquationExprContext equationExpr() {
			return getRuleContext(EquationExprContext.class,0);
		}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_primary);
		try {
			setState(717);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(714);
				parExpression();
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
				setState(715);
				literal();
				}
				break;
			case MUL:
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(716);
				equationExpr();
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
		public CreatedNameContext createdName() {
			return getRuleContext(CreatedNameContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitCreator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatorContext creator() throws RecognitionException {
		CreatorContext _localctx = new CreatorContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_creator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(719);
			createdName();
			{
			setState(720);
			arrayCreatorRest();
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

	public static class CreatedNameContext extends ParserRuleContext {
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public PointerTypeContext pointerType() {
			return getRuleContext(PointerTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitCreatedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreatedNameContext createdName() throws RecognitionException {
		CreatedNameContext _localctx = new CreatedNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_createdName);
		try {
			setState(725);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(722);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(723);
				pointerType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(724);
				structType();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitArrayCreatorRest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayCreatorRestContext arrayCreatorRest() throws RecognitionException {
		ArrayCreatorRestContext _localctx = new ArrayCreatorRestContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(727);
			match(LBRACK);
			setState(755);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(728);
				match(RBRACK);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(729);
					match(LBRACK);
					setState(730);
					match(RBRACK);
					}
					}
					setState(735);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(736);
				arrayInitializer();
				}
				break;
			case NEW:
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
				setState(737);
				expression(0);
				setState(738);
				match(RBRACK);
				setState(745);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(739);
						match(LBRACK);
						setState(740);
						expression(0);
						setState(741);
						match(RBRACK);
						}
						} 
					}
					setState(747);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				}
				setState(752);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(748);
						match(LBRACK);
						setState(749);
						match(RBRACK);
						}
						} 
					}
					setState(754);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(LPAREN);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(758);
				expressionList();
				}
			}

			setState(761);
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
		case 54:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 55:
			return structExpr_sempred((StructExprContext)_localctx, predIndex);
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
		}
		return true;
	}
	private boolean structExpr_sempred(StructExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3{\u02fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\5\2\u0082\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\7\4\u008b"+
		"\n\4\f\4\16\4\u008e\13\4\3\5\3\5\3\5\7\5\u0093\n\5\f\5\16\5\u0096\13\5"+
		"\3\6\7\6\u0099\n\6\f\6\16\6\u009c\13\6\3\6\3\6\3\7\3\7\5\7\u00a2\n\7\3"+
		"\b\3\b\7\b\u00a6\n\b\f\b\16\b\u00a9\13\b\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00b1"+
		"\n\t\f\t\16\t\u00b4\13\t\3\t\3\t\5\t\u00b8\n\t\3\t\3\t\5\t\u00bc\n\t\3"+
		"\n\5\n\u00bf\n\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\u00c9\n\13\f"+
		"\13\16\13\u00cc\13\13\3\13\3\13\3\f\3\f\3\f\7\f\u00d3\n\f\f\f\16\f\u00d6"+
		"\13\f\3\f\3\f\3\f\3\r\3\r\3\r\7\r\u00de\n\r\f\r\16\r\u00e1\13\r\3\16\3"+
		"\16\3\16\5\16\u00e6\n\16\3\17\3\17\3\20\3\20\5\20\u00ec\n\20\3\21\3\21"+
		"\3\21\3\21\7\21\u00f2\n\21\f\21\16\21\u00f5\13\21\3\21\5\21\u00f8\n\21"+
		"\5\21\u00fa\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u0101\n\22\f\22\16\22\u0104"+
		"\13\22\3\22\3\22\3\22\7\22\u0109\n\22\f\22\16\22\u010c\13\22\3\22\3\22"+
		"\3\22\7\22\u0111\n\22\f\22\16\22\u0114\13\22\5\22\u0116\n\22\3\23\3\23"+
		"\5\23\u011a\n\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u012d\n\26\3\26\3\26\3\26\3\26\5\26"+
		"\u0133\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u0143\n\26\3\27\7\27\u0146\n\27\f\27\16\27\u0149\13\27"+
		"\3\30\3\30\3\30\3\30\3\31\3\31\3\31\7\31\u0152\n\31\f\31\16\31\u0155\13"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\5\34\u0167\n\34\3\35\3\35\3\35\3\35\7\35\u016d\n\35\f\35"+
		"\16\35\u0170\13\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u0178\n\36\5\36"+
		"\u017a\n\36\3\37\3\37\3\37\7\37\u017f\n\37\f\37\16\37\u0182\13\37\3 \3"+
		" \5 \u0186\n \3 \3 \3!\3!\3!\7!\u018d\n!\f!\16!\u0190\13!\3!\3!\5!\u0194"+
		"\n!\3!\5!\u0197\n!\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\7%\u01a5\n%"+
		"\f%\16%\u01a8\13%\3&\3&\3\'\3\'\7\'\u01ae\n\'\f\'\16\'\u01b1\13\'\3\'"+
		"\3\'\3\'\5\'\u01b6\n\'\3\'\3\'\7\'\u01ba\n\'\f\'\16\'\u01bd\13\'\3\'\3"+
		"\'\5\'\u01c1\n\'\3\'\3\'\3\'\7\'\u01c6\n\'\f\'\16\'\u01c9\13\'\3\'\5\'"+
		"\u01cc\n\'\3(\3(\5(\u01d0\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\5+\u01de"+
		"\n+\3+\5+\u01e1\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3+\3+\5+\u01f8\n+\3+\5+\u01fb\n+\3+\7+\u01fe\n+\f+\16+\u0201\13"+
		"+\3+\7+\u0204\n+\f+\16+\u0207\13+\3+\3+\3+\3+\5+\u020d\n+\3+\5+\u0210"+
		"\n+\3+\3+\5+\u0214\n+\3+\3+\3+\5+\u0219\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\5+\u0226\n+\3,\6,\u0229\n,\r,\16,\u022a\3,\6,\u022e\n,\r,\16,\u022f"+
		"\3-\3-\3-\3-\3-\3-\5-\u0238\n-\3.\3.\3.\5.\u023d\n.\3.\3.\5.\u0241\n."+
		"\3/\3/\5/\u0245\n/\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3"+
		"\63\3\63\5\63\u0253\n\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\7\65\u025f\n\65\f\65\16\65\u0262\13\65\3\66\3\66\3\67\3\67\38\3"+
		"8\38\38\38\38\38\38\38\38\78\u0272\n8\f8\168\u0275\138\38\38\38\58\u027a"+
		"\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u028a\n8\38\38\38\38"+
		"\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\78\u02a4"+
		"\n8\f8\168\u02a7\138\39\39\39\39\39\39\39\39\39\79\u02b2\n9\f9\169\u02b5"+
		"\139\3:\3:\3:\3:\5:\u02bb\n:\3;\3;\3;\3;\3;\3;\3;\3;\7;\u02c5\n;\f;\16"+
		";\u02c8\13;\3;\5;\u02cb\n;\3<\3<\3<\5<\u02d0\n<\3=\3=\3=\3>\3>\3>\5>\u02d8"+
		"\n>\3?\3?\3?\3?\7?\u02de\n?\f?\16?\u02e1\13?\3?\3?\3?\3?\3?\3?\3?\7?\u02ea"+
		"\n?\f?\16?\u02ed\13?\3?\3?\7?\u02f1\n?\f?\16?\u02f4\13?\5?\u02f6\n?\3"+
		"@\3@\5@\u02fa\n@\3@\3@\3@\2\4npA\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\2\r\13\2\20"+
		"\20\22\22\25\25\33\33!!((**\65\6599\4\2\36\36;;\3\2EJ\3\2ab\3\2ad\3\2"+
		"WX\5\2TTknrr\4\2efjj\3\2cd\4\2UV\\]\4\2[[^^\2\u032f\2\u0081\3\2\2\2\4"+
		"\u0085\3\2\2\2\6\u0087\3\2\2\2\b\u008f\3\2\2\2\n\u009a\3\2\2\2\f\u00a1"+
		"\3\2\2\2\16\u00a3\3\2\2\2\20\u00aa\3\2\2\2\22\u00be\3\2\2\2\24\u00c4\3"+
		"\2\2\2\26\u00cf\3\2\2\2\30\u00da\3\2\2\2\32\u00e2\3\2\2\2\34\u00e7\3\2"+
		"\2\2\36\u00eb\3\2\2\2 \u00ed\3\2\2\2\"\u0115\3\2\2\2$\u0119\3\2\2\2&\u011d"+
		"\3\2\2\2(\u0120\3\2\2\2*\u0142\3\2\2\2,\u0147\3\2\2\2.\u014a\3\2\2\2\60"+
		"\u014e\3\2\2\2\62\u0156\3\2\2\2\64\u0158\3\2\2\2\66\u0166\3\2\2\28\u0168"+
		"\3\2\2\2:\u0179\3\2\2\2<\u017b\3\2\2\2>\u0183\3\2\2\2@\u0196\3\2\2\2B"+
		"\u0198\3\2\2\2D\u019b\3\2\2\2F\u019f\3\2\2\2H\u01a1\3\2\2\2J\u01a9\3\2"+
		"\2\2L\u01cb\3\2\2\2N\u01cf\3\2\2\2P\u01d1\3\2\2\2R\u01d4\3\2\2\2T\u0225"+
		"\3\2\2\2V\u0228\3\2\2\2X\u0237\3\2\2\2Z\u0239\3\2\2\2\\\u0244\3\2\2\2"+
		"^\u0246\3\2\2\2`\u024b\3\2\2\2b\u024d\3\2\2\2d\u0250\3\2\2\2f\u0257\3"+
		"\2\2\2h\u025b\3\2\2\2j\u0263\3\2\2\2l\u0265\3\2\2\2n\u0289\3\2\2\2p\u02a8"+
		"\3\2\2\2r\u02ba\3\2\2\2t\u02ca\3\2\2\2v\u02cf\3\2\2\2x\u02d1\3\2\2\2z"+
		"\u02d7\3\2\2\2|\u02d9\3\2\2\2~\u02f7\3\2\2\2\u0080\u0082\5\4\3\2\u0081"+
		"\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0084\7\2"+
		"\2\3\u0084\3\3\2\2\2\u0085\u0086\5\n\6\2\u0086\5\3\2\2\2\u0087\u008c\5"+
		"\"\22\2\u0088\u0089\7g\2\2\u0089\u008b\5\"\22\2\u008a\u0088\3\2\2\2\u008b"+
		"\u008e\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\7\3\2\2\2"+
		"\u008e\u008c\3\2\2\2\u008f\u0094\5\"\22\2\u0090\u0091\7R\2\2\u0091\u0093"+
		"\5\"\22\2\u0092\u0090\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2\2\2"+
		"\u0094\u0095\3\2\2\2\u0095\t\3\2\2\2\u0096\u0094\3\2\2\2\u0097\u0099\5"+
		"\f\7\2\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u009d\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u009e\5\16"+
		"\b\2\u009e\13\3\2\2\2\u009f\u00a2\5\22\n\2\u00a0\u00a2\5*\26\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a0\3\2\2\2\u00a2\r\3\2\2\2\u00a3\u00a7\5\20\t\2\u00a4"+
		"\u00a6\5\20\t\2\u00a5\u00a4\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3"+
		"\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\17\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7\3\2\2\u00ab\u00ac\7v\2\2\u00ac\u00ad\7\4\2\2\u00ad\u00b2\5> "+
		"\2\u00ae\u00af\7O\2\2\u00af\u00b1\7P\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b7\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\7@\2\2\u00b6\u00b8\5<\37\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00bc\5F$\2\u00ba\u00bc"+
		"\7Q\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\21\3\2\2\2\u00bd"+
		"\u00bf\7\37\2\2\u00be\u00bd\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00c1\5\"\22\2\u00c1\u00c2\5\30\r\2\u00c2\u00c3\7Q\2\2\u00c3"+
		"\23\3\2\2\2\u00c4\u00c5\5\"\22\2\u00c5\u00ca\5\26\f\2\u00c6\u00c7\7R\2"+
		"\2\u00c7\u00c9\5\26\f\2\u00c8\u00c6\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2"+
		"\2\2\u00cd\u00ce\7Q\2\2\u00ce\25\3\2\2\2\u00cf\u00d4\7v\2\2\u00d0\u00d1"+
		"\7O\2\2\u00d1\u00d3\7P\2\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d7\u00d8\7T\2\2\u00d8\u00d9\5\36\20\2\u00d9\27\3\2\2\2\u00da\u00df"+
		"\5\32\16\2\u00db\u00dc\7R\2\2\u00dc\u00de\5\32\16\2\u00dd\u00db\3\2\2"+
		"\2\u00de\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\31"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e5\5\34\17\2\u00e3\u00e4\7T\2\2"+
		"\u00e4\u00e6\5\36\20\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\33"+
		"\3\2\2\2\u00e7\u00e8\7v\2\2\u00e8\35\3\2\2\2\u00e9\u00ec\5 \21\2\u00ea"+
		"\u00ec\5n8\2\u00eb\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec\37\3\2\2\2"+
		"\u00ed\u00f9\7M\2\2\u00ee\u00f3\5\36\20\2\u00ef\u00f0\7R\2\2\u00f0\u00f2"+
		"\5\36\20\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2"+
		"\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8"+
		"\7R\2\2\u00f7\u00f6\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00fa\3\2\2\2\u00f9"+
		"\u00ee\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7N"+
		"\2\2\u00fc!\3\2\2\2\u00fd\u0102\5$\23\2\u00fe\u00ff\7O\2\2\u00ff\u0101"+
		"\7P\2\2\u0100\u00fe\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0116\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u010a\5("+
		"\25\2\u0106\u0107\7O\2\2\u0107\u0109\7P\2\2\u0108\u0106\3\2\2\2\u0109"+
		"\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b\u0116\3\2"+
		"\2\2\u010c\u010a\3\2\2\2\u010d\u0112\5&\24\2\u010e\u010f\7O\2\2\u010f"+
		"\u0111\7P\2\2\u0110\u010e\3\2\2\2\u0111\u0114\3\2\2\2\u0112\u0110\3\2"+
		"\2\2\u0112\u0113\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0115"+
		"\u00fd\3\2\2\2\u0115\u0105\3\2\2\2\u0115\u010d\3\2\2\2\u0116#\3\2\2\2"+
		"\u0117\u011a\5(\25\2\u0118\u011a\5&\24\2\u0119\u0117\3\2\2\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\7e\2\2\u011c%\3\2\2\2\u011d\u011e"+
		"\7:\2\2\u011e\u011f\7v\2\2\u011f\'\3\2\2\2\u0120\u0121\t\2\2\2\u0121)"+
		"\3\2\2\2\u0122\u0123\7:\2\2\u0123\u0124\7v\2\2\u0124\u0125\7\5\2\2\u0125"+
		"\u0126\5,\27\2\u0126\u0127\7\6\2\2\u0127\u0143\3\2\2\2\u0128\u0129\7:"+
		"\2\2\u0129\u012a\7v\2\2\u012a\u012c\7\7\2\2\u012b\u012d\7v\2\2\u012c\u012b"+
		"\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\7N\2\2\u012f"+
		"\u0130\5,\27\2\u0130\u0132\7\b\2\2\u0131\u0133\7v\2\2\u0132\u0131\3\2"+
		"\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7N\2\2\u0135"+
		"\u0143\3\2\2\2\u0136\u0137\7:\2\2\u0137\u0138\7v\2\2\u0138\u0139\7\t\2"+
		"\2\u0139\u013a\5,\27\2\u013a\u013b\7\n\2\2\u013b\u0143\3\2\2\2\u013c\u013d"+
		"\7:\2\2\u013d\u013e\7v\2\2\u013e\u013f\7M\2\2\u013f\u0140\5,\27\2\u0140"+
		"\u0141\7N\2\2\u0141\u0143\3\2\2\2\u0142\u0122\3\2\2\2\u0142\u0128\3\2"+
		"\2\2\u0142\u0136\3\2\2\2\u0142\u013c\3\2\2\2\u0143+\3\2\2\2\u0144\u0146"+
		"\5.\30\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148-\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\5\"\22\2"+
		"\u014b\u014c\5\60\31\2\u014c\u014d\7Q\2\2\u014d/\3\2\2\2\u014e\u0153\5"+
		"\62\32\2\u014f\u0150\7R\2\2\u0150\u0152\5\62\32\2\u0151\u014f\3\2\2\2"+
		"\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\61"+
		"\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u0157\5\64\33\2\u0157\63\3\2\2\2\u0158"+
		"\u0159\7v\2\2\u0159\65\3\2\2\2\u015a\u015b\7\13\2\2\u015b\u015c\5\"\22"+
		"\2\u015c\u015d\7\f\2\2\u015d\u015e\7v\2\2\u015e\u015f\7Q\2\2\u015f\u0167"+
		"\3\2\2\2\u0160\u0161\7\13\2\2\u0161\u0162\5*\26\2\u0162\u0163\7\f\2\2"+
		"\u0163\u0164\7v\2\2\u0164\u0165\7Q\2\2\u0165\u0167\3\2\2\2\u0166\u015a"+
		"\3\2\2\2\u0166\u0160\3\2\2\2\u0167\67\3\2\2\2\u0168\u0169\7V\2\2\u0169"+
		"\u016e\5:\36\2\u016a\u016b\7R\2\2\u016b\u016d\5:\36\2\u016c\u016a\3\2"+
		"\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7U\2\2\u01729\3\2\2\2\u0173"+
		"\u017a\5\"\22\2\u0174\u0177\7Y\2\2\u0175\u0176\t\3\2\2\u0176\u0178\5\""+
		"\22\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2\2\2\u0178\u017a\3\2\2\2\u0179"+
		"\u0173\3\2\2\2\u0179\u0174\3\2\2\2\u017a;\3\2\2\2\u017b\u0180\5H%\2\u017c"+
		"\u017d\7R\2\2\u017d\u017f\5H%\2\u017e\u017c\3\2\2\2\u017f\u0182\3\2\2"+
		"\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2\2\2\u0181=\3\2\2\2\u0182\u0180"+
		"\3\2\2\2\u0183\u0185\7K\2\2\u0184\u0186\5@!\2\u0185\u0184\3\2\2\2\u0185"+
		"\u0186\3\2\2\2\u0186\u0187\3\2\2\2\u0187\u0188\7L\2\2\u0188?\3\2\2\2\u0189"+
		"\u018e\5B\"\2\u018a\u018b\7R\2\2\u018b\u018d\5B\"\2\u018c\u018a\3\2\2"+
		"\2\u018d\u0190\3\2\2\2\u018e\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0193"+
		"\3\2\2\2\u0190\u018e\3\2\2\2\u0191\u0192\7R\2\2\u0192\u0194\5D#\2\u0193"+
		"\u0191\3\2\2\2\u0193\u0194\3\2\2\2\u0194\u0197\3\2\2\2\u0195\u0197\5D"+
		"#\2\u0196\u0189\3\2\2\2\u0196\u0195\3\2\2\2\u0197A\3\2\2\2\u0198\u0199"+
		"\5\"\22\2\u0199\u019a\5\34\17\2\u019aC\3\2\2\2\u019b\u019c\5\"\22\2\u019c"+
		"\u019d\7x\2\2\u019d\u019e\5\34\17\2\u019eE\3\2\2\2\u019f\u01a0\5L\'\2"+
		"\u01a0G\3\2\2\2\u01a1\u01a6\7v\2\2\u01a2\u01a3\7S\2\2\u01a3\u01a5\7v\2"+
		"\2\u01a4\u01a2\3\2\2\2\u01a5\u01a8\3\2\2\2\u01a6\u01a4\3\2\2\2\u01a6\u01a7"+
		"\3\2\2\2\u01a7I\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01aa\t\4\2\2\u01aa"+
		"K\3\2\2\2\u01ab\u01af\7\5\2\2\u01ac\u01ae\5N(\2\u01ad\u01ac\3\2\2\2\u01ae"+
		"\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b2\3\2"+
		"\2\2\u01b1\u01af\3\2\2\2\u01b2\u01cc\7\6\2\2\u01b3\u01b5\7\7\2\2\u01b4"+
		"\u01b6\7v\2\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2"+
		"\2\2\u01b7\u01bb\7N\2\2\u01b8\u01ba\5N(\2\u01b9\u01b8\3\2\2\2\u01ba\u01bd"+
		"\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc\u01be\3\2\2\2\u01bd"+
		"\u01bb\3\2\2\2\u01be\u01c0\7\b\2\2\u01bf\u01c1\7v\2\2\u01c0\u01bf\3\2"+
		"\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01cc\7N\2\2\u01c3"+
		"\u01c7\7M\2\2\u01c4\u01c6\5N(\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2"+
		"\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\3\2\2\2\u01c9\u01c7"+
		"\3\2\2\2\u01ca\u01cc\7N\2\2\u01cb\u01ab\3\2\2\2\u01cb\u01b3\3\2\2\2\u01cb"+
		"\u01c3\3\2\2\2\u01ccM\3\2\2\2\u01cd\u01d0\5P)\2\u01ce\u01d0\5T+\2\u01cf"+
		"\u01cd\3\2\2\2\u01cf\u01ce\3\2\2\2\u01d0O\3\2\2\2\u01d1\u01d2\5R*\2\u01d2"+
		"\u01d3\7Q\2\2\u01d3Q\3\2\2\2\u01d4\u01d5\5\"\22\2\u01d5\u01d6\5\30\r\2"+
		"\u01d6S\3\2\2\2\u01d7\u0226\5L\'\2\u01d8\u01d9\7#\2\2\u01d9\u01da\5f\64"+
		"\2\u01da\u01dd\5T+\2\u01db\u01dc\7\34\2\2\u01dc\u01de\5T+\2\u01dd\u01db"+
		"\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u0226\3\2\2\2\u01df\u01e1\7\"\2\2\u01e0"+
		"\u01df\3\2\2\2\u01e0\u01e1\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u01e3\7K"+
		"\2\2\u01e3\u01e4\5Z.\2\u01e4\u01e5\7L\2\2\u01e5\u01e6\5T+\2\u01e6\u0226"+
		"\3\2\2\2\u01e7\u01e8\7D\2\2\u01e8\u01e9\5f\64\2\u01e9\u01ea\5T+\2\u01ea"+
		"\u0226\3\2\2\2\u01eb\u01ec\7\32\2\2\u01ec\u01ed\5T+\2\u01ed\u01ee\7D\2"+
		"\2\u01ee\u01ef\5f\64\2\u01ef\u01f0\7Q\2\2\u01f0\u0226\3\2\2\2\u01f1\u01f2"+
		"\7<\2\2\u01f2\u01fa\5f\64\2\u01f3\u01fb\7M\2\2\u01f4\u01fb\7\5\2\2\u01f5"+
		"\u01f7\7\7\2\2\u01f6\u01f8\7v\2\2\u01f7\u01f6\3\2\2\2\u01f7\u01f8\3\2"+
		"\2\2\u01f8\u01f9\3\2\2\2\u01f9\u01fb\7N\2\2\u01fa\u01f3\3\2\2\2\u01fa"+
		"\u01f4\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fb\u01ff\3\2\2\2\u01fc\u01fe\5V"+
		",\2\u01fd\u01fc\3\2\2\2\u01fe\u0201\3\2\2\2\u01ff\u01fd\3\2\2\2\u01ff"+
		"\u0200\3\2\2\2\u0200\u0205\3\2\2\2\u0201\u01ff\3\2\2\2\u0202\u0204\5X"+
		"-\2\u0203\u0202\3\2\2\2\u0204\u0207\3\2\2\2\u0205\u0203\3\2\2\2\u0205"+
		"\u0206\3\2\2\2\u0206\u020f\3\2\2\2\u0207\u0205\3\2\2\2\u0208\u0210\7N"+
		"\2\2\u0209\u0210\7\6\2\2\u020a\u020c\7\b\2\2\u020b\u020d\7v\2\2\u020c"+
		"\u020b\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u0210\7N"+
		"\2\2\u020f\u0208\3\2\2\2\u020f\u0209\3\2\2\2\u020f\u020a\3\2\2\2\u0210"+
		"\u0226\3\2\2\2\u0211\u0213\7\62\2\2\u0212\u0214\5n8\2\u0213\u0212\3\2"+
		"\2\2\u0213\u0214\3\2\2\2\u0214\u0215\3\2\2\2\u0215\u0226\7Q\2\2\u0216"+
		"\u0218\7\21\2\2\u0217\u0219\7v\2\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2"+
		"\2\2\u0219\u021a\3\2\2\2\u021a\u0226\7Q\2\2\u021b\u0226\7Q\2\2\u021c\u021d"+
		"\5j\66\2\u021d\u021e\7Q\2\2\u021e\u0226\3\2\2\2\u021f\u0220\5b\62\2\u0220"+
		"\u0221\7Q\2\2\u0221\u0226\3\2\2\2\u0222\u0223\5d\63\2\u0223\u0224\7Q\2"+
		"\2\u0224\u0226\3\2\2\2\u0225\u01d7\3\2\2\2\u0225\u01d8\3\2\2\2\u0225\u01e0"+
		"\3\2\2\2\u0225\u01e7\3\2\2\2\u0225\u01eb\3\2\2\2\u0225\u01f1\3\2\2\2\u0225"+
		"\u0211\3\2\2\2\u0225\u0216\3\2\2\2\u0225\u021b\3\2\2\2\u0225\u021c\3\2"+
		"\2\2\u0225\u021f\3\2\2\2\u0225\u0222\3\2\2\2\u0226U\3\2\2\2\u0227\u0229"+
		"\5X-\2\u0228\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u0228\3\2\2\2\u022a"+
		"\u022b\3\2\2\2\u022b\u022d\3\2\2\2\u022c\u022e\5N(\2\u022d\u022c\3\2\2"+
		"\2\u022e\u022f\3\2\2\2\u022f\u022d\3\2\2\2\u022f\u0230\3\2\2\2\u0230W"+
		"\3\2\2\2\u0231\u0232\7\23\2\2\u0232\u0233\5l\67\2\u0233\u0234\7Z\2\2\u0234"+
		"\u0238\3\2\2\2\u0235\u0236\7\31\2\2\u0236\u0238\7Z\2\2\u0237\u0231\3\2"+
		"\2\2\u0237\u0235\3\2\2\2\u0238Y\3\2\2\2\u0239\u023a\5\\/\2\u023a\u023c"+
		"\7Q\2\2\u023b\u023d\5n8\2\u023c\u023b\3\2\2\2\u023c\u023d\3\2\2\2\u023d"+
		"\u023e\3\2\2\2\u023e\u0240\7Q\2\2\u023f\u0241\5`\61\2\u0240\u023f\3\2"+
		"\2\2\u0240\u0241\3\2\2\2\u0241[\3\2\2\2\u0242\u0245\5R*\2\u0243\u0245"+
		"\5h\65\2\u0244\u0242\3\2\2\2\u0244\u0243\3\2\2\2\u0245]\3\2\2\2\u0246"+
		"\u0247\5\"\22\2\u0247\u0248\5\34\17\2\u0248\u0249\7Z\2\2\u0249\u024a\5"+
		"n8\2\u024a_\3\2\2\2\u024b\u024c\5h\65\2\u024ca\3\2\2\2\u024d\u024e\7."+
		"\2\2\u024e\u024f\5n8\2\u024fc\3\2\2\2\u0250\u0252\7\63\2\2\u0251\u0253"+
		"\5\"\22\2\u0252\u0251\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u0254\3\2\2\2"+
		"\u0254\u0255\7\64\2\2\u0255\u0256\5\34\17\2\u0256e\3\2\2\2\u0257\u0258"+
		"\7K\2\2\u0258\u0259\5n8\2\u0259\u025a\7L\2\2\u025ag\3\2\2\2\u025b\u0260"+
		"\5n8\2\u025c\u025d\7R\2\2\u025d\u025f\5n8\2\u025e\u025c\3\2\2\2\u025f"+
		"\u0262\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u0261\3\2\2\2\u0261i\3\2\2\2"+
		"\u0262\u0260\3\2\2\2\u0263\u0264\5n8\2\u0264k\3\2\2\2\u0265\u0266\5n8"+
		"\2\u0266m\3\2\2\2\u0267\u0268\b8\1\2\u0268\u028a\5v<\2\u0269\u026a\5r"+
		":\2\u026a\u026b\7O\2\2\u026b\u026c\5n8\2\u026c\u0273\7P\2\2\u026d\u026e"+
		"\7O\2\2\u026e\u026f\5n8\2\u026f\u0270\7P\2\2\u0270\u0272\3\2\2\2\u0271"+
		"\u026d\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274\3\2"+
		"\2\2\u0274\u028a\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0277\7v\2\2\u0277"+
		"\u0279\7K\2\2\u0278\u027a\5h\65\2\u0279\u0278\3\2\2\2\u0279\u027a\3\2"+
		"\2\2\u027a\u027b\3\2\2\2\u027b\u028a\7L\2\2\u027c\u027d\7,\2\2\u027d\u028a"+
		"\5x=\2\u027e\u027f\5t;\2\u027f\u0280\t\5\2\2\u0280\u028a\3\2\2\2\u0281"+
		"\u0282\t\6\2\2\u0282\u028a\5t;\2\u0283\u0284\t\7\2\2\u0284\u028a\5n8\13"+
		"\u0285\u0286\5t;\2\u0286\u0287\t\b\2\2\u0287\u0288\5n8\3\u0288\u028a\3"+
		"\2\2\2\u0289\u0267\3\2\2\2\u0289\u0269\3\2\2\2\u0289\u0276\3\2\2\2\u0289"+
		"\u027c\3\2\2\2\u0289\u027e\3\2\2\2\u0289\u0281\3\2\2\2\u0289\u0283\3\2"+
		"\2\2\u0289\u0285\3\2\2\2\u028a\u02a5\3\2\2\2\u028b\u028c\f\n\2\2\u028c"+
		"\u028d\t\t\2\2\u028d\u02a4\5n8\13\u028e\u028f\f\t\2\2\u028f\u0290\t\n"+
		"\2\2\u0290\u02a4\5n8\n\u0291\u0292\f\b\2\2\u0292\u0293\t\13\2\2\u0293"+
		"\u02a4\5n8\t\u0294\u0295\f\7\2\2\u0295\u0296\t\f\2\2\u0296\u02a4\5n8\b"+
		"\u0297\u0298\f\6\2\2\u0298\u0299\7_\2\2\u0299\u02a4\5n8\7\u029a\u029b"+
		"\f\5\2\2\u029b\u029c\7`\2\2\u029c\u02a4\5n8\6\u029d\u029e\f\4\2\2\u029e"+
		"\u029f\7Y\2\2\u029f\u02a0\5n8\2\u02a0\u02a1\7Z\2\2\u02a1\u02a2\5n8\5\u02a2"+
		"\u02a4\3\2\2\2\u02a3\u028b\3\2\2\2\u02a3\u028e\3\2\2\2\u02a3\u0291\3\2"+
		"\2\2\u02a3\u0294\3\2\2\2\u02a3\u0297\3\2\2\2\u02a3\u029a\3\2\2\2\u02a3"+
		"\u029d\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6\3\2"+
		"\2\2\u02a6o\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02a9\b9\1\2\u02a9\u02aa"+
		"\7v\2\2\u02aa\u02b3\3\2\2\2\u02ab\u02ac\f\4\2\2\u02ac\u02ad\7S\2\2\u02ad"+
		"\u02b2\7v\2\2\u02ae\u02af\f\3\2\2\u02af\u02b0\7\r\2\2\u02b0\u02b2\7v\2"+
		"\2\u02b1\u02ab\3\2\2\2\u02b1\u02ae\3\2\2\2\u02b2\u02b5\3\2\2\2\u02b3\u02b1"+
		"\3\2\2\2\u02b3\u02b4\3\2\2\2\u02b4q\3\2\2\2\u02b5\u02b3\3\2\2\2\u02b6"+
		"\u02bb\7v\2\2\u02b7\u02b8\7e\2\2\u02b8\u02bb\7v\2\2\u02b9\u02bb\5p9\2"+
		"\u02ba\u02b6\3\2\2\2\u02ba\u02b7\3\2\2\2\u02ba\u02b9\3\2\2\2\u02bbs\3"+
		"\2\2\2\u02bc\u02cb\7v\2\2\u02bd\u02be\7e\2\2\u02be\u02cb\7v\2\2\u02bf"+
		"\u02c6\5r:\2\u02c0\u02c1\7O\2\2\u02c1\u02c2\5n8\2\u02c2\u02c3\7P\2\2\u02c3"+
		"\u02c5\3\2\2\2\u02c4\u02c0\3\2\2\2\u02c5\u02c8\3\2\2\2\u02c6\u02c4\3\2"+
		"\2\2\u02c6\u02c7\3\2\2\2\u02c7\u02cb\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9"+
		"\u02cb\5p9\2\u02ca\u02bc\3\2\2\2\u02ca\u02bd\3\2\2\2\u02ca\u02bf\3\2\2"+
		"\2\u02ca\u02c9\3\2\2\2\u02cbu\3\2\2\2\u02cc\u02d0\5f\64\2\u02cd\u02d0"+
		"\5J&\2\u02ce\u02d0\5t;\2\u02cf\u02cc\3\2\2\2\u02cf\u02cd\3\2\2\2\u02cf"+
		"\u02ce\3\2\2\2\u02d0w\3\2\2\2\u02d1\u02d2\5z>\2\u02d2\u02d3\5|?\2\u02d3"+
		"y\3\2\2\2\u02d4\u02d8\5(\25\2\u02d5\u02d8\5$\23\2\u02d6\u02d8\5&\24\2"+
		"\u02d7\u02d4\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d7\u02d6\3\2\2\2\u02d8{\3"+
		"\2\2\2\u02d9\u02f5\7O\2\2\u02da\u02df\7P\2\2\u02db\u02dc\7O\2\2\u02dc"+
		"\u02de\7P\2\2\u02dd\u02db\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2"+
		"\u02f6\5 \21\2\u02e3\u02e4\5n8\2\u02e4\u02eb\7P\2\2\u02e5\u02e6\7O\2\2"+
		"\u02e6\u02e7\5n8\2\u02e7\u02e8\7P\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e5"+
		"\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec"+
		"\u02f2\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02ef\7O\2\2\u02ef\u02f1\7P\2"+
		"\2\u02f0\u02ee\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02da\3\2\2\2\u02f5"+
		"\u02e3\3\2\2\2\u02f6}\3\2\2\2\u02f7\u02f9\7K\2\2\u02f8\u02fa\5h\65\2\u02f9"+
		"\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\7L"+
		"\2\2\u02fc\177\3\2\2\2S\u0081\u008c\u0094\u009a\u00a1\u00a7\u00b2\u00b7"+
		"\u00bb\u00be\u00ca\u00d4\u00df\u00e5\u00eb\u00f3\u00f7\u00f9\u0102\u010a"+
		"\u0112\u0115\u0119\u012c\u0132\u0142\u0147\u0153\u0166\u016e\u0177\u0179"+
		"\u0180\u0185\u018e\u0193\u0196\u01a6\u01af\u01b5\u01bb\u01c0\u01c7\u01cb"+
		"\u01cf\u01dd\u01e0\u01f7\u01fa\u01ff\u0205\u020c\u020f\u0213\u0218\u0225"+
		"\u022a\u022f\u0237\u023c\u0240\u0244\u0252\u0260\u0273\u0279\u0289\u02a3"+
		"\u02a5\u02b1\u02b3\u02ba\u02c6\u02ca\u02cf\u02d7\u02df\u02eb\u02f2\u02f5"+
		"\u02f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}