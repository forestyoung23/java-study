package com.forest.designpatterns.decorator;

/**
 * 具体的装饰类
 *
 * @author Forest Dong
 * @date 2021年10月13日 08:37
 */
public class ConcreteDecorator1 extends Decorator {
    /**
     * 通过构造函数传递被修饰者
     *
     * @param component
     */
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    /**
     * 装饰方法
     */
    private void decorate() {
        System.err.println("ConcreteDecorator1-->decorate");
    }

    /**
     * 重写父类的operate方法
     *
     * @param
     * @return
     * @author Forest Dong
     * @date 2021/10/13 上午8:38
     */
    @Override
    public void operate() {
        this.decorate();
        super.operate();
    }
}
