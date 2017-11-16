package com.interpreter.AST;

import com.utils.KeyTokens;

import javax.xml.soap.Node;
import java.util.ArrayList;
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
       this.children = new ArrayList<>();
    }

    public List<AbstractSyntaxTree> getChildren() {
        return children;
    }

    public AbstractSyntaxTree getChild(int index){
        return children.get(index);
    }

    public void addChild(AbstractSyntaxTree child) {
        this.children.add(child);
    }

    public AbstractSyntaxTree getParent() {
        return parent;
    }

    public void setParent(AbstractSyntaxTree parent) {
        this.parent = parent;
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object value){
        this.value = value;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType){
        this.nodeType = nodeType;
    }
}
