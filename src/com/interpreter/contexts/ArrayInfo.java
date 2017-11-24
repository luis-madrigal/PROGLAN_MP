package com.interpreter.contexts;

import com.interpreter.SemanticErrors;
import java.lang.reflect.Array;

public class ArrayInfo implements GenericInfo{
    //
   // private ArrayList<Integer> size;
    private String type;
    private Object[] array;
    //number of dimensions of array
    private int dims;
    private boolean isInitialized = false;

    public ArrayInfo(int dims, String type){
        this.dims = dims;
        this.type = type.substring(0,type.indexOf('['));
        System.out.println("arr type: "+this.type);
    }


    public ArrayInfo(int[] sizes, String type){
        this.dims = sizes.length;
        this.array = initArr(sizes);


        this.type = type.substring(0,type.indexOf('['));
        System.out.println("arr type: "+this.type);

        this.isInitialized = true;
    }

    //todo test
    public Object getObject(int ... index){
        if(index.length != dims){
            SemanticErrors.throwError(SemanticErrors.INVALID_DIMS, index.length,dims);
            return null;
        }
        else {
            Object cur = array;
            for (int i : index) {
                cur = Array.get(cur, i);
            }
            return cur;
        }
    }

    public void setObject(Object toSet, int ... index){
        set: if(index.length != dims){
            SemanticErrors.throwError(SemanticErrors.INVALID_DIMS, index.length,dims);
        }
        else {
            Object cur = array;
            for (int i : index) {
                if(i < Array.getLength(cur)) {
                    cur = Array.get(cur, i);
                }else {
                    SemanticErrors.throwError(SemanticErrors.OUT_OF_BOUNDS, i, Array.getLength(cur));
                    break set;
                }
            }

            cur = toSet;
        }
    }

    public Object[] initArr(int[] sizes){
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
                supArr[index] = curArr.clone();
            }
            curArr = supArr;
        }
        this.array = curArr;
        return curArr;
    }

    public Object[] getArray() {
        return array;
    }

    @Override
    public GenericInfo getInfo() {
        return this;
    }

    public boolean isInitialized() {
        return isInitialized;
    }
}
