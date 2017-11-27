package com.interpreter.contexts;

import com.utils.Utils;

public class PointerInfo implements  GenericInfo<PointerInfo>{
    private SymbolContext pointee;
    private ContextType pointsToCtxType;
    private String pointsToType;

    public PointerInfo(String type){
        this.pointsToType = type.substring(0,type.indexOf('*'));
        pointsToCtxType = Utils.detectContextType(pointsToType);
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

    public String getPointsToType() {
        return pointsToType;
    }

    public ContextType getPointsToCtxType() {
        return pointsToCtxType;
    }

	public void setPointsToCtxType(ContextType pointsToCtxType) {
		this.pointsToCtxType = pointsToCtxType;
	}

	public void setPointsToType(String pointsToType) {
		this.pointsToType = pointsToType;
	}

}
