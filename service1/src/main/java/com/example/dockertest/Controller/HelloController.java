package com.example.dockertest.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping("/getHello1")
    public String getHello1() {
        Long counter = redisTemplate.opsForValue().increment("counter");
        return "myapp is running " + counter + "times!";
    }

    @GetMapping("/getHello2")
    public String getHello2() {
        return "hello from dockertest";
    }
}
