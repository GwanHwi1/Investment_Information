package com.example.investment_information.investment_information.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String mainPage() throws Exception{
        return "main";
    }

    @GetMapping("/zz")
    public String mainzage() throws Exception{
        return "ex";
    }
}
