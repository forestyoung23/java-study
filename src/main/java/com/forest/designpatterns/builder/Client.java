package com.forest.designpatterns.builder;

import java.util.Arrays;
import java.util.List;

/**
 * @author Forest Dong
 * @date 2021年09月30日 17:15
 */
public class Client {
    public static void main(String[] args) {
        List<String> order = Arrays.asList("start", "stop", "alarm");
        Car1Builder builder = new Car1Builder();
        builder.setOrder(order);
        builder.build().run();
    }
}
