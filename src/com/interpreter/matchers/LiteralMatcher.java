package com.interpreter.matchers;

import com.parser.ManuScriptParser.LiteralContext;
import com.utils.KeyTokens;

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
			return "string";
		if(ctx.FloatingPointLiteral() != null)
			return "float";
		if(ctx.BooleanLiteral() != null)
			return "boolean";
		return "null";
	}
	
	public String getPossibleLiteralTypes(LiteralContext ctx) {
		if(ctx.IntegerLiteral() != null)
			return "int|char|float";
		if(ctx.CharacterLiteral() != null)
			return "char|int|float";
		if(ctx.StringLiteral() != null)
			return "string";
		if(ctx.FloatingPointLiteral() != null)
			return "float";
		if(ctx.BooleanLiteral() != null)
			return "boolean";
		return "null";
	}
	
	public KeyTokens.LITERAL_TYPE getLiteralType(Object ob) {
		if(ob instanceof Integer)
			return KeyTokens.LITERAL_TYPE.INT;
		if(ob instanceof Character)
			return KeyTokens.LITERAL_TYPE.CHAR;
		if(ob instanceof String)
			return KeyTokens.LITERAL_TYPE.STRING;
		if(ob instanceof Float)
			return KeyTokens.LITERAL_TYPE.FLOAT;
		if(ob instanceof Boolean)
			return KeyTokens.LITERAL_TYPE.BOOLEAN;
		return KeyTokens.LITERAL_TYPE.NULL;
	}
	
	public Object parseAttempt(Object ob) {
		try {
			Integer x = Integer.parseInt(ob.toString());
			return x;
		}catch(Exception e){
			try {
				Float x = Float.parseFloat(ob.toString());
				return x;
			}catch(Exception e1){
				if(ob.toString().equals("true") || ob.toString().equals("false")) {
					Boolean x = Boolean.parseBoolean(ob.toString());
					return x;
				} else if(parseChar(ob.toString()) != null) {
					return parseChar(ob.toString());
				} else {
					return ob.toString().substring(1).substring(0, ob.toString().length()-2);
				}
			}
		}
	}
	
	private Character parseChar(String s) {
		if(s.substring(0, 1).equals("'") && s.substring(s.length()-1).equals("'"))
			return new Character(s.charAt(1));
		return null;
	}
	
	public static LiteralMatcher instance() {
		if(instance == null)
			instance = new LiteralMatcher();
		return instance;
	}

}
