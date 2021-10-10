package com.forest.designpatterns.command;

/**
 * 调用者Invoker类
 *
 * @author Forest Dong
 * @date 2021年10月10日 17:38
 */
public class Invoker {
    private Command command;

    /**
     * 接收命令
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行命令
     *
     * @param
     * @return
     * @author Forest Dong
     * @date 2021/10/10 下午5:40
     */
    public void action() {
        command.execute();
    }
}
