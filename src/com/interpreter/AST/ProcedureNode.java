package com.interpreter.AST;

import javafx.scene.Parent;

public class ProcedureNode extends AbstractSyntaxTree{
    protected String procedureName;

    public ProcedureNode(AbstractSyntaxTree parent, String procedureName){
        super(parent);
        this.procedureName = procedureName;
    }

    public String getProcedureName(){
        return procedureName;
    }

    public void setProcedureName(String name){
        this.procedureName = name;
    }
}
