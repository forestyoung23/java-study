package com.forest.designpatterns.singleton;

/**
 * 懒汉式（线程安全，性能差）
 *
 * @author Forest
 * @date 2020年07月26日 15:11
 */
public class Singleton4 {
    private Singleton4() {
    }

    private static Singleton4 singleton;

    public static synchronized Singleton4 getInstance() {
        if (null == singleton) {
            singleton = new Singleton4();
        }
        return singleton;
    }
}
