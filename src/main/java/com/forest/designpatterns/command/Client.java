package com.forest.designpatterns.command;

/**
 * @author Forest Dong
 * @date 2021年10月10日 17:39
 */
public class Client {
    public static void main(String[] args) {
        // 声明调用者
        Invoker invoker = new Invoker();
        // 定义接收者
        ConcreteReceiver1 receiver = new ConcreteReceiver1();
        // 定义发送给接收者的命令
        ConcreteCommand1 command = new ConcreteCommand1(receiver);
        // 把命令交给调用者执行
        invoker.setCommand(command);
        invoker.action();
    }
}
