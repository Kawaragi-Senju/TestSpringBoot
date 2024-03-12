package com.example.chat.controllers;

import com.example.chat.service.CustomersBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerBoot {

    @Autowired
    CustomersBaseService dataBase;

    @GetMapping("/logForm")
    public String log(){
        return "logform";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/newuser")
    public String reg(){
        return "registration";
    }

    @PostMapping("/user")
    public String registration(@RequestParam(name="name")String name, @RequestParam(name="email") String email){

        return "ok";
    }
}
