package com.forest.designpatterns.memento.clone;

/**
 * 融合备忘录的发起者角色
 *
 * @author Forest Dong
 * @date 2021年11月02日 18:27
 */
public class Originator implements Cloneable {

    private Originator backup;
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
    public Originator createMemento() {
        return backup = this.clone();
    }

    /**
     * 恢复一个备忘录
     */
    public void restoreMemento() {
        this.setState(backup.getState());
    }

    /**
     * 克隆当前对象
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Originator clone() {
        try {
            return (Originator) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
