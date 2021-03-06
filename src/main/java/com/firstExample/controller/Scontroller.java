package com.firstExample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Controller
public class Scontroller {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }
}

