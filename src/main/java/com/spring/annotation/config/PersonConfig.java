package com.spring.annotation.config;

import com.spring.annotation.bean.Person;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @author: hadouken.pe@gmail.com
 * @date: 2020/12/20 20:42
 */
@Configurable
public class PersonConfig {

    @Lazy
    @Bean("person")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Person person() {
        System.out.println("创建person实例");
        Person person = new Person();
        person.setAge(11);
        person.setName("zhangsan");
        person.setNickName("zhangsan01");
        return person;
    }
}
