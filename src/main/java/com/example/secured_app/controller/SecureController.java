package com.example.secured_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/secure")
public class SecureController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello, this is a secured route!";
    }
}
