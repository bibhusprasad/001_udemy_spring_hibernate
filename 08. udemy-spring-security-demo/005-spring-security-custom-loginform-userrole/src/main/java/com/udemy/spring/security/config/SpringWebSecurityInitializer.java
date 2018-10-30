package com.udemy.spring.security.config;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringWebSecurityInitializer extends AbstractSecurityWebApplicationInitializer{
	
	static {
		System.out.println("SpringWebSecurityInitializer Loaded");
	}
}
