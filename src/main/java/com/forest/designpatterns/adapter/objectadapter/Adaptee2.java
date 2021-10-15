package com.forest.designpatterns.adapter.objectadapter;

/**
 * @author Forest Dong
 * @date 2021年10月15日 08:55
 */
public class Adaptee2 implements IAdaptee2 {
    @Override
    public void request() {
        System.err.println("Adaptee2 request()");
    }
}
