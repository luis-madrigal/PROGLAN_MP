package com.interpreter;

public class SemanticErrors {
	
	private static final String LINE_INFO = "line %d:%d ";
	
	//TYPE MISMATCH
	public static final String INT_MISMATCH = LINE_INFO + "type mismatch value should be of type 'int'";
	public static final String FLOAT_MISMATCH = LINE_INFO + "type mismatch value should be of type 'float'";
	public static final String CHAR_MISMATCH = LINE_INFO + "type mismatch value should be of type 'char'";
	public static final String STRING_MISMATCH = LINE_INFO + "type mismatch value should be of type 'string'";
	
	//SCOPE
	public static final String UNDECLARED_VAR = LINE_INFO + "undeclared variable %s";
	
	//SPECIAL ERRORS
	public static final String ONLY_ONE_CHAR = LINE_INFO + "char can only contain one character. Try using string instead";
}
