package com.forest.designpatterns.proxy.dynamic;

/**
 * @author Forest Dong
 * @date 2021年10月06日 14:20
 */
public class Client {
    public static void main(String[] args) {
        // GamePlayer player = new GamePlayer("张三");
        // GamePlayerIH gamePlayerIH = new GamePlayerIH(player);
        // ClassLoader classLoader = player.getClass().getClassLoader();
        // IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, new Class[]{IGamePlayer.class}, gamePlayerIH);
        // proxy.login("123", "123");
        // proxy.killBoss();
        // proxy.upgrade();
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstatnce(subject);
        proxy.doSomething("123");
    }
}
