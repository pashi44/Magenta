package com.pashi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.pashi.springdemo.designpatterns.creational.BeanOne;

@SpringBootApplication
public class SpringdemoApplication {

	public static void main(String[] args) {
		
		
		
		ConfigurableApplicationContext app = SpringApplication.run(SpringdemoApplication.class, args);app.getBean(BeanOne.class);
		var bean = app.getBean(BeanOne.class);
	 bean.put();
	
	}

}
