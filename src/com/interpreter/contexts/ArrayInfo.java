package com.interpreter.contexts;

import com.utils.KeyTokens;

public class ArrayInfo implements GenericInfo{
    private int dims;
    private KeyTokens.LITERAL_TYPE type;
    //size of -1 means array is either uninitialized or it is unspecified in the context
    private int size;

    public ArrayInfo(KeyTokens.LITERAL_TYPE type, int size, int dims){
        this.type = type;
        this.size = size;
        this.dims = dims;
    }

    public KeyTokens.LITERAL_TYPE getType() {
        return type;
    }

    public void setType(KeyTokens.LITERAL_TYPE type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getDims() {
        return dims;
    }

    public void setDims(int dims) {
        this.dims = dims;
    }

    @Override
    public GenericInfo getInfo() {
        return this;
    }
}
