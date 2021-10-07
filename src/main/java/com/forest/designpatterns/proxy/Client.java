package com.forest.designpatterns.proxy;

/**
 * @author Forest Dong
 * @date 2021年10月06日 11:04
 */
public class Client {
    public static void main(String[] args) {
        // ForceGamePlayer player = new ForceGamePlayer("三哥");
        // ForceGamePlayerProxy proxy = new ForceGamePlayerProxy(player);
        // proxy.login("三哥", "1234");
        // proxy.killBoss();
        // proxy.upgrade();
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
