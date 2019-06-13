package com.example.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author penghaijun
 * @description MyInvocationHandler
 * @date 2019-06-13 08:33
 **/
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 拦截器
     */
    private IMethodInterceptor interceptor;
    private Object target;

    public MyInvocationHandler(Object target, IMethodInterceptor interceptor) {
        this.target = target;
        this.interceptor = interceptor;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        interceptor.before(args);
        try {
            Object result = method.invoke(target, args);
            interceptor.after(result);
            return result;
        } catch (Throwable ex) {
            interceptor.exception(ex);
        }
        return null;
    }
}
