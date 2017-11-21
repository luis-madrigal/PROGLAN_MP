package com.interpreter.AST;

import com.interpreter.modules.ExpressionEvaluator;
import com.interpreter.modules.Writer;
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

    public AbstractSyntaxTree(AbstractSyntaxTree parent) {
        this.parent = parent;
        this.children = new ArrayList<AbstractSyntaxTree>();
    }

    public void print() {
        print("", true);
    }

    private void print(String prefix, boolean isTail) {
        System.out.println(prefix + (isTail ? "└── " : "├── ") + nodeType);
        for (int i = 0; i < children.size() - 1; i++) {
            children.get(i).print(prefix + (isTail ? "    " : "│   "), false);
        }
        if (children.size() > 0) {
            children.get(children.size() - 1)
                    .print(prefix + (isTail ? "    " : "│   "), true);
        }
    }

    public List<AbstractSyntaxTree> getChildren() {
        return children;
    }

    public AbstractSyntaxTree getChild(int index) {
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

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public NodeType getNodeType() {
        return nodeType;
    }

    public void setNodeType(NodeType nodeType) {
        this.nodeType = nodeType;
    }
}
