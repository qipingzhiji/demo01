package com.spring.demo.demo01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello3Controller {

    @GetMapping(value = "hello_world")
    public Object testHello() {
        return "hello world2";
    }
}
