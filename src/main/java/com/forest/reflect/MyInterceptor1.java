package com.forest.reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * @author dongyang
 * @date 2021年07月20日 17:13
 */
public class MyInterceptor1 implements Interceptor {
    /**
     * 拦截处理
     *
     * @return
     * @author dongyang
     * @date 2021/7/20 下午5:03
     */
    @Override
    public Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException {
        System.err.println("自定义拦截处理1----start");
        Object obj = invocation.process();
        System.err.println("自定义拦截处理1----end");
        return obj;
    }

    /**
     * 添加拦截类
     *
     * @param target
     * @return
     * @author dongyang
     * @date 2021/7/20 下午5:33
     */
    @Override
    public Object plugin(Object target) {
        return MyInvocationHandler.wrap(target, this);
    }
}
