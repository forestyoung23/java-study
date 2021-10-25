package com.forest.designpatterns.observer;

import java.util.Vector;

/**
 * 被观察者
 *
 * @author Forest Dong
 * @date 2021年10月25日 19:50
 */
public abstract class Subject {
    /**
     * 定义一个观察者集合
     */
    private Vector<Observer> observerVector = new Vector<Observer>();

    /**
     * 增加一个观察者
     *
     * @param observer
     * @return
     * @author Forest Dong
     * @date 2021/10/25 下午7:55
     */
    public void addObserver(Observer observer) {
        this.observerVector.add(observer);
    }

    /**
     * 删除一个观察者
     *
     * @param observer
     * @return
     * @author Forest Dong
     * @date 2021/10/25 下午7:56
     */
    public void delObserver(Observer observer) {
        this.observerVector.remove(observer);
    }

    /**
     * 通知所有观察者
     *
     * @param
     * @return
     * @author Forest Dong
     * @date 2021/10/25 下午7:56
     */
    public void notifyObservers() {
        for (Observer observer : observerVector) {
            observer.update();
        }
    }
}
