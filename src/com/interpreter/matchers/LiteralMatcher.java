package com.interpreter.matchers;

import java.util.HashMap;

import com.utils.Literals;

public class LiteralMatcher {
	
	private static LiteralMatcher instance;
	private HashMap<String, Matcher> matchMap;
	
	private LiteralMatcher() {
		matchMap = new HashMap<String, Matcher>();
		matchMap.put(Literals.INTEGER, new IntegerMatcher());
		matchMap.put(Literals.CHARACTER, new CharMatcher());
		matchMap.put(Literals.STRING, new StringMatcher());
		matchMap.put(Literals.FLOAT, new FloatMatcher());
	}
	
	public boolean isOfType(String type, String value) {
		return matchMap.get(type).isOfType(value);
	}
	
	public String getLiteralType(String value) {
		if(LiteralMatcher.instance().isOfType(Literals.INTEGER, value))
			return Literals.INTEGER;
		if(LiteralMatcher.instance().isOfType(Literals.CHARACTER, value))
			return Literals.CHARACTER;
		if(LiteralMatcher.instance().isOfType(Literals.STRING, value))
			return Literals.STRING;
		if(LiteralMatcher.instance().isOfType(Literals.FLOAT, value))
			return Literals.FLOAT;
		return null;
	}
	
	public static LiteralMatcher instance() {
		if(instance == null)
			instance = new LiteralMatcher();
		return instance;
	}

}
