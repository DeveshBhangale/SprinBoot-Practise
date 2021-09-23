package com.bridgelabz.springbootpractise;

import com.bridgelabz.springbootpractise.component.DemoBean;
import com.bridgelabz.springbootpractise.controller.HelloRestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemobeanApplication {
	public static final Logger logger=LoggerFactory.getLogger(DemobeanApplication.class);

	public static void main(String[] args) {
		logger.info("Hello, Welcome to Demo");
		ConfigurableApplicationContext context=SpringApplication.run(DemobeanApplication.class, args);
		DemoBean demoBean=context.getBean(DemoBean.class);
		logger.debug("Demo Bean= "+demoBean.toString());
		logger.debug(""+context.getBean(HelloRestController.class));
		
	}

}
