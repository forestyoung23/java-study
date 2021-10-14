package com.forest.designpatterns.adapter;

/**
 * 目标角色的实现类
 *
 * @author Forest Dong
 * @date 2021年10月14日 18:02
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.err.println("request");
    }
}
