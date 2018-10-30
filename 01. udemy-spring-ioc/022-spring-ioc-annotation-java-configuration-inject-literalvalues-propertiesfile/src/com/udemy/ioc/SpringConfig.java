package com.udemy.ioc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.udemy.ioc.impl")
@PropertySource("classpath:application.properties")
public class SpringConfig {

}
