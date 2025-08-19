package com.pashi.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Annotation;

@RestController
public class StartupControler    {


    @GetMapping("/greet")
public String greet(){

        return   StartupControler.class.toString();

    }



}
