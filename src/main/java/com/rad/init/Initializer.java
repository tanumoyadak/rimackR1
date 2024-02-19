package com.rad.init;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;

public class Initializer implements WebApplicationInitializer  {

	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("Application start up");
		AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
		ctx.register(WebAppConfig.class);
		servletContext.addListener(new ContextLoaderListener(ctx));

		ctx.setServletContext(servletContext);
	}

}
