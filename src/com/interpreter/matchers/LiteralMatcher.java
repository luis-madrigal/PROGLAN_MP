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
			System.out.println("----------INTEGER----------");
			return x;
		}catch(Exception e){
			try {
				Float x = Float.parseFloat(ob.toString());
				System.out.println("----------Float----------");
				return x;
			}catch(Exception e1){
				if(ob.toString().equals("true") || ob.toString().equals("false")) {
					Boolean x = Boolean.parseBoolean(ob.toString());
					System.out.println("----------Boolean----------");
					return x;
				} else if(parseChar(ob.toString()) != null) {
					System.out.println("----------Char----------");
					return parseChar(ob.toString());
				} else {
					System.out.println("----------String----------");
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
