package com.spring.annotation.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

/**
 * @author: hadouken.pe@gmail.com
 * @date 2021-01-02 15:31:41
 */
@Component
public class Dog {

    public Dog() {
        System.out.println("dog construct");
    }

    @PostConstruct
    public void init() {
        System.out.println("dog init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("dog destroy");
    }
}
