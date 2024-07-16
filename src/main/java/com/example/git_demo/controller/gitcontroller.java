package com.example.git_demo.controller;

import com.example.git_demo.order;
import org.springframework.web.bind.annotation.*;

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

    //created this method to check changes that i have made means i created this method on local repository reflects or not on remote repository i.e github
    @GetMapping("/welcome")
    public String welcome() {
        return "welcome";
    }



    //adding this comment to check whether remote changes reflects in local repo or not

    @PostMapping("/purchase")
    public String purchase(@RequestBody order order)
    {
        return "Hi " + order.getUsername() + " order for " +order.getProductName()  + " with amount " + order.getAmount() + " stored successfully...";
    }

    //added comment
}
