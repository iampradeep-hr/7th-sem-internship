package com.pradeep.spring_security.controller;


import com.pradeep.spring_security.models.User;
import com.pradeep.spring_security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    // https://localhost:8080/home/user


    @GetMapping("/user")
    public List<User> getUser(){
        System.out.println("getting users");
        return userService.getUsers();
    }

    @GetMapping("username")
    public String getUserName(Principal principal){
        return principal.getName();
    }

    @GetMapping
    public String getHomePage(Principal principal){
        return "This is our website Home page!";
    }

}
