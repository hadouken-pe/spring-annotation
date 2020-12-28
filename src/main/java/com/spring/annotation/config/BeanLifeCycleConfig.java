package com.spring.annotation.config;

import com.spring.annotation.bean.Car;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @Author hadouken.pe@gmail.com
 * @Date 2020-12-27 22:50:16
 */
@Configurable
public class BeanLifeCycleConfig {

    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Car car() {
        return new Car();
    }
}
