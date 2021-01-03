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

    private AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(ApplicationConfig.class);

    @Test
    public void testClassPathXmlApplicationContext() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");
        Person person = (Person) applicationContext.getBean("person");
        System.out.println(person);
    }

    @Test
    public void testAnnotationConfigApplicationContext() {
        String[] beanNames = applicationContext.getBeanNamesForType(Person.class);
        Arrays.stream(beanNames).forEach(System.out::println);
    }

    @Test
    public void testGetBeanNamesForType() {
        String[] beanNames = applicationContext.getBeanNamesForType(Person.class);
        Arrays.stream(beanNames).forEach(System.out::println);
    }

    @Test
    public void testComponentScan() {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }

    @Test
    public void testScope() {
        Person person1 = applicationContext.getBean(Person.class);
        Person person2 = applicationContext.getBean(Person.class);
        System.out.println(person1 == person2);
    }

    @Test
    public void testConditional() {
        Person person = applicationContext.getBean(Person.class);
    }

    @Test
    public void testImport() {
        getBeanDefinitionNames(applicationContext);
    }

    @Test
    public void testPostConstruct() {
        getBeanDefinitionNames(applicationContext);
        applicationContext.close();
        System.out.println("application context close");
    }

    private void getBeanDefinitionNames(AnnotationConfigApplicationContext applicationContext) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }
}
