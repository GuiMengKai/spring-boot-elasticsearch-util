package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class LoginController {
    @RequestMapping("/login")
    public String toLogin() {
        return "login";
    }
}
