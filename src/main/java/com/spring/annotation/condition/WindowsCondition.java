package com.spring.annotation.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 判断是不是Windows环境
 *
 * @Author hadouken.pe@gmail.com
 * @Date 2020-12-27 11:23:05
 */
public class WindowsCondition implements Condition {

    /**
     * @param context  判断条件能使用的上下文环境
     * @param metadata 注释信息
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 能够获取到IOC使用的BeanFactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();

        // 能够获取到类加载信息
        ClassLoader classLoader = context.getClassLoader();

        // 能够获取当前环境
        Environment environment = context.getEnvironment();

        // 能够获取Bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();

        // 能够获取资源加载信息
        ResourceLoader resourceLoader = context.getResourceLoader();

        String property = environment.getProperty("os.name");
        if (property.contains("Windows")) {
            return true;
        }
        return false;
    }
}
