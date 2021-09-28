package com.forest.designpatterns.factory.simplefactory;

import com.forest.designpatterns.factory.Pizza;

import java.lang.reflect.InvocationTargetException;

/**
 * 简单工厂模式
 *
 * @author Forest
 * @date 2020年07月27日 23:51
 */
public class SimpleFactory {
    public static Pizza createPizza(Class<? extends Pizza> clazz) {
        Pizza pizza = null;
        try {
            pizza = (Pizza) Class.forName(clazz.getName()).getDeclaredConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return pizza;
    }
}
