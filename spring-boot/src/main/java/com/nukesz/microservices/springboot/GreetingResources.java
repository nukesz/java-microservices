package com.nukesz.microservices.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingResources {

    @RequestMapping("/greeting")
    public Greeting greeting() {
        return new Greeting("Hello from Spring Boot!", System.currentTimeMillis());
    }
}