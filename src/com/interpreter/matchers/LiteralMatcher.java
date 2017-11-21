package com.interpreter.matchers;

import java.util.HashMap;

import com.parser.ManuScriptParser.LiteralContext;
import com.utils.KeyTokens;
import com.utils.Types;

public class LiteralMatcher {
	
	private static LiteralMatcher instance;
	
	private LiteralMatcher() {
		
	}
	
	public KeyTokens.LITERAL_TYPE getLiteralType(LiteralContext ctx) {
		if(ctx.IntegerLiteral() != null)
			return KeyTokens.LITERAL_TYPE.INT;
		if(ctx.CharacterLiteral() != null)
			return KeyTokens.LITERAL_TYPE.CHAR;
		if(ctx.StringLiteral() != null)
			return KeyTokens.LITERAL_TYPE.STRING;
		if(ctx.FloatingPointLiteral() != null)
			return KeyTokens.LITERAL_TYPE.FLOAT;
		if(ctx.BooleanLiteral() != null)
			return KeyTokens.LITERAL_TYPE.BOOL;
		return KeyTokens.LITERAL_TYPE.NULL;
	}
	
	public static LiteralMatcher instance() {
		if(instance == null)
			instance = new LiteralMatcher();
		return instance;
	}

}
