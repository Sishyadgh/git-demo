package com.example.git_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gitcontroller {

    @GetMapping("/hellogit")
    public String hellogit() {
        return "Hello, git-World!";
    }
}
