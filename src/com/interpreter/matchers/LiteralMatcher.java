package com.interpreter.matchers;

import java.util.HashMap;

import com.parser.ManuScriptParser.LiteralContext;
import com.utils.Types;

public class LiteralMatcher {
	
	private static LiteralMatcher instance;
	
	private LiteralMatcher() {
		
	}
	
	public String getLiteralType(LiteralContext ctx) {
		if(ctx.IntegerLiteral() != null)
			return Types.INTEGER;
		if(ctx.CharacterLiteral() != null)
			return Types.CHARACTER;
		if(ctx.StringLiteral() != null)
			return Types.STRING;
		if(ctx.FloatingPointLiteral() != null)
			return Types.FLOAT;
		if(ctx.BooleanLiteral() != null)
			return Types.BOOLEAN;
		return Types.NULL;
	}
	
	public static LiteralMatcher instance() {
		if(instance == null)
			instance = new LiteralMatcher();
		return instance;
	}

}
