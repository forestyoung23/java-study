package com.forest.designpatterns.memento.clone;

/**
 * 场景类
 *
 * @author Forest Dong
 * @date 2021年11月02日 18:34
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("初始状态");
        System.err.println(originator.getState());
        originator.createMemento();
        originator.setState("修改状态");
        System.err.println(originator.getState());
        originator.restoreMemento();
        System.err.println(originator.getState());
    }
}
