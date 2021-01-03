package com.spring.annotation;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author: hadouken.pe@gmail.com
 * @date: 2020/12/20 21:39
 */
@Configurable
@ComponentScan(value = "com.spring")
public class ApplicationConfig {
}
