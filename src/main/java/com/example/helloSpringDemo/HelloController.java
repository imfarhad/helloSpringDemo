package com.example.helloSpringDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/ping")
    public String ping(){
        return "OK -- working fine!!";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "Welcome to GitHub Actions";
    }
}
