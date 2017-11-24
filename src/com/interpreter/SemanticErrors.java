package com.interpreter;

import com.utils.Console;

public class SemanticErrors {
	
	private static final String LINE_INFO = "line %d:%d ";

	//ARRAY
	public static final String OUT_OF_BOUNDS = LINE_INFO + "Array index out of bounds. index: %s ; array length: %s";
	public static final String INVALID_DIMS = LINE_INFO + "Array invalid dimensions. # specified dim: %s ; # correct dim: %s";


	//STRUCTURES
	public static final String UNDEFINED_STRUCT = LINE_INFO + "Undefined structure '%s'";
	public static final String DUPLICATE_STRUCT = LINE_INFO + "Duplicate structure '%s'";

	//TYPE MISMATCH
	public static final String TYPE_MISMATCH = LINE_INFO + "Type mismatch. Value should be of type '%s'";
	public static final String METHOD_ARG_MISMATCH = LINE_INFO + "Type mismatch. Argument '%s' should be of type '%s'";
	
	//METHOD
	public static final String UNDEFINED_METHOD = LINE_INFO + "Undefined method '%s'";
	public static final String PARAM_COUNT_MISMATCH_G = LINE_INFO + "Method '%s' can only support %d argument/s";
	public static final String PARAM_COUNT_MISMATCH_L = LINE_INFO + "Method '%s' requires %d argument/s";
	public static final String INVALID_RETURN_TYPE = LINE_INFO + "Invalid return type for method '%s'. Expecting type '%s'";
	public static final String DUPLICATE_METHOD = LINE_INFO + "Duplicate method '%s'";
	
	//SCOPE
	public static final String UNDECLARED_VAR = LINE_INFO + "Undeclared variable '%s'";
	public static final String DUPLICATE_VAR = LINE_INFO + "Duplicate variable '%s'";
	
	//CONSTANT
	public static final String CONSTANT_MOD = LINE_INFO + "Cannont modify constant variable '%s'";
	
	//COMPARISON
	public static final String COMPARISON_ERR = LINE_INFO + "The operator %s is undefined for the argument types '%s' and '%s'";
	
	//SPECIAL ERRORS
	public static final String ONLY_ONE_CHAR = LINE_INFO + "'char' can only contain one character. Try using 'string' instead";
	
	public static void throwError(String error, Object ...args) {
		Console.instance().err(String.format(error, args), (int)args[0]);
	}
}
