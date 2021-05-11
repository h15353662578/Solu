package com.hs.stack;

/**
 * @author Huasheng
 * @Date 2021/05/11/11:33
 * 数组栈
 * @Description
 */
public class Stack {

    //数组
    private  String[] group;

    //找出栈中元素个数
    private int count;

    //栈的大小
    private int size;

    //初始化数组
    public Stack(int size){
        this.group = new String[size];
        this.count = 0;
        this.size = size;
    }

    //入栈
    public boolean push(String groups){
        //如空间不足直接返回false 入栈失败
        if (count ==size){
            throw new RuntimeException("栈满");
        }
        //将group放到下标为count的位置 count自增
        group[count] = groups;
        count++;
        return true;
    }

    //出栈
    public String pop(){
        //栈为空返回null
        if (count == 0){
            return null;
        }
        //返回下标为count -1的数组元素 count自减
        String tmp = group[count -1];
        --count;
        return tmp;
    }

    public int length(){
        return group.length;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push("华生");
        stack.push("花生");
        stack.push("汤姆");
        stack.push("泰克");
        stack.push("斯派克");
        System.out.println(stack.pop());
    }
}
