package com.forest.designpatterns.proxy;

/**
 * 抽象主题类
 *
 * @author Forest Dong
 * @date 2021年10月06日 10:54
 */
public interface IGamePlayer {
    void login(String userName, String password);
    void killBoss();
    void upgrade();
}
