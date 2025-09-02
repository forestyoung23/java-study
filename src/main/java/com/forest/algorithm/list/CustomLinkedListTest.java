package com.forest.algorithm.list;

import org.junit.jupiter.api.Test;

/**
 * @author Forest Dong
 * @date 2025年09月02日 20:55
 */
public class CustomLinkedListTest {
    @Test
    public void testAdd() {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.add(1);
        list.add(2);
        System.err.println(list);
    }

    @Test
    public void testAddFirst() {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        System.err.println(list);
    }

    @Test
    public void testAddLast() {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        System.err.println(list);
    }

    @Test
    public void testAddIndex() {
        CustomLinkedList<Integer> list = new CustomLinkedList<>();
        list.addLast(1);
        list.addLast(2);
        list.add(1, 3);
        System.err.println(list);
    }
}
