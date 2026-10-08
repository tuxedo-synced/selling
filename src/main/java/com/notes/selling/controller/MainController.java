package com.notes.selling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.notes.selling.dto.UserDetailsDto;
import com.notes.selling.service.blueprint.AuthService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor 
public class MainController {

    private final AuthService authService ;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
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
