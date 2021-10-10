package com.forest.designpatterns.command.best;

import com.forest.designpatterns.command.Receiver;

/**
 * 完美的Command类
 *
 * @author Forest Dong
 * @date 2021年10月10日 17:47
 */
public abstract class Command {
    /**
     * 定义一个子类的全局共享变量
     */
    protected final Receiver receiver;

    /**
     * 实现类必须定义一个接收者
     * @param receiver
     */
    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 每个命令类都必须有一个执行命令的方法
     *
     * @param
     * @return
     * @author Forest Dong
     * @date 2021/10/10 下午5:49
     */
    public abstract void execute();
}
