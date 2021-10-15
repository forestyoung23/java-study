package com.forest.designpatterns.iterator;

/**
 * 抽象容器
 *
 * @author Forest Dong
 * @date 2021年10月15日 13:48
 */
public interface Aggregate {
    /**
     * 添加元素
     *
     * @param object
     * @return
     * @author Forest Dong
     * @date 2021/10/15 下午1:57
     */
    void add(Object object);

    /**
     * 删除元素
     *
     * @param object
     * @return
     * @author Forest Dong
     * @date 2021/10/15 下午1:57
     */
    void remove(Object object);

    /**
     * 由迭代器遍历所有的元素
     *
     * @param
     * @return
     * @author Forest Dong
     * @date 2021/10/15 下午1:57
     */
    Iterator iterator();
}
