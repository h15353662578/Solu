package com.hs.Line;

/**
 * @author Huasheng
 * @Date 2021/05/07/11:34
 * @Description
 */
public interface Sequence {
    /***
     * 添加元素操作
     */
    void add(Object group) throws Exception;

    /***
     * 删除元素
     * @param index
     * @return
     */
    boolean delete(int index);

    /***
     * 查找指定元素
     * @param index
     * @return
     */
    Object get(int index);

    /***
     * 判断是否存在
     * @param group
     * @return
     */
    boolean contains(Object group);

    /***
     * 修改制定内容
     * @param index 元素下表
     * @param newGroup 修改后的内容
     * @return
     */
    Object set(int index,Object newGroup);

    /***
     * 返回当前线性表元素个数
     * @return
     */
    int size();

    /***
     * 清除数据
     */
    void clear();

    /***
     * 线性表转换为数组
     * @return
     */
    Object[] toArray();
}

