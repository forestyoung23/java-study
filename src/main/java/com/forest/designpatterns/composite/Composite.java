package com.forest.designpatterns.composite;

import java.util.ArrayList;

/**
 * 树枝构件（安全模式）
 *
 * @author Forest Dong
 * @date 2021年10月21日 09:54
 */
public class Composite extends Component {
    /**
     * 构件容器
     */
    private ArrayList<Component> list = new ArrayList<>();

    /**
     * 增加一个叶子构件或树枝构件
     * @param component
     */
    public void add(Component component) {
        list.add(component);
    }

    public void remove(Component component) {
        list.remove(component);
    }

    public ArrayList<Component> getChildren() {
        return list;
    }
}
