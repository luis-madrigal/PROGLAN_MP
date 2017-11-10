package com.interpreter;

public class SemanticErrors {
	
	private static final String LINE_INFO = "line %d:%d ";
	
	//TYPE MISMATCH
	public static final String TYPE_MISMATCH = LINE_INFO + "type mismatch value should be of type '%s'";
//	public static final String INT_MISMATCH = LINE_INFO + "type mismatch value should be of type 'int'";
//	public static final String FLOAT_MISMATCH = LINE_INFO + "type mismatch value should be of type 'float'";
//	public static final String CHAR_MISMATCH = LINE_INFO + "type mismatch value should be of type 'char'";
//	public static final String STRING_MISMATCH = LINE_INFO + "type mismatch value should be of type 'string'";
	
	//METHOD
	public static final String UNDEFINED_METHOD = LINE_INFO + "undefined method '%s'";
	public static final String PARAM_COUNT_MISMATCH_G = LINE_INFO + "method '%s' can only support %d argument/s";
	public static final String PARAM_COUNT_MISMATCH_L = LINE_INFO + "method '%s' requires %d argument/s";
	
	//SCOPE
	public static final String UNDECLARED_VAR = LINE_INFO + "undeclared variable '%s'";
	public static final String DUPLICATE_VAR = LINE_INFO + "duplicate variable '%s'";
	
	//SPECIAL ERRORS
	public static final String ONLY_ONE_CHAR = LINE_INFO + "char can only contain one character. Try using string instead";
}
