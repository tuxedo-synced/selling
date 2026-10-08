package com.notes.selling.security.service.blueprint;

import com.notes.selling.dto.UserDetailsDto;

public interface LoginAuthService {

    String verify(UserDetailsDto userDetailsDto);
    
}
