package com.interpreter.AST;

public enum NodeType{
    //TODO: wala pang structures
    FIELD_DEC, FIELD_DEC_END,
    BLOCK, GOTO,
    FUNCTION_DECLARATION, FUNCTION_INVOKE, FUNCTION_END,
    RETURN,
    VAR_DECLARE,
    BIN_ARITHMETIC, BIN_LOGIC, ASSIGN,
    ARRAY_ASSIGN, ARRAY_ACCESS,
    ARRAY_INIT, ARRAY_BLOCK,
    UNIPOST_ARITHMETIC, UNIPRE_ARITHMETIC, UNI_LOGIC,
    TER_OP, //call onelineif
    WHILE, DO_WHILE, FOR,
    TERMINAL,
    BRANCH, //u sed for if-else statements
    PRINT,
    SCAN,
    VARIABLE, LITERAL
}