package com.forest.designpatterns.decorator;

/**
 * @author Forest Dong
 * @date 2021年10月13日 08:44
 */
public class ConcreteDecorator2 extends Decorator {
    /**
     * 通过构造函数传递被修饰者
     *
     * @param component
     */
    public ConcreteDecorator2(Component component) {
        super(component);
    }

    /**
     * 装饰方法
     */
    private void decorate() {
        System.err.println("ConcreteDecorator2-->decorate");
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
