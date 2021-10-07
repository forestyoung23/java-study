package com.forest.designpatterns.proxy.force;

/**
 * @author Forest Dong
 * @date 2021年10月06日 11:49
 */
public interface IForceGamePlayer {
    void login(String userName, String password);
    void killBoss();
    void upgrade();
    IForceGamePlayer getProxy();
}
