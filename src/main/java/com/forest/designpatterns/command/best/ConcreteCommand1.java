package com.forest.designpatterns.command.best;

import com.forest.designpatterns.command.ConcreteReceiver1;
import com.forest.designpatterns.command.Receiver;

/**
 * 具体的命令
 *
 * @author Forest Dong
 * @date 2021年10月10日 17:50
 */
public class ConcreteCommand1 extends Command {
    /**
     * 声明自己的默认接收者
     */
    public ConcreteCommand1() {
        super(new ConcreteReceiver1());
    }

    /**
     * 设置新的接收者
     *
     * @param receiver
     */
    public ConcreteCommand1(Receiver receiver) {
        super(new ConcreteReceiver1());
    }

    /**
     * 每个命令类都必须有一个执行命令的方法
     *
     * @return
     * @author Forest Dong
     * @date 2021/10/10 下午5:49
     */
    @Override
    public void execute() {
        receiver.doSomething();
    }
}
