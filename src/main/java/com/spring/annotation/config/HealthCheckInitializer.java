package com.spring.annotation.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@Configurable
public class HealthCheckInitializer implements ApplicationContextInitializer {

    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        System.setProperty("spring.cloud.consul.discovery.health-check-path", "/actuator/healthCheck");
    }
}