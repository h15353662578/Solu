package com.hs.Tree;
/**
 * @author Huasheng
 * @Date 2021/05/06/9:16
 * 双向链表节点
 * @Description
 */
public class DoubleNode {
    //数据
    private Integer data;
    //next节点
    private DoubleNode next;
    //前驱节点
    private DoubleNode previous;

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }
}

class DoubleList{

    private DoubleNode head;
    /***
     * 将新节点的前驱节点指向表头head
     * 新节点后续节点指向表头
     * 将表头的前驱节点指向新节点
     */
    public void add(int data){
        //创建新节点
        DoubleNode newNode = new DoubleNode();
        //新节点添加数据
        newNode.setData(data);
        //如果表头为空将新节点作为头
        if(head==null){
            head = newNode;
        }else{
            //将新节点的前驱节点指向表头
            //新节点的后续节点指向表头
            newNode.setNext(head);
            //将表头的前驱结点指向新节点
            head.setPrevious(newNode);
            //head重新赋值
            head = newNode;
        }
    }

    public void displayNode(){
        //将表头作为当前节点
        DoubleNode curNode = head;
        //遍历链表
        while(curNode!=null){
            //打印数据
            System.out.println(curNode.getData());
            //将下一个节点作为当前节点
            curNode = curNode.getNext();
        }
    }

    public void addLast(int data){
        DoubleNode newNode = new DoubleNode();
        newNode.setData(data);
        if (head==null){
            head=newNode;
        }else{
            DoubleNode curNode = head;
            //遍历节点
            while (curNode.getNext()!=null){
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
            newNode.setPrevious(curNode);
        }
    }

    public static void main(String[] args) {
        DoubleList doubleList = new DoubleList();
        for(int i=0;i<5;i++){
//            doubleList.add(i);
            doubleList.addLast(i);
        }
        doubleList.displayNode();
    }
}

