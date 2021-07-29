package com.example.hellowworldapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/")
@RestController

public class HellowWorldApplication {

    public static void main(String[] args) {
        SpringApplication.run(HellowWorldApplication.class, args);
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/hello1")
    public String sayHello1() {
        return "Hello Akhil!";
    }
}
