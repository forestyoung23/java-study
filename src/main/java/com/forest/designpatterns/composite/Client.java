package com.forest.designpatterns.composite;

/**
 * 场景类
 *
 * @author Forest Dong
 * @date 2021年10月21日 10:05
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        // 创建一个树枝节点
        Composite branch = new Composite();
        // 创建一个叶子节点
        Leaf leaf = new Leaf();
        // 建立整体
        root.add(branch);
        branch.add(leaf);
    }

    public static void display(Composite root) {
        for (Component child : root.getChildren()) {
            if (child instanceof Leaf) {
                // 叶子节点
                child.doSomething();
            } else {
                // 树枝节点
                display((Composite) child);
            }
        }
    }
}
