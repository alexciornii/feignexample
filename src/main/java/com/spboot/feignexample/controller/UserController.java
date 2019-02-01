package com.spboot.feignexample.controller;

import com.spboot.feignexample.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    @GetMapping("/get")
    public User getUser() {
        return new User("Adam", "Sendler");
    }

}
