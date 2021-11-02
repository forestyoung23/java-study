package com.forest.designpatterns.memento.multi;

import com.forest.designpatterns.memento.Memento;

import java.util.HashMap;

/**
 * 备忘录管理员
 *
 * @author Forest Dong
 * @date 2021年11月02日 18:40
 */
public class Caretaker {
    /**
     * 备忘录容器
     */
    private HashMap<String, Memento> memMap = new HashMap<>();

    public Memento getMemento(String id) {
        return memMap.get(id);
    }

    /**
     * id可以是时间戳等便于回滚的标识
     * @param id
     * @param memento
     */
    public void setMemeto(String id, Memento memento) {
        memMap.put(id, memento);
    }
}
