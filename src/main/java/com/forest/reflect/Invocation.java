package com.forest.reflect;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author dongyang
 * @date 2021年07月20日 17:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invocation {
    private Object target;
    private Method method;
    private Object[] args;

    public Object process() throws InvocationTargetException, IllegalAccessException {
        return method.invoke(target, args);
    }
}
