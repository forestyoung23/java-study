package com.forest.designpatterns.observer;

/**
 * 具体被观察者
 *
 * @author Forest Dong
 * @date 2021年10月25日 19:52
 */
public class ConcreteSubject extends Subject {

    /**
     * 具体的业务
     *
     * @param
     * @return
     * @author Forest Dong
     * @date 2021/10/25 下午7:53
     */
    public void doSomething() {
        super.notifyObservers();
    }
}
