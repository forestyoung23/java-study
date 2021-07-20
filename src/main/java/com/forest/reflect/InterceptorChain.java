package com.forest.reflect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author dongyang
 * @date 2021年07月20日 17:36
 */
public class InterceptorChain {
    private final List<Interceptor> interceptorList = new ArrayList<>();

    public Object pluginAll(Object target) {
        for (Interceptor interceptor : interceptorList) {
            target = interceptor.plugin(target);
        }
        return target;
    }

    public void addInterceptor(Interceptor interceptor) {
        interceptorList.add(interceptor);
    }

    public List<Interceptor> getInterceptors() {
        return Collections.unmodifiableList(interceptorList);
    }
}
