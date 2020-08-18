package com.example.service;

import com.example.model.HelloWorld;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class HelloWorldService {
    
    public String getHelloWorldAndTime() {
        HelloWorld helloWorld = new HelloWorld();
        LocalDateTime helloWorldTime = LocalDateTime.now();
        
        helloWorld.setHelloWorld("HelloWorld" + " " + helloWorldTime);
        
        return helloWorld.getHelloWorld();
    }
}
