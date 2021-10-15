package com.forest.designpatterns.iterator;

import java.util.Vector;

/**
 * 具体的容器
 *
 * @author Forest Dong
 * @date 2021年10月15日 13:58
 */
public class ConcreteAggregate implements Aggregate {
    /**
     * 容纳兑现的容器
     */
    private Vector vector = new Vector();

    /**
     * 添加元素
     *
     * @param object
     * @return
     * @author Forest Dong
     * @date 2021/10/15 下午1:57
     */
    @Override
    public void add(Object object) {
        vector.add(object);
    }

    /**
     * 删除元素
     *
     * @param object
     * @return
     * @author Forest Dong
     * @date 2021/10/15 下午1:57
     */
    @Override
    public void remove(Object object) {
        vector.remove(object);
    }

    /**
     * 由迭代器遍历所有的元素
     *
     * @return
     * @author Forest Dong
     * @date 2021/10/15 下午1:57
     */
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(vector);
    }
}
