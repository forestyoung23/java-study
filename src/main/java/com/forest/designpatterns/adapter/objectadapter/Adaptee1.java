package com.forest.designpatterns.adapter.objectadapter;

/**
 * @author Forest Dong
 * @date 2021年10月15日 08:54
 */
public class Adaptee1 implements IAdaptee1 {
    @Override
    public void request() {
        System.err.println("Adaptee1 request()");
    }
}
