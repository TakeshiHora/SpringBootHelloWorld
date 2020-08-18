package com.example.controller;

import com.example.service.HelloWorldService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    
    @GetMapping("/hello")
    public String getHelloWorldAndTime(Model model){
        HelloWorldService helloWorldService = new HelloWorldService();
        
        model.addAttribute("msg", helloWorldService.getHelloWorldAndTime());
        
        return "hello";
    }
}
