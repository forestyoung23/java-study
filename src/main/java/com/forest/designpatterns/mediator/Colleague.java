package com.forest.designpatterns.mediator;

/**
 * 抽象同事类
 *
 * @author Forest Dong
 * @date 2021年10月08日 10:30
 */
public abstract class Colleague {
    protected Mediator mediator;
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
