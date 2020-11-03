package com.forest.java8;

import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author dongyang
 * @date 2020年11月03日 15:04
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            /**
             * Gets a result.
             *
             * @return a result
             */
            @Override
            public Integer get() {
                return new Random().nextInt();
            }
        };
        System.err.println(supplier1.get());
        Supplier<Integer> supplier2 = () -> new Random().nextInt();
        System.err.println(supplier2.get());
        Supplier<Double> supplier3 = Math::random;
        System.err.println(supplier3.get());
        System.err.println("----------------------");
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
        //返回一个optional对象
        Optional<Integer> first = stream.filter(i -> i > 4)
                .findFirst();

        //optional对象有需要Supplier接口的方法
        //orElse，如果first中存在数，就返回这个数，如果不存在，就放回传入的数
        System.out.println(first.orElse(1));
        System.out.println(first.orElse(7));

        System.out.println("********************");

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                //返回一个随机值
                return new Random().nextInt();
            }
        };
        //orElseGet，如果first中存在数，就返回这个数，如果不存在，就返回supplier返回的值
        System.out.println(first.orElseGet(supplier));
    }
}
