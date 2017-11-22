package com.interpreter.AST;

public enum NodeType{
    //TODO: wala pang structures
    BLOCK,
    FUNCTION_DECLARATION, FUNCTION_INVOKE,
    RETURN,
    VAR_DECLARE,
    BIN_ARITHMETIC, BIN_LOGIC, ASSIGN,
    ARRAY_ACCESS,
    UNIPOST_ARITHMETIC, UNIPRE_ARITHMETIC, UNI_LOGIC,
    TER_OP, //call onelineif
    WHILE, DO_WHILE, FOR,
    TERMINAL,
    BRANCH, //used for if-else statements
    PRINT,
    SCAN,
    VARIABLE, LITERAL
}