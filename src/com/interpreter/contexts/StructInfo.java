package com.interpreter.contexts;

/** todo: implement a separate table for defined structinfo
 * data for struct type symbols
 */
public class StructInfo implements GenericInfo<StructInfo>{
    private String structName;
    private SymbolContext[] members;

    public StructInfo(String type, SymbolContext[] members){
       this.structName = type.replace("composition ","");
       this.members = members;
    }

    public String getStructName() {
        return structName;
    }

    public SymbolContext[] getMembers() {
        return members;
    }

    public void setMembers(SymbolContext[] members) {
        this.members = members;
    }

    public SymbolContext getMember(String memberName){
        for(SymbolContext mem : members){
            if(mem.getIdentifier().equals(memberName))
                return mem;
        }
        return null;
    }

    @Override
    public StructInfo getInfo() {
        return this;
    }
}
