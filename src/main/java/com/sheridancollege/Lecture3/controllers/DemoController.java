package com.sheridancollege.Lecture3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController
{
    @GetMapping("/")
    public String goHome(){
        return "index";
    }
    @GetMapping("/register")
    public String registerUser(@RequestParam String firstname ,
                               @RequestParam String lastname  ,
                               @RequestParam (defaultValue = "off") String rememberMe ) {
        System.out.println(firstname+" " + lastname + " " + rememberMe);
        return "success";
    }
    @GetMapping("/register_page")
    public String goRegister() {
        return "register";
    }

}
