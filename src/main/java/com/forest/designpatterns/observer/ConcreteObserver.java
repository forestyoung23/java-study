package com.forest.designpatterns.observer;

/**
 * 具体的观察者
 *
 * @author Forest Dong
 * @date 2021年10月25日 19:54
 */
public class ConcreteObserver implements Observer {
    /**
     * 实现更新方法
     *
     * @param
     * @return
     * @author Forest Dong
     * @date 2021/10/25 下午7:54
     */
    @Override
    public void update() {
        System.err.println("接收到消息并进行处理！");
    }
}
