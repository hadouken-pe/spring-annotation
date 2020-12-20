package com.spring.annotation;

import com.spring.annotation.filter.CustomFilter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

/**
 * @author: hadouken.pe@gmail.com
 * @date: 2020/12/20 21:39
 */
@Configurable
@ComponentScan(value = "com.spring", includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {Controller.class}),
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, classes = {Person.class}),
        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {CustomFilter.class})},
        useDefaultFilters = false)
public class ApplicationConfig {
}
