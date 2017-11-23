package com.interpreter.contexts;

public class PointerInfo implements  GenericInfo{
    private SymbolContext pointee;

    public PointerInfo(SymbolContext pointee){
        this.pointee = pointee;
    }

    public SymbolContext getPointee() {
        return pointee;
    }

    public void setPointee(SymbolContext pointee) {
        this.pointee = pointee;
    }

    @Override
    public GenericInfo getInfo() {
        return this;
    }
}
