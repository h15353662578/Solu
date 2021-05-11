package com.hs.testLine;

import java.util.Arrays;

/**
 * @author Huasheng
 * @Date 2021/05/07/20:00
 * @Description
 */
public class TestLine {

    private Object[] group;

    private int size;

    private final static int DEFAULT_LENGTH = 10;

    public TestLine (){
        this.group = new Object[DEFAULT_LENGTH];
    }

    public TestLine(int capacity){
        if (capacity > 0){
            this.group = new Object[capacity];
        }
    }


    public Object[] toArray(){
        return this.group;
    }

    public Object rang(int size){
        if (size == 0){
            return null;
        }else {
            return size;
        }
    }

    public void kuo(int cap){
        if (cap - group.length > 1){
            int oldCap = group.length;
            int newCap = oldCap << 1;
            if (cap - newCap > 0){
                newCap = cap;
            }
            group = Arrays.copyOf(group,newCap);
        }
    }

}
