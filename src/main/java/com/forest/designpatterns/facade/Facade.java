package com.forest.designpatterns.facade;

/**
 * 门面对象
 *
 * @author Forest Dong
 * @date 2021年10月28日 09:08
 */
public class Facade {
    /**
     * 被委托的对象
     */
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    private Context context = new Context();

    /**
     * 提供给外部访问的方法
     */
    public void methodA() {
        a.doSomethingA();
    }

    public void methodB() {
        b.doSomethingB();
    }

    public void methodC() {
        // c.doSomethingC();
        context.complexMethod();
    }
}
