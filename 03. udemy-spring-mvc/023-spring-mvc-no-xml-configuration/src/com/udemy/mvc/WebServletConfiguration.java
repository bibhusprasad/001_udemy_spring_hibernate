package com.udemy.mvc;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebServletConfiguration implements WebApplicationInitializer {

	static {
		System.out.println("WebServletConfiguration (web.xml) Loaded");
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("onStartup() Inside WebServletConfiguration");
		AnnotationConfigWebApplicationContext webAppContext = new AnnotationConfigWebApplicationContext();
		webAppContext.register(SpringAppConfig.class); // Register-SpringConfig-Annotation-class
		webAppContext.setServletContext(servletContext); // Set ServletContext
		ServletRegistration.Dynamic servlet = servletContext.addServlet("dispatcher",
				new DispatcherServlet(webAppContext));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");
	}

}
