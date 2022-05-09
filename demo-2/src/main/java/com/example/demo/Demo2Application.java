package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(Demo2Application.class, args);
	FirstDemo fd=ctx.getBean(FirstDemo.class);
	fd.display();
	}

}
