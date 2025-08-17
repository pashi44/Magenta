package com.pashi.springdemo.designpatterns.creational;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component

public class BeanOne {

public void put(){

    System.out.println("asdadd");
}


@Bean
public  BeanOne  getObject(){

 return  new BeanOne();
}

}
