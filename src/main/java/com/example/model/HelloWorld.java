package com.example.model;

import java.time.LocalDateTime;

public class HelloWorld {
    
    private String helloWorld;
    private LocalDateTime localDateTime;
    
    public HelloWorld(String helloWorld, LocalDateTime localDateTime) {
        this.helloWorld = helloWorld;
        this.localDateTime = localDateTime;
    }
    
    public String getHelloWorld() {
        return helloWorld;
    }
    
    public void setHelloWorld(String helloWorld) {
        this.helloWorld = helloWorld;
    }
    
    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
    
    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
