package com.forest.designpatterns.command;

/**
 * 抽象的Command类
 *
 * @author Forest Dong
 * @date 2021年10月10日 17:32
 */
public abstract class Command {
    /**
     * 每个命令类都必须有一个执行命令的方法
     *
     * @param
     * @return
     * @author Forest Dong
     * @date 2021/10/10 下午5:33
     */
    public abstract void execute();
}
