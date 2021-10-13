package com.forest.designpatterns.strategy;

/**
 * 封装角色
 *
 * @author Forest Dong
 * @date 2021年10月13日 10:45
 */
public class Context {
    // 抽象策略
    private Strategy strategy;

    /**
     * 构造函数设置具体策略
     * @param strategy
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 封装后的策略方法
     */
    public void doAnything() {
        this.strategy.doSomething();
    }
}
