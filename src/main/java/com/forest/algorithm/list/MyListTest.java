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
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.err.println(list.get(i));
        }
    }

    @Test
    public void testAddIndex() {
        MyList<Integer> list = new MyList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add(5, 20);
        System.err.println( list);
    }

    @Test
    void testAddFirst() {
        MyList<Integer> list = new MyList<>();
        for (int i = 0; i < 100; i++) {
            list.addFirst(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.err.println(list.get(i));
        }
    }

    @Test
    void testAddLast() {
        MyList<Integer> list = new MyList<>();
        for (int i = 0; i < 100; i++) {
            list.addLast(i);
        }
        for (int i = 0; i < list.size(); i++) {
            System.err.println(list.get(i));
        }
    }

    @Test
    void testGet() {
        MyList<Integer> list = new MyList<>();
        for (int i = 1000; i < 10000; i++) {
            list.addLast(i);
        }
        System.err.println(list.get(8888));
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

    @Test
    void testRemove() {
        MyList<Integer> list = new MyList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        list.remove(7);
        System.err.println(list);
    }

    @Test
    void testRemoveEle() {
        MyList<Integer> list = new MyList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        list.removeEle(5);
        System.err.println(list);
    }

    @Test
    void testRemoveFirst() {
        MyList<Integer> list = new MyList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        list.removeFirst();
        System.err.println(list);
    }

    @Test
    void testRemoveLast() {
        MyList<Integer> list = new MyList<>();
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        list.removeLast();
        System.err.println(list);
    }

    @Test
    void testSize() {
        MyList<Integer> list = new MyList<>();
        System.err.println(list.size());
        for (int i = 1; i < 100; i++) {
            list.add(i);
        }
        System.err.println(list.size());
    }

    @Test
    void testClear() {
        MyList<Integer> list = new MyList<>();
        for (int i = 1; i < 100; i++) {
            list.add(i);
        }
        list.clear();
        System.err.println(list.size());
    }

    @Test
    void testDestroy() {
        MyList<Integer> list = new MyList<>();
        for (int i = 1; i < 100; i++) {
            list.add(i);
        }
        list.destroy();
        System.err.println(list);
    }

    @Test
    void testAddObject() {
        MyList<String> list = new MyList<>();
        list.add("1");
        list.add("2");
        System.err.println(list);
    }

    @Test
    void testAddAll() {
        MyList<String> list = new MyList<>();
        list.add("1");
        list.add("2");
        MyList<String> list1 = new MyList<>();
        list1.add("3");
        list1.add("4");
        list1.add("5");
        list1.add("6");
        list1.add("7");
        list1.add("8");
        list1.add("9");
        list1.add("10");
        list1.add("11");
        list.addAll(list1);
        System.err.println(list);
    }
}
