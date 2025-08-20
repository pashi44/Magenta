package com.pashi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.util.*;

import com.pashi.Models.BeanOne;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication(exclude = {


        org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration.class

})
public class MagentaApp {

	public static void main(String[] args) {
		
		
		
		ConfigurableApplicationContext app = SpringApplication.run(MagentaApp.class, args);app.getBean(BeanOne.class);




	}




}
