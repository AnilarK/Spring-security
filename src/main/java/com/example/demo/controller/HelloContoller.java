package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

    @GetMapping("/")
    public String index( HttpServletRequest request) {
        String id = request.getSession().getId();
        return  "<div style='text-align: center; margin-top: 20%;'>" +
                "<h1 style='font-size: 60px;'>Hello World </br> This is spring security!</h1>" + id +
                "</div>";
    }
}


