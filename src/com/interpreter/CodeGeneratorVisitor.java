package com.interpreter;

import com.interpreter.AST.ProcedureNode;

import java.util.HashMap;

public class CodeGeneratorVisitor {
    private HashMap<String, ProcedureNode> procMap;

    public CodeGeneratorVisitor(HashMap<String, ProcedureNode> procMap){
        this.procMap = procMap;
    }


}
