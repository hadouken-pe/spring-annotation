package com.spring.annotation;

import com.spring.annotation.bean.Car;
import com.spring.annotation.config.BeanLifeCycleConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: hadouken.pe@gmail.com
 * @date 2020-12-27 22:52:38
 */
public class BeanLifeRecycleTest {

    private AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(BeanLifeCycleConfig.class);

    @Test
    public void testBeanLifeRecycle() {
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);
        applicationContext.close();
    }
}
