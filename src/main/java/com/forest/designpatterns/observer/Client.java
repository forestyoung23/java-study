package com.forest.designpatterns.observer;

/**
 * 场景类
 *
 * @author Forest Dong
 * @date 2021年10月25日 19:56
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver();
        subject.addObserver(observer);
        subject.doSomething();
    }
}
