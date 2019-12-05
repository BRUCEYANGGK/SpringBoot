package com.example.demo.controllor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class test {
    @RequestMapping("/hello")
    public String sayhello(){
        System.out.println("welcome to bruce's world!");
        return "/pages/index";
    }
}
