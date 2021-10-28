package com.forest.designpatterns.facade;

/**
 * 封装类
 *
 * @author Forest Dong
 * @date 2021年10月28日 09:17
 */
public class Context {
    private ClassA a = new ClassA();
    private ClassC c = new ClassC();

    public void complexMethod() {
        a.doSomethingA();
        c.doSomethingC();
    }
}
