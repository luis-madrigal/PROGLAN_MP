package com.interpreter.AST;

import com.utils.KeyTokens;

/**
 * for terminals (Variables/Literals)
 */
public class TerminalNode extends AbstractSyntaxTree {
    protected KeyTokens.TERMINAL_TYPE literalType;

    public TerminalNode(AbstractSyntaxTree parent, KeyTokens.TERMINAL_TYPE type){
        super(parent);
        this.literalType = type;
    }

    public KeyTokens.TERMINAL_TYPE getLiteralType() {
        return literalType;
    }

}
