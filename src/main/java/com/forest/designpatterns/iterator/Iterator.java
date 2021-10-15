package com.forest.designpatterns.iterator;

/**
 * 抽象迭代器
 *
 * @author Forest Dong
 * @date 2021年10月15日 11:39
 */
public interface Iterator {
    /**
     * 遍历到下一个元素
     * @return
     */
    Object next();

    /**
     * 是否已经遍历到尾部
     * @return
     */
    boolean hasNext();

    /**
     * 删除当前指向的元素
     * @return
     */
    boolean remove();
}
