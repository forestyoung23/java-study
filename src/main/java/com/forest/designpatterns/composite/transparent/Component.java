package com.forest.designpatterns.composite.transparent;

import java.util.ArrayList;

/**
 * 抽象构件(透明模式)
 *
 * @author Forest Dong
 * @date 2021年10月21日 15:00
 */
public abstract class Component {
    /**
     * 个体和整体都具有的共享
     */
    public void doSomething() {
        // 编写业务逻辑
    }

    /**
     * 增加一个叶子构件或树枝构件
     * @param component
     */
    public abstract void add(Component component);

    /**
     * 删除一个叶子构件或树枝构件
     * @param component
     */
    public abstract void remove(Component component);

    /**
     * 获得分支下的所有叶子构件和树枝构件
     * @return
     */
    public abstract ArrayList<Component> getChildren();
}
