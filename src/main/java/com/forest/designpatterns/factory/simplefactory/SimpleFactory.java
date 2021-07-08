package com.forest.designpatterns.factory.simplefactory;

import com.forest.designpatterns.factory.CheesePizza;
import com.forest.designpatterns.factory.GreekPizza;
import com.forest.designpatterns.factory.Pizza;

/**
 * 简单工厂模式
 *
 * @author Forest
 * @date 2020年07月27日 23:51
 */
public class SimpleFactory {
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("greek")) {
            pizza = new GreekPizza();
        }
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        return pizza;
    }
}
