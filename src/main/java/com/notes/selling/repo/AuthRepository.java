package com.notes.selling.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notes.selling.entity.UserDetails;

public interface AuthRepository extends JpaRepository<UserDetails , UUID>{
    
}
