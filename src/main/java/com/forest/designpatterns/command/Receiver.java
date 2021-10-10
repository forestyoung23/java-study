package com.forest.designpatterns.command;

/**
 * 通用Receive类
 *
 * @author Forest Dong
 * @date 2021年10月10日 17:29
 */
public abstract class Receiver {
    /**
     * 抽象接收者，定义每个接收者都必须完成的业务
     *
     * @param
     * @return
     * @author Forest Dong
     * @date 2021/10/10 下午5:30
     */
    public abstract void doSomething();
}
