package com.forest.designpatterns.proxy;

/**
 * 代理类
 *
 * @author Forest Dong
 * @date 2021年10月06日 11:23
 */
public class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    private void before() {
        System.err.println("before()");
    }

    private void after() {
        System.err.println("after()");
    }
}
