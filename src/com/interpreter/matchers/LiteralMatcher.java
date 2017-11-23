package com.interpreter.matchers;

import java.util.HashMap;

import com.parser.ManuScriptParser.LiteralContext;
import com.utils.KeyTokens;
import com.utils.KeyTokens.LITERAL_TYPE;
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
			return KeyTokens.LITERAL_TYPE.BOOLEAN;
		return KeyTokens.LITERAL_TYPE.NULL;
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
	
	public Object parseAttempt(Object ob) {//TODO: bad implementation
		try {
			Integer x = Integer.parseInt(ob.toString());
			return x;
		}catch(Exception e){
			try {
				Float x = Float.parseFloat(ob.toString());
				return x;
			}catch(Exception e1){
				try {
					Boolean x = Boolean.parseBoolean(ob.toString());
					return x;
				}catch(Exception e2) {
					if(parseChar(ob.toString()) != null)
						return parseChar(ob.toString());
					else
						return ob.toString().substring(1).substring(0, ob.toString().length()-1);
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
