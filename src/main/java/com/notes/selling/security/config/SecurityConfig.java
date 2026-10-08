package com.notes.selling.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.notes.selling.entity.Users;
import com.notes.selling.helper.Provider;

import jakarta.servlet.DispatcherType;

@Configuration 
@EnableWebSecurity 
public class SecurityConfig {

    @Bean 
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
    
    @Bean 
    public SecurityFilterChain securityFilterChain(HttpSecurity http){
        http
        .csrf(e -> e.disable())
        .authorizeHttpRequests(
            authorizeHttpRequests -> authorizeHttpRequests.requestMatchers("/","/home","/login","/register","/css/**").permitAll()
            .dispatcherTypeMatchers(DispatcherType.FORWARD,DispatcherType.ERROR).permitAll()
            .anyRequest().authenticated()
        )
        .formLogin(form -> form
            .loginPage("/login")
            .defaultSuccessUrl("/interface",true)
            .failureUrl("/login?error=true")
            .permitAll()
        );
        return http.build();
    }

    @Bean
    public AuthenticationProvider authenticationProvider(UserDetailsService userDetailsService){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailsService);
        provider.setPasswordEncoder(new BCryptPasswordEncoder());
        return provider;
    }

    @Bean 
    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder){

        Users user1 = new Users();
        user1.setUsername("Raju_123");
        user1.setPassword(passwordEncoder.encode("Raju@0148c"));
        user1.setEmail("raju.synced@gmail.com");
        user1.setOnline(true);
        user1.setProvider(Provider.LOCAL);

        return new InMemoryUserDetailsManager(user1);
    }

}
