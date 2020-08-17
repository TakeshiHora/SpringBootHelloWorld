package com.example.service;

import com.example.model.HelloWorld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;


@Service
public class HelloWorldService {
    
    public HelloWorld getHelloWorldAndTime() {
    
        return new HelloWorld("HelloWorld", LocalDateTime.now());
    }
}
