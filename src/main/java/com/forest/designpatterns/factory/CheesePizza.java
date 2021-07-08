package com.forest.designpatterns.factory;

/**
 * @author Forest
 * @date 2020年07月28日 00:00
 */
public class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.err.println("prepare");
    }

    @Override
    public void bake() {
        System.err.println("bake");
    }

    @Override
    public void cut() {
        System.err.println("cut");
    }

    @Override
    public void pack() {
        System.err.println("pack");
    }
}
