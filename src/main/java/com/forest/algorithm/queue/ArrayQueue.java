package com.forest.algorithm.queue;

import java.util.ArrayList;

/**
 * 使用数组实现队列
 *
 * @author Forest Dong
 * @date 2023年12月12日 21:26
 */
public class ArrayQueue<T> {
    private ArrayList<T> list = new ArrayList<>();
    /**
     * 是否为空
     *
     * @return boolean
     * @author Forest Dong
     * @date 2023/12/12 19:43
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * 元素数量
     *
     * @return int
     * @author Forest Dong
     * @date 2023/12/12 19:43
     */
    public int size() {
        return list.size();
    }

    /**
     * 往栈顶添加元素
     *
     * @param e
     * @author Forest Dong
     * @date 2023/12/12 19:43
     */
    public void push(T e) {
    }

    /**
     * 从栈顶移除元素
     *
     * @return {@link T }
     * @author Forest Dong
     * @date 2023/12/12 19:43
     */
    public T pop() {
        return null;
    }

    /**
     * 获取栈顶元素（不删除）
     *
     * @return {@link T }
     * @author Forest Dong
     * @date 2023/12/12 19:44
     */
    public T peek() {
        return null;
    }
}
