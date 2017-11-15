package com.interpreter.AST;

public enum NodeType{
    //TODO: wala pang structures
    PROCEDURE,
    RETURN,
    BIN_OP, COMPARE_OP, ASSIGN,
    UNI_ARITHMETIC, NOT,
    TER_OP,
    WHILE, DO_WHILE, FOR,
    TERMINAL,
    BRANCH //used as reference for looping

}