package com.forest.java8;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 * @author dongyang
 * @date 2020年11月03日 14:29
 */
public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> consumer1 = new Consumer<String>() {

            /**
             * Performs this operation on the given argument.
             *
             * @param s the input argument
             */
            @Override
            public void accept(String s) {
                System.err.println(s);
            }
        };
        Stream<String> stream1 = Stream.of("aa", "cc", "dd", "bb");
        Stream<String> stream2 = Stream.of("aa", "cc", "dd", "bb");
        Stream<String> stream3 = Stream.of("aa", "cc", "dd", "bb");
        Stream<String> stream4 = Stream.of("aa", "cc", "dd", "bb");
        stream1.forEach(consumer1);
        System.err.println("----------------------------");
        Consumer<String> consumer2 = s -> System.err.println(s);
        stream2.forEach(consumer2);
        System.err.println("----------------------------");
        Consumer consumer3 = System.err::println;
        stream3.forEach(consumer3);
        System.err.println("----------------------------");
        stream4.forEach(System.err::println);
    }
}
