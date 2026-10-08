package com.notes.selling.dto;

import java.util.UUID;

import com.notes.selling.helper.Provider;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter 
@Setter 
@RequiredArgsConstructor 
public class UserDetailsDto {
    private UUID id ;
    private String username ;
    private String email ;
    private String password ;
    private Provider provider ;
    private boolean isOnline ;
    private String role ;
}
