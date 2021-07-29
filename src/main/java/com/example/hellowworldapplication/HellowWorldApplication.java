package com.example.hellowworldapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@SpringBootApplication

public class HellowWorldApplication {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World!";
    }

    @GetMapping("/Akhil")
    public String getAkhil() {
        return "Hello Akhil!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HellowWorldApplication.class, args);
    }


}
