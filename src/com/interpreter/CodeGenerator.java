package com.interpreter;

import com.interpreter.AST.AbstractSyntaxTree;
import com.interpreter.modules.Writer;

import java.util.HashMap;

public class CodeGenerator {

    private HashMap<String,AbstractSyntaxTree> procedureTable;
    private AbstractSyntaxTree tree;
    public CodeGenerator(HashMap<String,AbstractSyntaxTree> procedureTable) {
        this.procedureTable = procedureTable;
        this.tree = procedureTable.get("main");
        System.out.println("--------------------");
    }

    public void generate() {
        traverse(this.tree);
    }

    private void traverse(AbstractSyntaxTree node) {
        if(node.getChildren() != null && !node.getChildren().isEmpty()) {
            for(AbstractSyntaxTree child : node.getChildren()) {
                evaluate(child);
                traverse(child);
            }
        }
    }

    private void evaluate(AbstractSyntaxTree node) {
        System.out.println(node.getNodeType());
        switch(node.getNodeType()) {
            case FUNCTION_DECLARATION:break;
            case FUNCTION_INVOKE:break;
            case RETURN:break;
            case BIN_ARITHMETIC:break;
            case BIN_LOGIC:break;
            case ASSIGN:break;
            case UNI_LOGIC:break;
            case WHILE:break;
            case DO_WHILE:break;
            case FOR:break;
            case TERMINAL:break;
            case BRANCH:break; //used for if-else statements
            case PRINT: Writer.printText(node.getValue().toString());break;
            case SCAN:break;
            default:break;
        }
    }
}
