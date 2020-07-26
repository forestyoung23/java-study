package com.forest.designpatterns.singleton;

/**
 * 饿汉式（线程安全）
 *
 * @author Forest
 * @date 2020年07月26日 15:03
 */
public class Singleton1 {

    private Singleton1() {
    }

    private static final Singleton1 singleton = new Singleton1();

    public static Singleton1 getInstance() {
        return singleton;
    }
}
