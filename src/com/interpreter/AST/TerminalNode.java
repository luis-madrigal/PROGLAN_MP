package com.interpreter.AST;

import com.utils.KeyTokens;

/**
 * for terminals (Variables/Literals)
 */
public class TerminalNode extends AbstractSyntaxTree {
	protected KeyTokens.TERMINAL_TYPE type;
    protected Object value;

    public TerminalNode(KeyTokens.TERMINAL_TYPE type, Object value){
    	super(null); // TODO: What?
        this.type = type;
        this.value = value;
    }

    public KeyTokens.TERMINAL_TYPE getType() {
        return type;
    }

    public Object getValue() {
        return value;
    }
}
