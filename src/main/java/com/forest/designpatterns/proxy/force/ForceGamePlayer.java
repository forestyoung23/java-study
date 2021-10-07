package com.forest.designpatterns.proxy.force;

/**
 * @author Forest Dong
 * @date 2021年10月06日 11:50
 */
public class ForceGamePlayer implements IForceGamePlayer {
    private IForceGamePlayer proxy;

    private String userName;

    public ForceGamePlayer(String userName) {
        this.userName = userName;
    }
    @Override
    public void login(String userName, String password) {
        if (isProxy()) {
            System.err.println("login");
        } else {
            System.err.println("not allow");
        }
    }

    @Override
    public void killBoss() {
        if (isProxy()) {
            System.err.println("killBoss()");
        } else {
            System.err.println("not allow");
        }
    }

    @Override
    public void upgrade() {
        if (isProxy()) {
            System.err.println("upgrade()");
        } else {
            System.err.println("not allow");
        }
    }

    @Override
    public IForceGamePlayer getProxy() {
        this.proxy = new ForceGamePlayerProxy(this);
        return proxy;
    }

    private boolean isProxy() {
        return proxy != null;
    }
}
