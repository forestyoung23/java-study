package com.forest.designpatterns.decorator;

/**
 * 具体的构件
 *
 * @author Forest Dong
 * @date 2021年10月12日 18:02
 */
public class ConcreteComponent extends Component {
    /**
     * 具体实现
     */
    @Override
    public void operate() {
        System.err.println("operate()");
    }
}
