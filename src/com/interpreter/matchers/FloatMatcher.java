package com.interpreter.matchers;

public class FloatMatcher implements Matcher{

	@Override
	public boolean isOfType(String value) {
		try {
			Float.parseFloat(value);
		}catch(NumberFormatException e) {
        	return false;
		}
		return true;
	}

}
