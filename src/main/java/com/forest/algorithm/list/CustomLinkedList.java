package com.forest.algorithm.list;

/**
 * 自定义链表
 *
 * @author Forest Dong
 * @date 2025年09月02日 20:32
 */
public class CustomLinkedList<T> {
    private Node head;

    private int size;

    public CustomLinkedList() {
    }

    public boolean add(T element) {
        Node<T> node = new Node<>(element, null);
        if (null == head) {
            this.head = node;
        } else {
            Node last = head;
            while (null != last.next) {
                last = last.next;
            }
            last.next = node;
        }
        size++;
        return true;
    }

    public boolean addFirst(T element) {
        if (null == head) {
            head = new Node<>(element, null);
        } else {
            head = new Node<>(element, head);
        }
        size++;
        return true;
    }

    public boolean addLast(T element) {
        return add(element);
    }

    public boolean add(int index, T element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node = new Node<>(element, null);
        Node<T> targetNode = head;
        for (int i = 0; i < index; i++) {
            if (i == index - 1) {
                targetNode.next = node;
            }
            targetNode = targetNode.next;
        }
        node.setNext(targetNode);
        size++;
        return true;
    }

    private static class Node<T> {
        private T element;
        private Node<T> next;

        public Node(T element, Node<T> next) {
            this.element = element;
            this.next = next;
        }

        public T getElement() {
            return element;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    @Override
    public String toString() {
        while (head != null) {
            System.out.println(head.getElement());
            head = head.getNext();
        }
        return super.toString();
    }
}
