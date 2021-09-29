package com.forest.designpatterns.templatemethod;

/**
 * @author Forest Dong
 * @date 2021年09月29日 19:05
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

    @Override
    protected boolean isAlarm() {
        return false;
    }
}
