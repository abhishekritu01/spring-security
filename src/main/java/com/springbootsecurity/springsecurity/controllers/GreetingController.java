package com.springbootsecurity.springsecurity.controllers;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GreetingController {


    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }


    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String userEndPoint() {
        return "Hello User";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String adminEndPoint() {
        return "Hello Admin";
    }


    @GetMapping("/contact")
    public String contact() {
        return "Contact Us";
    }

    @GetMapping("/update")
    public String contactUser() {
        return "update user";
    }

    @GetMapping("/update/admin")
    public String contactAdmin() {
        return "update admin";
    }




}
