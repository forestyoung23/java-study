package com.forest.designpatterns.proxy.force;

/**
 * @author Forest Dong
 * @date 2021年10月06日 14:00
 */
public class Client {
    public static void main(String[] args) {
        IForceGamePlayer player = new ForceGamePlayer("123").getProxy();
        player.login("qwe", "1234");
        player.killBoss();
        player.upgrade();
        ForceGamePlayerProxy playerProxy = new ForceGamePlayerProxy(new ForceGamePlayer("123"));
        playerProxy.login("qwe", "1234");
        playerProxy.killBoss();
        playerProxy.upgrade();
    }
}
