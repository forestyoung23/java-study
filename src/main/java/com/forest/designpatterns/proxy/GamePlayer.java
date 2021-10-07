package com.forest.designpatterns.proxy;

/**
 * 真实主题类
 *
 * @author Forest Dong
 * @date 2021年10月06日 10:55
 */
public class GamePlayer implements IGamePlayer {
    private String userName;

    public GamePlayer(String userName) {
        this.userName = userName;
    }

    @Override
    public void login(String userName, String password) {
        System.err.println(userName + "登录成功！");
    }

    @Override
    public void killBoss() {
        System.err.println(userName + "killBoss()");
    }

    @Override
    public void upgrade() {
        System.err.println(userName + "upgrade()");
    }
}
