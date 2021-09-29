package com.forest.designpatterns.factory.abstractfactory;

/**
 * 工厂生成器
 *
 * @author Forest
 * @date 2020年07月28日 00:17
 */
public class  FactoryBuilder {
    private AbstractFactory getFactory(String type) {
        if ("BJ".equals(type)) {
            return new BJFactory();
        }
        if ("LD".equals(type)) {
            return new LDFactory();
        }
        return null;
    }
}
