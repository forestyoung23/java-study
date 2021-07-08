package com.forest.concurrency;


import java.util.function.Consumer;

/**
 * @author Forest
 * @date 2020年06月23日 14:07
 */
public class TaskBufferUtil {

    public static void main(String[] args) {
        Consumer<Exception> consumer = (e) -> System.out.println("Hello" + e.getMessage());
        consumer.accept(new Exception("123"));
    }
}
