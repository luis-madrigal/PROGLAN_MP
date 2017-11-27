package com.interpreter.contexts;

import com.interpreter.SemanticErrors;
import com.rits.cloning.Cloner;
import com.utils.Utils;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayInfo implements GenericInfo<ArrayInfo>{
    //
   // private ArrayList<Integer> size;
    private String arrType;
    private Object[] array;
    //number of dimensions of array
    private int dims;
    private boolean isInitialized = false;
    private ContextType arrayCtxType;

    public ArrayInfo(int dims, String type){
        this.dims = dims;
        this.arrType = type.substring(0,type.indexOf('['));
        System.out.println("array type: "+this.arrType);
        this.arrayCtxType = Utils.detectContextType(arrType);
    }

    public Object getObject(int ... index){
        if(isInitialized) {
            get: if (index.length != dims) {
                //todo might not work properly -- no line number, charnumber
                SemanticErrors.throwError(SemanticErrors.INVALID_DIMS, index.length, dims);
                return null;
            } else {
                Object cur = array;
                for (int i : index) {
                    if (i < Array.getLength(cur)) {
                        cur = Array.get(cur, i);
                    } else {
                        //todo might not work properly -- no line number, charnumber
                        SemanticErrors.throwError(SemanticErrors.OUT_OF_BOUNDS, i, Array.getLength(cur));
                        break get;
                    }
                }
                return cur;
            }
        }
        return null;
    }

    public void setObject(Object toSet, int ... index){
        if(isInitialized) {
            set:
            if (index.length != dims) {
                SemanticErrors.throwError(SemanticErrors.INVALID_DIMS, index.length, dims);
            } else {
                Object cur = array;
                for (int i = 0 ;i < index.length - 1; i++) {
                    if (index[i] < Array.getLength(cur)) {
                        cur = Array.get(cur, index[i]);
                    } else {
                        break set;
                    }
                }
                Array.set(cur,index[index.length-1],toSet);
            }
        }
    }

    public void initArr(int[] sizes){
        int dims = sizes.length;
        if(this.dims != dims){
            SemanticErrors.throwError(SemanticErrors.INVALID_DIMS,dims,this.dims);
        }
        //gets the deepest dim
        Object[] curArr = new Object[sizes[dims-1]];
        Object[] supArr;

        for(int i = dims-2;i >= 0; i--){
            System.out.println(i);
            int curSize = sizes[i];
            supArr = new Object[curSize];
            for(int index = 0; index < curSize; index++){
                supArr[index] = Cloner.standard().deepClone(curArr);
            }
            curArr = supArr;
        }
        this.isInitialized = true;
        this.array = curArr;
    }

    public String getArrType(){
        return this.arrType;
    }
    
    public Object getObjWithIndex(Object value) {
    	Integer index = Integer.parseInt(value.toString());
    	System.out.println(this.array[index]);
    	return this.array[index];
    }

    public Object[] getArray() {
        return array;
    }

    @Override
    public ArrayInfo getInfo() {
        return this;
    }

    public boolean isInitialized() {
        return isInitialized;
    }

    public void setInitialized(boolean isInitialized){
        this.isInitialized = isInitialized;
    }

    public String toSring(){
        return Arrays.deepToString(array);
    }

    public ContextType getArrayCtxType() {
        return arrayCtxType;
    }

	public int getDims() {
		return dims;
	}

	public void setDims(int dims) {
		this.dims = dims;
	}
}
