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
		T__9=10, ABSTRACT=11, ASSERT=12, BOOLEAN=13, BREAK=14, BYTE=15, CASE=16, 
		CATCH=17, CHAR=18, CLASS=19, CONST=20, CONTINUE=21, DEFAULT=22, DO=23, 
		DOUBLE=24, ELSE=25, ENUM=26, EXTENDS=27, FINAL=28, FINALLY=29, FLOAT=30, 
		FOR=31, IF=32, GOTO=33, IMPLEMENTS=34, IMPORT=35, INSTANCEOF=36, INT=37, 
		INTERFACE=38, LONG=39, NATIVE=40, NEW=41, PACKAGE=42, PRINT=43, PRIVATE=44, 
		PROTECTED=45, PUBLIC=46, RETURN=47, SCAN=48, SCANTO=49, SHORT=50, STARTING=51, 
		STATIC=52, STRICTFP=53, STRING=54, STRUCT=55, SUPER=56, SWITCH=57, SYNCHRONIZED=58, 
		THIS=59, THROW=60, THROWS=61, TRANSIENT=62, TRY=63, VOID=64, WHILE=65, 
		IntegerLiteral=66, FloatingPointLiteral=67, BooleanLiteral=68, CharacterLiteral=69, 
		StringLiteral=70, NullLiteral=71, LPAREN=72, RPAREN=73, LBRACE=74, RBRACE=75, 
		LBRACK=76, RBRACK=77, SEMI=78, COMMA=79, DOT=80, ASSIGN=81, GT=82, LT=83, 
		BANG=84, TILDE=85, QUESTION=86, COLON=87, EQUAL=88, LE=89, GE=90, NOTEQUAL=91, 
		AND=92, OR=93, INC=94, DEC=95, ADD=96, SUB=97, MUL=98, DIV=99, BITAND=100, 
		BITOR=101, CARET=102, MOD=103, ADD_ASSIGN=104, SUB_ASSIGN=105, MUL_ASSIGN=106, 
		DIV_ASSIGN=107, AND_ASSIGN=108, OR_ASSIGN=109, XOR_ASSIGN=110, MOD_ASSIGN=111, 
		LSHIFT_ASSIGN=112, RSHIFT_ASSIGN=113, URSHIFT_ASSIGN=114, Identifier=115, 
		AT=116, ELLIPSIS=117, WS=118, COMMENT=119, LINE_COMMENT=120;
	public static final int
		RULE_compilationUnit = 0, RULE_bodyDeclaration = 1, RULE_typeBound = 2, 
		RULE_typeList = 3, RULE_memberDeclaration = 4, RULE_methodDeclaration = 5, 
		RULE_fieldDeclaration = 6, RULE_constDeclaration = 7, RULE_constantDeclarator = 8, 
		RULE_variableDeclarators = 9, RULE_variableDeclarator = 10, RULE_variableDeclaratorId = 11, 
		RULE_variableInitializer = 12, RULE_arrayInitializer = 13, RULE_typeType = 14, 
		RULE_pointerType = 15, RULE_structType = 16, RULE_primitiveType = 17, 
		RULE_structDefinition = 18, RULE_structDeclarationList = 19, RULE_structDeclaration = 20, 
		RULE_structDeclaratorList = 21, RULE_structDeclarator = 22, RULE_structDeclaratorId = 23, 
		RULE_typeDefinition = 24, RULE_typeArguments = 25, RULE_typeArgument = 26, 
		RULE_qualifiedNameList = 27, RULE_formalParameters = 28, RULE_formalParameterList = 29, 
		RULE_formalParameter = 30, RULE_lastFormalParameter = 31, RULE_methodBody = 32, 
		RULE_qualifiedName = 33, RULE_literal = 34, RULE_block = 35, RULE_blockStatement = 36, 
		RULE_localVariableDeclarationStatement = 37, RULE_localVariableDeclaration = 38, 
		RULE_statement = 39, RULE_switchBlockStatementGroup = 40, RULE_switchLabel = 41, 
		RULE_forControl = 42, RULE_forInit = 43, RULE_enhancedForControl = 44, 
		RULE_forUpdate = 45, RULE_outputStatement = 46, RULE_inputStatement = 47, 
		RULE_parExpression = 48, RULE_expressionList = 49, RULE_statementExpression = 50, 
		RULE_constantExpression = 51, RULE_expression = 52, RULE_variableExpr = 53, 
		RULE_equationExpr = 54, RULE_primary = 55, RULE_creator = 56, RULE_createdName = 57, 
		RULE_arrayCreatorRest = 58, RULE_arguments = 59;
	public static final String[] ruleNames = {
		"compilationUnit", "bodyDeclaration", "typeBound", "typeList", "memberDeclaration", 
		"methodDeclaration", "fieldDeclaration", "constDeclaration", "constantDeclarator", 
		"variableDeclarators", "variableDeclarator", "variableDeclaratorId", "variableInitializer", 
		"arrayInitializer", "typeType", "pointerType", "structType", "primitiveType", 
		"structDefinition", "structDeclarationList", "structDeclaration", "structDeclaratorList", 
		"structDeclarator", "structDeclaratorId", "typeDefinition", "typeArguments", 
		"typeArgument", "qualifiedNameList", "formalParameters", "formalParameterList", 
		"formalParameter", "lastFormalParameter", "methodBody", "qualifiedName", 
		"literal", "block", "blockStatement", "localVariableDeclarationStatement", 
		"localVariableDeclaration", "statement", "switchBlockStatementGroup", 
		"switchLabel", "forControl", "forInit", "enhancedForControl", "forUpdate", 
		"outputStatement", "inputStatement", "parExpression", "expressionList", 
		"statementExpression", "constantExpression", "expression", "variableExpr", 
		"equationExpr", "primary", "creator", "createdName", "arrayCreatorRest", 
		"arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'ACT'", "'starring'", "'{A}'", "'{Z}'", "'{SCENE'", "'{END'", "'SCENE'", 
		"'END'", "'cast'", "'as'", "'template'", "'assert'", "'boolean'", "'break'", 
		"'byte'", "'version'", "'catch'", "'char'", "'script'", "'const'", "'continue'", 
		"'original'", "'rehearse'", "'double'", "'else'", "'enum'", null, "'permanent'", 
		"'finally'", "'float'", "'replay'", "'if'", "'goto'", "'that can'", "'take'", 
		"'can act as'", "'int'", "'interface'", "'long'", "'native'", "'new'", 
		"'from'", "'Say'", "'secret'", "'hereditary'", "'universal'", "'give'", 
		"'Write'", "'to'", "'short'", "'The'", "'static'", "'strictfp'", "'string'", 
		"'composition'", "'super'", "'switch'", "'synchronized'", "'this'", "'ignore'", 
		"'ignores'", "'transient'", "'audition'", "'void'", "'when'", null, null, 
		null, null, null, "'null'", "'('", "')'", "'{'", "'}'", "'['", "']'", 
		"';'", "','", "'.'", "'='", "'>'", "'<'", "'!'", "'~'", "'?'", "':'", 
		"'=='", "'<='", "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", 
		"'-'", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", 
		"'/='", "'&='", "'|='", "'^='", "'%='", "'<<='", "'>>='", "'>>>='", null, 
		"'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "ABSTRACT", 
		"ASSERT", "BOOLEAN", "BREAK", "BYTE", "CASE", "CATCH", "CHAR", "CLASS", 
		"CONST", "CONTINUE", "DEFAULT", "DO", "DOUBLE", "ELSE", "ENUM", "EXTENDS", 
		"FINAL", "FINALLY", "FLOAT", "FOR", "IF", "GOTO", "IMPLEMENTS", "IMPORT", 
		"INSTANCEOF", "INT", "INTERFACE", "LONG", "NATIVE", "NEW", "PACKAGE", 
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(120);
				bodyDeclaration();
				}
				break;
			}
			setState(123);
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
		public List<MemberDeclarationContext> memberDeclaration() {
			return getRuleContexts(MemberDeclarationContext.class);
		}
		public MemberDeclarationContext memberDeclaration(int i) {
			return getRuleContext(MemberDeclarationContext.class,i);
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(125);
				memberDeclaration();
				}
				}
				setState(130);
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
			setState(131);
			typeType();
			setState(136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(132);
				match(BITAND);
				setState(133);
				typeType();
				}
				}
				setState(138);
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
			setState(139);
			typeType();
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(140);
				match(COMMA);
				setState(141);
				typeType();
				}
				}
				setState(146);
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
		public MethodDeclarationContext methodDeclaration() {
			return getRuleContext(MethodDeclarationContext.class,0);
		}
		public FieldDeclarationContext fieldDeclaration() {
			return getRuleContext(FieldDeclarationContext.class,0);
		}
		public StructDefinitionContext structDefinition() {
			return getRuleContext(StructDefinitionContext.class,0);
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
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				methodDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				fieldDeclaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
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
		enterRule(_localctx, 10, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__0);
			setState(153);
			match(Identifier);
			setState(154);
			match(T__1);
			setState(155);
			formalParameters();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(156);
				match(LBRACK);
				setState(157);
				match(RBRACK);
				}
				}
				setState(162);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(163);
				match(THROWS);
				setState(164);
				qualifiedNameList();
				}
			}

			setState(169);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__4:
			case LBRACE:
				{
				setState(167);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(168);
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
		enterRule(_localctx, 12, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(171);
				match(FINAL);
				}
			}

			setState(174);
			typeType();
			setState(175);
			variableDeclarators();
			setState(176);
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
		enterRule(_localctx, 14, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			typeType();
			setState(179);
			constantDeclarator();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(180);
				match(COMMA);
				setState(181);
				constantDeclarator();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187);
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
		enterRule(_localctx, 16, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(Identifier);
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(190);
				match(LBRACK);
				setState(191);
				match(RBRACK);
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(197);
			match(ASSIGN);
			setState(198);
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
		enterRule(_localctx, 18, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			variableDeclarator();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(201);
				match(COMMA);
				setState(202);
				variableDeclarator();
				}
				}
				setState(207);
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
		enterRule(_localctx, 20, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			variableDeclaratorId();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(209);
				match(ASSIGN);
				setState(210);
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
		enterRule(_localctx, 22, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(Identifier);
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(214);
				match(LBRACK);
				setState(215);
				match(RBRACK);
				}
				}
				setState(220);
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
		enterRule(_localctx, 24, RULE_variableInitializer);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
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
				setState(222);
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
		enterRule(_localctx, 26, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(LBRACE);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(226);
				variableInitializer();
				setState(231);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227);
						match(COMMA);
						setState(228);
						variableInitializer();
						}
						} 
					}
					setState(233);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(234);
					match(COMMA);
					}
				}

				}
			}

			setState(239);
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
		enterRule(_localctx, 28, RULE_typeType);
		int _la;
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				pointerType();
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(242);
					match(LBRACK);
					setState(243);
					match(RBRACK);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				primitiveType();
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(250);
					match(LBRACK);
					setState(251);
					match(RBRACK);
					}
					}
					setState(256);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(257);
				structType();
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
		enterRule(_localctx, 30, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
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
				setState(267);
				primitiveType();
				}
				break;
			case STRUCT:
				{
				setState(268);
				structType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(271);
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
		enterRule(_localctx, 32, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(STRUCT);
			setState(274);
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
		enterRule(_localctx, 34, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
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
		enterRule(_localctx, 36, RULE_structDefinition);
		int _la;
		try {
			setState(310);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(STRUCT);
				setState(279);
				match(Identifier);
				setState(280);
				match(T__2);
				setState(281);
				structDeclarationList();
				setState(282);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				match(STRUCT);
				setState(285);
				match(Identifier);
				setState(286);
				match(T__4);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(287);
					match(Identifier);
					}
				}

				setState(290);
				match(RBRACE);
				setState(291);
				structDeclarationList();
				setState(292);
				match(T__5);
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(293);
					match(Identifier);
					}
				}

				setState(296);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				match(STRUCT);
				setState(299);
				match(Identifier);
				setState(300);
				match(T__6);
				setState(301);
				structDeclarationList();
				setState(302);
				match(T__7);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(304);
				match(STRUCT);
				setState(305);
				match(Identifier);
				setState(306);
				match(LBRACE);
				setState(307);
				structDeclarationList();
				setState(308);
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
		enterRule(_localctx, 38, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0)) {
				{
				{
				setState(312);
				structDeclaration();
				}
				}
				setState(317);
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
		enterRule(_localctx, 40, RULE_structDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			typeType();
			setState(319);
			structDeclaratorList();
			setState(320);
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
		enterRule(_localctx, 42, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(322);
				structDeclarator();
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
		enterRule(_localctx, 44, RULE_structDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
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
		enterRule(_localctx, 46, RULE_structDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
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
		enterRule(_localctx, 48, RULE_typeDefinition);
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(332);
				match(T__8);
				setState(333);
				typeType();
				setState(334);
				match(T__9);
				setState(335);
				match(Identifier);
				setState(336);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(338);
				match(T__8);
				setState(339);
				structDefinition();
				setState(340);
				match(T__9);
				setState(341);
				match(Identifier);
				setState(342);
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
		enterRule(_localctx, 50, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(LT);
			setState(347);
			typeArgument();
			setState(352);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(348);
				match(COMMA);
				setState(349);
				typeArgument();
				}
				}
				setState(354);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(355);
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
		enterRule(_localctx, 52, RULE_typeArgument);
		int _la;
		try {
			setState(363);
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
				setState(357);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
				match(QUESTION);
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(359);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(360);
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
		enterRule(_localctx, 54, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			qualifiedName();
			setState(370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(366);
				match(COMMA);
				setState(367);
				qualifiedName();
				}
				}
				setState(372);
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
		enterRule(_localctx, 56, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(LPAREN);
			setState(375);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0)) {
				{
				setState(374);
				formalParameterList();
				}
			}

			setState(377);
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
		enterRule(_localctx, 58, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(392);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				formalParameter();
				setState(384);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(380);
						match(COMMA);
						setState(381);
						formalParameter();
						}
						} 
					}
					setState(386);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				setState(389);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(387);
					match(COMMA);
					setState(388);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
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
		enterRule(_localctx, 60, RULE_formalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			typeType();
			setState(395);
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
		enterRule(_localctx, 62, RULE_lastFormalParameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			typeType();
			setState(398);
			match(ELLIPSIS);
			setState(399);
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
		enterRule(_localctx, 64, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
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
		enterRule(_localctx, 66, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(Identifier);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(404);
				match(DOT);
				setState(405);
				match(Identifier);
				}
				}
				setState(410);
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
		enterRule(_localctx, 68, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			_la = _input.LA(1);
			if ( !(((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)))) != 0)) ) {
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
		enterRule(_localctx, 70, RULE_block);
		int _la;
		try {
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(T__2);
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					{
					setState(414);
					blockStatement();
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(420);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(421);
				match(T__4);
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(422);
					match(Identifier);
					}
				}

				setState(425);
				match(RBRACE);
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (Identifier - 65)))) != 0)) {
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
				match(T__5);
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(433);
					match(Identifier);
					}
				}

				setState(436);
				match(RBRACE);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				match(LBRACE);
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (Identifier - 65)))) != 0)) {
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
		enterRule(_localctx, 72, RULE_blockStatement);
		try {
			setState(449);
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
				setState(447);
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
				setState(448);
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
		enterRule(_localctx, 74, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			localVariableDeclaration();
			setState(452);
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
		enterRule(_localctx, 76, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			typeType();
			setState(455);
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
		enterRule(_localctx, 78, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(535);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new BlockStmtContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(457);
				block();
				}
				break;
			case 2:
				_localctx = new IfElseStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(458);
				match(IF);
				setState(459);
				parExpression();
				setState(460);
				statement();
				setState(463);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(461);
					match(ELSE);
					setState(462);
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
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(465);
					match(FOR);
					}
				}

				setState(468);
				match(LPAREN);
				setState(469);
				forControl();
				setState(470);
				match(RPAREN);
				setState(471);
				statement();
				}
				break;
			case 4:
				_localctx = new WhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(473);
				match(WHILE);
				setState(474);
				parExpression();
				setState(475);
				statement();
				}
				break;
			case 5:
				_localctx = new DoWhileStmtContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(477);
				match(DO);
				setState(478);
				statement();
				setState(479);
				match(WHILE);
				setState(480);
				parExpression();
				setState(481);
				match(SEMI);
				}
				break;
			case 6:
				_localctx = new SwitchStmtContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(483);
				match(SWITCH);
				setState(484);
				parExpression();
				setState(492);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(485);
					match(LBRACE);
					}
					break;
				case T__2:
					{
					setState(486);
					match(T__2);
					}
					break;
				case T__4:
					{
					setState(487);
					match(T__4);
					setState(489);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(488);
						match(Identifier);
						}
					}

					setState(491);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(494);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(499);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				}
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(500);
					switchLabel();
					}
					}
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(513);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE:
					{
					setState(506);
					match(RBRACE);
					}
					break;
				case T__3:
					{
					setState(507);
					match(T__3);
					}
					break;
				case T__5:
					{
					setState(508);
					match(T__5);
					setState(510);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(509);
						match(Identifier);
						}
					}

					setState(512);
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
				setState(515);
				match(RETURN);
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(516);
					expression(0);
					}
				}

				setState(519);
				match(SEMI);
				}
				break;
			case 8:
				_localctx = new BreakStmtContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(520);
				match(BREAK);
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
				match(SEMI);
				}
				break;
			case 9:
				_localctx = new SemicolonStmtContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(525);
				match(SEMI);
				}
				break;
			case 10:
				_localctx = new ExprStmtContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(526);
				statementExpression();
				setState(527);
				match(SEMI);
				}
				break;
			case 11:
				_localctx = new OutputStmtContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(529);
				outputStatement();
				setState(530);
				match(SEMI);
				}
				break;
			case 12:
				_localctx = new InputStmtContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(532);
				inputStatement();
				setState(533);
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
		enterRule(_localctx, 80, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(537);
				switchLabel();
				}
				}
				setState(540); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(543); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(542);
				blockStatement();
				}
				}
				setState(545); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__4) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << NEW) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (WHILE - 65)) | (1L << (IntegerLiteral - 65)) | (1L << (FloatingPointLiteral - 65)) | (1L << (BooleanLiteral - 65)) | (1L << (CharacterLiteral - 65)) | (1L << (StringLiteral - 65)) | (1L << (NullLiteral - 65)) | (1L << (LPAREN - 65)) | (1L << (LBRACE - 65)) | (1L << (SEMI - 65)) | (1L << (BANG - 65)) | (1L << (TILDE - 65)) | (1L << (INC - 65)) | (1L << (DEC - 65)) | (1L << (ADD - 65)) | (1L << (SUB - 65)) | (1L << (MUL - 65)) | (1L << (Identifier - 65)))) != 0) );
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
		enterRule(_localctx, 82, RULE_switchLabel);
		try {
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(547);
				match(CASE);
				setState(548);
				constantExpression();
				setState(549);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				match(DEFAULT);
				setState(552);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitForControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_forControl);
		int _la;
		try {
			setState(565);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(555);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(556);
				forInit();
				setState(557);
				match(SEMI);
				setState(559);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(558);
					expression(0);
					}
				}

				setState(561);
				match(SEMI);
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(562);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ManuScriptVisitor ) return ((ManuScriptVisitor<? extends T>)visitor).visitForInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitContext forInit() throws RecognitionException {
		ForInitContext _localctx = new ForInitContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_forInit);
		try {
			setState(569);
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
				setState(567);
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
				setState(568);
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
		enterRule(_localctx, 88, RULE_enhancedForControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			typeType();
			setState(572);
			variableDeclaratorId();
			setState(573);
			match(COLON);
			setState(574);
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
		enterRule(_localctx, 90, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
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
		enterRule(_localctx, 92, RULE_outputStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(PRINT);
			setState(579);
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
		enterRule(_localctx, 94, RULE_inputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			match(SCAN);
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0)) {
				{
				setState(582);
				typeType();
				}
			}

			setState(585);
			match(SCANTO);
			setState(586);
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
		enterRule(_localctx, 96, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(LPAREN);
			setState(589);
			expression(0);
			setState(590);
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
		enterRule(_localctx, 98, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(592);
			expression(0);
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(593);
				match(COMMA);
				setState(594);
				expression(0);
				}
				}
				setState(599);
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
		enterRule(_localctx, 100, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
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
		enterRule(_localctx, 102, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
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
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(605);
				primary();
				}
				break;
			case 2:
				{
				_localctx = new ArrayExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(606);
				variableExpr();
				setState(607);
				match(LBRACK);
				setState(608);
				expression(0);
				setState(609);
				match(RBRACK);
				}
				break;
			case 3:
				{
				_localctx = new FunctionExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(611);
				variableExpr();
				setState(612);
				match(LPAREN);
				setState(614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEW || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					setState(613);
					expressionList();
					}
				}

				setState(616);
				match(RPAREN);
				}
				break;
			case 4:
				{
				_localctx = new ArrayInitExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(618);
				match(NEW);
				setState(619);
				creator();
				}
				break;
			case 5:
				{
				_localctx = new PostIncDecExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(620);
				variableExpr();
				setState(621);
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
				setState(623);
				_la = _input.LA(1);
				if ( !(((((_la - 94)) & ~0x3f) == 0 && ((1L << (_la - 94)) & ((1L << (INC - 94)) | (1L << (DEC - 94)) | (1L << (ADD - 94)) | (1L << (SUB - 94)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(624);
				variableExpr();
				}
				break;
			case 7:
				{
				_localctx = new NegationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(625);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(626);
				expression(9);
				}
				break;
			case 8:
				{
				_localctx = new AssignExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(627);
				equationExpr();
				setState(628);
				_la = _input.LA(1);
				if ( !(((((_la - 81)) & ~0x3f) == 0 && ((1L << (_la - 81)) & ((1L << (ASSIGN - 81)) | (1L << (ADD_ASSIGN - 81)) | (1L << (SUB_ASSIGN - 81)) | (1L << (MUL_ASSIGN - 81)) | (1L << (DIV_ASSIGN - 81)) | (1L << (MOD_ASSIGN - 81)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(629);
				expression(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(659);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,68,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(657);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(633);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(634);
						_la = _input.LA(1);
						if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (MUL - 98)) | (1L << (DIV - 98)) | (1L << (MOD - 98)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(635);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(636);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(637);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(638);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(639);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(640);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (GT - 82)) | (1L << (LT - 82)) | (1L << (LE - 82)) | (1L << (GE - 82)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(641);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(642);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(643);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(644);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(645);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(646);
						match(AND);
						setState(647);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(648);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(649);
						match(OR);
						setState(650);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new OneLineIfExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(651);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(652);
						match(QUESTION);
						setState(653);
						expression(0);
						setState(654);
						match(COLON);
						setState(655);
						expression(3);
						}
						break;
					}
					} 
				}
				setState(661);
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
		enterRule(_localctx, 106, RULE_variableExpr);
		try {
			setState(665);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(662);
				match(Identifier);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 2);
				{
				setState(663);
				match(MUL);
				setState(664);
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
		enterRule(_localctx, 108, RULE_equationExpr);
		try {
			setState(675);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(667);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(668);
				match(MUL);
				setState(669);
				match(Identifier);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				variableExpr();
				setState(671);
				match(LBRACK);
				setState(672);
				expression(0);
				setState(673);
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
		enterRule(_localctx, 110, RULE_primary);
		try {
			setState(685);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(677);
				match(LPAREN);
				setState(678);
				expression(0);
				setState(679);
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
				setState(681);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(682);
				match(Identifier);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(683);
				match(MUL);
				setState(684);
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
		enterRule(_localctx, 112, RULE_creator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			createdName();
			{
			setState(688);
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
		enterRule(_localctx, 114, RULE_createdName);
		try {
			setState(692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(690);
				primitiveType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(691);
				pointerType();
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
		enterRule(_localctx, 116, RULE_arrayCreatorRest);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			match(LBRACK);
			setState(722);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RBRACK:
				{
				setState(695);
				match(RBRACK);
				setState(700);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(696);
					match(LBRACK);
					setState(697);
					match(RBRACK);
					}
					}
					setState(702);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(703);
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
				setState(704);
				expression(0);
				setState(705);
				match(RBRACK);
				setState(712);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(706);
						match(LBRACK);
						setState(707);
						expression(0);
						setState(708);
						match(RBRACK);
						}
						} 
					}
					setState(714);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
				}
				setState(719);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(715);
						match(LBRACK);
						setState(716);
						match(RBRACK);
						}
						} 
					}
					setState(721);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,75,_ctx);
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
		enterRule(_localctx, 118, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			match(LPAREN);
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEW || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
				{
				setState(725);
				expressionList();
				}
			}

			setState(728);
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
		case 52:
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
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3z\u02dd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\5\2|\n\2\3\2\3\2\3\3\7\3\u0081\n\3\f\3\16\3\u0084\13\3\3\4\3\4\3"+
		"\4\7\4\u0089\n\4\f\4\16\4\u008c\13\4\3\5\3\5\3\5\7\5\u0091\n\5\f\5\16"+
		"\5\u0094\13\5\3\6\3\6\3\6\5\6\u0099\n\6\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u00a1"+
		"\n\7\f\7\16\7\u00a4\13\7\3\7\3\7\5\7\u00a8\n\7\3\7\3\7\5\7\u00ac\n\7\3"+
		"\b\5\b\u00af\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00b9\n\t\f\t\16"+
		"\t\u00bc\13\t\3\t\3\t\3\n\3\n\3\n\7\n\u00c3\n\n\f\n\16\n\u00c6\13\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\7\13\u00ce\n\13\f\13\16\13\u00d1\13\13\3\f\3"+
		"\f\3\f\5\f\u00d6\n\f\3\r\3\r\3\r\7\r\u00db\n\r\f\r\16\r\u00de\13\r\3\16"+
		"\3\16\5\16\u00e2\n\16\3\17\3\17\3\17\3\17\7\17\u00e8\n\17\f\17\16\17\u00eb"+
		"\13\17\3\17\5\17\u00ee\n\17\5\17\u00f0\n\17\3\17\3\17\3\20\3\20\3\20\7"+
		"\20\u00f7\n\20\f\20\16\20\u00fa\13\20\3\20\3\20\3\20\7\20\u00ff\n\20\f"+
		"\20\16\20\u0102\13\20\3\20\3\20\3\20\7\20\u0107\n\20\f\20\16\20\u010a"+
		"\13\20\5\20\u010c\n\20\3\21\3\21\5\21\u0110\n\21\3\21\3\21\3\22\3\22\3"+
		"\22\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0123"+
		"\n\24\3\24\3\24\3\24\3\24\5\24\u0129\n\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0139\n\24\3\25\7\25\u013c"+
		"\n\25\f\25\16\25\u013f\13\25\3\26\3\26\3\26\3\26\3\27\7\27\u0146\n\27"+
		"\f\27\16\27\u0149\13\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u015b\n\32\3\33\3\33\3\33\3\33"+
		"\7\33\u0161\n\33\f\33\16\33\u0164\13\33\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\5\34\u016c\n\34\5\34\u016e\n\34\3\35\3\35\3\35\7\35\u0173\n\35\f\35\16"+
		"\35\u0176\13\35\3\36\3\36\5\36\u017a\n\36\3\36\3\36\3\37\3\37\3\37\7\37"+
		"\u0181\n\37\f\37\16\37\u0184\13\37\3\37\3\37\5\37\u0188\n\37\3\37\5\37"+
		"\u018b\n\37\3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3#\3#\3#\7#\u0199\n#\f#\16#\u019c"+
		"\13#\3$\3$\3%\3%\7%\u01a2\n%\f%\16%\u01a5\13%\3%\3%\3%\5%\u01aa\n%\3%"+
		"\3%\7%\u01ae\n%\f%\16%\u01b1\13%\3%\3%\5%\u01b5\n%\3%\3%\3%\7%\u01ba\n"+
		"%\f%\16%\u01bd\13%\3%\5%\u01c0\n%\3&\3&\5&\u01c4\n&\3\'\3\'\3\'\3(\3("+
		"\3(\3)\3)\3)\3)\3)\3)\5)\u01d2\n)\3)\5)\u01d5\n)\3)\3)\3)\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u01ec\n)\3)\5)\u01ef\n)"+
		"\3)\7)\u01f2\n)\f)\16)\u01f5\13)\3)\7)\u01f8\n)\f)\16)\u01fb\13)\3)\3"+
		")\3)\3)\5)\u0201\n)\3)\5)\u0204\n)\3)\3)\5)\u0208\n)\3)\3)\3)\5)\u020d"+
		"\n)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\5)\u021a\n)\3*\6*\u021d\n*\r*\16"+
		"*\u021e\3*\6*\u0222\n*\r*\16*\u0223\3+\3+\3+\3+\3+\3+\5+\u022c\n+\3,\3"+
		",\3,\3,\5,\u0232\n,\3,\3,\5,\u0236\n,\5,\u0238\n,\3-\3-\5-\u023c\n-\3"+
		".\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\5\61\u024a\n\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\63\3\63\3\63\7\63\u0256\n\63\f\63\16\63\u0259"+
		"\13\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\5\66\u0269\n\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\5\66\u027a\n\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\3\66\7\66\u0294\n\66\f\66\16\66\u0297\13\66\3\67\3\67"+
		"\3\67\5\67\u029c\n\67\38\38\38\38\38\38\38\38\58\u02a6\n8\39\39\39\39"+
		"\39\39\39\39\59\u02b0\n9\3:\3:\3:\3;\3;\5;\u02b7\n;\3<\3<\3<\3<\7<\u02bd"+
		"\n<\f<\16<\u02c0\13<\3<\3<\3<\3<\3<\3<\3<\7<\u02c9\n<\f<\16<\u02cc\13"+
		"<\3<\3<\7<\u02d0\n<\f<\16<\u02d3\13<\5<\u02d5\n<\3=\3=\5=\u02d9\n=\3="+
		"\3=\3=\2\3j>\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\r\13\2\17\17\21\21\24\24\32\32"+
		"  \'\'))\64\6488\4\2\35\35::\3\2DI\3\2`a\3\2`c\3\2VW\5\2SSjmqq\4\2dei"+
		"i\3\2bc\4\2TU[\\\4\2ZZ]]\2\u030d\2{\3\2\2\2\4\u0082\3\2\2\2\6\u0085\3"+
		"\2\2\2\b\u008d\3\2\2\2\n\u0098\3\2\2\2\f\u009a\3\2\2\2\16\u00ae\3\2\2"+
		"\2\20\u00b4\3\2\2\2\22\u00bf\3\2\2\2\24\u00ca\3\2\2\2\26\u00d2\3\2\2\2"+
		"\30\u00d7\3\2\2\2\32\u00e1\3\2\2\2\34\u00e3\3\2\2\2\36\u010b\3\2\2\2 "+
		"\u010f\3\2\2\2\"\u0113\3\2\2\2$\u0116\3\2\2\2&\u0138\3\2\2\2(\u013d\3"+
		"\2\2\2*\u0140\3\2\2\2,\u0147\3\2\2\2.\u014a\3\2\2\2\60\u014c\3\2\2\2\62"+
		"\u015a\3\2\2\2\64\u015c\3\2\2\2\66\u016d\3\2\2\28\u016f\3\2\2\2:\u0177"+
		"\3\2\2\2<\u018a\3\2\2\2>\u018c\3\2\2\2@\u018f\3\2\2\2B\u0193\3\2\2\2D"+
		"\u0195\3\2\2\2F\u019d\3\2\2\2H\u01bf\3\2\2\2J\u01c3\3\2\2\2L\u01c5\3\2"+
		"\2\2N\u01c8\3\2\2\2P\u0219\3\2\2\2R\u021c\3\2\2\2T\u022b\3\2\2\2V\u0237"+
		"\3\2\2\2X\u023b\3\2\2\2Z\u023d\3\2\2\2\\\u0242\3\2\2\2^\u0244\3\2\2\2"+
		"`\u0247\3\2\2\2b\u024e\3\2\2\2d\u0252\3\2\2\2f\u025a\3\2\2\2h\u025c\3"+
		"\2\2\2j\u0279\3\2\2\2l\u029b\3\2\2\2n\u02a5\3\2\2\2p\u02af\3\2\2\2r\u02b1"+
		"\3\2\2\2t\u02b6\3\2\2\2v\u02b8\3\2\2\2x\u02d6\3\2\2\2z|\5\4\3\2{z\3\2"+
		"\2\2{|\3\2\2\2|}\3\2\2\2}~\7\2\2\3~\3\3\2\2\2\177\u0081\5\n\6\2\u0080"+
		"\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2"+
		"\2\u0083\5\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u008a\5\36\20\2\u0086\u0087"+
		"\7f\2\2\u0087\u0089\5\36\20\2\u0088\u0086\3\2\2\2\u0089\u008c\3\2\2\2"+
		"\u008a\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\7\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008d\u0092\5\36\20\2\u008e\u008f\7Q\2\2\u008f\u0091\5\36\20\2"+
		"\u0090\u008e\3\2\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093"+
		"\3\2\2\2\u0093\t\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0099\5\f\7\2\u0096"+
		"\u0099\5\16\b\2\u0097\u0099\5&\24\2\u0098\u0095\3\2\2\2\u0098\u0096\3"+
		"\2\2\2\u0098\u0097\3\2\2\2\u0099\13\3\2\2\2\u009a\u009b\7\3\2\2\u009b"+
		"\u009c\7u\2\2\u009c\u009d\7\4\2\2\u009d\u00a2\5:\36\2\u009e\u009f\7N\2"+
		"\2\u009f\u00a1\7O\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a7\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\7?\2\2\u00a6\u00a8\58\35\2\u00a7\u00a5\3\2\2\2\u00a7\u00a8\3\2"+
		"\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00ac\5B\"\2\u00aa\u00ac\7P\2\2\u00ab\u00a9"+
		"\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\r\3\2\2\2\u00ad\u00af\7\36\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\5\36"+
		"\20\2\u00b1\u00b2\5\24\13\2\u00b2\u00b3\7P\2\2\u00b3\17\3\2\2\2\u00b4"+
		"\u00b5\5\36\20\2\u00b5\u00ba\5\22\n\2\u00b6\u00b7\7Q\2\2\u00b7\u00b9\5"+
		"\22\n\2\u00b8\u00b6\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7P"+
		"\2\2\u00be\21\3\2\2\2\u00bf\u00c4\7u\2\2\u00c0\u00c1\7N\2\2\u00c1\u00c3"+
		"\7O\2\2\u00c2\u00c0\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4"+
		"\u00c5\3\2\2\2\u00c5\u00c7\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c8\7S"+
		"\2\2\u00c8\u00c9\5\32\16\2\u00c9\23\3\2\2\2\u00ca\u00cf\5\26\f\2\u00cb"+
		"\u00cc\7Q\2\2\u00cc\u00ce\5\26\f\2\u00cd\u00cb\3\2\2\2\u00ce\u00d1\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\25\3\2\2\2\u00d1\u00cf"+
		"\3\2\2\2\u00d2\u00d5\5\30\r\2\u00d3\u00d4\7S\2\2\u00d4\u00d6\5\32\16\2"+
		"\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\27\3\2\2\2\u00d7\u00dc"+
		"\7u\2\2\u00d8\u00d9\7N\2\2\u00d9\u00db\7O\2\2\u00da\u00d8\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\31\3\2\2"+
		"\2\u00de\u00dc\3\2\2\2\u00df\u00e2\5\34\17\2\u00e0\u00e2\5j\66\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e0\3\2\2\2\u00e2\33\3\2\2\2\u00e3\u00ef\7L\2\2"+
		"\u00e4\u00e9\5\32\16\2\u00e5\u00e6\7Q\2\2\u00e6\u00e8\5\32\16\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00eb\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9\u00ea\3\2"+
		"\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00ec\u00ee\7Q\2\2\u00ed"+
		"\u00ec\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00e4\3\2"+
		"\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\7M\2\2\u00f2"+
		"\35\3\2\2\2\u00f3\u00f8\5 \21\2\u00f4\u00f5\7N\2\2\u00f5\u00f7\7O\2\2"+
		"\u00f6\u00f4\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9"+
		"\3\2\2\2\u00f9\u010c\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u0100\5$\23\2\u00fc"+
		"\u00fd\7N\2\2\u00fd\u00ff\7O\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2\2"+
		"\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u010c\3\2\2\2\u0102\u0100"+
		"\3\2\2\2\u0103\u0108\5\"\22\2\u0104\u0105\7N\2\2\u0105\u0107\7O\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2"+
		"\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010b\u00f3\3\2\2\2\u010b"+
		"\u00fb\3\2\2\2\u010b\u0103\3\2\2\2\u010c\37\3\2\2\2\u010d\u0110\5$\23"+
		"\2\u010e\u0110\5\"\22\2\u010f\u010d\3\2\2\2\u010f\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\7d\2\2\u0112!\3\2\2\2\u0113\u0114\79\2\2\u0114"+
		"\u0115\7u\2\2\u0115#\3\2\2\2\u0116\u0117\t\2\2\2\u0117%\3\2\2\2\u0118"+
		"\u0119\79\2\2\u0119\u011a\7u\2\2\u011a\u011b\7\5\2\2\u011b\u011c\5(\25"+
		"\2\u011c\u011d\7\6\2\2\u011d\u0139\3\2\2\2\u011e\u011f\79\2\2\u011f\u0120"+
		"\7u\2\2\u0120\u0122\7\7\2\2\u0121\u0123\7u\2\2\u0122\u0121\3\2\2\2\u0122"+
		"\u0123\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0125\7M\2\2\u0125\u0126\5(\25"+
		"\2\u0126\u0128\7\b\2\2\u0127\u0129\7u\2\2\u0128\u0127\3\2\2\2\u0128\u0129"+
		"\3\2\2\2\u0129\u012a\3\2\2\2\u012a\u012b\7M\2\2\u012b\u0139\3\2\2\2\u012c"+
		"\u012d\79\2\2\u012d\u012e\7u\2\2\u012e\u012f\7\t\2\2\u012f\u0130\5(\25"+
		"\2\u0130\u0131\7\n\2\2\u0131\u0139\3\2\2\2\u0132\u0133\79\2\2\u0133\u0134"+
		"\7u\2\2\u0134\u0135\7L\2\2\u0135\u0136\5(\25\2\u0136\u0137\7M\2\2\u0137"+
		"\u0139\3\2\2\2\u0138\u0118\3\2\2\2\u0138\u011e\3\2\2\2\u0138\u012c\3\2"+
		"\2\2\u0138\u0132\3\2\2\2\u0139\'\3\2\2\2\u013a\u013c\5*\26\2\u013b\u013a"+
		"\3\2\2\2\u013c\u013f\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e"+
		")\3\2\2\2\u013f\u013d\3\2\2\2\u0140\u0141\5\36\20\2\u0141\u0142\5,\27"+
		"\2\u0142\u0143\7P\2\2\u0143+\3\2\2\2\u0144\u0146\5.\30\2\u0145\u0144\3"+
		"\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"-\3\2\2\2\u0149\u0147\3\2\2\2\u014a\u014b\5\60\31\2\u014b/\3\2\2\2\u014c"+
		"\u014d\7u\2\2\u014d\61\3\2\2\2\u014e\u014f\7\13\2\2\u014f\u0150\5\36\20"+
		"\2\u0150\u0151\7\f\2\2\u0151\u0152\7u\2\2\u0152\u0153\7P\2\2\u0153\u015b"+
		"\3\2\2\2\u0154\u0155\7\13\2\2\u0155\u0156\5&\24\2\u0156\u0157\7\f\2\2"+
		"\u0157\u0158\7u\2\2\u0158\u0159\7P\2\2\u0159\u015b\3\2\2\2\u015a\u014e"+
		"\3\2\2\2\u015a\u0154\3\2\2\2\u015b\63\3\2\2\2\u015c\u015d\7U\2\2\u015d"+
		"\u0162\5\66\34\2\u015e\u015f\7Q\2\2\u015f\u0161\5\66\34\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2\2\2\u0163"+
		"\u0165\3\2\2\2\u0164\u0162\3\2\2\2\u0165\u0166\7T\2\2\u0166\65\3\2\2\2"+
		"\u0167\u016e\5\36\20\2\u0168\u016b\7X\2\2\u0169\u016a\t\3\2\2\u016a\u016c"+
		"\5\36\20\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2"+
		"\u016d\u0167\3\2\2\2\u016d\u0168\3\2\2\2\u016e\67\3\2\2\2\u016f\u0174"+
		"\5D#\2\u0170\u0171\7Q\2\2\u0171\u0173\5D#\2\u0172\u0170\3\2\2\2\u0173"+
		"\u0176\3\2\2\2\u0174\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u01759\3\2\2\2"+
		"\u0176\u0174\3\2\2\2\u0177\u0179\7J\2\2\u0178\u017a\5<\37\2\u0179\u0178"+
		"\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017c\7K\2\2\u017c"+
		";\3\2\2\2\u017d\u0182\5> \2\u017e\u017f\7Q\2\2\u017f\u0181\5> \2\u0180"+
		"\u017e\3\2\2\2\u0181\u0184\3\2\2\2\u0182\u0180\3\2\2\2\u0182\u0183\3\2"+
		"\2\2\u0183\u0187\3\2\2\2\u0184\u0182\3\2\2\2\u0185\u0186\7Q\2\2\u0186"+
		"\u0188\5@!\2\u0187\u0185\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u018b\3\2\2"+
		"\2\u0189\u018b\5@!\2\u018a\u017d\3\2\2\2\u018a\u0189\3\2\2\2\u018b=\3"+
		"\2\2\2\u018c\u018d\5\36\20\2\u018d\u018e\5\30\r\2\u018e?\3\2\2\2\u018f"+
		"\u0190\5\36\20\2\u0190\u0191\7w\2\2\u0191\u0192\5\30\r\2\u0192A\3\2\2"+
		"\2\u0193\u0194\5H%\2\u0194C\3\2\2\2\u0195\u019a\7u\2\2\u0196\u0197\7R"+
		"\2\2\u0197\u0199\7u\2\2\u0198\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a"+
		"\u0198\3\2\2\2\u019a\u019b\3\2\2\2\u019bE\3\2\2\2\u019c\u019a\3\2\2\2"+
		"\u019d\u019e\t\4\2\2\u019eG\3\2\2\2\u019f\u01a3\7\5\2\2\u01a0\u01a2\5"+
		"J&\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01c0\7\6"+
		"\2\2\u01a7\u01a9\7\7\2\2\u01a8\u01aa\7u\2\2\u01a9\u01a8\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01af\7M\2\2\u01ac\u01ae\5J&"+
		"\2\u01ad\u01ac\3\2\2\2\u01ae\u01b1\3\2\2\2\u01af\u01ad\3\2\2\2\u01af\u01b0"+
		"\3\2\2\2\u01b0\u01b2\3\2\2\2\u01b1\u01af\3\2\2\2\u01b2\u01b4\7\b\2\2\u01b3"+
		"\u01b5\7u\2\2\u01b4\u01b3\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u01b6\3\2"+
		"\2\2\u01b6\u01c0\7M\2\2\u01b7\u01bb\7L\2\2\u01b8\u01ba\5J&\2\u01b9\u01b8"+
		"\3\2\2\2\u01ba\u01bd\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01be\3\2\2\2\u01bd\u01bb\3\2\2\2\u01be\u01c0\7M\2\2\u01bf\u019f\3\2"+
		"\2\2\u01bf\u01a7\3\2\2\2\u01bf\u01b7\3\2\2\2\u01c0I\3\2\2\2\u01c1\u01c4"+
		"\5L\'\2\u01c2\u01c4\5P)\2\u01c3\u01c1\3\2\2\2\u01c3\u01c2\3\2\2\2\u01c4"+
		"K\3\2\2\2\u01c5\u01c6\5N(\2\u01c6\u01c7\7P\2\2\u01c7M\3\2\2\2\u01c8\u01c9"+
		"\5\36\20\2\u01c9\u01ca\5\24\13\2\u01caO\3\2\2\2\u01cb\u021a\5H%\2\u01cc"+
		"\u01cd\7\"\2\2\u01cd\u01ce\5b\62\2\u01ce\u01d1\5P)\2\u01cf\u01d0\7\33"+
		"\2\2\u01d0\u01d2\5P)\2\u01d1\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u021a"+
		"\3\2\2\2\u01d3\u01d5\7!\2\2\u01d4\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5"+
		"\u01d6\3\2\2\2\u01d6\u01d7\7J\2\2\u01d7\u01d8\5V,\2\u01d8\u01d9\7K\2\2"+
		"\u01d9\u01da\5P)\2\u01da\u021a\3\2\2\2\u01db\u01dc\7C\2\2\u01dc\u01dd"+
		"\5b\62\2\u01dd\u01de\5P)\2\u01de\u021a\3\2\2\2\u01df\u01e0\7\31\2\2\u01e0"+
		"\u01e1\5P)\2\u01e1\u01e2\7C\2\2\u01e2\u01e3\5b\62\2\u01e3\u01e4\7P\2\2"+
		"\u01e4\u021a\3\2\2\2\u01e5\u01e6\7;\2\2\u01e6\u01ee\5b\62\2\u01e7\u01ef"+
		"\7L\2\2\u01e8\u01ef\7\5\2\2\u01e9\u01eb\7\7\2\2\u01ea\u01ec\7u\2\2\u01eb"+
		"\u01ea\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed\u01ef\7M"+
		"\2\2\u01ee\u01e7\3\2\2\2\u01ee\u01e8\3\2\2\2\u01ee\u01e9\3\2\2\2\u01ef"+
		"\u01f3\3\2\2\2\u01f0\u01f2\5R*\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2"+
		"\2\u01f3\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f9\3\2\2\2\u01f5\u01f3"+
		"\3\2\2\2\u01f6\u01f8\5T+\2\u01f7\u01f6\3\2\2\2\u01f8\u01fb\3\2\2\2\u01f9"+
		"\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u0203\3\2\2\2\u01fb\u01f9\3\2"+
		"\2\2\u01fc\u0204\7M\2\2\u01fd\u0204\7\6\2\2\u01fe\u0200\7\b\2\2\u01ff"+
		"\u0201\7u\2\2\u0200\u01ff\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0202\3\2"+
		"\2\2\u0202\u0204\7M\2\2\u0203\u01fc\3\2\2\2\u0203\u01fd\3\2\2\2\u0203"+
		"\u01fe\3\2\2\2\u0204\u021a\3\2\2\2\u0205\u0207\7\61\2\2\u0206\u0208\5"+
		"j\66\2\u0207\u0206\3\2\2\2\u0207\u0208\3\2\2\2\u0208\u0209\3\2\2\2\u0209"+
		"\u021a\7P\2\2\u020a\u020c\7\20\2\2\u020b\u020d\7u\2\2\u020c\u020b\3\2"+
		"\2\2\u020c\u020d\3\2\2\2\u020d\u020e\3\2\2\2\u020e\u021a\7P\2\2\u020f"+
		"\u021a\7P\2\2\u0210\u0211\5f\64\2\u0211\u0212\7P\2\2\u0212\u021a\3\2\2"+
		"\2\u0213\u0214\5^\60\2\u0214\u0215\7P\2\2\u0215\u021a\3\2\2\2\u0216\u0217"+
		"\5`\61\2\u0217\u0218\7P\2\2\u0218\u021a\3\2\2\2\u0219\u01cb\3\2\2\2\u0219"+
		"\u01cc\3\2\2\2\u0219\u01d4\3\2\2\2\u0219\u01db\3\2\2\2\u0219\u01df\3\2"+
		"\2\2\u0219\u01e5\3\2\2\2\u0219\u0205\3\2\2\2\u0219\u020a\3\2\2\2\u0219"+
		"\u020f\3\2\2\2\u0219\u0210\3\2\2\2\u0219\u0213\3\2\2\2\u0219\u0216\3\2"+
		"\2\2\u021aQ\3\2\2\2\u021b\u021d\5T+\2\u021c\u021b\3\2\2\2\u021d\u021e"+
		"\3\2\2\2\u021e\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u0221\3\2\2\2\u0220"+
		"\u0222\5J&\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0221\3\2\2"+
		"\2\u0223\u0224\3\2\2\2\u0224S\3\2\2\2\u0225\u0226\7\22\2\2\u0226\u0227"+
		"\5h\65\2\u0227\u0228\7Y\2\2\u0228\u022c\3\2\2\2\u0229\u022a\7\30\2\2\u022a"+
		"\u022c\7Y\2\2\u022b\u0225\3\2\2\2\u022b\u0229\3\2\2\2\u022cU\3\2\2\2\u022d"+
		"\u0238\5Z.\2\u022e\u022f\5X-\2\u022f\u0231\7P\2\2\u0230\u0232\5j\66\2"+
		"\u0231\u0230\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235"+
		"\7P\2\2\u0234\u0236\5\\/\2\u0235\u0234\3\2\2\2\u0235\u0236\3\2\2\2\u0236"+
		"\u0238\3\2\2\2\u0237\u022d\3\2\2\2\u0237\u022e\3\2\2\2\u0238W\3\2\2\2"+
		"\u0239\u023c\5N(\2\u023a\u023c\5d\63\2\u023b\u0239\3\2\2\2\u023b\u023a"+
		"\3\2\2\2\u023cY\3\2\2\2\u023d\u023e\5\36\20\2\u023e\u023f\5\30\r\2\u023f"+
		"\u0240\7Y\2\2\u0240\u0241\5j\66\2\u0241[\3\2\2\2\u0242\u0243\5d\63\2\u0243"+
		"]\3\2\2\2\u0244\u0245\7-\2\2\u0245\u0246\5j\66\2\u0246_\3\2\2\2\u0247"+
		"\u0249\7\62\2\2\u0248\u024a\5\36\20\2\u0249\u0248\3\2\2\2\u0249\u024a"+
		"\3\2\2\2\u024a\u024b\3\2\2\2\u024b\u024c\7\63\2\2\u024c\u024d\5\30\r\2"+
		"\u024da\3\2\2\2\u024e\u024f\7J\2\2\u024f\u0250\5j\66\2\u0250\u0251\7K"+
		"\2\2\u0251c\3\2\2\2\u0252\u0257\5j\66\2\u0253\u0254\7Q\2\2\u0254\u0256"+
		"\5j\66\2\u0255\u0253\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258e\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\5j\66\2"+
		"\u025bg\3\2\2\2\u025c\u025d\5j\66\2\u025di\3\2\2\2\u025e\u025f\b\66\1"+
		"\2\u025f\u027a\5p9\2\u0260\u0261\5l\67\2\u0261\u0262\7N\2\2\u0262\u0263"+
		"\5j\66\2\u0263\u0264\7O\2\2\u0264\u027a\3\2\2\2\u0265\u0266\5l\67\2\u0266"+
		"\u0268\7J\2\2\u0267\u0269\5d\63\2\u0268\u0267\3\2\2\2\u0268\u0269\3\2"+
		"\2\2\u0269\u026a\3\2\2\2\u026a\u026b\7K\2\2\u026b\u027a\3\2\2\2\u026c"+
		"\u026d\7+\2\2\u026d\u027a\5r:\2\u026e\u026f\5l\67\2\u026f\u0270\t\5\2"+
		"\2\u0270\u027a\3\2\2\2\u0271\u0272\t\6\2\2\u0272\u027a\5l\67\2\u0273\u0274"+
		"\t\7\2\2\u0274\u027a\5j\66\13\u0275\u0276\5n8\2\u0276\u0277\t\b\2\2\u0277"+
		"\u0278\5j\66\3\u0278\u027a\3\2\2\2\u0279\u025e\3\2\2\2\u0279\u0260\3\2"+
		"\2\2\u0279\u0265\3\2\2\2\u0279\u026c\3\2\2\2\u0279\u026e\3\2\2\2\u0279"+
		"\u0271\3\2\2\2\u0279\u0273\3\2\2\2\u0279\u0275\3\2\2\2\u027a\u0295\3\2"+
		"\2\2\u027b\u027c\f\n\2\2\u027c\u027d\t\t\2\2\u027d\u0294\5j\66\13\u027e"+
		"\u027f\f\t\2\2\u027f\u0280\t\n\2\2\u0280\u0294\5j\66\n\u0281\u0282\f\b"+
		"\2\2\u0282\u0283\t\13\2\2\u0283\u0294\5j\66\t\u0284\u0285\f\7\2\2\u0285"+
		"\u0286\t\f\2\2\u0286\u0294\5j\66\b\u0287\u0288\f\6\2\2\u0288\u0289\7^"+
		"\2\2\u0289\u0294\5j\66\7\u028a\u028b\f\5\2\2\u028b\u028c\7_\2\2\u028c"+
		"\u0294\5j\66\6\u028d\u028e\f\4\2\2\u028e\u028f\7X\2\2\u028f\u0290\5j\66"+
		"\2\u0290\u0291\7Y\2\2\u0291\u0292\5j\66\5\u0292\u0294\3\2\2\2\u0293\u027b"+
		"\3\2\2\2\u0293\u027e\3\2\2\2\u0293\u0281\3\2\2\2\u0293\u0284\3\2\2\2\u0293"+
		"\u0287\3\2\2\2\u0293\u028a\3\2\2\2\u0293\u028d\3\2\2\2\u0294\u0297\3\2"+
		"\2\2\u0295\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296k\3\2\2\2\u0297\u0295"+
		"\3\2\2\2\u0298\u029c\7u\2\2\u0299\u029a\7d\2\2\u029a\u029c\7u\2\2\u029b"+
		"\u0298\3\2\2\2\u029b\u0299\3\2\2\2\u029cm\3\2\2\2\u029d\u02a6\7u\2\2\u029e"+
		"\u029f\7d\2\2\u029f\u02a6\7u\2\2\u02a0\u02a1\5l\67\2\u02a1\u02a2\7N\2"+
		"\2\u02a2\u02a3\5j\66\2\u02a3\u02a4\7O\2\2\u02a4\u02a6\3\2\2\2\u02a5\u029d"+
		"\3\2\2\2\u02a5\u029e\3\2\2\2\u02a5\u02a0\3\2\2\2\u02a6o\3\2\2\2\u02a7"+
		"\u02a8\7J\2\2\u02a8\u02a9\5j\66\2\u02a9\u02aa\7K\2\2\u02aa\u02b0\3\2\2"+
		"\2\u02ab\u02b0\5F$\2\u02ac\u02b0\7u\2\2\u02ad\u02ae\7d\2\2\u02ae\u02b0"+
		"\7u\2\2\u02af\u02a7\3\2\2\2\u02af\u02ab\3\2\2\2\u02af\u02ac\3\2\2\2\u02af"+
		"\u02ad\3\2\2\2\u02b0q\3\2\2\2\u02b1\u02b2\5t;\2\u02b2\u02b3\5v<\2\u02b3"+
		"s\3\2\2\2\u02b4\u02b7\5$\23\2\u02b5\u02b7\5 \21\2\u02b6\u02b4\3\2\2\2"+
		"\u02b6\u02b5\3\2\2\2\u02b7u\3\2\2\2\u02b8\u02d4\7N\2\2\u02b9\u02be\7O"+
		"\2\2\u02ba\u02bb\7N\2\2\u02bb\u02bd\7O\2\2\u02bc\u02ba\3\2\2\2\u02bd\u02c0"+
		"\3\2\2\2\u02be\u02bc\3\2\2\2\u02be\u02bf\3\2\2\2\u02bf\u02c1\3\2\2\2\u02c0"+
		"\u02be\3\2\2\2\u02c1\u02d5\5\34\17\2\u02c2\u02c3\5j\66\2\u02c3\u02ca\7"+
		"O\2\2\u02c4\u02c5\7N\2\2\u02c5\u02c6\5j\66\2\u02c6\u02c7\7O\2\2\u02c7"+
		"\u02c9\3\2\2\2\u02c8\u02c4\3\2\2\2\u02c9\u02cc\3\2\2\2\u02ca\u02c8\3\2"+
		"\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02d1\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cd"+
		"\u02ce\7N\2\2\u02ce\u02d0\7O\2\2\u02cf\u02cd\3\2\2\2\u02d0\u02d3\3\2\2"+
		"\2\u02d1\u02cf\3\2\2\2\u02d1\u02d2\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3\u02d1"+
		"\3\2\2\2\u02d4\u02b9\3\2\2\2\u02d4\u02c2\3\2\2\2\u02d5w\3\2\2\2\u02d6"+
		"\u02d8\7J\2\2\u02d7\u02d9\5d\63\2\u02d8\u02d7\3\2\2\2\u02d8\u02d9\3\2"+
		"\2\2\u02d9\u02da\3\2\2\2\u02da\u02db\7K\2\2\u02dby\3\2\2\2P{\u0082\u008a"+
		"\u0092\u0098\u00a2\u00a7\u00ab\u00ae\u00ba\u00c4\u00cf\u00d5\u00dc\u00e1"+
		"\u00e9\u00ed\u00ef\u00f8\u0100\u0108\u010b\u010f\u0122\u0128\u0138\u013d"+
		"\u0147\u015a\u0162\u016b\u016d\u0174\u0179\u0182\u0187\u018a\u019a\u01a3"+
		"\u01a9\u01af\u01b4\u01bb\u01bf\u01c3\u01d1\u01d4\u01eb\u01ee\u01f3\u01f9"+
		"\u0200\u0203\u0207\u020c\u0219\u021e\u0223\u022b\u0231\u0235\u0237\u023b"+
		"\u0249\u0257\u0268\u0279\u0293\u0295\u029b\u02a5\u02af\u02b6\u02be\u02ca"+
		"\u02d1\u02d4\u02d8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}