package com.notes.selling.helper;

import org.springframework.core.env.Environment;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;

public class A {
    @Bean
    ApplicationRunner checkDatabaseConfig(Environment env) {
        return args -> {
            System.out.println("DB USERNAME: " +
                    env.getProperty("spring.datasource.username"));
            System.out.println("DB PASSWORD PRESENT: " +
                    (env.getProperty("spring.datasource.password") != null));
        };
    }
}