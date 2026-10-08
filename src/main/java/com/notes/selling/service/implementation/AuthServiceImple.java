package com.notes.selling.service.implementation;

import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.notes.selling.dto.UserDetailsDto;
import com.notes.selling.entity.UserDetails;
import com.notes.selling.helper.Provider;
import com.notes.selling.repo.AuthRepository;
import com.notes.selling.service.blueprint.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImple implements AuthService {

    private final AuthRepository authRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    @Override
    public Boolean verify(UserDetailsDto userDetailsDto) {

        String usernameRegex = "^[a-zA-Z0-9_]{3,20}$";
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String passwordRegex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$";

        return userDetailsDto.getUsername() != null
                && userDetailsDto.getUsername().matches(usernameRegex)

                && userDetailsDto.getEmail() != null
                && userDetailsDto.getEmail().matches(emailRegex)

                && userDetailsDto.getPassword() != null
                && userDetailsDto.getPassword().matches(passwordRegex);
    }

    @Override
    public void register(UserDetailsDto userDetailsDto) {

        UserDetails userDetails = modelMapper.map(userDetailsDto, UserDetails.class);

        userDetails.setPassword(
                passwordEncoder.encode(userDetailsDto.getPassword())
        );

        userDetails.setProvider(Provider.LOCAL);
        userDetails.setOnline(false);

        authRepository.save(userDetails);
    }
}