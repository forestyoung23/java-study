package com.forest.designpatterns.composite;

/**
 * 树枝构件（安全模式）
 *
 * @author Forest Dong
 * @date 2021年10月21日 10:04
 */
public class Leaf extends Component {
    /**
     * 可以覆写父类方法
     */
    @Override
    public void doSomething() {
        super.doSomething();
    }
}
