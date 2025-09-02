package com.forest.algorithm.list;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * 自定义顺序表
 *
 * @author Forest Dong
 * @date 2025年08月13日 23:23
 */
public class CustomArrayList<T> implements Collection<T> {
    /**
     * 元素集合
     */
    private Object[] elementData;

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
    public CustomArrayList() {
        // 懒加载（节省内存）
        elementData = EMPTY_ELEMENTS;
    }

    public CustomArrayList(int initialCapacity) {
        if (initialCapacity > 0) {
            elementData = new Object[initialCapacity];
        } else if (initialCapacity == 0) {
            elementData = EMPTY_ELEMENTS;
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
        elementData = null;
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
            elementData[i] = null;
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
    @SuppressWarnings("unchecked")
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return (T) elementData[index];
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
            if (element.equals(elementData[i])) {
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
    @Override
    public boolean add(T element) {
        if (size == elementData.length) {
            // 数组满则扩容
            grow(size + 1);
        }
        elementData[size++] = element;
        return true;
    }

    /**
     * @return boolean
     * @author Forest Dong
     * @date 2025/08/20 22:48:40
     */
    public Object[] grow(int minCapacity) {
        int oldCapacity = elementData.length;
        if (0 == oldCapacity) {
            // 初始化容量
            elementData = new Object[Math.max(minCapacity, DEFAULT_CAPACITY)];
            return elementData;
        } else  {
            int newCapacity = newLength(oldCapacity, minCapacity - oldCapacity, oldCapacity >> 1);
            // 扩容1.5倍
            elementData = Arrays.copyOf(elementData, newCapacity);
            return elementData;
        }
    }

    private static final int MAX_ARRAY_LENGTH = Integer.MAX_VALUE - 8;

    public static int newLength(int oldLength, int minGrowth, int prefGrowth) {
        int newLength = oldLength + Math.max(minGrowth, prefGrowth);
        if (newLength - MAX_ARRAY_LENGTH > 0) {
            if (newLength < 0) throw new OutOfMemoryError();
            return Integer.MAX_VALUE;
        }
        return newLength;
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
        if (size == elementData.length) {
            grow(size + 1);
        }
        for (int i = size; i > index; i--) {
            elementData[i] = elementData[i - 1];
        }
        // 或
        // System.arraycopy(elements, index, elements, index + 1, size - index);
        elementData[index] = element;
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

    @Override
    public boolean addAll(Collection<? extends T> c) {
        Object[] a = c.toArray();
        int numNew = a.length;
        if (numNew == 0) {
            return false;
        }
        Object[] elements;
        final int s;
        if ((s = size) > (elements = this.elementData).length - numNew) {
            elements = grow(s + numNew);
        }
        System.arraycopy(a, 0, elements, s, c.size());
        size = s + numNew;
        return true;
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
            elementData[i] = elementData[i + 1];
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
    public void removeEle(T element) {
        for (int i = 0; i < size; i++) {
            if (elementData[i].equals(element)) {
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

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elementData, size);
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}
