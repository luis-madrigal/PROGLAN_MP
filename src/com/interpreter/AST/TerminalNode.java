package com.interpreter.AST;

import com.utils.KeyTokens;

/**
 * for terminals (Variables/Literals)
 */
public class TerminalNode extends AbstractSyntaxTree {

    protected KeyTokens.LITERAL_TYPE literalType;
    protected Object value;

    public TerminalNode(AbstractSyntaxTree parent, KeyTokens.LITERAL_TYPE type) {
        super(parent);
        this.literalType = type;
    }

    public KeyTokens.LITERAL_TYPE getLiteralType() {
        return literalType;
    }

}
