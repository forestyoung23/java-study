package com.forest.algorithm.list;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;

/**
 * 自定义线性表
 *
 * @author Forest Dong
 * @date 2025年08月13日 23:23
 */
public class MyList<T> {
    /**
     * 元素集合
     */
    private Object[] elements;

    /**
     * 元素个数
     */
    private int size;

    private static final Object[] EMPTY_ELEMENTS = {};

    private static final int DEFAULT_CAPACITY = 10;

    /**
     * 初始化
     *
     * @author Forest Dong
     * @date 2025/08/18 22:43:25
     */
    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int initialCapacity) {
        if (initialCapacity > 0) {
            elements = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            elements = EMPTY_ELEMENTS;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " +
                    initialCapacity);
        }
    }

    /**
     * 销毁
     *
     * @author Forest Dong
     * @date 2025/08/18 22:42:54
     */
    public void destroy() {
        elements = null;
        size = 0;
    }

    /**
     * 清空
     *
     * @author Forest Dong
     * @date 2025/08/18 22:43:06
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    /**
     * 获取指定下标元素
     *
     * @param index
     * @return {@link T }
     * @author Forest Dong
     * @date 2025/08/18 23:07:10
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elements[index];
    }

    /**
     * 获取队头元素
     *
     * @return {@link T }
     * @author Forest Dong
     * @date 2025/08/18 23:13:47
     */
    public T getFirst() {
        return get(0);
    }

    /**
     * 获取队尾元素
     *
     * @return {@link T }
     * @author Forest Dong
     * @date 2025/08/18 23:14:01
     */
    public T getLast() {
        return get(size - 1);
    }

    /**
     * 获取指定元素下标
     *
     * @param element
     * @return int
     * @author Forest Dong
     * @date 2025/08/18 23:06:51
     */
    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (element.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 添加元素
     *
     * @param element
     * @author Forest Dong
     * @date 2025/08/18 22:44:27
     */
    public void add(T element) {
        elements[size++] = element;
    }

    /**
     * 插入（指定位置插入）
     *
     * @param index
     * @param element
     * @author Forest Dong
     * @date 2025/08/18 22:58:00
     */
    public void add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;
    }

    /**
     * 队头插入
     *
     * @param element
     * @author Forest Dong
     * @date 2025/08/18 22:57:55
     */
    public void addFirst(T element) {
        add(0, element);
    }

    /**
     * 队尾插入
     *
     * @param element
     * @author Forest Dong
     * @date 2025/08/18 22:58:25
     */
    public void addLast(T element) {
        add(element);
    }

    /**
     * 删除（指定位置删除）
     *
     * @param index
     * @return {@link T }
     * @author Forest Dong
     * @date 2025/08/18 23:00:33
     */
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    /**
     * 删除指定元素
     *
     * @param element
     * @author Forest Dong
     * @date 2025/08/18 23:10:12
     */
    public void remove(T element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element)) {
                remove(i);
            }
        }
    }

    /**
     * 删除队头元素
     *
     * @author Forest Dong
     * @date 2025/08/18 23:05:29
     */
    public void removeFirst() {
        remove(0);
    }

    /**
     * 删除队尾元素
     *
     * @author Forest Dong
     * @date 2025/08/18 23:05:55
     */
    public void removeLast() {
        remove(size - 1);
    }

    /**
     * 返回元素个数
     *
     * @return int
     * @author Forest Dong
     * @date 2025/08/18 22:50:05
     */
    public int size() {
        return size;
    }
}
