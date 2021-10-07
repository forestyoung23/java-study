package com.forest.designpatterns.proxy.normal;

import com.forest.designpatterns.proxy.GamePlayer;
import com.forest.designpatterns.proxy.IGamePlayer;

/**
 * 普通代理模式
 * 客户端只能访问代理角色，不能直接访问真实角色
 *
 * @author Forest Dong
 * @date 2021年10月06日 11:42
 */
public class NormalGamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;

    public NormalGamePlayerProxy(String userName) {
        gamePlayer = new GamePlayer(userName);
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
