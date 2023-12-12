package com.forest.algorithm.stack;

/**
 * 使用链表实现栈
 *
 * @author Forest Dong
 * @date 2023年12月12日 19:31
 */
public class LinkedListStack<T> {
    /**
     * 头节点作为栈顶
     */
    private ListNode<T> stackTop;

    /**
     * 栈元素数量
     */
    private int size = 0;

    /**
     * 是否为空
     *
     * @return boolean
     * @author Forest Dong
     * @date 2023/12/12 19:43
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 元素数量
     *
     * @return int
     * @author Forest Dong
     * @date 2023/12/12 19:43
     */
    public int size() {
        return size;
    }

    /**
     * 往栈顶添加元素
     *
     * @param e
     * @author Forest Dong
     * @date 2023/12/12 19:43
     */
    public void push(T e) {
        ListNode<T> node = new ListNode<>(e);
        node.next = stackTop;
        stackTop = node;
        size++;
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
        stackTop = stackTop.next;
        size--;
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
        if (isEmpty()) {
            throw new IndexOutOfBoundsException();
        }
        return stackTop.value;
    }

    private static class ListNode<T> {
        private T value;

        private ListNode<T> next;

        public ListNode(T value) {
            this.value = value;
        }

        public ListNode(T value, ListNode<T> next) {
            this.value = value;
            this.next = next;
        }

        public ListNode<T> next() {
            return this.next;
        }

        public T value() {
            return this.value;
        }
    }

    public static void main(String[] args) {
        LinkedListStack<Integer> stack = new LinkedListStack<>();
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
