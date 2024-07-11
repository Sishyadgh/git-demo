package com.example.git_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class gitcontroller {

    @GetMapping("/hellogit")
    public String hellogit() {
        return "Hello, git-World!";
    }

    @GetMapping("/adddata")
    public String addData(@RequestParam(required = false) String data) {
        if (data != null && data.equals("aishwarya")) {
            return "hello again";
        }
        return "data received: " + data;
    }
}
