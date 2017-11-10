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
		RULE_compilationUnit = 0, RULE_bodyDeclaration = 1, RULE_variableModifier = 2, 
		RULE_typeBound = 3, RULE_typeList = 4, RULE_memberDeclaration = 5, RULE_methodDeclaration = 6, 
		RULE_fieldDeclaration = 7, RULE_constDeclaration = 8, RULE_constantDeclarator = 9, 
		RULE_variableDeclarators = 10, RULE_variableDeclarator = 11, RULE_variableDeclaratorId = 12, 
		RULE_variableInitializer = 13, RULE_arrayInitializer = 14, RULE_typeType = 15, 
		RULE_pointerType = 16, RULE_structType = 17, RULE_classOrInterfaceType = 18, 
		RULE_primitiveType = 19, RULE_structDefinition = 20, RULE_structDeclarationList = 21, 
		RULE_structDeclaration = 22, RULE_qualifierSpecifierList = 23, RULE_qualifierList = 24, 
		RULE_qualifier = 25, RULE_structDeclaratorList = 26, RULE_structDeclarator = 27, 
		RULE_structDeclaratorId = 28, RULE_typeDefinition = 29, RULE_typeArguments = 30, 
		RULE_typeArgument = 31, RULE_qualifiedNameList = 32, RULE_formalParameters = 33, 
		RULE_formalParameterList = 34, RULE_formalParameter = 35, RULE_lastFormalParameter = 36, 
		RULE_methodBody = 37, RULE_qualifiedName = 38, RULE_literal = 39, RULE_block = 40, 
		RULE_blockStatement = 41, RULE_localVariableDeclarationStatement = 42, 
		RULE_localVariableDeclaration = 43, RULE_statement = 44, RULE_switchBlockStatementGroup = 45, 
		RULE_switchLabel = 46, RULE_forControl = 47, RULE_forInit = 48, RULE_enhancedForControl = 49, 
		RULE_forUpdate = 50, RULE_outputStatement = 51, RULE_outputValue = 52, 
		RULE_inputStatement = 53, RULE_parExpression = 54, RULE_expressionList = 55, 
		RULE_statementExpression = 56, RULE_constantExpression = 57, RULE_expression = 58, 
		RULE_primary = 59, RULE_arrayCreatorRest = 60, RULE_arguments = 61;
	public static final String[] ruleNames = {
		"compilationUnit", "bodyDeclaration", "variableModifier", "typeBound", 
		"typeList", "memberDeclaration", "methodDeclaration", "fieldDeclaration", 
		"constDeclaration", "constantDeclarator", "variableDeclarators", "variableDeclarator", 
		"variableDeclaratorId", "variableInitializer", "arrayInitializer", "typeType", 
		"pointerType", "structType", "classOrInterfaceType", "primitiveType", 
		"structDefinition", "structDeclarationList", "structDeclaration", "qualifierSpecifierList", 
		"qualifierList", "qualifier", "structDeclaratorList", "structDeclarator", 
		"structDeclaratorId", "typeDefinition", "typeArguments", "typeArgument", 
		"qualifiedNameList", "formalParameters", "formalParameterList", "formalParameter", 
		"lastFormalParameter", "methodBody", "qualifiedName", "literal", "block", 
		"blockStatement", "localVariableDeclarationStatement", "localVariableDeclaration", 
		"statement", "switchBlockStatementGroup", "switchLabel", "forControl", 
		"forInit", "enhancedForControl", "forUpdate", "outputStatement", "outputValue", 
		"inputStatement", "parExpression", "expressionList", "statementExpression", 
		"constantExpression", "expression", "primary", "arrayCreatorRest", "arguments"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'final'", "'ACT'", "'starring'", "'{A}'", "'{Z}'", "'{SCENE'", 
		"'{END'", "'SCENE'", "'END'", "'cast'", "'as'", "'template'", "'assert'", 
		"'boolean'", "'break'", "'byte'", "'version'", "'catch'", "'char'", "'script'", 
		"'const'", "'continue'", "'original'", "'rehearse'", "'double'", "'else'", 
		"'enum'", null, "'permanent'", "'finally'", "'float'", "'replay'", "'if'", 
		"'goto'", "'that can'", "'take'", "'can act as'", "'int'", "'interface'", 
		"'long'", "'native'", "'new'", "'from'", "'Say'", "'secret'", "'hereditary'", 
		"'universal'", "'give'", "'Write'", "'to'", "'short'", "'The'", "'static'", 
		"'strictfp'", "'string'", "'composition'", "'super'", "'switch'", "'synchronized'", 
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
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(124);
				bodyDeclaration();
				}
				break;
			}
			setState(127);
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
	}

	public final BodyDeclarationContext bodyDeclaration() throws RecognitionException {
		BodyDeclarationContext _localctx = new BodyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_bodyDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0) || _la==Identifier) {
				{
				{
				setState(129);
				memberDeclaration();
				}
				}
				setState(134);
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
		enterRule(_localctx, 4, RULE_variableModifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
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
		enterRule(_localctx, 6, RULE_typeBound);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			typeType();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BITAND) {
				{
				{
				setState(138);
				match(BITAND);
				setState(139);
				typeType();
				}
				}
				setState(144);
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
	}

	public final TypeListContext typeList() throws RecognitionException {
		TypeListContext _localctx = new TypeListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_typeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			typeType();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(146);
				match(COMMA);
				setState(147);
				typeType();
				}
				}
				setState(152);
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
		enterRule(_localctx, 10, RULE_memberDeclaration);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				methodDeclaration();
				}
				break;
			case BOOLEAN:
			case BYTE:
			case CHAR:
			case DOUBLE:
			case FINAL:
			case FLOAT:
			case INT:
			case LONG:
			case SHORT:
			case STRING:
			case STRUCT:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				fieldDeclaration();
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
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__1);
			setState(158);
			match(Identifier);
			setState(159);
			match(T__2);
			setState(160);
			formalParameters();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(161);
				match(LBRACK);
				setState(162);
				match(RBRACK);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==THROWS) {
				{
				setState(168);
				match(THROWS);
				setState(169);
				qualifiedNameList();
				}
			}

			setState(174);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
			case T__5:
			case LBRACE:
				{
				setState(172);
				methodBody();
				}
				break;
			case SEMI:
				{
				setState(173);
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
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fieldDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FINAL) {
				{
				setState(176);
				match(FINAL);
				}
			}

			setState(179);
			typeType();
			setState(180);
			variableDeclarators();
			setState(181);
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
	}

	public final ConstDeclarationContext constDeclaration() throws RecognitionException {
		ConstDeclarationContext _localctx = new ConstDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_constDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			typeType();
			setState(184);
			constantDeclarator();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(185);
				match(COMMA);
				setState(186);
				constantDeclarator();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
		enterRule(_localctx, 18, RULE_constantDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(Identifier);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(195);
				match(LBRACK);
				setState(196);
				match(RBRACK);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(ASSIGN);
			setState(203);
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
	}

	public final VariableDeclaratorsContext variableDeclarators() throws RecognitionException {
		VariableDeclaratorsContext _localctx = new VariableDeclaratorsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclarators);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			variableDeclarator();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(207);
				variableDeclarator();
				}
				}
				setState(212);
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
		enterRule(_localctx, 22, RULE_variableDeclarator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			variableDeclaratorId();
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(214);
				match(ASSIGN);
				setState(215);
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
		enterRule(_localctx, 24, RULE_variableDeclaratorId);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(Identifier);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LBRACK) {
				{
				{
				setState(219);
				match(LBRACK);
				setState(220);
				match(RBRACK);
				}
				}
				setState(225);
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
		enterRule(_localctx, 26, RULE_variableInitializer);
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
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
				setState(227);
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
		enterRule(_localctx, 28, RULE_arrayInitializer);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(LBRACE);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (LBRACE - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
				{
				setState(231);
				variableInitializer();
				setState(236);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(232);
						match(COMMA);
						setState(233);
						variableInitializer();
						}
						} 
					}
					setState(238);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(239);
					match(COMMA);
					}
				}

				}
			}

			setState(244);
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
	}

	public final TypeTypeContext typeType() throws RecognitionException {
		TypeTypeContext _localctx = new TypeTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_typeType);
		int _la;
		try {
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				pointerType();
				setState(251);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(247);
					match(LBRACK);
					setState(248);
					match(RBRACK);
					}
					}
					setState(253);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(254);
				primitiveType();
				setState(259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(255);
					match(LBRACK);
					setState(256);
					match(RBRACK);
					}
					}
					setState(261);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(262);
				structType();
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(263);
					match(LBRACK);
					setState(264);
					match(RBRACK);
					}
					}
					setState(269);
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
		enterRule(_localctx, 32, RULE_pointerType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
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
				setState(272);
				primitiveType();
				}
				break;
			case Identifier:
				{
				setState(273);
				classOrInterfaceType();
				}
				break;
			case STRUCT:
				{
				setState(274);
				structType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(277);
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
		enterRule(_localctx, 34, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(STRUCT);
			setState(280);
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
		enterRule(_localctx, 36, RULE_classOrInterfaceType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(Identifier);
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(283);
				typeArguments();
				}
			}

			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(286);
				match(DOT);
				setState(287);
				match(Identifier);
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LT) {
					{
					setState(288);
					typeArguments();
					}
				}

				}
				}
				setState(295);
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
		enterRule(_localctx, 38, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
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
		enterRule(_localctx, 40, RULE_structDefinition);
		int _la;
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				match(STRUCT);
				setState(299);
				match(Identifier);
				setState(300);
				match(T__3);
				setState(301);
				structDeclarationList();
				setState(302);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(STRUCT);
				setState(305);
				match(Identifier);
				setState(306);
				match(T__5);
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(307);
					match(Identifier);
					}
				}

				setState(310);
				match(RBRACE);
				setState(311);
				structDeclarationList();
				setState(312);
				match(T__6);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(313);
					match(Identifier);
					}
				}

				setState(316);
				match(RBRACE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(318);
				match(STRUCT);
				setState(319);
				match(Identifier);
				setState(320);
				match(T__7);
				setState(321);
				structDeclarationList();
				setState(322);
				match(T__8);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
				match(STRUCT);
				setState(325);
				match(Identifier);
				setState(326);
				match(LBRACE);
				setState(327);
				structDeclarationList();
				setState(328);
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
		enterRule(_localctx, 42, RULE_structDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FINAL) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STATIC) | (1L << STRING) | (1L << STRUCT))) != 0) || _la==Identifier) {
				{
				{
				setState(332);
				structDeclaration();
				}
				}
				setState(337);
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
		enterRule(_localctx, 44, RULE_structDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			qualifierSpecifierList();
			setState(339);
			structDeclaratorList();
			setState(340);
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
		enterRule(_localctx, 46, RULE_qualifierSpecifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(342);
				qualifierList();
				}
				break;
			}
			setState(345);
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
		enterRule(_localctx, 48, RULE_qualifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FINAL || _la==STATIC) {
				{
				{
				setState(347);
				qualifier();
				}
				}
				setState(352);
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
		enterRule(_localctx, 50, RULE_qualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
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
		enterRule(_localctx, 52, RULE_structDeclaratorList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Identifier) {
				{
				{
				setState(355);
				structDeclarator();
				}
				}
				setState(360);
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
		enterRule(_localctx, 54, RULE_structDeclarator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		enterRule(_localctx, 56, RULE_structDeclaratorId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
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
		enterRule(_localctx, 58, RULE_typeDefinition);
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(T__9);
				setState(366);
				typeType();
				setState(367);
				match(T__10);
				setState(368);
				match(Identifier);
				setState(369);
				match(SEMI);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(371);
				match(T__9);
				setState(372);
				structDefinition();
				setState(373);
				match(T__10);
				setState(374);
				match(Identifier);
				setState(375);
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
		enterRule(_localctx, 60, RULE_typeArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(LT);
			setState(380);
			typeArgument();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(381);
				match(COMMA);
				setState(382);
				typeArgument();
				}
				}
				setState(387);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(388);
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
		enterRule(_localctx, 62, RULE_typeArgument);
		int _la;
		try {
			setState(396);
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
				setState(390);
				typeType();
				}
				break;
			case QUESTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(391);
				match(QUESTION);
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXTENDS || _la==SUPER) {
					{
					setState(392);
					_la = _input.LA(1);
					if ( !(_la==EXTENDS || _la==SUPER) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(393);
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
		enterRule(_localctx, 64, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			qualifiedName();
			setState(403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(399);
				match(COMMA);
				setState(400);
				qualifiedName();
				}
				}
				setState(405);
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
		enterRule(_localctx, 66, RULE_formalParameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(LPAREN);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0) || _la==Identifier) {
				{
				setState(407);
				formalParameterList();
				}
			}

			setState(410);
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
		enterRule(_localctx, 68, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(425);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(412);
				formalParameter();
				setState(417);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(413);
						match(COMMA);
						setState(414);
						formalParameter();
						}
						} 
					}
					setState(419);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
				}
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(420);
					match(COMMA);
					setState(421);
					lastFormalParameter();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(424);
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
		enterRule(_localctx, 70, RULE_formalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(427);
				variableModifier();
				}
				}
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(433);
			typeType();
			setState(434);
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
		enterRule(_localctx, 72, RULE_lastFormalParameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(436);
				variableModifier();
				}
				}
				setState(441);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(442);
			typeType();
			setState(443);
			match(ELLIPSIS);
			setState(444);
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
		enterRule(_localctx, 74, RULE_methodBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
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
		enterRule(_localctx, 76, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(Identifier);
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(449);
				match(DOT);
				setState(450);
				match(Identifier);
				}
				}
				setState(455);
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
		enterRule(_localctx, 78, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
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
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_block);
		int _la;
		try {
			setState(490);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				match(T__3);
				setState(462);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(459);
					blockStatement();
					}
					}
					setState(464);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(465);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(T__5);
				setState(468);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(467);
					match(Identifier);
					}
				}

				setState(470);
				match(RBRACE);
				setState(474);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(471);
					blockStatement();
					}
					}
					setState(476);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(477);
				match(T__6);
				setState(479);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(478);
					match(Identifier);
					}
				}

				setState(481);
				match(RBRACE);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 3);
				{
				setState(482);
				match(LBRACE);
				setState(486);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0)) {
					{
					{
					setState(483);
					blockStatement();
					}
					}
					setState(488);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(489);
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
	}

	public final BlockStatementContext blockStatement() throws RecognitionException {
		BlockStatementContext _localctx = new BlockStatementContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_blockStatement);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(492);
				localVariableDeclarationStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(493);
				statement();
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
		enterRule(_localctx, 84, RULE_localVariableDeclarationStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(496);
			localVariableDeclaration();
			setState(497);
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
		enterRule(_localctx, 86, RULE_localVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(499);
			typeType();
			setState(500);
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
		public TerminalNode RETURN() { return getToken(ManuScriptParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode BREAK() { return getToken(ManuScriptParser.BREAK, 0); }
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
		enterRule(_localctx, 88, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(579);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(502);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(503);
				match(IF);
				setState(504);
				parExpression();
				setState(505);
				statement();
				setState(508);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(506);
					match(ELSE);
					setState(507);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(511);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(510);
					match(FOR);
					}
				}

				setState(513);
				match(LPAREN);
				setState(514);
				forControl();
				setState(515);
				match(RPAREN);
				setState(516);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				match(WHILE);
				setState(519);
				parExpression();
				setState(520);
				statement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(522);
				match(DO);
				setState(523);
				statement();
				setState(524);
				match(WHILE);
				setState(525);
				parExpression();
				setState(526);
				match(SEMI);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(528);
				match(SWITCH);
				setState(529);
				parExpression();
				setState(537);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(530);
					match(LBRACE);
					}
					break;
				case T__3:
					{
					setState(531);
					match(T__3);
					}
					break;
				case T__5:
					{
					setState(532);
					match(T__5);
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
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(542);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(539);
						switchBlockStatementGroup();
						}
						} 
					}
					setState(544);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CASE || _la==DEFAULT) {
					{
					{
					setState(545);
					switchLabel();
					}
					}
					setState(550);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(558);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case RBRACE:
					{
					setState(551);
					match(RBRACE);
					}
					break;
				case T__4:
					{
					setState(552);
					match(T__4);
					}
					break;
				case T__6:
					{
					setState(553);
					match(T__6);
					setState(555);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Identifier) {
						{
						setState(554);
						match(Identifier);
						}
					}

					setState(557);
					match(RBRACE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(560);
				match(RETURN);
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(561);
					expression(0);
					}
				}

				setState(564);
				match(SEMI);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(565);
				match(BREAK);
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(566);
					match(Identifier);
					}
				}

				setState(569);
				match(SEMI);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(570);
				match(SEMI);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(571);
				statementExpression();
				setState(572);
				match(SEMI);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(574);
				match(Identifier);
				setState(575);
				match(COLON);
				setState(576);
				statement();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(577);
				outputStatement();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(578);
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
		enterRule(_localctx, 90, RULE_switchBlockStatementGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(581);
				switchLabel();
				}
				}
				setState(584); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CASE || _la==DEFAULT );
			setState(587); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(586);
				blockStatement();
				}
				}
				setState(589); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << BOOLEAN) | (1L << BREAK) | (1L << BYTE) | (1L << CHAR) | (1L << DO) | (1L << DOUBLE) | (1L << FLOAT) | (1L << FOR) | (1L << IF) | (1L << INT) | (1L << LONG) | (1L << PRINT) | (1L << RETURN) | (1L << SCAN) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT) | (1L << SWITCH))) != 0) || ((((_la - 66)) & ~0x3f) == 0 && ((1L << (_la - 66)) & ((1L << (WHILE - 66)) | (1L << (IntegerLiteral - 66)) | (1L << (FloatingPointLiteral - 66)) | (1L << (BooleanLiteral - 66)) | (1L << (CharacterLiteral - 66)) | (1L << (StringLiteral - 66)) | (1L << (NullLiteral - 66)) | (1L << (LPAREN - 66)) | (1L << (LBRACE - 66)) | (1L << (SEMI - 66)) | (1L << (BANG - 66)) | (1L << (TILDE - 66)) | (1L << (INC - 66)) | (1L << (DEC - 66)) | (1L << (ADD - 66)) | (1L << (SUB - 66)) | (1L << (MUL - 66)) | (1L << (Identifier - 66)))) != 0) );
			}
		}
		catch (RecognitionException re) {
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
	}

	public final SwitchLabelContext switchLabel() throws RecognitionException {
		SwitchLabelContext _localctx = new SwitchLabelContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_switchLabel);
		try {
			setState(597);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CASE:
				enterOuterAlt(_localctx, 1);
				{
				setState(591);
				match(CASE);
				setState(592);
				constantExpression();
				setState(593);
				match(COLON);
				}
				break;
			case DEFAULT:
				enterOuterAlt(_localctx, 2);
				{
				setState(595);
				match(DEFAULT);
				setState(596);
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
	}

	public final ForControlContext forControl() throws RecognitionException {
		ForControlContext _localctx = new ForControlContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_forControl);
		int _la;
		try {
			setState(611);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(599);
				enhancedForControl();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0) || ((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(600);
					forInit();
					}
				}

				setState(603);
				match(SEMI);
				setState(605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(604);
					expression(0);
					}
				}

				setState(607);
				match(SEMI);
				setState(609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
					{
					setState(608);
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
		enterRule(_localctx, 96, RULE_forInit);
		try {
			setState(615);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(613);
				localVariableDeclaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(614);
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
		enterRule(_localctx, 98, RULE_enhancedForControl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(620);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(617);
				variableModifier();
				}
				}
				setState(622);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(623);
			typeType();
			setState(624);
			variableDeclaratorId();
			setState(625);
			match(COLON);
			setState(626);
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
		enterRule(_localctx, 100, RULE_forUpdate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
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
		enterRule(_localctx, 102, RULE_outputStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(PRINT);
			setState(631);
			outputValue();
			setState(636);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(632);
					match(ADD);
					setState(633);
					outputValue();
					}
					} 
				}
				setState(638);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
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
		enterRule(_localctx, 104, RULE_outputValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
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
		enterRule(_localctx, 106, RULE_inputStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(641);
			match(SCAN);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << BYTE) | (1L << CHAR) | (1L << DOUBLE) | (1L << FLOAT) | (1L << INT) | (1L << LONG) | (1L << SHORT) | (1L << STRING) | (1L << STRUCT))) != 0) || _la==Identifier) {
				{
				setState(642);
				typeType();
				}
			}

			setState(645);
			match(SCANTO);
			setState(646);
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
		enterRule(_localctx, 108, RULE_parExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(LPAREN);
			setState(649);
			expression(0);
			setState(650);
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
		enterRule(_localctx, 110, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			expression(0);
			setState(657);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(653);
				match(COMMA);
				setState(654);
				expression(0);
				}
				}
				setState(659);
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
		enterRule(_localctx, 112, RULE_statementExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
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
		enterRule(_localctx, 114, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
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
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(670);
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

				setState(665);
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
				setState(666);
				_la = _input.LA(1);
				if ( !(((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (INC - 95)) | (1L << (DEC - 95)) | (1L << (ADD - 95)) | (1L << (SUB - 95)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(667);
				expression(10);
				}
				break;
			case BANG:
			case TILDE:
				{
				_localctx = new NegationExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(668);
				_la = _input.LA(1);
				if ( !(_la==BANG || _la==TILDE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(669);
				expression(9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(714);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(712);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new MultDivModExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(672);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(673);
						_la = _input.LA(1);
						if ( !(((((_la - 99)) & ~0x3f) == 0 && ((1L << (_la - 99)) & ((1L << (MUL - 99)) | (1L << (DIV - 99)) | (1L << (MOD - 99)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(674);
						expression(9);
						}
						break;
					case 2:
						{
						_localctx = new AddSubExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(675);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(676);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(677);
						expression(8);
						}
						break;
					case 3:
						{
						_localctx = new ComparisonExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(678);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(679);
						_la = _input.LA(1);
						if ( !(((((_la - 83)) & ~0x3f) == 0 && ((1L << (_la - 83)) & ((1L << (GT - 83)) | (1L << (LT - 83)) | (1L << (LE - 83)) | (1L << (GE - 83)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(680);
						expression(7);
						}
						break;
					case 4:
						{
						_localctx = new EqualityExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(681);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(682);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOTEQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(683);
						expression(6);
						}
						break;
					case 5:
						{
						_localctx = new AndExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(684);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(685);
						match(AND);
						setState(686);
						expression(5);
						}
						break;
					case 6:
						{
						_localctx = new OrExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(687);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(688);
						match(OR);
						setState(689);
						expression(4);
						}
						break;
					case 7:
						{
						_localctx = new OneLineIfExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(690);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(691);
						match(QUESTION);
						setState(692);
						expression(0);
						setState(693);
						match(COLON);
						setState(694);
						expression(3);
						}
						break;
					case 8:
						{
						_localctx = new AssignExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(696);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(697);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ASSIGN - 82)) | (1L << (ADD_ASSIGN - 82)) | (1L << (SUB_ASSIGN - 82)) | (1L << (MUL_ASSIGN - 82)) | (1L << (DIV_ASSIGN - 82)) | (1L << (MOD_ASSIGN - 82)))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(698);
						expression(1);
						}
						break;
					case 9:
						{
						_localctx = new ArrayExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(699);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(700);
						match(LBRACK);
						setState(701);
						expression(0);
						setState(702);
						match(RBRACK);
						}
						break;
					case 10:
						{
						_localctx = new FunctionExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(704);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(705);
						match(LPAREN);
						setState(707);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
							{
							setState(706);
							expressionList();
							}
						}

						setState(709);
						match(RPAREN);
						}
						break;
					case 11:
						{
						_localctx = new PostIncDecExprContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(710);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(711);
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
				setState(716);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
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
		enterRule(_localctx, 118, RULE_primary);
		try {
			setState(725);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAREN:
				enterOuterAlt(_localctx, 1);
				{
				setState(717);
				match(LPAREN);
				setState(718);
				expression(0);
				setState(719);
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
				setState(721);
				literal();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 3);
				{
				setState(722);
				match(Identifier);
				}
				break;
			case MUL:
				enterOuterAlt(_localctx, 4);
				{
				setState(723);
				match(MUL);
				setState(724);
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
		enterRule(_localctx, 120, RULE_arrayCreatorRest);
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
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
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
					_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
				}
				setState(752);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LBRACK) {
					{
					{
					setState(748);
					match(LBRACK);
					setState(749);
					match(RBRACK);
					}
					}
					setState(754);
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
		enterRule(_localctx, 122, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(LPAREN);
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & ((1L << (IntegerLiteral - 67)) | (1L << (FloatingPointLiteral - 67)) | (1L << (BooleanLiteral - 67)) | (1L << (CharacterLiteral - 67)) | (1L << (StringLiteral - 67)) | (1L << (NullLiteral - 67)) | (1L << (LPAREN - 67)) | (1L << (BANG - 67)) | (1L << (TILDE - 67)) | (1L << (INC - 67)) | (1L << (DEC - 67)) | (1L << (ADD - 67)) | (1L << (SUB - 67)) | (1L << (MUL - 67)) | (1L << (Identifier - 67)))) != 0)) {
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
		case 58:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3{\u02fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\3\2\5\2\u0080\n\2\3\2\3\2\3\3\7\3\u0085\n\3\f\3\16\3\u0088"+
		"\13\3\3\4\3\4\3\5\3\5\3\5\7\5\u008f\n\5\f\5\16\5\u0092\13\5\3\6\3\6\3"+
		"\6\7\6\u0097\n\6\f\6\16\6\u009a\13\6\3\7\3\7\5\7\u009e\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\7\b\u00a6\n\b\f\b\16\b\u00a9\13\b\3\b\3\b\5\b\u00ad\n\b\3"+
		"\b\3\b\5\b\u00b1\n\b\3\t\5\t\u00b4\n\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n"+
		"\7\n\u00be\n\n\f\n\16\n\u00c1\13\n\3\n\3\n\3\13\3\13\3\13\7\13\u00c8\n"+
		"\13\f\13\16\13\u00cb\13\13\3\13\3\13\3\13\3\f\3\f\3\f\7\f\u00d3\n\f\f"+
		"\f\16\f\u00d6\13\f\3\r\3\r\3\r\5\r\u00db\n\r\3\16\3\16\3\16\7\16\u00e0"+
		"\n\16\f\16\16\16\u00e3\13\16\3\17\3\17\5\17\u00e7\n\17\3\20\3\20\3\20"+
		"\3\20\7\20\u00ed\n\20\f\20\16\20\u00f0\13\20\3\20\5\20\u00f3\n\20\5\20"+
		"\u00f5\n\20\3\20\3\20\3\21\3\21\3\21\7\21\u00fc\n\21\f\21\16\21\u00ff"+
		"\13\21\3\21\3\21\3\21\7\21\u0104\n\21\f\21\16\21\u0107\13\21\3\21\3\21"+
		"\3\21\7\21\u010c\n\21\f\21\16\21\u010f\13\21\5\21\u0111\n\21\3\22\3\22"+
		"\3\22\5\22\u0116\n\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\5\24\u011f\n"+
		"\24\3\24\3\24\3\24\5\24\u0124\n\24\7\24\u0126\n\24\f\24\16\24\u0129\13"+
		"\24\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0137"+
		"\n\26\3\26\3\26\3\26\3\26\5\26\u013d\n\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u014d\n\26\3\27\7\27\u0150"+
		"\n\27\f\27\16\27\u0153\13\27\3\30\3\30\3\30\3\30\3\31\5\31\u015a\n\31"+
		"\3\31\3\31\3\32\7\32\u015f\n\32\f\32\16\32\u0162\13\32\3\33\3\33\3\34"+
		"\7\34\u0167\n\34\f\34\16\34\u016a\13\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u017c\n\37\3 "+
		"\3 \3 \3 \7 \u0182\n \f \16 \u0185\13 \3 \3 \3!\3!\3!\3!\5!\u018d\n!\5"+
		"!\u018f\n!\3\"\3\"\3\"\7\"\u0194\n\"\f\"\16\"\u0197\13\"\3#\3#\5#\u019b"+
		"\n#\3#\3#\3$\3$\3$\7$\u01a2\n$\f$\16$\u01a5\13$\3$\3$\5$\u01a9\n$\3$\5"+
		"$\u01ac\n$\3%\7%\u01af\n%\f%\16%\u01b2\13%\3%\3%\3%\3&\7&\u01b8\n&\f&"+
		"\16&\u01bb\13&\3&\3&\3&\3&\3\'\3\'\3(\3(\3(\7(\u01c6\n(\f(\16(\u01c9\13"+
		"(\3)\3)\3*\3*\7*\u01cf\n*\f*\16*\u01d2\13*\3*\3*\3*\5*\u01d7\n*\3*\3*"+
		"\7*\u01db\n*\f*\16*\u01de\13*\3*\3*\5*\u01e2\n*\3*\3*\3*\7*\u01e7\n*\f"+
		"*\16*\u01ea\13*\3*\5*\u01ed\n*\3+\3+\5+\u01f1\n+\3,\3,\3,\3-\3-\3-\3."+
		"\3.\3.\3.\3.\3.\5.\u01ff\n.\3.\5.\u0202\n.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0219\n.\3.\5.\u021c\n.\3.\7."+
		"\u021f\n.\f.\16.\u0222\13.\3.\7.\u0225\n.\f.\16.\u0228\13.\3.\3.\3.\3"+
		".\5.\u022e\n.\3.\5.\u0231\n.\3.\3.\5.\u0235\n.\3.\3.\3.\5.\u023a\n.\3"+
		".\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u0246\n.\3/\6/\u0249\n/\r/\16/\u024a\3"+
		"/\6/\u024e\n/\r/\16/\u024f\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u0258\n"+
		"\60\3\61\3\61\5\61\u025c\n\61\3\61\3\61\5\61\u0260\n\61\3\61\3\61\5\61"+
		"\u0264\n\61\5\61\u0266\n\61\3\62\3\62\5\62\u026a\n\62\3\63\7\63\u026d"+
		"\n\63\f\63\16\63\u0270\13\63\3\63\3\63\3\63\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\65\3\65\7\65\u027d\n\65\f\65\16\65\u0280\13\65\3\66\3\66\3\67\3"+
		"\67\5\67\u0286\n\67\3\67\3\67\3\67\38\38\38\38\39\39\39\79\u0292\n9\f"+
		"9\169\u0295\139\3:\3:\3;\3;\3<\3<\3<\3<\3<\3<\5<\u02a1\n<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<\3<"+
		"\3<\3<\3<\3<\3<\3<\3<\3<\5<\u02c6\n<\3<\3<\3<\7<\u02cb\n<\f<\16<\u02ce"+
		"\13<\3=\3=\3=\3=\3=\3=\3=\3=\5=\u02d8\n=\3>\3>\3>\3>\7>\u02de\n>\f>\16"+
		">\u02e1\13>\3>\3>\3>\3>\3>\3>\3>\7>\u02ea\n>\f>\16>\u02ed\13>\3>\3>\7"+
		">\u02f1\n>\f>\16>\u02f4\13>\5>\u02f6\n>\3?\3?\5?\u02fa\n?\3?\3?\3?\2\3"+
		"v@\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"FHJLNPRTVXZ\\^`bdfhjlnprtvxz|\2\17\13\2\20\20\22\22\25\25\33\33!!((**"+
		"\65\6599\4\2\37\37\67\67\4\2\36\36;;\3\2EJ\4\2IIvv\3\2ad\3\2WX\4\2efj"+
		"j\3\2cd\4\2UV\\]\4\2[[^^\5\2TTknrr\3\2ab\2\u0332\2\177\3\2\2\2\4\u0086"+
		"\3\2\2\2\6\u0089\3\2\2\2\b\u008b\3\2\2\2\n\u0093\3\2\2\2\f\u009d\3\2\2"+
		"\2\16\u009f\3\2\2\2\20\u00b3\3\2\2\2\22\u00b9\3\2\2\2\24\u00c4\3\2\2\2"+
		"\26\u00cf\3\2\2\2\30\u00d7\3\2\2\2\32\u00dc\3\2\2\2\34\u00e6\3\2\2\2\36"+
		"\u00e8\3\2\2\2 \u0110\3\2\2\2\"\u0115\3\2\2\2$\u0119\3\2\2\2&\u011c\3"+
		"\2\2\2(\u012a\3\2\2\2*\u014c\3\2\2\2,\u0151\3\2\2\2.\u0154\3\2\2\2\60"+
		"\u0159\3\2\2\2\62\u0160\3\2\2\2\64\u0163\3\2\2\2\66\u0168\3\2\2\28\u016b"+
		"\3\2\2\2:\u016d\3\2\2\2<\u017b\3\2\2\2>\u017d\3\2\2\2@\u018e\3\2\2\2B"+
		"\u0190\3\2\2\2D\u0198\3\2\2\2F\u01ab\3\2\2\2H\u01b0\3\2\2\2J\u01b9\3\2"+
		"\2\2L\u01c0\3\2\2\2N\u01c2\3\2\2\2P\u01ca\3\2\2\2R\u01ec\3\2\2\2T\u01f0"+
		"\3\2\2\2V\u01f2\3\2\2\2X\u01f5\3\2\2\2Z\u0245\3\2\2\2\\\u0248\3\2\2\2"+
		"^\u0257\3\2\2\2`\u0265\3\2\2\2b\u0269\3\2\2\2d\u026e\3\2\2\2f\u0276\3"+
		"\2\2\2h\u0278\3\2\2\2j\u0281\3\2\2\2l\u0283\3\2\2\2n\u028a\3\2\2\2p\u028e"+
		"\3\2\2\2r\u0296\3\2\2\2t\u0298\3\2\2\2v\u02a0\3\2\2\2x\u02d7\3\2\2\2z"+
		"\u02d9\3\2\2\2|\u02f7\3\2\2\2~\u0080\5\4\3\2\177~\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\2\2\3\u0082\3\3\2\2\2\u0083\u0085"+
		"\5\f\7\2\u0084\u0083\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\5\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7\3\2\2"+
		"\u008a\7\3\2\2\2\u008b\u0090\5 \21\2\u008c\u008d\7g\2\2\u008d\u008f\5"+
		" \21\2\u008e\u008c\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090"+
		"\u0091\3\2\2\2\u0091\t\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0098\5 \21\2"+
		"\u0094\u0095\7R\2\2\u0095\u0097\5 \21\2\u0096\u0094\3\2\2\2\u0097\u009a"+
		"\3\2\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\13\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009e\5\16\b\2\u009c\u009e\5\20\t\2\u009d\u009b\3"+
		"\2\2\2\u009d\u009c\3\2\2\2\u009e\r\3\2\2\2\u009f\u00a0\7\4\2\2\u00a0\u00a1"+
		"\7v\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a7\5D#\2\u00a3\u00a4\7O\2\2\u00a4"+
		"\u00a6\7P\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00ac\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7@\2\2\u00ab\u00ad\5B\"\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2"+
		"\2\u00ad\u00b0\3\2\2\2\u00ae\u00b1\5L\'\2\u00af\u00b1\7Q\2\2\u00b0\u00ae"+
		"\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1\17\3\2\2\2\u00b2\u00b4\7\37\2\2\u00b3"+
		"\u00b2\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\5 "+
		"\21\2\u00b6\u00b7\5\26\f\2\u00b7\u00b8\7Q\2\2\u00b8\21\3\2\2\2\u00b9\u00ba"+
		"\5 \21\2\u00ba\u00bf\5\24\13\2\u00bb\u00bc\7R\2\2\u00bc\u00be\5\24\13"+
		"\2\u00bd\u00bb\3\2\2\2\u00be\u00c1\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00c2\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c2\u00c3\7Q\2\2\u00c3"+
		"\23\3\2\2\2\u00c4\u00c9\7v\2\2\u00c5\u00c6\7O\2\2\u00c6\u00c8\7P\2\2\u00c7"+
		"\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2"+
		"\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc\u00cd\7T\2\2\u00cd"+
		"\u00ce\5\34\17\2\u00ce\25\3\2\2\2\u00cf\u00d4\5\30\r\2\u00d0\u00d1\7R"+
		"\2\2\u00d1\u00d3\5\30\r\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4"+
		"\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\27\3\2\2\2\u00d6\u00d4\3\2\2"+
		"\2\u00d7\u00da\5\32\16\2\u00d8\u00d9\7T\2\2\u00d9\u00db\5\34\17\2\u00da"+
		"\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\31\3\2\2\2\u00dc\u00e1\7v\2\2"+
		"\u00dd\u00de\7O\2\2\u00de\u00e0\7P\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e3"+
		"\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\33\3\2\2\2\u00e3"+
		"\u00e1\3\2\2\2\u00e4\u00e7\5\36\20\2\u00e5\u00e7\5v<\2\u00e6\u00e4\3\2"+
		"\2\2\u00e6\u00e5\3\2\2\2\u00e7\35\3\2\2\2\u00e8\u00f4\7M\2\2\u00e9\u00ee"+
		"\5\34\17\2\u00ea\u00eb\7R\2\2\u00eb\u00ed\5\34\17\2\u00ec\u00ea\3\2\2"+
		"\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2"+
		"\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00f3\7R\2\2\u00f2\u00f1\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00e9\3\2\2\2\u00f4\u00f5\3\2"+
		"\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f7\7N\2\2\u00f7\37\3\2\2\2\u00f8\u00fd"+
		"\5\"\22\2\u00f9\u00fa\7O\2\2\u00fa\u00fc\7P\2\2\u00fb\u00f9\3\2\2\2\u00fc"+
		"\u00ff\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0111\3\2"+
		"\2\2\u00ff\u00fd\3\2\2\2\u0100\u0105\5(\25\2\u0101\u0102\7O\2\2\u0102"+
		"\u0104\7P\2\2\u0103\u0101\3\2\2\2\u0104\u0107\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106\u0111\3\2\2\2\u0107\u0105\3\2\2\2\u0108"+
		"\u010d\5$\23\2\u0109\u010a\7O\2\2\u010a\u010c\7P\2\2\u010b\u0109\3\2\2"+
		"\2\u010c\u010f\3\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0111"+
		"\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u00f8\3\2\2\2\u0110\u0100\3\2\2\2\u0110"+
		"\u0108\3\2\2\2\u0111!\3\2\2\2\u0112\u0116\5(\25\2\u0113\u0116\5&\24\2"+
		"\u0114\u0116\5$\23\2\u0115\u0112\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0114"+
		"\3\2\2\2\u0116\u0117\3\2\2\2\u0117\u0118\7e\2\2\u0118#\3\2\2\2\u0119\u011a"+
		"\7:\2\2\u011a\u011b\7v\2\2\u011b%\3\2\2\2\u011c\u011e\7v\2\2\u011d\u011f"+
		"\5> \2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0127\3\2\2\2\u0120"+
		"\u0121\7S\2\2\u0121\u0123\7v\2\2\u0122\u0124\5> \2\u0123\u0122\3\2\2\2"+
		"\u0123\u0124\3\2\2\2\u0124\u0126\3\2\2\2\u0125\u0120\3\2\2\2\u0126\u0129"+
		"\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128\3\2\2\2\u0128\'\3\2\2\2\u0129"+
		"\u0127\3\2\2\2\u012a\u012b\t\2\2\2\u012b)\3\2\2\2\u012c\u012d\7:\2\2\u012d"+
		"\u012e\7v\2\2\u012e\u012f\7\6\2\2\u012f\u0130\5,\27\2\u0130\u0131\7\7"+
		"\2\2\u0131\u014d\3\2\2\2\u0132\u0133\7:\2\2\u0133\u0134\7v\2\2\u0134\u0136"+
		"\7\b\2\2\u0135\u0137\7v\2\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2\u0137"+
		"\u0138\3\2\2\2\u0138\u0139\7N\2\2\u0139\u013a\5,\27\2\u013a\u013c\7\t"+
		"\2\2\u013b\u013d\7v\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013f\7N\2\2\u013f\u014d\3\2\2\2\u0140\u0141\7:\2"+
		"\2\u0141\u0142\7v\2\2\u0142\u0143\7\n\2\2\u0143\u0144\5,\27\2\u0144\u0145"+
		"\7\13\2\2\u0145\u014d\3\2\2\2\u0146\u0147\7:\2\2\u0147\u0148\7v\2\2\u0148"+
		"\u0149\7M\2\2\u0149\u014a\5,\27\2\u014a\u014b\7N\2\2\u014b\u014d\3\2\2"+
		"\2\u014c\u012c\3\2\2\2\u014c\u0132\3\2\2\2\u014c\u0140\3\2\2\2\u014c\u0146"+
		"\3\2\2\2\u014d+\3\2\2\2\u014e\u0150\5.\30\2\u014f\u014e\3\2\2\2\u0150"+
		"\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152-\3\2\2\2"+
		"\u0153\u0151\3\2\2\2\u0154\u0155\5\60\31\2\u0155\u0156\5\66\34\2\u0156"+
		"\u0157\7Q\2\2\u0157/\3\2\2\2\u0158\u015a\5\62\32\2\u0159\u0158\3\2\2\2"+
		"\u0159\u015a\3\2\2\2\u015a\u015b\3\2\2\2\u015b\u015c\5 \21\2\u015c\61"+
		"\3\2\2\2\u015d\u015f\5\64\33\2\u015e\u015d\3\2\2\2\u015f\u0162\3\2\2\2"+
		"\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\63\3\2\2\2\u0162\u0160"+
		"\3\2\2\2\u0163\u0164\t\3\2\2\u0164\65\3\2\2\2\u0165\u0167\58\35\2\u0166"+
		"\u0165\3\2\2\2\u0167\u016a\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\67\3\2\2\2\u016a\u0168\3\2\2\2\u016b\u016c\5:\36\2\u016c9\3"+
		"\2\2\2\u016d\u016e\7v\2\2\u016e;\3\2\2\2\u016f\u0170\7\f\2\2\u0170\u0171"+
		"\5 \21\2\u0171\u0172\7\r\2\2\u0172\u0173\7v\2\2\u0173\u0174\7Q\2\2\u0174"+
		"\u017c\3\2\2\2\u0175\u0176\7\f\2\2\u0176\u0177\5*\26\2\u0177\u0178\7\r"+
		"\2\2\u0178\u0179\7v\2\2\u0179\u017a\7Q\2\2\u017a\u017c\3\2\2\2\u017b\u016f"+
		"\3\2\2\2\u017b\u0175\3\2\2\2\u017c=\3\2\2\2\u017d\u017e\7V\2\2\u017e\u0183"+
		"\5@!\2\u017f\u0180\7R\2\2\u0180\u0182\5@!\2\u0181\u017f\3\2\2\2\u0182"+
		"\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0186\3\2"+
		"\2\2\u0185\u0183\3\2\2\2\u0186\u0187\7U\2\2\u0187?\3\2\2\2\u0188\u018f"+
		"\5 \21\2\u0189\u018c\7Y\2\2\u018a\u018b\t\4\2\2\u018b\u018d\5 \21\2\u018c"+
		"\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018f\3\2\2\2\u018e\u0188\3\2"+
		"\2\2\u018e\u0189\3\2\2\2\u018fA\3\2\2\2\u0190\u0195\5N(\2\u0191\u0192"+
		"\7R\2\2\u0192\u0194\5N(\2\u0193\u0191\3\2\2\2\u0194\u0197\3\2\2\2\u0195"+
		"\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196C\3\2\2\2\u0197\u0195\3\2\2\2"+
		"\u0198\u019a\7K\2\2\u0199\u019b\5F$\2\u019a\u0199\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019c\3\2\2\2\u019c\u019d\7L\2\2\u019dE\3\2\2\2\u019e\u01a3"+
		"\5H%\2\u019f\u01a0\7R\2\2\u01a0\u01a2\5H%\2\u01a1\u019f\3\2\2\2\u01a2"+
		"\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a8\3\2"+
		"\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a7\7R\2\2\u01a7\u01a9\5J&\2\u01a8\u01a6"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ac\3\2\2\2\u01aa\u01ac\5J&\2\u01ab"+
		"\u019e\3\2\2\2\u01ab\u01aa\3\2\2\2\u01acG\3\2\2\2\u01ad\u01af\5\6\4\2"+
		"\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0\u01b1"+
		"\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\5 \21\2\u01b4"+
		"\u01b5\5\32\16\2\u01b5I\3\2\2\2\u01b6\u01b8\5\6\4\2\u01b7\u01b6\3\2\2"+
		"\2\u01b8\u01bb\3\2\2\2\u01b9\u01b7\3\2\2\2\u01b9\u01ba\3\2\2\2\u01ba\u01bc"+
		"\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01bd\5 \21\2\u01bd\u01be\7x\2\2\u01be"+
		"\u01bf\5\32\16\2\u01bfK\3\2\2\2\u01c0\u01c1\5R*\2\u01c1M\3\2\2\2\u01c2"+
		"\u01c7\7v\2\2\u01c3\u01c4\7S\2\2\u01c4\u01c6\7v\2\2\u01c5\u01c3\3\2\2"+
		"\2\u01c6\u01c9\3\2\2\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8O"+
		"\3\2\2\2\u01c9\u01c7\3\2\2\2\u01ca\u01cb\t\5\2\2\u01cbQ\3\2\2\2\u01cc"+
		"\u01d0\7\6\2\2\u01cd\u01cf\5T+\2\u01ce\u01cd\3\2\2\2\u01cf\u01d2\3\2\2"+
		"\2\u01d0\u01ce\3\2\2\2\u01d0\u01d1\3\2\2\2\u01d1\u01d3\3\2\2\2\u01d2\u01d0"+
		"\3\2\2\2\u01d3\u01ed\7\7\2\2\u01d4\u01d6\7\b\2\2\u01d5\u01d7\7v\2\2\u01d6"+
		"\u01d5\3\2\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01dc\7N"+
		"\2\2\u01d9\u01db\5T+\2\u01da\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df"+
		"\u01e1\7\t\2\2\u01e0\u01e2\7v\2\2\u01e1\u01e0\3\2\2\2\u01e1\u01e2\3\2"+
		"\2\2\u01e2\u01e3\3\2\2\2\u01e3\u01ed\7N\2\2\u01e4\u01e8\7M\2\2\u01e5\u01e7"+
		"\5T+\2\u01e6\u01e5\3\2\2\2\u01e7\u01ea\3\2\2\2\u01e8\u01e6\3\2\2\2\u01e8"+
		"\u01e9\3\2\2\2\u01e9\u01eb\3\2\2\2\u01ea\u01e8\3\2\2\2\u01eb\u01ed\7N"+
		"\2\2\u01ec\u01cc\3\2\2\2\u01ec\u01d4\3\2\2\2\u01ec\u01e4\3\2\2\2\u01ed"+
		"S\3\2\2\2\u01ee\u01f1\5V,\2\u01ef\u01f1\5Z.\2\u01f0\u01ee\3\2\2\2\u01f0"+
		"\u01ef\3\2\2\2\u01f1U\3\2\2\2\u01f2\u01f3\5X-\2\u01f3\u01f4\7Q\2\2\u01f4"+
		"W\3\2\2\2\u01f5\u01f6\5 \21\2\u01f6\u01f7\5\26\f\2\u01f7Y\3\2\2\2\u01f8"+
		"\u0246\5R*\2\u01f9\u01fa\7#\2\2\u01fa\u01fb\5n8\2\u01fb\u01fe\5Z.\2\u01fc"+
		"\u01fd\7\34\2\2\u01fd\u01ff\5Z.\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2"+
		"\2\2\u01ff\u0246\3\2\2\2\u0200\u0202\7\"\2\2\u0201\u0200\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0204\7K\2\2\u0204\u0205\5`\61"+
		"\2\u0205\u0206\7L\2\2\u0206\u0207\5Z.\2\u0207\u0246\3\2\2\2\u0208\u0209"+
		"\7D\2\2\u0209\u020a\5n8\2\u020a\u020b\5Z.\2\u020b\u0246\3\2\2\2\u020c"+
		"\u020d\7\32\2\2\u020d\u020e\5Z.\2\u020e\u020f\7D\2\2\u020f\u0210\5n8\2"+
		"\u0210\u0211\7Q\2\2\u0211\u0246\3\2\2\2\u0212\u0213\7<\2\2\u0213\u021b"+
		"\5n8\2\u0214\u021c\7M\2\2\u0215\u021c\7\6\2\2\u0216\u0218\7\b\2\2\u0217"+
		"\u0219\7v\2\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021a\3\2"+
		"\2\2\u021a\u021c\7N\2\2\u021b\u0214\3\2\2\2\u021b\u0215\3\2\2\2\u021b"+
		"\u0216\3\2\2\2\u021c\u0220\3\2\2\2\u021d\u021f\5\\/\2\u021e\u021d\3\2"+
		"\2\2\u021f\u0222\3\2\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u0226\3\2\2\2\u0222\u0220\3\2\2\2\u0223\u0225\5^\60\2\u0224\u0223\3\2"+
		"\2\2\u0225\u0228\3\2\2\2\u0226\u0224\3\2\2\2\u0226\u0227\3\2\2\2\u0227"+
		"\u0230\3\2\2\2\u0228\u0226\3\2\2\2\u0229\u0231\7N\2\2\u022a\u0231\7\7"+
		"\2\2\u022b\u022d\7\t\2\2\u022c\u022e\7v\2\2\u022d\u022c\3\2\2\2\u022d"+
		"\u022e\3\2\2\2\u022e\u022f\3\2\2\2\u022f\u0231\7N\2\2\u0230\u0229\3\2"+
		"\2\2\u0230\u022a\3\2\2\2\u0230\u022b\3\2\2\2\u0231\u0246\3\2\2\2\u0232"+
		"\u0234\7\62\2\2\u0233\u0235\5v<\2\u0234\u0233\3\2\2\2\u0234\u0235\3\2"+
		"\2\2\u0235\u0236\3\2\2\2\u0236\u0246\7Q\2\2\u0237\u0239\7\21\2\2\u0238"+
		"\u023a\7v\2\2\u0239\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023b\u0246\7Q\2\2\u023c\u0246\7Q\2\2\u023d\u023e\5r:\2\u023e\u023f"+
		"\7Q\2\2\u023f\u0246\3\2\2\2\u0240\u0241\7v\2\2\u0241\u0242\7Z\2\2\u0242"+
		"\u0246\5Z.\2\u0243\u0246\5h\65\2\u0244\u0246\5l\67\2\u0245\u01f8\3\2\2"+
		"\2\u0245\u01f9\3\2\2\2\u0245\u0201\3\2\2\2\u0245\u0208\3\2\2\2\u0245\u020c"+
		"\3\2\2\2\u0245\u0212\3\2\2\2\u0245\u0232\3\2\2\2\u0245\u0237\3\2\2\2\u0245"+
		"\u023c\3\2\2\2\u0245\u023d\3\2\2\2\u0245\u0240\3\2\2\2\u0245\u0243\3\2"+
		"\2\2\u0245\u0244\3\2\2\2\u0246[\3\2\2\2\u0247\u0249\5^\60\2\u0248\u0247"+
		"\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u0248\3\2\2\2\u024a\u024b\3\2\2\2\u024b"+
		"\u024d\3\2\2\2\u024c\u024e\5T+\2\u024d\u024c\3\2\2\2\u024e\u024f\3\2\2"+
		"\2\u024f\u024d\3\2\2\2\u024f\u0250\3\2\2\2\u0250]\3\2\2\2\u0251\u0252"+
		"\7\23\2\2\u0252\u0253\5t;\2\u0253\u0254\7Z\2\2\u0254\u0258\3\2\2\2\u0255"+
		"\u0256\7\31\2\2\u0256\u0258\7Z\2\2\u0257\u0251\3\2\2\2\u0257\u0255\3\2"+
		"\2\2\u0258_\3\2\2\2\u0259\u0266\5d\63\2\u025a\u025c\5b\62\2\u025b\u025a"+
		"\3\2\2\2\u025b\u025c\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025f\7Q\2\2\u025e"+
		"\u0260\5v<\2\u025f\u025e\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\3\2\2"+
		"\2\u0261\u0263\7Q\2\2\u0262\u0264\5f\64\2\u0263\u0262\3\2\2\2\u0263\u0264"+
		"\3\2\2\2\u0264\u0266\3\2\2\2\u0265\u0259\3\2\2\2\u0265\u025b\3\2\2\2\u0266"+
		"a\3\2\2\2\u0267\u026a\5X-\2\u0268\u026a\5p9\2\u0269\u0267\3\2\2\2\u0269"+
		"\u0268\3\2\2\2\u026ac\3\2\2\2\u026b\u026d\5\6\4\2\u026c\u026b\3\2\2\2"+
		"\u026d\u0270\3\2\2\2\u026e\u026c\3\2\2\2\u026e\u026f\3\2\2\2\u026f\u0271"+
		"\3\2\2\2\u0270\u026e\3\2\2\2\u0271\u0272\5 \21\2\u0272\u0273\5\32\16\2"+
		"\u0273\u0274\7Z\2\2\u0274\u0275\5v<\2\u0275e\3\2\2\2\u0276\u0277\5p9\2"+
		"\u0277g\3\2\2\2\u0278\u0279\7.\2\2\u0279\u027e\5j\66\2\u027a\u027b\7c"+
		"\2\2\u027b\u027d\5j\66\2\u027c\u027a\3\2\2\2\u027d\u0280\3\2\2\2\u027e"+
		"\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027fi\3\2\2\2\u0280\u027e\3\2\2\2"+
		"\u0281\u0282\t\6\2\2\u0282k\3\2\2\2\u0283\u0285\7\63\2\2\u0284\u0286\5"+
		" \21\2\u0285\u0284\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0287\3\2\2\2\u0287"+
		"\u0288\7\64\2\2\u0288\u0289\5\32\16\2\u0289m\3\2\2\2\u028a\u028b\7K\2"+
		"\2\u028b\u028c\5v<\2\u028c\u028d\7L\2\2\u028do\3\2\2\2\u028e\u0293\5v"+
		"<\2\u028f\u0290\7R\2\2\u0290\u0292\5v<\2\u0291\u028f\3\2\2\2\u0292\u0295"+
		"\3\2\2\2\u0293\u0291\3\2\2\2\u0293\u0294\3\2\2\2\u0294q\3\2\2\2\u0295"+
		"\u0293\3\2\2\2\u0296\u0297\5v<\2\u0297s\3\2\2\2\u0298\u0299\5v<\2\u0299"+
		"u\3\2\2\2\u029a\u029b\b<\1\2\u029b\u02a1\5x=\2\u029c\u029d\t\7\2\2\u029d"+
		"\u02a1\5v<\f\u029e\u029f\t\b\2\2\u029f\u02a1\5v<\13\u02a0\u029a\3\2\2"+
		"\2\u02a0\u029c\3\2\2\2\u02a0\u029e\3\2\2\2\u02a1\u02cc\3\2\2\2\u02a2\u02a3"+
		"\f\n\2\2\u02a3\u02a4\t\t\2\2\u02a4\u02cb\5v<\13\u02a5\u02a6\f\t\2\2\u02a6"+
		"\u02a7\t\n\2\2\u02a7\u02cb\5v<\n\u02a8\u02a9\f\b\2\2\u02a9\u02aa\t\13"+
		"\2\2\u02aa\u02cb\5v<\t\u02ab\u02ac\f\7\2\2\u02ac\u02ad\t\f\2\2\u02ad\u02cb"+
		"\5v<\b\u02ae\u02af\f\6\2\2\u02af\u02b0\7_\2\2\u02b0\u02cb\5v<\7\u02b1"+
		"\u02b2\f\5\2\2\u02b2\u02b3\7`\2\2\u02b3\u02cb\5v<\6\u02b4\u02b5\f\4\2"+
		"\2\u02b5\u02b6\7Y\2\2\u02b6\u02b7\5v<\2\u02b7\u02b8\7Z\2\2\u02b8\u02b9"+
		"\5v<\5\u02b9\u02cb\3\2\2\2\u02ba\u02bb\f\3\2\2\u02bb\u02bc\t\r\2\2\u02bc"+
		"\u02cb\5v<\3\u02bd\u02be\f\17\2\2\u02be\u02bf\7O\2\2\u02bf\u02c0\5v<\2"+
		"\u02c0\u02c1\7P\2\2\u02c1\u02cb\3\2\2\2\u02c2\u02c3\f\16\2\2\u02c3\u02c5"+
		"\7K\2\2\u02c4\u02c6\5p9\2\u02c5\u02c4\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c6"+
		"\u02c7\3\2\2\2\u02c7\u02cb\7L\2\2\u02c8\u02c9\f\r\2\2\u02c9\u02cb\t\16"+
		"\2\2\u02ca\u02a2\3\2\2\2\u02ca\u02a5\3\2\2\2\u02ca\u02a8\3\2\2\2\u02ca"+
		"\u02ab\3\2\2\2\u02ca\u02ae\3\2\2\2\u02ca\u02b1\3\2\2\2\u02ca\u02b4\3\2"+
		"\2\2\u02ca\u02ba\3\2\2\2\u02ca\u02bd\3\2\2\2\u02ca\u02c2\3\2\2\2\u02ca"+
		"\u02c8\3\2\2\2\u02cb\u02ce\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cd\3\2"+
		"\2\2\u02cdw\3\2\2\2\u02ce\u02cc\3\2\2\2\u02cf\u02d0\7K\2\2\u02d0\u02d1"+
		"\5v<\2\u02d1\u02d2\7L\2\2\u02d2\u02d8\3\2\2\2\u02d3\u02d8\5P)\2\u02d4"+
		"\u02d8\7v\2\2\u02d5\u02d6\7e\2\2\u02d6\u02d8\7v\2\2\u02d7\u02cf\3\2\2"+
		"\2\u02d7\u02d3\3\2\2\2\u02d7\u02d4\3\2\2\2\u02d7\u02d5\3\2\2\2\u02d8y"+
		"\3\2\2\2\u02d9\u02f5\7O\2\2\u02da\u02df\7P\2\2\u02db\u02dc\7O\2\2\u02dc"+
		"\u02de\7P\2\2\u02dd\u02db\3\2\2\2\u02de\u02e1\3\2\2\2\u02df\u02dd\3\2"+
		"\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e2\3\2\2\2\u02e1\u02df\3\2\2\2\u02e2"+
		"\u02f6\5\36\20\2\u02e3\u02e4\5v<\2\u02e4\u02eb\7P\2\2\u02e5\u02e6\7O\2"+
		"\2\u02e6\u02e7\5v<\2\u02e7\u02e8\7P\2\2\u02e8\u02ea\3\2\2\2\u02e9\u02e5"+
		"\3\2\2\2\u02ea\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02eb\u02ec\3\2\2\2\u02ec"+
		"\u02f2\3\2\2\2\u02ed\u02eb\3\2\2\2\u02ee\u02ef\7O\2\2\u02ef\u02f1\7P\2"+
		"\2\u02f0\u02ee\3\2\2\2\u02f1\u02f4\3\2\2\2\u02f2\u02f0\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u02f6\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5\u02da\3\2\2\2\u02f5"+
		"\u02e3\3\2\2\2\u02f6{\3\2\2\2\u02f7\u02f9\7K\2\2\u02f8\u02fa\5p9\2\u02f9"+
		"\u02f8\3\2\2\2\u02f9\u02fa\3\2\2\2\u02fa\u02fb\3\2\2\2\u02fb\u02fc\7L"+
		"\2\2\u02fc}\3\2\2\2W\177\u0086\u0090\u0098\u009d\u00a7\u00ac\u00b0\u00b3"+
		"\u00bf\u00c9\u00d4\u00da\u00e1\u00e6\u00ee\u00f2\u00f4\u00fd\u0105\u010d"+
		"\u0110\u0115\u011e\u0123\u0127\u0136\u013c\u014c\u0151\u0159\u0160\u0168"+
		"\u017b\u0183\u018c\u018e\u0195\u019a\u01a3\u01a8\u01ab\u01b0\u01b9\u01c7"+
		"\u01d0\u01d6\u01dc\u01e1\u01e8\u01ec\u01f0\u01fe\u0201\u0218\u021b\u0220"+
		"\u0226\u022d\u0230\u0234\u0239\u0245\u024a\u024f\u0257\u025b\u025f\u0263"+
		"\u0265\u0269\u026e\u027e\u0285\u0293\u02a0\u02c5\u02ca\u02cc\u02d7\u02df"+
		"\u02eb\u02f2\u02f5\u02f9";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}