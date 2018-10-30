package com.udemy.spring.security.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcDispathcerServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	static {
		System.out.println("SpringMvcDispathcerServletInitializer (web.xml) Loaded");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringAppConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
