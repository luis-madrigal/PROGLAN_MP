package com.interpreter.AST;

import com.utils.KeyTokens;

/**
 * for terminals (Variables/Literals)
 */
public class LeafNode extends AbstractSyntaxTree {

    protected String literalType;
    protected Object value;

    public LeafNode(AbstractSyntaxTree parent) {
        super(parent);
    }

    public void setLiteralType(String literalType) {
        this.literalType = literalType;
    }

    public String getLiteralType() {
        return literalType;
    }

}
