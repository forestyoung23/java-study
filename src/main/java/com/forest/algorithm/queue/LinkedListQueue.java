package com.forest.algorithm.queue;

/**
 * 使用链表实现队列
 *
 * @author Forest Dong
 * @date 2023年12月12日 21:10
 */
public class LinkedListQueue<T> {
    /**
     * 头节点和尾节点
     */
    private ListNode<T> head, tail;

    /**
     * 队列元素数量
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
        if (null == head) {
            head = node;
        } else if (null == tail) {
            tail = node;
            head.next = tail;
        } else {
            tail.next = node;
        }
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
        head = head.next();
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
        return head.value;
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
        LinkedListQueue<Integer> queue = new LinkedListQueue<>();
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
