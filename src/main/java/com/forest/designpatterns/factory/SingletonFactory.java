package com.forest.designpatterns.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 相对于直接new产生对象，反射在效率上要慢很多，
 * 所以这里只是提供一种单例实现参考，实际还是建议使用双重检查锁或者静态内部类等单例模式实现
 *
 * @author Forest Dong
 * @date 2021年09月28日 10:37
 */
public class SingletonFactory {

    public static synchronized <T> T getSingleton(Class<T> clazz) {
        try {
            Class<T> cl = (Class<T>) Class.forName(clazz.getName());
            // 获取无参构造
            Constructor<T> constructor = cl.getDeclaredConstructor();
            // 设置无参构造可访问
            constructor.setAccessible(true);
            // 产生实例对象并返回
            return constructor.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
