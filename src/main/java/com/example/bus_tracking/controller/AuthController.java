package com.example.bus_tracking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.security.Principal;
import com.example.bus_tracking.dto.UserProfileDTO;
import com.example.bus_tracking.dto.LoginRequest;
import com.example.bus_tracking.dto.LoginResponse;
import com.example.bus_tracking.dto.RegisterRequest;
import com.example.bus_tracking.service.AuthService;

@RestController

@RequestMapping("/auth")

@CrossOrigin("*")

public class AuthController {

    @Autowired

    private AuthService service;

    @PostMapping("/register")

    public String register(

            @RequestBody RegisterRequest request) {

        return service.register(request);

    }

    @PostMapping("/login")

    public LoginResponse login(

            @RequestBody LoginRequest request) {

        return service.login(request);

    }
    @GetMapping("/profile")
    public UserProfileDTO profile(Principal principal){

        return service.getProfile(principal.getName());

    }

}