package com.udemy.spring.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@ComponentScan(basePackages = "com.udemy.spring.security")
@EnableWebMvc
public class SpringAppConfig {
	
	static {
		System.out.println("SpringAppConfig (spring.xml) Loaded");
	}

	/**
	 * Define View Resolver
	 */
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Inside View Resolver.");
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/view/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

}
