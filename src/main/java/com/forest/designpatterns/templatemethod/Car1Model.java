package com.forest.designpatterns.templatemethod;

/**
 * @author Forest Dong
 * @date 2021年09月29日 19:04
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

    @Override
    protected boolean isAlarm() {
        return super.isAlarm();
    }
}
