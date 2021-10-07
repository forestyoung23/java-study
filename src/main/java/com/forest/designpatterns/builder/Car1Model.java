package com.forest.designpatterns.builder;

/**
 * @author Forest Dong
 * @date 2021年09月30日 15:56
 */
public class Car1Model extends CarModel {
    @Override
    protected void start() {
        System.err.println("start1");
    }

    @Override
    protected void alarm() {
        System.err.println("alarm1");
    }

    @Override
    protected void stop() {
        System.err.println("stop1");
    }
}
