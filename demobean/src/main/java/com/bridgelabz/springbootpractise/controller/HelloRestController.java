package com.bridgelabz.springbootpractise.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloRestController {
    @RequestMapping(value = {"","/","/home"})
    public String sayHello(){
        return "hello from bridgelabz";
    }
}
