package com.spring.annotation.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.spring.annotation.bean.Person;

/**
 * @Author hadouken.pe@gmail.com
 * @Date 2021-01-02 22:36:42
 */
@Configurable
public class PropertiesValueConfig {

    @Bean
    public Person person() {
        return new Person();
    }
}
