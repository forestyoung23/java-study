package com.forest.designpatterns.command;

/**
 * 具体的Command类
 *
 * @author Forest Dong
 * @date 2021年10月10日 17:34
 */
public class ConcreteCommand2 extends Command {
    /**
     * 对哪个Receiver类进行命令处理
     */
    private Receiver receiver;

    /**
     * 构造函数传递接收者
     * @param receiver
     */
    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }
    /**
     * 必须实现一个命令
     *
     * @return
     * @author Forest Dong
     * @date 2021/10/10 下午5:33
     */
    @Override
    public void execute() {
        // 业务处理
        receiver.doSomething();
    }
}
