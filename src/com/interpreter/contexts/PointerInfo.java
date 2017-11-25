package com.interpreter.contexts;

public class PointerInfo implements  GenericInfo<PointerInfo>{
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
    public PointerInfo getInfo() {
        return this;
    }
}
