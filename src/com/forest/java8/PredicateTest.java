package com.forest.java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author dongyang
 * @date 2020年11月03日 15:21
 */
public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> predicate = new Predicate<String>() {

            /**
             * Evaluates this predicate on the given argument.
             *
             * @param s the input argument
             * @return {@code true} if the input argument matches the predicate,
             * otherwise {@code false}
             */
            @Override
            public boolean test(String s) {
                return s.startsWith("s");
            }
        };
        System.err.println(predicate.test("stre"));
        System.err.println(predicate.test("fadf"));
        predicate = s -> s.startsWith("s");
        System.out.println(predicate.test("start"));

        //① 将Predicate作为filter接口，Predicate起到一个判断的作用
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer > 5){
                    return true;
                }
                return false;
            }
        };

        Stream<Integer> stream = Stream.of(1, 23, 3, 4, 5, 56, 6, 6);
        List<Integer> list = stream.filter(predicate1).collect(Collectors.toList());
        list.forEach(System.out::println);

        System.out.println("********************");
    }
}
