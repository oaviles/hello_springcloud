package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String hello() {
        return "CI/CD demo about Azure Spring Cloud and GitHub Actions, demo version 1.6\n";
    }
}
