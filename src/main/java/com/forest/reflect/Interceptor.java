package com.forest.reflect;

import java.lang.reflect.InvocationTargetException;

/**
 * 拦截器接口定义
 *
 * @author dongyang
 * @date 2021年07月20日 17:03
 */
public interface Interceptor {
    /**
     * 拦截处理
     *
     * @param invocation
     * @return
     * @author dongyang
     * @date 2021/7/20 下午5:03
     */
    Object intercept(Invocation invocation) throws InvocationTargetException, IllegalAccessException;

    /**
     * 添加拦截类
     *
     * @param target
     * @return
     * @author dongyang
     * @date 2021/7/20 下午5:33
     */
    Object plugin(Object target);
}
