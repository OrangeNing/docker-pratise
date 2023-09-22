package com.example.service2.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/service2/getHello")
    public String getHello(){
        return "hello from service2";
    }
}
