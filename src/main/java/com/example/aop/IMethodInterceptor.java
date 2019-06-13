package com.example.aop;

/**
 * @Description 方法级调用的拦截器
 * @Author penghaijun
 * @Date 2019-06-13 08:34
 **/
public interface IMethodInterceptor {
    /**
     * 调用之前
     *
     * @param args 参数
     */
    default void before(Object[] args) {
        // do nothing
        System.out.println("invoke before");
    }

    /**
     * 调用之后
     *
     * @param result 结果
     */
    default void after(Object result) {
        // do nothing
        System.out.println("invoke after");
    }

    /**
     * 出错之后
     *
     * @param ex 异常
     */
    default void exception(Throwable ex) {
        ex.printStackTrace();
    }
}
