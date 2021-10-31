package com.forest.designpatterns.memento;

/**
 * 备忘录管理员角色
 *
 * @author Forest Dong
 * @date 2021年10月31日 16:18
 */
public class Caretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
