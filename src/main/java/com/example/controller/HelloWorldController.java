package com.example.controller;

import com.example.model.HelloWorld;
import com.example.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping
public class HelloWorldController {
    
    //@GetMapping("/hello")
    //public String getHelloWorld(){
    //    HelloWorldService helloWorldService = new HelloWorldService();
    //
    //    return helloWorldService.getHelloWorld();
    //}
    @GetMapping("/hello")
    public HelloWorld getHelloWorldAndTime(){
        HelloWorldService helloWorldService = new HelloWorldService();
        return helloWorldService.getHelloWorldAndTime();
    }
}
