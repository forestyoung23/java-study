package com.forest.designpatterns.strategy;

/**
 * 具体的策略角色
 *
 * @author Forest Dong
 * @date 2021年10月13日 10:44
 */
public class ConcreteStrategy2 implements Strategy {
    @Override
    public void doSomething() {
        System.err.println("ConcreteStrategy2-->doSomething");
    }
}
