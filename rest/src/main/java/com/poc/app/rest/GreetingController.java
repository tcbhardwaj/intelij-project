package com.poc.app.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poc.bean.Greeting;

@RestController
public class GreetingController {
    private static final String message = "Hello, %s!";
    private static int count = 0;
    

    @GetMapping("/error")
    public String error() {
        return "Error handling";
    }

   
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue = "World", required = false) String name) {
        return new Greeting(GreetingController.count, String.format(message, name));
    }
}
