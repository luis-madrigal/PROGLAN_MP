package com.interpreter;

import com.utils.Console;

public class SemanticErrors {
	
	private static final String LINE_INFO = "line %d:%d ";

	//INIT
	public static final String ILLEGAL_INIT = LINE_INFO + "Illegal initializer for type %s";

	//ARRAY
	public static final String UNINITIALIZED = LINE_INFO + "Array has not been initialized.";
	public static final String OUT_OF_BOUNDS = LINE_INFO + "Array index is out of bounds. index: %s -- array length: %s";
	public static final String INVALID_DIMS = LINE_INFO + "Invalid dimensions. # initialized dims: %s -- # correct dims: %s";
	public static final String ARR_TYPE_MISMATCH = LINE_INFO + "Array initialization type mismatch. Array should be of type '%s'";
	public static final String INVALID_INIT = LINE_INFO + "Invalid array initialization. Initialization could only be of the format: 'new <type> [expr] ... [expr]? '";

	//	public static final String DIMS_NOT_MATCH = LINE_INFO + "Array dimensions initialization doesn't match declared. init dim: %s ; declared dim: %s";

	//STRUCTURES
	public static final String UNDEFINED_STRUCT = LINE_INFO + "Undefined structure '%s'";
	public static final String DUPLICATE_STRUCT = LINE_INFO + "Duplicate structure '%s'";

	//TYPE MISMATCH
	public static final String TYPE_MISMATCH = LINE_INFO + "Type mismatch. Value should be of type '%s'";
	public static final String METHOD_ARG_MISMATCH = LINE_INFO + "Type mismatch. Argument '%s' should be of type '%s'";
	public static final String UN_OP_TYPE_MISMATCH = LINE_INFO + "The operator '%s' is undefined for arguments: %s";
	public static final String BIN_OP_TYPE_MISMATCH = LINE_INFO + "The operator '%s' is undefined for arguments: %s, %s";
	public static final String VAR_ASSIGN_MISMATCH = LINE_INFO + "Type mismatch. Variable '%s' should be of type '%s'";
	public static final String IF_CONDITION_MISMATCH = LINE_INFO + "Type mismatch in if condition. Value should be of type boolean";
	public static final String FOR_CONDITION_MISMATCH = LINE_INFO + "Type mismatch in for condition. Value should be of type boolean";
	public static final String WHILE_CONDITION_MISMATCH = LINE_INFO + "Type mismatch in while condition. Value should be of type boolean";
	public static final String DOWHILE_CONDITION_MISMATCH = LINE_INFO + "Type mismatch in do-while condition. Value should be of type boolean";
	
	//METHOD
	public static final String UNDEFINED_METHOD = LINE_INFO + "Undefined method '%s'";
	public static final String PARAM_COUNT_MISMATCH_G = LINE_INFO + "Method '%s' can only support %d argument/s";
	public static final String PARAM_COUNT_MISMATCH_L = LINE_INFO + "Method '%s' requires %d argument/s";
	public static final String INVALID_RETURN_TYPE = LINE_INFO + "Invalid return type for method '%s'. Expecting type '%s'";
	public static final String DUPLICATE_METHOD = LINE_INFO + "Duplicate method '%s'";
	public static final String NO_MAIN_METHOD = "No main method detected";

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
	
	public static void throwError(String error) {
		Console.instance().err(error);
	}
}
