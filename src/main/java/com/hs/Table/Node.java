package com.hs.Table;

/**
 * @author Huasheng
 * @Date 2021/05/07/15:18
 * @Description
 */
public class Node {

    //数据域
    public Object date;
    //指针域
    public Node next;

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public Node(Object data,Node next){
        this.date = data;
        this.next = next;
    }
}
