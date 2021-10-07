package com.forest.designpatterns.proxy.force;


/**
 * 强制代理模式
 *
 * @author Forest Dong
 * @date 2021年10月06日 11:52
 */
public class ForceGamePlayerProxy implements IForceGamePlayer {
    private IForceGamePlayer gamePlayer;

    public ForceGamePlayerProxy(ForceGamePlayer forceGamePlayer) {
        this.gamePlayer = forceGamePlayer;
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

    @Override
    public IForceGamePlayer getProxy() {
        return this;
    }
}
