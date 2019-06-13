package com.example.aop;

import javax.naming.spi.NamingManager;

/**
 * @author penghaijun
 * @description HelloImpl
 * @date 2019-06-13 08:32
 **/
public class HelloImpl implements IHello {
    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }
}
