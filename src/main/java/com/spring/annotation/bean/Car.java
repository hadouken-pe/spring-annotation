package com.spring.annotation.bean;

/**
 * @Author hadouken.pe@gmail.com
 * @Date 2020-12-27 22:46:59
 */
public class Car {

    public Car() {
        System.out.println("构造Car");
    }

    public void init() {
        System.out.println("初始化Car");
    }

    public void destroy() {
        System.out.println("销毁Car");
    }
}
