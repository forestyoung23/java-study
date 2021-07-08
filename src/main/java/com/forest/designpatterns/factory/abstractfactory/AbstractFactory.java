package com.forest.designpatterns.factory.abstractfactory;

import com.forest.designpatterns.factory.Pizza;

/**
 * 抽象工厂模式
 *
 * @author Forest
 * @date 2020年07月28日 00:11
 */
public interface AbstractFactory {
    Pizza createPizza(String type);
}
