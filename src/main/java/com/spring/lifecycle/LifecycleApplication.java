package com.spring.lifecycle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationContextFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class LifecycleApplication {

	private final static Logger logger = LoggerFactory.getLogger(LifecycleApplication.class);

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(AppConfiguration.class);
		context.refresh();

		LibraryManager manager = context.getBean(LibraryManager.class);
		//System.out.println("Context and beans are set up and ready to work");
		logger.info("Context and beans are set up and ready to work");
		context.close();
	}

}
