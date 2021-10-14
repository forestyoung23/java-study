package com.forest.designpatterns.adapter;

/**
 * 适配器角色
 *
 * @author Forest Dong
 * @date 2021年10月14日 18:04
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
