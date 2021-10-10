package com.forest.designpatterns.command.best;

/**
 * @author Forest Dong
 * @date 2021年10月10日 17:54
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        ConcreteCommand1 command = new ConcreteCommand1();
        invoker.setCommand(command);
        invoker.action();
    }
}
