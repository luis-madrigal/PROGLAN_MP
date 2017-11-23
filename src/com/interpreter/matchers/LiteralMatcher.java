package com.interpreter.matchers;

import java.util.HashMap;

import com.parser.ManuScriptParser.LiteralContext;
import com.utils.KeyTokens;
import com.utils.Types;

public class LiteralMatcher {
	
	private static LiteralMatcher instance;
	
	private LiteralMatcher() {
		
	}
	
	public String getLiteralType(LiteralContext ctx) {
		if(ctx.IntegerLiteral() != null)
			return "int";
		if(ctx.CharacterLiteral() != null)
			return "char";
		if(ctx.StringLiteral() != null)
			return KeyTokens.LITERAL_TYPE.STRING;
		if(ctx.FloatingPointLiteral() != null)
			return KeyTokens.LITERAL_TYPE.FLOAT;
		if(ctx.BooleanLiteral() != null)
			return KeyTokens.LITERAL_TYPE.BOOLEAN;
		return KeyTokens.LITERAL_TYPE.NULL;
	}
	
	public static LiteralMatcher instance() {
		if(instance == null)
			instance = new LiteralMatcher();
		return instance;
	}

}
