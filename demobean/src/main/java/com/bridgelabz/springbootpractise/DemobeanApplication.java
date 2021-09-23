package com.bridgelabz.springbootpractise;

import com.bridgelabz.springbootpractise.component.DemoBean;
import com.bridgelabz.springbootpractise.controller.HelloRestController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemobeanApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		ConfigurableApplicationContext context=SpringApplication.run(DemobeanApplication.class, args);
		DemoBean demoBean=context.getBean(DemoBean.class);
		System.out.println("Demo Bean= "+demoBean.toString());
		System.out.println(context.getBean(HelloRestController.class));
	}

}
