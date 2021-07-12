package com.forest.java11;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合增强
 * 自Java9开始，Jdk里面为集合（List/Set/Map）都添加了of和copyOf方法，它们两个都用来创建不可变的集合
 *
 * @author dongyang
 * @date 2021年07月12日 14:33
 */
public class CollectionsTest {
    public static void main(String[] args) {
        var list1 = List.of("a", "b", "c");
        var list2 = List.copyOf(list1);
        System.err.println(list1 == list2);
        var list3 = new ArrayList<>();
        var list4 = List.copyOf(list3);
        System.err.println(list3 == list4);
        /*
        * ****OUTPUT****
        * true
        * false
        * */
    }
}
