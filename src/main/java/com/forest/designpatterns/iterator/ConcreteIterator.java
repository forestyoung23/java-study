package com.forest.designpatterns.iterator;

import java.util.Vector;

/**
 * 具体迭代器
 *
 * @author Forest Dong
 * @date 2021年10月15日 11:41
 */
public class ConcreteIterator implements Iterator {
    private Vector vector = new Vector();

    /**
     * 定义当前游标
     */
    public int cursor = 0;

    public  ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    /**
     * 遍历到下一个元素
     *
     * @return
     */
    @Override
    public Object next() {
        return hasNext() ? vector.get(cursor++) : null;
    }

    /**
     * 是否已经遍历到尾部
     *
     * @return
     */
    @Override
    public boolean hasNext() {
        return cursor != vector.size();
    }

    /**
     * 删除当前指向的元素
     *
     * @return
     */
    @Override
    public boolean remove() {
        vector.remove(cursor);
        return true;
    }
}
