package com.interpreter.matchers;

import java.util.HashMap;

import com.parser.ManuScriptParser.LiteralContext;
import com.utils.Literals;

public class LiteralMatcher {
	
	private static LiteralMatcher instance;
	
	private LiteralMatcher() {
		
	}
	
	public String getLiteralType(LiteralContext ctx) {
		if(ctx.IntegerLiteral() != null)
			return Literals.INTEGER;
		if(ctx.CharacterLiteral() != null)
			return Literals.CHARACTER;
		if(ctx.StringLiteral() != null)
			return Literals.STRING;
		if(ctx.FloatingPointLiteral() != null)
			return Literals.FLOAT;
		if(ctx.BooleanLiteral() != null)
			return Literals.BOOLEAN;
		return Literals.NULL;
	}
	
	public static LiteralMatcher instance() {
		if(instance == null)
			instance = new LiteralMatcher();
		return instance;
	}

}
