package com.forest.java11;

/**
 * 类型推断
 * <b>局部变量</b>可以直接用var定义，而不用写具体的类型
 * 编译器能根据右边的表达式自动推断类型
 * 注意：这里是局部变量，全局变量不能这么用
 *
 * @author dongyang
 * @date 2021年07月12日 11:22
 */
public class VarTest {
    public static void main(String[] args) {
        var s = 123;
        System.err.println(s);
    }
}
