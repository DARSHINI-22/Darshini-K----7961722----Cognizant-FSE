package com.cognizant.jwt_handson.controller;

import com.cognizant.jwt_handson.model.AuthenticationResponse;
import com.cognizant.jwt_handson.util.JwtUtil;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate(Authentication authentication) {

        String username = authentication.getName();

        String token = JwtUtil.generateToken(username);

        return new AuthenticationResponse(token);
    }
}