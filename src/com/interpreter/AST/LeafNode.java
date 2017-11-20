package com.interpreter.AST;

import com.utils.KeyTokens;

/**
 * for terminals (Variables/Literals)
 */
public class LeafNode extends AbstractSyntaxTree {

    protected KeyTokens.LITERAL_TYPE literalType;
    protected Object value;

    public LeafNode(AbstractSyntaxTree parent) {
        super(parent);
    }

    public void setLiteralType(KeyTokens.LITERAL_TYPE literalType) {
        this.literalType = literalType;
    }

    public KeyTokens.LITERAL_TYPE getLiteralType() {
        return literalType;
    }

}
