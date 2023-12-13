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
        list.add(e);
    }

    /**
     * 从栈顶移除元素
     *
     * @return {@link T }
     * @author Forest Dong
     * @date 2023/12/12 19:43
     */
    public T pop() {
        T result = peek();
        list.remove(0);
        return result;
    }

    /**
     * 获取栈顶元素（不删除）
     *
     * @return {@link T }
     * @author Forest Dong
     * @date 2023/12/12 19:44
     */
    public T peek() {
        if (0 == size()) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        System.err.println("当前栈是否为空:" + queue.isEmpty());
        System.err.println("当前栈元素个数:" + queue.size());
        queue.push(1);
        queue.push(2);
        queue.push(3);
        System.err.println("当前栈是否为空:" + queue.isEmpty());
        System.err.println("当前栈元素个数:" + queue.size());
        System.err.println("peek第一个元素,元素值为:" + queue.peek() + ",peek后元素个数为:" + queue.size());
        System.err.println("pop第一个元素,元素值为:" + queue.pop() + ",pop后元素个数为:" + queue.size());
        System.err.println("peek第二个元素,元素值为:" + queue.peek() + ",peek后元素个数为:" + queue.size());
        System.err.println("pop第二个元素,元素值为:" + queue.pop() + ",pop后元素个数为:" + queue.size());
        System.err.println("peek第三个元素,元素值为:" + queue.peek() + ",peek后元素个数为:" + queue.size());
        System.err.println("pop第三个元素,元素值为:" + queue.pop() + ",pop后元素个数为:" + queue.size());
        System.err.println("peek第四个元素,元素值为:" + queue.peek() + ",peek后元素个数为:" + queue.size());
        System.err.println("pop第四个元素,元素值为:" + queue.pop() + ",pop后元素个数为:" + queue.size());
    }
}
