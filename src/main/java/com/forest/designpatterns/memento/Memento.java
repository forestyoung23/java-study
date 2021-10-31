package com.forest.designpatterns.memento;

/**
 * 备忘录角色
 *
 * @author Forest Dong
 * @date 2021年10月31日 16:14
 */
public class Memento {
    /**
     * 发起人的内部状态
     */
    private String state = "";

    /**
     * 构造函数传递参数
     * @param state
     */
    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
