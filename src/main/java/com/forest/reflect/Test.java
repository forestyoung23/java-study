package com.forest.reflect;

/**
 * @author dongyang
 * @date 2021年07月20日 17:15
 */
public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        MyInterceptor1 interceptor1 = new MyInterceptor1();
        MyInterceptor2 interceptor2 = new MyInterceptor2();
        InterceptorChain chain = new InterceptorChain();
        chain.addInterceptor(interceptor1);
        chain.addInterceptor(interceptor2);
        Animal proxy = (Animal)chain.pluginAll(cat);
        proxy.run();
    }
}
