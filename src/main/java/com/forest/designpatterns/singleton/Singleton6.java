package com.forest.designpatterns.singleton;

/**
 * 懒汉式（加载外部类时静态内部类不会被加载，推荐使用）
 *
 * @author Forest
 * @date 2020年07月26日 15:19
 */
public class Singleton6 {
    private Singleton6() {
    }

    private static class SingletonInstance {
        private static final Singleton6 singleton = new Singleton6();
    }

    public static synchronized Singleton6 getInstance() {
        return SingletonInstance.singleton;
    }
}
