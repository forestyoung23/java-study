package com.forest.designpatterns.proxy;

/**
 * 真实主题类
 *
 * @author Forest Dong
 * @date 2021年10月06日 11:23
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.err.println("request");
    }
}
