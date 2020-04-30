package com.forest.collection.list;

import java.util.Arrays;

/**
 * @author Forest
 * @date 2020年04月30日 10:12
 */
public class MyList<E> implements List<E> {

    Object[] element;

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    private static final Integer DEFAULT_CAPACITY = 10;

    private int size = 0;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (0 == size()) {
            return true;
        }
        return false;
    }

    /**
     * 添加元素
     * 
     * @param 
     * @return 
     * @author Forest
     * @date 2020/4/30 10:32
    */
    @Override
    public boolean add(Object data) {
        checkSize();
        element[size++] = data;
        return true;
    }

    /**
     * 校验数组容量，如果已达上限，进行扩容操作
     * 
     * @param 
     * @return 
     * @author Forest
     * @date 2020/4/30 14:39
    */
    private void checkSize() {
        if (element.length <= size) {
            element = Arrays.copyOf(element, size + 5);
        }
    }

    @Override
    public boolean add(int index, Object data) {
        checkSize();
        System.arraycopy(element, index, element, index + 1, size - index);
        element[index] = data;
        size ++;
        return true;
    }

    @Override
    public E get(int index) {
        return (E) element[index];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object o : element) {
            if (null != o) {
                sb.append(o.toString() + ",");
            }
        }
        if (sb.length() == 0) {
            return sb.toString();
        } else {
            return sb.delete(sb.length()-1, sb.length()).toString();
        }
    }

    public static void main(String[] args) {
        int i = 13 >> 1;
        System.err.println(i);
    }
}
