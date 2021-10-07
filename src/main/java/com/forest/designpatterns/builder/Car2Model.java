package com.forest.designpatterns.builder;

/**
 * @author Forest Dong
 * @date 2021年09月30日 15:57
 */
public class Car2Model extends CarModel {
    @Override
    protected void start() {
        System.err.println("start2");
    }

    @Override
    protected void alarm() {
        System.err.println("alarm2");
    }

    @Override
    protected void stop() {
        System.err.println("stop2");
    }
}
