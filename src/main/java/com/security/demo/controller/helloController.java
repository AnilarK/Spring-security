package com.security.demo.controller;

import com.security.demo.repo.UserRepo;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    private UserRepo repo;

    @GetMapping("/")
    public String greet(HttpServletRequest req){
        System.out.println("hello greet "+ req.getSession().getId());
        return "hello greet " + req.getSession().getId(); }

}