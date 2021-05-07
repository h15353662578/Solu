package com.hs.Line;

import java.util.Arrays;

/**
 * @author Huasheng
 * @Date 2021/05/07/11:39
 * @Description
 */
public class SequenceImpl implements Sequence{

    //存放元素的对象数组
    private Object[] oldGroup;

    //默认长度为10
    private static final int DEFAULT_CAPACITY = 10;

    //存放元素个数
    private int size;

    //线性表最大容量
    private static final int MAX_CAPACITY = Integer.MAX_VALUE-8;

    public SequenceImpl(){
        //初始化存储元素数组 初始化为10
        this.oldGroup = new Object[DEFAULT_CAPACITY];
    }
    public SequenceImpl(int capacity){
        if (capacity > 0){
            this.oldGroup = new Object[capacity];
        }
    }

    @Override
    public void add(Object group) throws Exception {
        //判断添加元素是否越界
        //若越界先进行扩容 后再添加数据
        ensureCapacityInter(size+1);
        oldGroup[size++] = group;
    }

    @Override
    public boolean delete(int index) {
        rangeCheck(index);
        int moveSteps = size-index-1;
        if(moveSteps > 0){
            System.arraycopy(oldGroup,index-1,oldGroup,index,moveSteps);
        }
        oldGroup[--size]=null;
        return true;
    }

    @Override
    public Object get(int index) {
        rangeCheck(index);
        return oldGroup[index];
    }

    @Override
    public boolean contains(Object group) {
        //判断是否有指定内容null
        if (group == null){
            for (int i = 0;i < size;i ++)
            if (oldGroup[i]==null){
                return true;
            }
        }else {
            for (int i=0;i<size;i++){
                if (group.equals(oldGroup[i])){
                    //采用equals判断一定要将指定内容放在前面防止空指针异常
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Object set(int index, Object newGroup) {
        rangeCheck(index);
        Object oldData = oldGroup[index];
        oldGroup[index] = newGroup;
        return oldData;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        for (int i = 0;i < size;i ++){
            oldGroup[i] = null;
        }
        this.size = 0;
    }

    @Override
    public Object[] toArray() {
        return this.oldGroup;
    }
    private void ensureCapacityInter(int cap) throws Exception {
        //overflow
        if (cap-oldGroup.length>0){
            //扩容
            grow(cap);
        }
    }
    private void grow(int cap) throws Exception {
        int oldCap = oldGroup.length;
        int newCap = oldCap << 1;
        if (cap-newCap>0){
            newCap = cap;
        }
        if (newCap-MAX_CAPACITY > 0){
            throw new Exception("线性表超出最大值");
        }
        oldGroup = Arrays.copyOf(oldGroup,newCap);
    }

    private void rangeCheck(int index){
        if (index < 0 || index >= size) {
//            try {
//            return "索引非法";
             throw new ArrayIndexOutOfBoundsException("索引非法");
//            }catch ();
        }
    }
}
