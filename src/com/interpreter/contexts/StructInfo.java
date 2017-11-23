package com.interpreter.contexts;

public class StructInfo implements GenericInfo{
    private String name;
    private SymbolContext[] members;

    public StructInfo(String name, SymbolContext[] members){
       this.name = name;
       this.members = members;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SymbolContext[] getMembers() {
        return members;
    }

    public void setMembers(SymbolContext[] members) {
        this.members = members;
    }

    @Override
    public GenericInfo getInfo() {
        return this;
    }
}
