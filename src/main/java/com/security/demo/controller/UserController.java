package com.security.demo.controller;

import com.security.demo.model.Users;
import com.security.demo.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private MyUserDetailsService userService;

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        System.out.println("hello samosa");
        return userService.register(user);
    }
}
