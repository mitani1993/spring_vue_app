package com.example.api.app.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.app.service.AuthService;
import com.example.api.domain.auth.model.SigninUser;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/token")
    public String token(Authentication authentication) {
        return authService.issueToken(authentication);
    }

    @PostMapping("/signup")
    public SigninUser signup(@RequestBody SigninUser signinUser) {
        authService.addUser(signinUser);
        return signinUser;
    }
}
