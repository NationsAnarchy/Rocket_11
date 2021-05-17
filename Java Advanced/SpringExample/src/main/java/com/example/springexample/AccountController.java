package com.example.springexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/hello")
public class AccountController {
    @GetMapping

    public String hello() {
        return "Hello Spring Boot! By Incarnat1on.";
    }
}
