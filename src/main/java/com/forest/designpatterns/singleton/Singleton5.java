package com.forest.designpatterns.singleton;

/**
 * 懒汉式（双重检查，线程安全，推荐使用）
 *
 * @author Forest
 * @date 2020年07月26日 15:12
 */
public class Singleton5 {

    private Singleton5(){}

    private static Singleton5 singleton;

    public static Singleton5 getInstance() {
        if (null == singleton) {
            synchronized (Singleton5.class) {
                if (null == singleton) {
                    singleton = new Singleton5();
                }
            }
        }
        return singleton;
    }
}
