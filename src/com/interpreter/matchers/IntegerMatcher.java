package com.interpreter.matchers;

public class IntegerMatcher implements Matcher{

	@Override
	public boolean isOfType(String value) {
		try {
			Integer.parseInt(value);
		}catch(NumberFormatException e) {
        	return false;
		}
		return true;
	}

}
