package com.interpreter.AST;

import com.utils.KeyTokens;

import java.util.ArrayList;
import java.util.List;

/*
public abstract class ExprNode extends AbstractSyntaxTree{

}


abstract class BinExpressionNode extends ExprNode{

    ExprNode leftChild;
    ExprNode rightChild;

    public BinExpressionNode(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public ExprNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(ExprNode left){
        this.leftChild = leftChild;
    }

    public ExprNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(ExprNode right){
        this.rightChild = rightChild;
    }

    @Override
    public List<AbstractSyntaxTree> getChildren() {
        ArrayList<AbstractSyntaxTree> children = new ArrayList(){{
            add(leftChild);
            add(rightChild);
        }};
        return children;
    }

    @Override
    public AbstractSyntaxTree getChild(int index) {
        if(index<0)
            return leftChild;
        else if(index>0)
            return rightChild;
        else
            return null;
    }

}

class BinArithmeticNode extends BinExpressionNode{

    protected KeyTokens.BIN.Arithmetic operator;

    public BinArithmeticNode(KeyTokens.BIN.Arithmetic operator) {
        super(NodeType.BIN_ARITHMETIC);
        this.operator = operator;
    }

    public KeyTokens.BIN.Arithmetic getOperator() {
        return operator;
    }

    public void setOperator (KeyTokens.BIN.Arithmetic operator){
        this.operator = operator;
    }
}

class BinLogicalNode extends BinExpressionNode{

    protected KeyTokens.BIN.Logical operator;

    public BinLogicalNode(KeyTokens.BIN.Logical operator) {
        super(NodeType.BIN_LOGIC);
        this.operator = operator;
    }

    public KeyTokens.BIN.Logical getOperator() {
        return operator;
    }

    public void setOperator (KeyTokens.BIN.Logical operator){
        this.operator = operator;
    }
}

abstract class UniExpressionNode extends ExprNode {

    ExprNode child;

    public UniExpressionNode(NodeType nodeType) {
        this.nodeType = nodeType;
    }

    public ExprNode getChild() {
        return child;
    }

    public void setChild(ExprNode child) {
        this.child = child;
    }


    @Override
    public List<AbstractSyntaxTree> getChildren() {
        ArrayList<AbstractSyntaxTree> children = new ArrayList(){{
            add(child);
        }};
        return children;
    }

    @Override
    public AbstractSyntaxTree getChild(int index) {
        return child;
    }
}

class UniArithmeticNode extends UniExpressionNode{

    KeyTokens.UNARY.Arithmetic_U operator;

    public UniArithmeticNode(KeyTokens.UNARY.Arithmetic_U operator){
        super(NodeType.UNI_ARITHMETIC);
        this.operator = operator;
    }

    public KeyTokens.UNARY.Arithmetic_U getOperator() {
        return operator;
    }

    public void setOperator (KeyTokens.UNARY.Arithmetic_U operator){
        this.operator = operator;
    }
}

class UniLogicalNode extends UniExpressionNode{
    KeyTokens.UNARY.Logical_U operator;

    public UniLogicalNode(KeyTokens.UNARY.Logical_U operator){
        super(NodeType.UNI_LOGIC);
        this.operator = operator;
    }

    public KeyTokens.UNARY.Logical_U getOperator() {
        return operator;
    }

    public void setOperator (KeyTokens.UNARY.Logical_U operator){
        this.operator = operator;
    }
}
*/