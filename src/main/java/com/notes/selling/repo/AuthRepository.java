package com.notes.selling.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.notes.selling.entity.Users;

public interface AuthRepository extends JpaRepository<Users , UUID>{
    
}
