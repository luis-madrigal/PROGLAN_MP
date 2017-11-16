package com.interpreter.AST;

import javafx.scene.Parent;

import java.util.List;
import java.util.Objects;

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

    @Override
    public List<AbstractSyntaxTree> getChildren() {
        return null;
    }

    @Override
    public AbstractSyntaxTree getChild(int index) {
        return null;
    }

}
