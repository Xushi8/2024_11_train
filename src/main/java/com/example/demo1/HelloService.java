package com.example.demo1;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
}
