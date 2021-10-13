package com.forest.designpatterns.decorator;

/**
 * 场景类
 *
 * @author Forest Dong
 * @date 2021年10月13日 08:41
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.operate();
    }
}
