package com.forest.designpatterns.proxy.dynamic;

/**
 * @author Forest Dong
 * @date 2021年10月06日 14:45
 */
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstatnce(T subject) {
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        MyInvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(classLoader, interfaces, handler);
    }
}
