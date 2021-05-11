package com.hs.stack;

import com.hs.Table.Node;

/**
 * @author Huasheng
 * @Date 2021/05/11/15:13
 * 基于链表的栈
 * @Description
 */
public class NodeStack {

    private Node top = null;

    public void push(Object val){
        Node newNode = new Node(val,null);
        if (top == null){
            newNode.next = top;
        }
        top = newNode;
    }

    //出栈
    public Object pop(){
        if (top == null){
            return -1;
        }
        Object val = top.date;
        top = top.next;
        return val;
    }

    //输出栈
    public void printAll(){
        Node p = top;
        while (p != null){
            System.out.println(p.date + "s");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeStack nodeStack = new NodeStack();
        nodeStack.push("斯派克");
        nodeStack.push("泰克");
        System.out.println(nodeStack.pop());
        nodeStack.printAll();
    }
}
