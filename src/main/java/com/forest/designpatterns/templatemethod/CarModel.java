package com.forest.designpatterns.templatemethod;

/**
 *
 * @author Forest Dong
 * @date 2021年09月29日 18:09
 */
public abstract class CarModel {
    protected abstract void start();
    protected abstract void alarm();
    protected abstract void stop();
    public final void run() {
        start();
        if (isAlarm()) {
            alarm();
        }
        stop();
    }

    protected boolean isAlarm() {
        return true;
    }
}
