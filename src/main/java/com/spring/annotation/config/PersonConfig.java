package com.spring.annotation.config;

import com.spring.annotation.bean.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * @author: hadouken.pe@gmail.com
 * @date: 2020/12/20 20:42
 */
@Configurable
public class PersonConfig {

    @Bean("person01")
    public Person person() {
        Person person = new Person();
        person.setAge(11);
        person.setName("zhangsan");
        person.setNickName("zhangsan01");
        return person;
    }
}
