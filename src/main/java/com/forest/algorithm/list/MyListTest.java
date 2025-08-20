package com.forest.algorithm.list;

import org.junit.jupiter.api.Test;

/**
 * @author Forest Dong
 * @date 2025年08月20日 22:45
 */
public class MyListTest {

    @Test
    public void testAdd() {
        MyList<Integer> list = new MyList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.err.println(list.get(i));
        }
    }

    @Test
    void testAddFirst() {
        MyList<Integer> list = new MyList<>();
        for (int i = 0; i < 100000; i++) {
            list.addFirst(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.err.println(list.get(i));
        }
    }

    @Test
    void testAddLast() {
        MyList<Integer> list = new MyList<>();
        for (int i = 0; i < 100000; i++) {
            list.addLast(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.err.println(list.get(i));
        }
    }

    @Test
    void testGet() {
        MyList<Integer> list = new MyList<>();
        for (int i = 1000; i < 100000; i++) {
            list.addLast(i);
        }
        System.err.println(list.get(9000));
    }

    @Test
    void testGetFirst() {
        MyList<Integer> list = new MyList<>();
        for (int i = 1000; i < 100000; i++) {
            list.addLast(i);
        }
        System.err.println(list.getFirst());
    }

    @Test
    void testGetLast() {
        MyList<Integer> list = new MyList<>();
        for (int i = 1; i < 100; i++) {
            list.addLast(i);
        }
        System.err.println(list.getLast());
    }

    @Test
    void testIndexOf() {
        MyList<Integer> list = new MyList<>();
        for (int i = 1; i < 100; i++) {
            list.addLast(i);
        }
        System.err.println(list.indexOf(89));
    }
}
