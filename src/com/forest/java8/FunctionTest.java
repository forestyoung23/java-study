package com.forest.java8;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author dongyang
 * @date 2020年11月03日 17:10
 */
public class FunctionTest {
    public static void main(String[] args) {
        //① 使用map方法，泛型的第一个参数是转换前的类型，第二个是转化后的类型
        Function<String, Integer> function = s -> {
            return s.length();//获取每个字符串的长度，并且返回
        };

        Stream<String> stream = Stream.of("aaa", "bbbbb", "ccccccv");
        Stream<Integer> stream1 = stream.map(function);
        stream1.forEach(System.out::println);

        System.out.println("********************");
    }
}
