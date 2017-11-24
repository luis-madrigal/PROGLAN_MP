package com.interpreter.AST;

public enum NodeType{
    //TODO: wala pang structures
    FIELD_DEC,
    BLOCK, GOTO,
    FUNCTION_DECLARATION, FUNCTION_INVOKE, FUNCTION_END,
    RETURN,
    VAR_DECLARE,
    BIN_ARITHMETIC, BIN_LOGIC, ASSIGN,
    ARRAY_ACCESS,
    UNIPOST_ARITHMETIC, UNIPRE_ARITHMETIC, UNI_LOGIC,
    TER_OP, //call onelineif
    WHILE, DO_WHILE, FOR,
    TERMINAL,
    BRANCH, //u sed for if-else statements
    PRINT,
    SCAN,
    VARIABLE, LITERAL
}