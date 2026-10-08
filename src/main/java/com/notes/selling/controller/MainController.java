package com.notes.selling.controller;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.notes.selling.dto.UserDetailsDto;
import com.notes.selling.security.service.blueprint.JwtService;
import com.notes.selling.security.service.blueprint.LoginAuthService;
import com.notes.selling.service.blueprint.AuthService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor 
public class MainController {

    private final AuthService authService ;
    private final JwtService jwtService ;
    private final LoginAuthService loginAuthService ;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    
    @PostMapping("/login")
    public String loginP(@ModelAttribute UserDetailsDto userDetailsDto) {
        return loginAuthService.verify(userDetailsDto);
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerP(@ModelAttribute UserDetailsDto userDetailsDto) {
        if(authService.verify(userDetailsDto)){
            authService.register(userDetailsDto);
            return "redirect:/login";
        }else{
            return "redirect:/error";
        }
    }

    @GetMapping("/error")
    public String error(){
        return "error";
    }

    @GetMapping("/interface")
    public String interfaceM() {
        return "interface";
    }

}
