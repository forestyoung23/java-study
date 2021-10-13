package com.forest.designpatterns.strategy;

/**
 * 场景类
 *
 * @author Forest Dong
 * @date 2021年10月13日 10:48
 */
public class Client {
    public static void main(String[] args) {
        ConcreteStrategy1 strategy1 = new ConcreteStrategy1();
        ConcreteStrategy2 strategy2 = new ConcreteStrategy2();
        Context context1 = new Context(strategy1);
        context1.doAnything();
        Context context2 = new Context(strategy2);
        context2.doAnything();
    }
}
