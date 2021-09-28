package com.forest.designpatterns.factory;

/**
 * @author Forest
 * @date 2020年07月28日 00:01
 */
public class GreekPizza implements Pizza {
    public GreekPizza() {
    }

    private String str = "324sadfsddf";

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

    @Override
    public String toString() {
        return "GreekPizza{" +
                "str='" + str + '\'' +
                '}';
    }
}
