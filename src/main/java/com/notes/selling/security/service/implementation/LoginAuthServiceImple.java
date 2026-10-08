package com.notes.selling.security.service.implementation;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.notes.selling.dto.UserDetailsDto;
import com.notes.selling.security.service.blueprint.JwtService;
import com.notes.selling.security.service.blueprint.LoginAuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LoginAuthServiceImple implements LoginAuthService {
    private final AuthenticationManager authenticationManager;
    private final JwtService jwtService ;

    @Override
    public String verify(UserDetailsDto userDetailsDto) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userDetailsDto.getUsername(), userDetailsDto.getPassword()));
        if(authentication.isAuthenticated()){
            return jwtService.generateToken(userDetailsDto.getUsername());
        }else{
            return "error";
        }
    
}
}