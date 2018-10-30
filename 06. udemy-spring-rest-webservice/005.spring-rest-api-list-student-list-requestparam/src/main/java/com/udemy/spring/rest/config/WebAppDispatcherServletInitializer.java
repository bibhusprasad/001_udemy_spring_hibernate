package com.udemy.spring.rest.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	static {
		System.out.println("WebAppDispatcherServletInitializer (web.xml) Loaded");
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {SpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
