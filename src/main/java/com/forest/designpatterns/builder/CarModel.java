package com.forest.designpatterns.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Forest Dong
 * @date 2021年09月30日 15:56
 */
public abstract class CarModel {
    private List<String> order = new ArrayList<>();
    protected abstract void start();
    protected abstract void alarm();
    protected abstract void stop();

    public final void run() {
        for (String s : order) {
            if ("start".equals(s)) {
                start();
            } else if ("alarm".equals(s)) {
                alarm();
            } else if ("stop".equals(s)) {
                stop();
            }
        }
    }

    final public void setOrder(List<String> order) {
        this.order = order;
    }
}
