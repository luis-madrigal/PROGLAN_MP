package com.interpreter.matchers;

public class StringMatcher implements Matcher{

	@Override
	public boolean isOfType(String value) {
		if(value.substring(value.length()-1).equals("\"") && value.substring(0, 1).equals("\"")) {
        	return true;
		}
		return false;
	}

}
