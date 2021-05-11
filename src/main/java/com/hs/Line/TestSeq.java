package com.hs.Line;

import java.util.Arrays;

/**
 * @author Huasheng
 * @Date 2021/05/11/8:15
 * @Description
 */
public class TestSeq {

    private Object[] group;

    private int size;

    private static final int DEFAULT_PAPACITY = 10;

    private static final int MAX_PAPACITY = Integer.MAX_VALUE - 8;

    public TestSeq(){
        this.group = new Object[DEFAULT_PAPACITY];
    }
    public TestSeq(int papacity){
        if (papacity > 0){
            this.group = new Object[papacity];
        }
    }

    public Object get(int size){
        return group[size];
    }

    public void add(Object Group)throws Exception{
        kuo(size + 1);
        group[size++] = Group;
    }

    public void kuo(int cap) throws Exception{
        if (cap > group.length){
            kuoRong(cap);
        }
    }

    public void kuoRong(int cap)throws Exception{
        int oldCap = group.length;
        int newCap = oldCap << 1;
        if (cap - newCap > 0){
            newCap = cap;
        }
        if (newCap-MAX_PAPACITY > 0){
            throw new Exception("线性表超出最大值");
        }
        group = Arrays.copyOf(group,newCap);
    }

    private void rangeCheck(int index){
        if (index < 0 || index >= size) {
            try {
                throw new ArrayIndexOutOfBoundsException("索引非法");
            } catch (ArrayIndexOutOfBoundsException exception){
                exception.printStackTrace();
            }
        }
    }
}



