// Generated from C:/INTELLIJ Projects/PROGLAN_MP/src/com/parser\ManuScript.g4 by ANTLR 4.7
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(Identifier);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(230);
				match(LBRACK);
				setState(231);
				match(RBRACK);
				}
				}
				setState(236);
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
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
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
				setState(238);
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
			setState(241);
			match(LBRACE);
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(242);
				variableInitializer();
				setState(247);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(243);
						match(COMMA);
						setState(244);
						variableInitializer();
						}
						} 
					}
					setState(249);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(250);
					match(COMMA);
					}
				}

				}
			}

			setState(255);
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
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				pointerType();
				setState(262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(258);
					match(LBRACK);
					setState(259);
					match(RBRACK);
					}
					}
					setState(264);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				primitiveType();
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(266);
					match(LBRACK);
					setState(267);
					match(RBRACK);
					}
					}
					setState(272);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(273);
				structType();
				setState(278);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(274);
					match(LBRACK);
					setState(275);
					match(RBRACK);
					}
					}
					setState(280);
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
			setState(285);
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
				setState(283);
				primitiveType();
				}
				break;
			case STRUCT:
				{
				setState(284);
				structType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(287);
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
			setState(289);
			match(STRUCT);
			setState(290);
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
			setState(292);
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
			setState(326);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(294);
				match(STRUCT);
				setState(295);
				match(Identifier);
				setState(296);
				match(T__2);
				setState(297);
				structDeclarationList();
				setState(298);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(STRUCT);
				setState(301);
				match(Identifier);
				setState(302);
				match(T__4);
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
				setState(307);
				structDeclarationList();
				setState(308);
				match(T__5);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(309);
					match(Identifier);
					}
				}

				setState(312);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(314);
				match(STRUCT);
				setState(315);
				match(Identifier);
				setState(316);
				match(T__6);
				setState(317);
				structDeclarationList();
				setState(318);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(320);
				match(STRUCT);
				setState(321);
				match(Identifier);
				setState(322);
				match(LBRACE);
				setState(323);
				structDeclarationList();
				setState(324);
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
			setState(331);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(328);
				structDeclaration();
				}
				}
				setState(333);
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
			setState(334);
			typeType();
			setState(335);
			structDeclaratorList();
			setState(336);
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
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(338);
				structDeclarator();
				}
				}
				setState(343);
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
			setState(344);
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
			setState(346);
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
			setState(360);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				match(T__8);
				setState(349);
				typeType();
				setState(350);
				match(T__9);
				setState(351);
				match(Identifier);
				setState(352);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(354);
				match(T__8);
				setState(355);
				structDefinition();
				setState(356);
				match(T__9);
				setState(357);
				match(Identifier);
				setState(358);
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
			setState(362);
			match(LT);
			setState(363);
			typeArgument();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(364);
				match(COMMA);
				setState(365);
				typeArgument();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
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
			setState(379);
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
				setState(373);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				match(QUESTION);
				setState(377);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(375);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(376);
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
			setState(381);
			qualifiedName();
			setState(386);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(382);
				match(COMMA);
				setState(383);
				qualifiedName();
				}
				}
				setState(388);
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
			setState(389);
			match(LPAREN);
			setState(391);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0)) {
				{
				setState(390);
				formalParameterList();
				}
			}

			setState(393);
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
			setState(408);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(395);
				formalParameter();
				setState(400);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(396);
						match(COMMA);
						setState(397);
						formalParameter();
						}
						} 
					}
					setState(402);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(403);
					match(COMMA);
					setState(404);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(407);
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
			setState(410);
			typeType();
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
			setState(413);
			typeType();
			setState(414);
			match(ELLIPSIS);
			setState(415);
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
			setState(417);
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
			setState(419);
			match(Identifier);
			setState(424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(420);
				match(DOT);
				setState(421);
				match(Identifier);
				}
				}
				setState(426);
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
			setState(427);
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
			setState(461);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(429);
				match(T__2);
				setState(433);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(430);
					blockStatement();
					}
					}
					setState(435);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(436);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				match(T__4);
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(438);
					match(Identifier);
					}
				}

				setState(441);
				match(RBRACE);
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(442);
					blockStatement();
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(448);
				match(T__5);
				setState(450);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(449);
					match(Identifier);
					}
				}

				setState(452);
				match(RBRACE);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(453);
				match(LBRACE);
				setState(457);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(454);
					blockStatement();
					}
					}
					setState(459);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(460);
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
			setState(465);
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
				setState(463);
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
				setState(464);
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
			setState(467);
			localVariableDeclaration();
			setState(468);
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
			setState(470);
			typeType();
			setState(471);
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
			setState(551);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				block();
				}
				break;
			case 2:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				match(IF);
				setState(475);
				parExpression();
				setState(476);
				statement();
				setState(479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(477);
					match(ELSE);
					setState(478);
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
				setState(482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(481);
					match(FOR);
					}
				}

				setState(484);
				match(LPAREN);
				setState(485);
				forControl();
				setState(486);
				match(RPAREN);
				setState(487);
				statement();
				}
				break;
			case 4:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				match(WHILE);
				setState(490);
				parExpression();
				setState(491);
				statement();
				}
				break;
			case 5:
				_localctx = new DoWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(493);
				match(DO);
				setState(494);
				statement();
				setState(495);
				match(WHILE);
				setState(496);
				parExpression();
				setState(497);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(499);
				match(SWITCH);
				setState(500);
				parExpression();
				setState(508);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(501);
					match(LBRACE);
					}
					break;
				case T__2:
					{
					setState(502);
					match(T__2);
					}
					break;
				case T__4:
					{
					setState(503);
					match(T__4);
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(504);
						match(Identifier);
						}
					}

					setState(507);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(513);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(510);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(515);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
				}
				setState(519);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(516);
					switchLabel();
					}
					}
					setState(521);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(529);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE:
					{
					setState(522);
					match(RBRACE);
					}
					break;
				case T__3:
					{
					setState(523);
					match(T__3);
					}
					break;
				case T__5:
					{
					setState(524);
					match(T__5);
					setState(526);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(525);
						match(Identifier);
						}
					}

					setState(528);
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
				setState(531);
				match(RETURN);
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(532);
					expression(0);
					}
				}

				setState(535);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(536);
				match(BREAK);
				setState(538);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(537);
					match(Identifier);
					}
				}

				setState(540);
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new SemicolonStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(541);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(542);
				statementExpression();
				setState(543);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new OutputStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(545);
				outputStatement();
				setState(546);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new InputStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(548);
				inputStatement();
				setState(549);
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
			setState(554); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(553);
				switchLabel();
				}
				}
				setState(556); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(559); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(558);
				blockStatement();
				}
				}
				setState(561); 
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
			setState(569);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				match(CASE);
				setState(564);
				constantExpression();
				setState(565);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				match(DEFAULT);
				setState(568);
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
			setState(571);
			forInit();
			setState(572);
			match(SEMI);
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(573);
				expression(0);
				}
			}

			setState(576);
			match(SEMI);
			setState(578);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(577);
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
			setState(582);
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
				setState(580);
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
				setState(581);
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
			setState(584);
			typeType();
			setState(585);
			variableDeclaratorId();
			setState(586);
			match(COLON);
			setState(587);
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
			setState(589);
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
			setState(591);
			match(PRINT);
			setState(592);
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
			setState(594);
			match(SCAN);
			setState(596);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0)) {
				{
				setState(595);
				typeType();
				}
			}

			setState(598);
			match(SCANTO);
			setState(599);
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
			setState(601);
			match(LPAREN);
			setState(602);
			expression(0);
			setState(603);
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
			setState(605);
			expression(0);
			setState(610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(606);
				match(COMMA);
				setState(607);
				expression(0);
				}
				}
				setState(612);
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
			setState(613);
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
			setState(615);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		public VariableExprContext variableExpr() {
			return getRuleContext(VariableExprContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitFunctionExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PostIncDecExprContext extends ExpressionContext {
		public VariableExprContext variableExpr() {
			return getRuleContext(VariableExprContext.class,0);
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
		public VariableExprContext variableExpr() {
			return getRuleContext(VariableExprContext.class,0);
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
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(618);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(619);
				variableExpr();
				setState(620);
				match(LBRACK);
				setState(621);
				expression(0);
				setState(622);
				match(RBRACK);
				}
				break;
			case 3:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(624);
				variableExpr();
				setState(625);
				match(LPAREN);
				setState(627);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(626);
					expressionList();
					}
				}

				setState(629);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new ArrayInitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(631);
				match(NEW);
				setState(632);
				creator();
				}
				break;
			case 5:
				{
				_localctx = new PostIncDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(633);
				variableExpr();
				setState(634);
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
				setState(636);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (INC - 95)) | (1L << (DEC - 95)) | (1L << (ADD - 95)) | (1L << (SUB - 95)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(637);
				variableExpr();
				}
				break;
			case 7:
				{
				_localctx = new NegationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(638);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(639);
				expression(9);
				}
				break;
			case 8:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(640);
				equationExpr();
				setState(641);
				_la = _input.LA(1);
				if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ASSIGN - 82)) | (1L << (ADD_ASSIGN - 82)) | (1L << (SUB_ASSIGN - 82)) | (1L << (MUL_ASSIGN - 82)) | (1L << (DIV_ASSIGN - 82)) | (1L << (MOD_ASSIGN - 82)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(642);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(672);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(670);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(646);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(647);
						_la = _input.LA(1);
						if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (MUL - 99)) | (1L << (DIV - 99)) | (1L << (MOD - 99)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(648);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(649);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(650);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(651);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(652);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(653);
						_la = _input.LA(1);
						if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (GT - 83)) | (1L << (LT - 83)) | (1L << (LE - 83)) | (1L << (GE - 83)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(654);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(655);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(656);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(657);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(658);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(659);
						match(AND);
						setState(660);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(661);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(662);
						match(OR);
						setState(663);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new OneLineIfExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(664);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(665);
						match(QUESTION);
						setState(666);
						expression(0);
						setState(667);
						match(COLON);
						setState(668);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(674);
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
			setState(676);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(686);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(684);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new StructExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_structExpr);
						setState(678);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(679);
						match(DOT);
						setState(680);
						match(Identifier);
						}
						break;
					case 2:
						{
						_localctx = new StructExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_structExpr);
						setState(681);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(682);
						match(T__10);
						setState(683);
						match(Identifier);
						}
						break;
					}
					} 
				}
				setState(688);
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
			setState(692);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				match(Identifier);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				match(MUL);
				setState(691);
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

	public static class EquationExprContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(ManuScriptParser.Identifier, 0); }
		public VariableExprContext variableExpr() {
			return getRuleContext(VariableExprContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(702);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(694);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(695);
				match(MUL);
				setState(696);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(697);
				variableExpr();
				setState(698);
				match(LBRACK);
				setState(699);
				expression(0);
				setState(700);
				match(RBRACK);
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
			setState(712);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				match(LPAREN);
				setState(705);
				expression(0);
				setState(706);
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
				setState(708);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(709);
				match(Identifier);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(710);
				match(MUL);
				setState(711);
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
			setState(714);
			createdName();
			{
			setState(715);
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
			setState(720);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(718);
				pointerType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(719);
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
			setState(722);
			match(LBRACK);
			setState(750);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(723);
				match(RBRACK);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(724);
					match(LBRACK);
					setState(725);
					match(RBRACK);
					}
					}
					setState(730);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(731);
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
				setState(732);
				expression(0);
				setState(733);
				match(RBRACK);
				setState(740);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(734);
						match(LBRACK);
						setState(735);
						expression(0);
						setState(736);
						match(RBRACK);
						}
						} 
					}
					setState(742);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,76,_ctx);
				}
				setState(747);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(743);
						match(LBRACK);
						setState(744);
						match(RBRACK);
						}
						} 
					}
					setState(749);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,77,_ctx);
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
			setState(752);
			match(LPAREN);
			setState(754);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(753);
				expressionList();
				}
			}

			setState(756);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3{\u02f9\4\2\t\2\4"+
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
		"\16\3\16\5\16\u00e6\n\16\3\17\3\17\3\17\7\17\u00eb\n\17\f\17\16\17\u00ee"+
		"\13\17\3\20\3\20\5\20\u00f2\n\20\3\21\3\21\3\21\3\21\7\21\u00f8\n\21\f"+
		"\21\16\21\u00fb\13\21\3\21\5\21\u00fe\n\21\5\21\u0100\n\21\3\21\3\21\3"+
		"\22\3\22\3\22\7\22\u0107\n\22\f\22\16\22\u010a\13\22\3\22\3\22\3\22\7"+
		"\22\u010f\n\22\f\22\16\22\u0112\13\22\3\22\3\22\3\22\7\22\u0117\n\22\f"+
		"\22\16\22\u011a\13\22\5\22\u011c\n\22\3\23\3\23\5\23\u0120\n\23\3\23\3"+
		"\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\5\26\u0133\n\26\3\26\3\26\3\26\3\26\5\26\u0139\n\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0149"+
		"\n\26\3\27\7\27\u014c\n\27\f\27\16\27\u014f\13\27\3\30\3\30\3\30\3\30"+
		"\3\31\7\31\u0156\n\31\f\31\16\31\u0159\13\31\3\32\3\32\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u016b\n\34"+
		"\3\35\3\35\3\35\3\35\7\35\u0171\n\35\f\35\16\35\u0174\13\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\36\5\36\u017c\n\36\5\36\u017e\n\36\3\37\3\37\3\37\7"+
		"\37\u0183\n\37\f\37\16\37\u0186\13\37\3 \3 \5 \u018a\n \3 \3 \3!\3!\3"+
		"!\7!\u0191\n!\f!\16!\u0194\13!\3!\3!\5!\u0198\n!\3!\5!\u019b\n!\3\"\3"+
		"\"\3\"\3#\3#\3#\3#\3$\3$\3%\3%\3%\7%\u01a9\n%\f%\16%\u01ac\13%\3&\3&\3"+
		"\'\3\'\7\'\u01b2\n\'\f\'\16\'\u01b5\13\'\3\'\3\'\3\'\5\'\u01ba\n\'\3\'"+
		"\3\'\7\'\u01be\n\'\f\'\16\'\u01c1\13\'\3\'\3\'\5\'\u01c5\n\'\3\'\3\'\3"+
		"\'\7\'\u01ca\n\'\f\'\16\'\u01cd\13\'\3\'\5\'\u01d0\n\'\3(\3(\5(\u01d4"+
		"\n(\3)\3)\3)\3*\3*\3*\3+\3+\3+\3+\3+\3+\5+\u01e2\n+\3+\5+\u01e5\n+\3+"+
		"\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u01fc"+
		"\n+\3+\5+\u01ff\n+\3+\7+\u0202\n+\f+\16+\u0205\13+\3+\7+\u0208\n+\f+\16"+
		"+\u020b\13+\3+\3+\3+\3+\5+\u0211\n+\3+\5+\u0214\n+\3+\3+\5+\u0218\n+\3"+
		"+\3+\3+\5+\u021d\n+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\5+\u022a\n+\3,\6"+
		",\u022d\n,\r,\16,\u022e\3,\6,\u0232\n,\r,\16,\u0233\3-\3-\3-\3-\3-\3-"+
		"\5-\u023c\n-\3.\3.\3.\5.\u0241\n.\3.\3.\5.\u0245\n.\3/\3/\5/\u0249\n/"+
		"\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\5\63\u0257"+
		"\n\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\7\65\u0263\n\65"+
		"\f\65\16\65\u0266\13\65\3\66\3\66\3\67\3\67\38\38\38\38\38\38\38\38\3"+
		"8\38\58\u0276\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\58\u0287"+
		"\n8\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38\38"+
		"\38\38\78\u02a1\n8\f8\168\u02a4\138\39\39\39\39\39\39\39\39\39\79\u02af"+
		"\n9\f9\169\u02b2\139\3:\3:\3:\5:\u02b7\n:\3;\3;\3;\3;\3;\3;\3;\3;\5;\u02c1"+
		"\n;\3<\3<\3<\3<\3<\3<\3<\3<\5<\u02cb\n<\3=\3=\3=\3>\3>\3>\5>\u02d3\n>"+
		"\3?\3?\3?\3?\7?\u02d9\n?\f?\16?\u02dc\13?\3?\3?\3?\3?\3?\3?\3?\7?\u02e5"+
		"\n?\f?\16?\u02e8\13?\3?\3?\7?\u02ec\n?\f?\16?\u02ef\13?\5?\u02f1\n?\3"+
		"@\3@\5@\u02f5\n@\3@\3@\3@\2\4npA\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\2\r\13\2\20"+
		"\20\22\22\25\25\33\33!!((**\65\6599\4\2\36\36;;\3\2EJ\3\2ab\3\2ad\3\2"+
		"WX\5\2TTknrr\4\2efjj\3\2cd\4\2UV\\]\4\2[[^^\2\u0328\2\u0081\3\2\2\2\4"+
		"\u0085\3\2\2\2\6\u0087\3\2\2\2\b\u008f\3\2\2\2\n\u009a\3\2\2\2\f\u00a1"+
		"\3\2\2\2\16\u00a3\3\2\2\2\20\u00aa\3\2\2\2\22\u00be\3\2\2\2\24\u00c4\3"+
		"\2\2\2\26\u00cf\3\2\2\2\30\u00da\3\2\2\2\32\u00e2\3\2\2\2\34\u00e7\3\2"+
		"\2\2\36\u00f1\3\2\2\2 \u00f3\3\2\2\2\"\u011b\3\2\2\2$\u011f\3\2\2\2&\u0123"+
		"\3\2\2\2(\u0126\3\2\2\2*\u0148\3\2\2\2,\u014d\3\2\2\2.\u0150\3\2\2\2\60"+
		"\u0157\3\2\2\2\62\u015a\3\2\2\2\64\u015c\3\2\2\2\66\u016a\3\2\2\28\u016c"+
		"\3\2\2\2:\u017d\3\2\2\2<\u017f\3\2\2\2>\u0187\3\2\2\2@\u019a\3\2\2\2B"+
		"\u019c\3\2\2\2D\u019f\3\2\2\2F\u01a3\3\2\2\2H\u01a5\3\2\2\2J\u01ad\3\2"+
		"\2\2L\u01cf\3\2\2\2N\u01d3\3\2\2\2P\u01d5\3\2\2\2R\u01d8\3\2\2\2T\u0229"+
		"\3\2\2\2V\u022c\3\2\2\2X\u023b\3\2\2\2Z\u023d\3\2\2\2\\\u0248\3\2\2\2"+
		"^\u024a\3\2\2\2`\u024f\3\2\2\2b\u0251\3\2\2\2d\u0254\3\2\2\2f\u025b\3"+
		"\2\2\2h\u025f\3\2\2\2j\u0267\3\2\2\2l\u0269\3\2\2\2n\u0286\3\2\2\2p\u02a5"+
		"\3\2\2\2r\u02b6\3\2\2\2t\u02c0\3\2\2\2v\u02ca\3\2\2\2x\u02cc\3\2\2\2z"+
		"\u02d2\3\2\2\2|\u02d4\3\2\2\2~\u02f2\3\2\2\2\u0080\u0082\5\4\3\2\u0081"+
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
		"\3\2\2\2\u00e7\u00ec\7v\2\2\u00e8\u00e9\7O\2\2\u00e9\u00eb\7P\2\2\u00ea"+
		"\u00e8\3\2\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2"+
		"\2\2\u00ed\35\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f2\5 \21\2\u00f0\u00f2"+
		"\5n8\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\37\3\2\2\2\u00f3"+
		"\u00ff\7M\2\2\u00f4\u00f9\5\36\20\2\u00f5\u00f6\7R\2\2\u00f6\u00f8\5\36"+
		"\20\2\u00f7\u00f5\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9"+
		"\u00fa\3\2\2\2\u00fa\u00fd\3\2\2\2\u00fb\u00f9\3\2\2\2\u00fc\u00fe\7R"+
		"\2\2\u00fd\u00fc\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00f4\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\7N"+
		"\2\2\u0102!\3\2\2\2\u0103\u0108\5$\23\2\u0104\u0105\7O\2\2\u0105\u0107"+
		"\7P\2\2\u0106\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0109\3\2\2\2\u0109\u011c\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u0110\5("+
		"\25\2\u010c\u010d\7O\2\2\u010d\u010f\7P\2\2\u010e\u010c\3\2\2\2\u010f"+
		"\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u011c\3\2"+
		"\2\2\u0112\u0110\3\2\2\2\u0113\u0118\5&\24\2\u0114\u0115\7O\2\2\u0115"+
		"\u0117\7P\2\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u011c\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u0103\3\2\2\2\u011b\u010b\3\2\2\2\u011b\u0113\3\2\2\2\u011c#\3\2\2\2"+
		"\u011d\u0120\5(\25\2\u011e\u0120\5&\24\2\u011f\u011d\3\2\2\2\u011f\u011e"+
		"\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\7e\2\2\u0122%\3\2\2\2\u0123\u0124"+
		"\7:\2\2\u0124\u0125\7v\2\2\u0125\'\3\2\2\2\u0126\u0127\t\2\2\2\u0127)"+
		"\3\2\2\2\u0128\u0129\7:\2\2\u0129\u012a\7v\2\2\u012a\u012b\7\5\2\2\u012b"+
		"\u012c\5,\27\2\u012c\u012d\7\6\2\2\u012d\u0149\3\2\2\2\u012e\u012f\7:"+
		"\2\2\u012f\u0130\7v\2\2\u0130\u0132\7\7\2\2\u0131\u0133\7v\2\2\u0132\u0131"+
		"\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2\2\2\u0134\u0135\7N\2\2\u0135"+
		"\u0136\5,\27\2\u0136\u0138\7\b\2\2\u0137\u0139\7v\2\2\u0138\u0137\3\2"+
		"\2\2\u0138\u0139\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013b\7N\2\2\u013b"+
		"\u0149\3\2\2\2\u013c\u013d\7:\2\2\u013d\u013e\7v\2\2\u013e\u013f\7\t\2"+
		"\2\u013f\u0140\5,\27\2\u0140\u0141\7\n\2\2\u0141\u0149\3\2\2\2\u0142\u0143"+
		"\7:\2\2\u0143\u0144\7v\2\2\u0144\u0145\7M\2\2\u0145\u0146\5,\27\2\u0146"+
		"\u0147\7N\2\2\u0147\u0149\3\2\2\2\u0148\u0128\3\2\2\2\u0148\u012e\3\2"+
		"\2\2\u0148\u013c\3\2\2\2\u0148\u0142\3\2\2\2\u0149+\3\2\2\2\u014a\u014c"+
		"\5.\30\2\u014b\u014a\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014b\3\2\2\2\u014d"+
		"\u014e\3\2\2\2\u014e-\3\2\2\2\u014f\u014d\3\2\2\2\u0150\u0151\5\"\22\2"+
		"\u0151\u0152\5\60\31\2\u0152\u0153\7Q\2\2\u0153/\3\2\2\2\u0154\u0156\5"+
		"\62\32\2\u0155\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158\61\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\5\64\33"+
		"\2\u015b\63\3\2\2\2\u015c\u015d\7v\2\2\u015d\65\3\2\2\2\u015e\u015f\7"+
		"\13\2\2\u015f\u0160\5\"\22\2\u0160\u0161\7\f\2\2\u0161\u0162\7v\2\2\u0162"+
		"\u0163\7Q\2\2\u0163\u016b\3\2\2\2\u0164\u0165\7\13\2\2\u0165\u0166\5*"+
		"\26\2\u0166\u0167\7\f\2\2\u0167\u0168\7v\2\2\u0168\u0169\7Q\2\2\u0169"+
		"\u016b\3\2\2\2\u016a\u015e\3\2\2\2\u016a\u0164\3\2\2\2\u016b\67\3\2\2"+
		"\2\u016c\u016d\7V\2\2\u016d\u0172\5:\36\2\u016e\u016f\7R\2\2\u016f\u0171"+
		"\5:\36\2\u0170\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176\7U"+
		"\2\2\u01769\3\2\2\2\u0177\u017e\5\"\22\2\u0178\u017b\7Y\2\2\u0179\u017a"+
		"\t\3\2\2\u017a\u017c\5\"\22\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2"+
		"\u017c\u017e\3\2\2\2\u017d\u0177\3\2\2\2\u017d\u0178\3\2\2\2\u017e;\3"+
		"\2\2\2\u017f\u0184\5H%\2\u0180\u0181\7R\2\2\u0181\u0183\5H%\2\u0182\u0180"+
		"\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"=\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\7K\2\2\u0188\u018a\5@!\2\u0189"+
		"\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2\u018b\u018c\7L"+
		"\2\2\u018c?\3\2\2\2\u018d\u0192\5B\"\2\u018e\u018f\7R\2\2\u018f\u0191"+
		"\5B\"\2\u0190\u018e\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192"+
		"\u0193\3\2\2\2\u0193\u0197\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0196\7R"+
		"\2\2\u0196\u0198\5D#\2\u0197\u0195\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u019b"+
		"\3\2\2\2\u0199\u019b\5D#\2\u019a\u018d\3\2\2\2\u019a\u0199\3\2\2\2\u019b"+
		"A\3\2\2\2\u019c\u019d\5\"\22\2\u019d\u019e\5\34\17\2\u019eC\3\2\2\2\u019f"+
		"\u01a0\5\"\22\2\u01a0\u01a1\7x\2\2\u01a1\u01a2\5\34\17\2\u01a2E\3\2\2"+
		"\2\u01a3\u01a4\5L\'\2\u01a4G\3\2\2\2\u01a5\u01aa\7v\2\2\u01a6\u01a7\7"+
		"S\2\2\u01a7\u01a9\7v\2\2\u01a8\u01a6\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa"+
		"\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01abI\3\2\2\2\u01ac\u01aa\3\2\2\2"+
		"\u01ad\u01ae\t\4\2\2\u01aeK\3\2\2\2\u01af\u01b3\7\5\2\2\u01b0\u01b2\5"+
		"N(\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b3"+
		"\u01b4\3\2\2\2\u01b4\u01b6\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b6\u01d0\7\6"+
		"\2\2\u01b7\u01b9\7\7\2\2\u01b8\u01ba\7v\2\2\u01b9\u01b8\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bf\7N\2\2\u01bc\u01be\5N("+
		"\2\u01bd\u01bc\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0"+
		"\3\2\2\2\u01c0\u01c2\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c4\7\b\2\2\u01c3"+
		"\u01c5\7v\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01c6\3\2"+
		"\2\2\u01c6\u01d0\7N\2\2\u01c7\u01cb\7M\2\2\u01c8\u01ca\5N(\2\u01c9\u01c8"+
		"\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01d0\7N\2\2\u01cf\u01af\3\2"+
		"\2\2\u01cf\u01b7\3\2\2\2\u01cf\u01c7\3\2\2\2\u01d0M\3\2\2\2\u01d1\u01d4"+
		"\5P)\2\u01d2\u01d4\5T+\2\u01d3\u01d1\3\2\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"O\3\2\2\2\u01d5\u01d6\5R*\2\u01d6\u01d7\7Q\2\2\u01d7Q\3\2\2\2\u01d8\u01d9"+
		"\5\"\22\2\u01d9\u01da\5\30\r\2\u01daS\3\2\2\2\u01db\u022a\5L\'\2\u01dc"+
		"\u01dd\7#\2\2\u01dd\u01de\5f\64\2\u01de\u01e1\5T+\2\u01df\u01e0\7\34\2"+
		"\2\u01e0\u01e2\5T+\2\u01e1\u01df\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\u022a"+
		"\3\2\2\2\u01e3\u01e5\7\"\2\2\u01e4\u01e3\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5"+
		"\u01e6\3\2\2\2\u01e6\u01e7\7K\2\2\u01e7\u01e8\5Z.\2\u01e8\u01e9\7L\2\2"+
		"\u01e9\u01ea\5T+\2\u01ea\u022a\3\2\2\2\u01eb\u01ec\7D\2\2\u01ec\u01ed"+
		"\5f\64\2\u01ed\u01ee\5T+\2\u01ee\u022a\3\2\2\2\u01ef\u01f0\7\32\2\2\u01f0"+
		"\u01f1\5T+\2\u01f1\u01f2\7D\2\2\u01f2\u01f3\5f\64\2\u01f3\u01f4\7Q\2\2"+
		"\u01f4\u022a\3\2\2\2\u01f5\u01f6\7<\2\2\u01f6\u01fe\5f\64\2\u01f7\u01ff"+
		"\7M\2\2\u01f8\u01ff\7\5\2\2\u01f9\u01fb\7\7\2\2\u01fa\u01fc\7v\2\2\u01fb"+
		"\u01fa\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01ff\7N"+
		"\2\2\u01fe\u01f7\3\2\2\2\u01fe\u01f8\3\2\2\2\u01fe\u01f9\3\2\2\2\u01ff"+
		"\u0203\3\2\2\2\u0200\u0202\5V,\2\u0201\u0200\3\2\2\2\u0202\u0205\3\2\2"+
		"\2\u0203\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0209\3\2\2\2\u0205\u0203"+
		"\3\2\2\2\u0206\u0208\5X-\2\u0207\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209"+
		"\u0207\3\2\2\2\u0209\u020a\3\2\2\2\u020a\u0213\3\2\2\2\u020b\u0209\3\2"+
		"\2\2\u020c\u0214\7N\2\2\u020d\u0214\7\6\2\2\u020e\u0210\7\b\2\2\u020f"+
		"\u0211\7v\2\2\u0210\u020f\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\3\2"+
		"\2\2\u0212\u0214\7N\2\2\u0213\u020c\3\2\2\2\u0213\u020d\3\2\2\2\u0213"+
		"\u020e\3\2\2\2\u0214\u022a\3\2\2\2\u0215\u0217\7\62\2\2\u0216\u0218\5"+
		"n8\2\u0217\u0216\3\2\2\2\u0217\u0218\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"\u022a\7Q\2\2\u021a\u021c\7\21\2\2\u021b\u021d\7v\2\2\u021c\u021b\3\2"+
		"\2\2\u021c\u021d\3\2\2\2\u021d\u021e\3\2\2\2\u021e\u022a\7Q\2\2\u021f"+
		"\u022a\7Q\2\2\u0220\u0221\5j\66\2\u0221\u0222\7Q\2\2\u0222\u022a\3\2\2"+
		"\2\u0223\u0224\5b\62\2\u0224\u0225\7Q\2\2\u0225\u022a\3\2\2\2\u0226\u0227"+
		"\5d\63\2\u0227\u0228\7Q\2\2\u0228\u022a\3\2\2\2\u0229\u01db\3\2\2\2\u0229"+
		"\u01dc\3\2\2\2\u0229\u01e4\3\2\2\2\u0229\u01eb\3\2\2\2\u0229\u01ef\3\2"+
		"\2\2\u0229\u01f5\3\2\2\2\u0229\u0215\3\2\2\2\u0229\u021a\3\2\2\2\u0229"+
		"\u021f\3\2\2\2\u0229\u0220\3\2\2\2\u0229\u0223\3\2\2\2\u0229\u0226\3\2"+
		"\2\2\u022aU\3\2\2\2\u022b\u022d\5X-\2\u022c\u022b\3\2\2\2\u022d\u022e"+
		"\3\2\2\2\u022e\u022c\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\3\2\2\2\u0230"+
		"\u0232\5N(\2\u0231\u0230\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0231\3\2\2"+
		"\2\u0233\u0234\3\2\2\2\u0234W\3\2\2\2\u0235\u0236\7\23\2\2\u0236\u0237"+
		"\5l\67\2\u0237\u0238\7Z\2\2\u0238\u023c\3\2\2\2\u0239\u023a\7\31\2\2\u023a"+
		"\u023c\7Z\2\2\u023b\u0235\3\2\2\2\u023b\u0239\3\2\2\2\u023cY\3\2\2\2\u023d"+
		"\u023e\5\\/\2\u023e\u0240\7Q\2\2\u023f\u0241\5n8\2\u0240\u023f\3\2\2\2"+
		"\u0240\u0241\3\2\2\2\u0241\u0242\3\2\2\2\u0242\u0244\7Q\2\2\u0243\u0245"+
		"\5`\61\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245[\3\2\2\2\u0246"+
		"\u0249\5R*\2\u0247\u0249\5h\65\2\u0248\u0246\3\2\2\2\u0248\u0247\3\2\2"+
		"\2\u0249]\3\2\2\2\u024a\u024b\5\"\22\2\u024b\u024c\5\34\17\2\u024c\u024d"+
		"\7Z\2\2\u024d\u024e\5n8\2\u024e_\3\2\2\2\u024f\u0250\5h\65\2\u0250a\3"+
		"\2\2\2\u0251\u0252\7.\2\2\u0252\u0253\5n8\2\u0253c\3\2\2\2\u0254\u0256"+
		"\7\63\2\2\u0255\u0257\5\"\22\2\u0256\u0255\3\2\2\2\u0256\u0257\3\2\2\2"+
		"\u0257\u0258\3\2\2\2\u0258\u0259\7\64\2\2\u0259\u025a\5\34\17\2\u025a"+
		"e\3\2\2\2\u025b\u025c\7K\2\2\u025c\u025d\5n8\2\u025d\u025e\7L\2\2\u025e"+
		"g\3\2\2\2\u025f\u0264\5n8\2\u0260\u0261\7R\2\2\u0261\u0263\5n8\2\u0262"+
		"\u0260\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u0265i\3\2\2\2\u0266\u0264\3\2\2\2\u0267\u0268\5n8\2\u0268k\3\2\2"+
		"\2\u0269\u026a\5n8\2\u026am\3\2\2\2\u026b\u026c\b8\1\2\u026c\u0287\5v"+
		"<\2\u026d\u026e\5r:\2\u026e\u026f\7O\2\2\u026f\u0270\5n8\2\u0270\u0271"+
		"\7P\2\2\u0271\u0287\3\2\2\2\u0272\u0273\5r:\2\u0273\u0275\7K\2\2\u0274"+
		"\u0276\5h\65\2\u0275\u0274\3\2\2\2\u0275\u0276\3\2\2\2\u0276\u0277\3\2"+
		"\2\2\u0277\u0278\7L\2\2\u0278\u0287\3\2\2\2\u0279\u027a\7,\2\2\u027a\u0287"+
		"\5x=\2\u027b\u027c\5r:\2\u027c\u027d\t\5\2\2\u027d\u0287\3\2\2\2\u027e"+
		"\u027f\t\6\2\2\u027f\u0287\5r:\2\u0280\u0281\t\7\2\2\u0281\u0287\5n8\13"+
		"\u0282\u0283\5t;\2\u0283\u0284\t\b\2\2\u0284\u0285\5n8\3\u0285\u0287\3"+
		"\2\2\2\u0286\u026b\3\2\2\2\u0286\u026d\3\2\2\2\u0286\u0272\3\2\2\2\u0286"+
		"\u0279\3\2\2\2\u0286\u027b\3\2\2\2\u0286\u027e\3\2\2\2\u0286\u0280\3\2"+
		"\2\2\u0286\u0282\3\2\2\2\u0287\u02a2\3\2\2\2\u0288\u0289\f\n\2\2\u0289"+
		"\u028a\t\t\2\2\u028a\u02a1\5n8\13\u028b\u028c\f\t\2\2\u028c\u028d\t\n"+
		"\2\2\u028d\u02a1\5n8\n\u028e\u028f\f\b\2\2\u028f\u0290\t\13\2\2\u0290"+
		"\u02a1\5n8\t\u0291\u0292\f\7\2\2\u0292\u0293\t\f\2\2\u0293\u02a1\5n8\b"+
		"\u0294\u0295\f\6\2\2\u0295\u0296\7_\2\2\u0296\u02a1\5n8\7\u0297\u0298"+
		"\f\5\2\2\u0298\u0299\7`\2\2\u0299\u02a1\5n8\6\u029a\u029b\f\4\2\2\u029b"+
		"\u029c\7Y\2\2\u029c\u029d\5n8\2\u029d\u029e\7Z\2\2\u029e\u029f\5n8\5\u029f"+
		"\u02a1\3\2\2\2\u02a0\u0288\3\2\2\2\u02a0\u028b\3\2\2\2\u02a0\u028e\3\2"+
		"\2\2\u02a0\u0291\3\2\2\2\u02a0\u0294\3\2\2\2\u02a0\u0297\3\2\2\2\u02a0"+
		"\u029a\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2\u02a0\3\2\2\2\u02a2\u02a3\3\2"+
		"\2\2\u02a3o\3\2\2\2\u02a4\u02a2\3\2\2\2\u02a5\u02a6\b9\1\2\u02a6\u02a7"+
		"\7v\2\2\u02a7\u02b0\3\2\2\2\u02a8\u02a9\f\4\2\2\u02a9\u02aa\7S\2\2\u02aa"+
		"\u02af\7v\2\2\u02ab\u02ac\f\3\2\2\u02ac\u02ad\7\r\2\2\u02ad\u02af\7v\2"+
		"\2\u02ae\u02a8\3\2\2\2\u02ae\u02ab\3\2\2\2\u02af\u02b2\3\2\2\2\u02b0\u02ae"+
		"\3\2\2\2\u02b0\u02b1\3\2\2\2\u02b1q\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3"+
		"\u02b7\7v\2\2\u02b4\u02b5\7e\2\2\u02b5\u02b7\7v\2\2\u02b6\u02b3\3\2\2"+
		"\2\u02b6\u02b4\3\2\2\2\u02b7s\3\2\2\2\u02b8\u02c1\7v\2\2\u02b9\u02ba\7"+
		"e\2\2\u02ba\u02c1\7v\2\2\u02bb\u02bc\5r:\2\u02bc\u02bd\7O\2\2\u02bd\u02be"+
		"\5n8\2\u02be\u02bf\7P\2\2\u02bf\u02c1\3\2\2\2\u02c0\u02b8\3\2\2\2\u02c0"+
		"\u02b9\3\2\2\2\u02c0\u02bb\3\2\2\2\u02c1u\3\2\2\2\u02c2\u02c3\7K\2\2\u02c3"+
		"\u02c4\5n8\2\u02c4\u02c5\7L\2\2\u02c5\u02cb\3\2\2\2\u02c6\u02cb\5J&\2"+
		"\u02c7\u02cb\7v\2\2\u02c8\u02c9\7e\2\2\u02c9\u02cb\7v\2\2\u02ca\u02c2"+
		"\3\2\2\2\u02ca\u02c6\3\2\2\2\u02ca\u02c7\3\2\2\2\u02ca\u02c8\3\2\2\2\u02cb"+
		"w\3\2\2\2\u02cc\u02cd\5z>\2\u02cd\u02ce\5|?\2\u02cey\3\2\2\2\u02cf\u02d3"+
		"\5(\25\2\u02d0\u02d3\5$\23\2\u02d1\u02d3\5&\24\2\u02d2\u02cf\3\2\2\2\u02d2"+
		"\u02d0\3\2\2\2\u02d2\u02d1\3\2\2\2\u02d3{\3\2\2\2\u02d4\u02f0\7O\2\2\u02d5"+
		"\u02da\7P\2\2\u02d6\u02d7\7O\2\2\u02d7\u02d9\7P\2\2\u02d8\u02d6\3\2\2"+
		"\2\u02d9\u02dc\3\2\2\2\u02da\u02d8\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd"+
		"\3\2\2\2\u02dc\u02da\3\2\2\2\u02dd\u02f1\5 \21\2\u02de\u02df\5n8\2\u02df"+
		"\u02e6\7P\2\2\u02e0\u02e1\7O\2\2\u02e1\u02e2\5n8\2\u02e2\u02e3\7P\2\2"+
		"\u02e3\u02e5\3\2\2\2\u02e4\u02e0\3\2\2\2\u02e5\u02e8\3\2\2\2\u02e6\u02e4"+
		"\3\2\2\2\u02e6\u02e7\3\2\2\2\u02e7\u02ed\3\2\2\2\u02e8\u02e6\3\2\2\2\u02e9"+
		"\u02ea\7O\2\2\u02ea\u02ec\7P\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02ef\3\2\2"+
		"\2\u02ed\u02eb\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f1\3\2\2\2\u02ef\u02ed"+
		"\3\2\2\2\u02f0\u02d5\3\2\2\2\u02f0\u02de\3\2\2\2\u02f1}\3\2\2\2\u02f2"+
		"\u02f4\7K\2\2\u02f3\u02f5\5h\65\2\u02f4\u02f3\3\2\2\2\u02f4\u02f5\3\2"+
		"\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02f7\7L\2\2\u02f7\177\3\2\2\2R\u0081\u008c"+
		"\u0094\u009a\u00a1\u00a7\u00b2\u00b7\u00bb\u00be\u00ca\u00d4\u00df\u00e5"+
		"\u00ec\u00f1\u00f9\u00fd\u00ff\u0108\u0110\u0118\u011b\u011f\u0132\u0138"+
		"\u0148\u014d\u0157\u016a\u0172\u017b\u017d\u0184\u0189\u0192\u0197\u019a"+
		"\u01aa\u01b3\u01b9\u01bf\u01c4\u01cb\u01cf\u01d3\u01e1\u01e4\u01fb\u01fe"+
		"\u0203\u0209\u0210\u0213\u0217\u021c\u0229\u022e\u0233\u023b\u0240\u0244"+
		"\u0248\u0256\u0264\u0275\u0286\u02a0\u02a2\u02ae\u02b0\u02b6\u02c0\u02ca"+
		"\u02d2\u02da\u02e6\u02ed\u02f0\u02f4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}