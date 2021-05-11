package com.hs.Line;

import java.util.Arrays;

/**
 * @author Huasheng
 * @Date 2021/05/07/11:39
 * @Description
 */
public class SequenceImpl implements Sequence{

    //存放元素的对象数组
    private Object[] Group;

    //默认长度为10
    private static final int DEFAULT_CAPACITY = 10;

    //存放元素个数
    private int size;

    //线性表最大容量
    private static final int MAX_CAPACITY = Integer.MAX_VALUE-8;

    public SequenceImpl(){
        //初始化存储元素数组 初始化为10
        this.Group = new Object[DEFAULT_CAPACITY];
    }
    public SequenceImpl(int capacity){
        if (capacity > 0){
            this.Group = new Object[capacity];
        }
    }

    @Override
    public void add(Object group) throws Exception {
        //判断添加元素是否越界
        //若越界先进行扩容 后再添加数据
        ensureCapacityInter(size+1);
        Group[size++] = group;
    }

    @Override
    public boolean delete(int index) {
        rangeCheck(index);
        int moveSteps = size-index-1;
        if(moveSteps > 0){
            System.arraycopy(Group,index-1,Group,index,moveSteps);
        }
        Group[--size]=null;
        return true;
    }

    @Override
    public Object get(int index) {
        rangeCheck(index);
        return Group[index];
    }

    @Override
    public boolean contains(Object group) {
        //判断是否有指定内容null
        if (group == null){
            for (int i = 0;i < size;i ++)
            if (Group[i]==null){
                return true;
            }
        }else {
            for (int i=0;i<size;i++){
                if (group.equals(Group[i])){
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
        Object oldData = Group[index];
        Group[index] = newGroup;
        return oldData;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        for (int i = 0;i < size;i ++){
            Group[i] = null;
        }
        this.size = 0;
    }

    @Override
    public Object[] toArray() {
        return this.Group;
    }
    private void ensureCapacityInter(int cap) throws Exception {
        //overflow
        if (cap-Group.length>0){
            //扩容
            grow(cap);
        }
    }

    private void grow(int cap) throws Exception {
        int oldCap = Group.length;
        //左移一位原数据长度x2
        int newCap = oldCap << 1;
        if (cap-newCap>0){
            newCap = cap;
        }
        if (newCap-MAX_CAPACITY > 0){
            throw new Exception("线性表超出最大值");
        }
        Group = Arrays.copyOf(Group,newCap);
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
