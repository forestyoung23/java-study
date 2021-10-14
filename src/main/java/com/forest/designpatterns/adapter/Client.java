package com.forest.designpatterns.adapter;

/**
 * @author Forest Dong
 * @date 2021年10月14日 18:05
 */
public class Client {
    public static void main(String[] args) {
        // 原有的业务处理
        Target target = new ConcreteTarget();
        target.request();
        // 现在增加了适配器角色后的业务处理
        Target target1 = new Adapter();
        target1.request();
    }
}
