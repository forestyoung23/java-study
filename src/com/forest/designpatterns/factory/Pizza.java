package com.forest.designpatterns.factory;

/**
 * @author Forest
 * @date 2020年07月27日 23:58
 */
public interface Pizza {
    void prepare();
    void bake();
    void cut();
    void pack();
}
