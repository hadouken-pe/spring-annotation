package com.spring.annotation;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.annotation.bean.Person;
import com.spring.annotation.config.PropertiesValueConfig;

/**
 * @Author hadouken.pe@gmail.com
 * @Date 2021-01-02 22:37:50
 */
public class PropertiesValueTest {

    private AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(PropertiesValueConfig.class);

    @Test
    public void testClassPathXmlApplicationContext() {
        getBeanDefinitionNames(applicationContext);

        System.out.println("persion info: " + applicationContext.getBean(Person.class));
        applicationContext.close();
    }

    private void getBeanDefinitionNames(AnnotationConfigApplicationContext applicationContext) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        Arrays.stream(beanDefinitionNames).forEach(System.out::println);
    }
}
