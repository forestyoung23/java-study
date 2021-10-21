package com.forest.designpatterns.composite.transparent;

/**
 * 场景类（透明模式）
 * 优势：在遍历时不用进行强制类型转换
 *
 * @author Forest Dong
 * @date 2021年10月21日 15:58
 */
public class Client {

    public static void display(Component root) {
        for (Component child : root.getChildren()) {
            if (child instanceof Leaf) {
                child.doSomething();
            } else {
                display(child);
            }
        }
    }
}
