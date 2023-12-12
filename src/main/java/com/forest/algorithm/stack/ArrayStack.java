package com.forest.algorithm.stack;

import java.util.ArrayList;

/**
 * 使用数组实现栈
 *
 * @author Forest Dong
 * @date 2023年12月12日 20:26
 */
public class ArrayStack<T> {
    /**
     * 栈元素
     */
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
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return list.remove(list.size() - 1);
    }

    /**
     * 获取栈顶元素（不删除）
     *
     * @return {@link T }
     * @author Forest Dong
     * @date 2023/12/12 19:44
     */
    public T peek() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        System.err.println("当前栈是否为空:" + stack.isEmpty());
        System.err.println("当前栈元素个数:" + stack.size());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.err.println("当前栈是否为空:" + stack.isEmpty());
        System.err.println("当前栈元素个数:" + stack.size());
        System.err.println("peek第一个元素,元素值为:" + stack.peek() + ",peek后元素个数为:" + stack.size());
        System.err.println("pop第一个元素,元素值为:" + stack.pop() + ",pop后元素个数为:" + stack.size());
        System.err.println("peek第二个元素,元素值为:" + stack.peek() + ",peek后元素个数为:" + stack.size());
        System.err.println("pop第二个元素,元素值为:" + stack.pop() + ",pop后元素个数为:" + stack.size());
        System.err.println("peek第三个元素,元素值为:" + stack.peek() + ",peek后元素个数为:" + stack.size());
        System.err.println("pop第三个元素,元素值为:" + stack.pop() + ",pop后元素个数为:" + stack.size());
        System.err.println("peek第四个元素,元素值为:" + stack.peek() + ",peek后元素个数为:" + stack.size());
        System.err.println("pop第四个元素,元素值为:" + stack.pop() + ",pop后元素个数为:" + stack.size());
    }
}
