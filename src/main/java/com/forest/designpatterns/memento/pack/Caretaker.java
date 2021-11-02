package com.forest.designpatterns.memento.pack;

/**
 * 备忘录管理员
 *
 * @author Forest Dong
 * @date 2021年11月02日 18:48
 */
public class Caretaker {

    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
