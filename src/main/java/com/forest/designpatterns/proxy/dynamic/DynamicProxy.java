package com.forest.designpatterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author Forest Dong
 * @date 2021年10月06日 14:36
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        // 需要JoinPoint连接点，AOP框架使用元数据定义
        if (true) {
            // 执行一个前置通知
        }
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
