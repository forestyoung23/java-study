package com.forest.designpatterns.responsibilitychain;

/**
 * 场景类
 *
 * @author Forest Dong
 * @date 2021年10月11日 10:32
 */
public class Client {
    public static void main(String[] args) {
        // 声明所有的处理节点
        ConcreteHandler1 handler1 = new ConcreteHandler1();
        ConcreteHandler2 handler2 = new ConcreteHandler2();
        // 设置链中的阶段顺序
        handler1.setNext(handler2);
        Request request = new Request(1);
        // 提交请求，返回结果
        Response response = handler2.handle(request);
        System.err.println(response);
    }
}
