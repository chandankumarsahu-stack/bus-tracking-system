package com.example.bus_tracking.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@CrossOrigin("*")
public class AdminController {

    @GetMapping("/dashboard")
    public String dashboard() {

        return "Welcome Admin";

    }

}