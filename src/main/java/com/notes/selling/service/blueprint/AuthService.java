package com.notes.selling.service.blueprint;

import com.notes.selling.dto.UserDetailsDto;

public interface AuthService{
    public Boolean verify(UserDetailsDto userDetailsDto);
    public void register(UserDetailsDto userDetailsDto);
}
