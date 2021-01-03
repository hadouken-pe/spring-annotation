package com.spring.annotation.bean;

import org.springframework.beans.factory.annotation.Value;

import lombok.Data;

/**
 * @author: hadouken.pe@gmail.com
 * @date: 2020/12/20 20:24
 */
@Data
public class Person {

    @Value("张三")
    private String name;

    @Value("#{20 - 2}")
    private Integer age;

    private String nickName;
}
