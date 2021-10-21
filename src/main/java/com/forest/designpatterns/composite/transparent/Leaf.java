package com.forest.designpatterns.composite.transparent;

import java.util.ArrayList;

/**
 * 树叶节点（透明模式）
 *
 * @author Forest Dong
 * @date 2021年10月21日 15:09
 */
public class Leaf extends Component {
    /**
     * 增加一个叶子构件或树枝构件
     * @Deprecated 在编译器告诉调用者，你可以调用这个方法，但是可能会出现错误
     *
     * @param component
     */
    @Deprecated
    @Override
    public void add(Component component) {
        // 空实现，直接抛出一个"不支持请求"异常
        throw new UnsupportedOperationException();
    }

    /**
     * 删除一个叶子构件或树枝构件
     *
     * @param component
     */
    @Override
    public void remove(Component component) {

    }

    /**
     * 获得分支下的所有叶子构件和树枝构件
     *
     * @return
     */
    @Override
    public ArrayList<Component> getChildren() {
        return null;
    }
}
