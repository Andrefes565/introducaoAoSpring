package com.andreFelipe.demo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class HelloController {

    @GetMapping("/")
    public  String hello() {
        return "digai, meu consagrado!";
    }
}
