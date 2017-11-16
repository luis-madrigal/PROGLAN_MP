package com.interpreter.AST;

public enum NodeType{
    //TODO: wala pang structures
    PRINT, SCAN,
    PROCEDURE, PROCEDURE_CALL,
    RETURN,
    BIN_ARITHMETIC, BIN_LOGIC, ASSIGN,
    UNI_ARITHMETIC, UNI_LOGIC,
    TER_OP, //call onelineif
    WHILE, DO_WHILE, FOR,
    TERMINAL,
    BRANCH, //used for if-else statements
    PRINT,
    SCAN
}