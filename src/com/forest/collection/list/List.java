package com.forest.collection.list;

/**
 * @author Forest
 * @date 2020年04月30日 10:12
 */
public interface List<E> {
    /**
     * List大小
     * 
     * @param 
     * @return 
     * @author Forest
     * @date 2020/4/30 10:16
    */
    int size();
    
    /**
     * 是否为空
     * 
     * @param 
     * @return 
     * @author Forest
     * @date 2020/4/30 10:16
    */
    boolean isEmpty();
    
    /**
     * 添加元素
     * 
     * @param data
     * @return 
     * @author Forest
     * @date 2020/4/30 10:16
    */
    boolean add(E data);

    /**
     * 指定位置添加元素
     * 
     * @param index,data
     * @return 
     * @author Forest
     * @date 2020/4/30 10:17
    */
    boolean add(int index, E data);

    /**
     * 获取指定位置的元素
     * 
     * @param index
     * @return 
     * @author Forest
     * @date 2020/4/30 10:21
    */
    E get(int index);
}
