package com.interpreter.AST;

import com.utils.KeyTokens;

import java.util.List;

public class AbstractSyntaxTree {
    /**
     * Children is ordered left to right
     */
    protected List<AbstractSyntaxTree> children;
    protected AbstractSyntaxTree parent;
    protected NodeType nodeType;
    protected Object value;

    public AbstractSyntaxTree(AbstractSyntaxTree parent){
       this.parent = parent;
    }

    public List<AbstractSyntaxTree> getChildren() {
        return children;
    }

    public void addChildren(AbstractSyntaxTree child) {
        this.children.add(child);
    }

    public AbstractSyntaxTree getParent() {
        return parent;
    }

    public void setParent(AbstractSyntaxTree parent) {
        this.parent = parent;
    }



}
