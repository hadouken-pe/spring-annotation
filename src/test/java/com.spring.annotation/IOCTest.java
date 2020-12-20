package com.spring.annotation;

import com.spring.annotation.bean.Person;
import com.spring.annotation.config.PersonConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author: hadouken.pe@gmail.com
 * @date: 2020/12/20 20:24
 */
public class IOCTest {

    @Test
    public void testClassPathXmlApplicationContext() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    @Test
    public void testAnnotationConfigApplicationContext() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(PersonConfig.class);
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    @Test
    public void testGetBeanNamesForType() {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(PersonConfig.class);
        String[] beanNames = applicationContext.getBeanNamesForType(Person.class);
        Arrays.stream(beanNames).forEach(System.out::println);
    }
}
