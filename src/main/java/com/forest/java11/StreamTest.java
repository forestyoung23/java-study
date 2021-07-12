package com.forest.java11;

import cn.hutool.core.util.StrUtil;

import java.util.List;

/**
 * Stream流处理增强
 *
 * @author dongyang
 * @date 2021年07月12日 15:01
 */
public class StreamTest {
    public static void main(String[] args) {
        var s = "world";
        var list = List.of(s, "java", "python", "go");
        list.stream().map(e -> "Hello, " + e)
                .forEach(System.out::println);
        /**
         * lambda表达式体为 true 打印，遇到 false则不再继续
         */
        list.stream().takeWhile(e -> !StrUtil.startWith(e, "p"))
                .forEach(System.out::println);

        System.out.println("--------------------------------");
        /**
         * lambda表达式体为true不打印，一直到遇到false开始打印
         */
        list.stream().dropWhile(e -> !StrUtil.startWith(e, "p"))
                .forEach(System.out::println);
        /*
        * ****OUTPUT****
        * Hello, world
        * Hello, java
        * Hello, python
        * Hello, go
        * world
        * java
        * --------------------------------
        * python
        * go
        * */
    }
}
