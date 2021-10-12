package com.forest.designpatterns.decorator;

/**
 * 抽象装饰者
 *
 * @author Forest Dong
 * @date 2021年10月12日 18:03
 */
public abstract class Decorator extends Component {
    private Component component;

    /**
     * 通过构造函数传递被修饰者
     * @param component
     */
    public Decorator(Component component) {
        this.component = component;
    }

    /**
     * 委托给被修饰者执行
     */
    @Override
    public void operate() {
        this.component.operate();
    }
}
