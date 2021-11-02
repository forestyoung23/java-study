package com.forest.designpatterns.memento.pack;

/**
 * 发起人角色
 *
 * @author Forest Dong
 * @date 2021年11月02日 18:45
 */
public class Originator {
    /**
     * 内部状态
     */
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建一个备忘录
     * @return
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 恢复一个备忘录
     */
    public void restoreMemento(IMemento memento) {
        this.setState(((Memento)memento).getState());
    }

    /**
     * 内置类
     */
    private class Memento implements IMemento {
        /**
         * 内部状态
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
}
