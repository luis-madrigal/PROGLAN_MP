package com.interpreter.contexts;

import com.utils.KeyTokens;

public class ArrayInfo implements GenericInfo{
    private int dims;
    //size of -1 means array is either uninitialized or it is unspecified in the context
    private int size;

    public ArrayInfo(int size, int dims){
        this.size = size;
        this.dims = dims;
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
