package com.hs.Line;

/**
 * @author Huasheng
 * @Date 2021/05/07/11:21
 * @Description
 */
public class TestLineTable {
    public static void main(String[] args) throws Exception {
        SequenceImpl sequence = new SequenceImpl(17);
        sequence.add(90);
        sequence.add(66);
        sequence.add(33);
        sequence.add(80);
        sequence.add(70);
        sequence.add(60);
        sequence.add(null);
        System.out.println("查询数据下标2:"+sequence.get(2));
        System.out.println("修改数据下标3为71:"+sequence.set(3,71));
        System.out.println("读取数据下标3:"+sequence.get(3));
        System.out.println("查询是否有null数:"+sequence.contains(null));
        System.out.println("删除数据下标4:"+sequence.delete(4));
        System.out.println("------开始清理数据");
        sequence.clear();
        System.out.println("查询是否有null数:"+sequence.contains(null));
    }
}
