package com.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MyRest {

    @GetMapping("/")
    public String getDateTime(){
        return new Date().toString();
    }

    @GetMapping("/greeting/{name}")
    public String getGreeting(@PathVariable String name) {
        return "Hey! "+name+", welcome to the hell";
    }

}
