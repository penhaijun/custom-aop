package com.example.aop;

import java.lang.reflect.Proxy;

/**
 * @author penghaijun
 * @description PoxyBeanFactory
 * @date 2019-06-13 08:48
 **/
public class PoxyBeanFactory {

    /**
     * 对目标对像的所有方法都进行拦截
     * @param target
     * @param interceptor
     * @return
     */
    public static Object create(Object target, IMethodInterceptor interceptor) {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new MyInvocationHandler(target, interceptor));
    }
}
