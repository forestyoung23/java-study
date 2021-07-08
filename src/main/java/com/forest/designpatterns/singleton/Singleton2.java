package com.forest.designpatterns.singleton;

/**
 * 饿汉式（静态代码块，线程安全）
 *
 * @author Forest
 * @date 2020年07月26日 15:05
 */
public class Singleton2 {
    private Singleton2() {

    }

    private static Singleton2 singleton;

    static {
        singleton = new Singleton2();
    }

    public static Singleton2 getSingleton() {
        return singleton;
    }
}
