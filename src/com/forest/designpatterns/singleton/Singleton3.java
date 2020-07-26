package com.forest.designpatterns.singleton;

/**
 * 懒汉式（线程不安全）
 *
 * @author Forest
 * @date 2020年07月26日 15:08
 */
public class Singleton3 {
    private Singleton3() {
    }

    private static Singleton3 singleton;

    public static Singleton3 getInstance() {
        if (null == singleton) {
            singleton = new Singleton3();
        }
        return singleton;
    }
}
