package com.forest.designpatterns.proxy;

/**
 * 代理类
 *
 * @author Forest Dong
 * @date 2021年10月06日 11:03
 */
public class GamePlayerProxy implements IGamePlayer {
    private GamePlayer gamePlayer;

    public GamePlayerProxy(GamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }
    @Override
    public void login(String userName, String password) {
        gamePlayer.login(userName, password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }
}
