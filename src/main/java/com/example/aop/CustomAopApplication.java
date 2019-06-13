package com.example.aop;

/**
 * @author penghaijun
 * @description CustomAopApplication
 * @date 2019-06-13 08:31
 **/
public class CustomAopApplication {

    public static void main(String[] args) {

        HelloImpl helloObj = new HelloImpl();
        IHello proxy = (IHello) PoxyBeanFactory.create(helloObj, new IMethodInterceptor() {
            @Override
            public void before(Object[] args) {
                System.out.println("1-before");
            }

            @Override
            public void after(Object result) {
                System.out.println("2-after");
            }

            @Override
            public void exception(Throwable ex) {
                System.out.println("3-exception");
            }
        });

        proxy.sayHello("world!");
    }
}
