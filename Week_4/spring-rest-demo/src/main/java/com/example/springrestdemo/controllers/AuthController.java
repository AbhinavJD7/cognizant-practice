package com.example.springrestdemo.controllers;

import com.example.springrestdemo.models.LoginRequest;
import com.example.springrestdemo.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        if ("admin".equals(loginRequest.getUsername()) && "password".equals(loginRequest.getPassword())) {
            return jwtUtil.generateToken(loginRequest.getUsername());
        } else {
            return "Invalid username or password";
        }
    }
}
