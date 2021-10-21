package com.forest.designpatterns.composite;

/**
 * 抽象构件（安全模式）
 *
 * @author Forest Dong
 * @date 2021年10月21日 09:52
 */
public abstract class Component {
    /**
     * 个体和整体都具有的共享
     */
    public void doSomething() {
        // 编写业务逻辑
    }
}
