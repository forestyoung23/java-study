package com.forest.designpatterns.proxy.dynamic;

/**
 * @author Forest Dong
 * @date 2021年10月06日 14:30
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.err.println("do something!---->" + str);
    }
}
