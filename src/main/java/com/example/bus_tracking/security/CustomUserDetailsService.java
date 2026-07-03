package com.example.bus_tracking.security;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import com.example.bus_tracking.entity.User;
import com.example.bus_tracking.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {

        User user = repository.findByEmail(email)

                .orElseThrow(() -> new UsernameNotFoundException("User Not Found"));

        return new org.springframework.security.core.userdetails.User(

                user.getEmail(),

                user.getPassword(),

                Collections.singleton(

                        new SimpleGrantedAuthority("ROLE_" + user.getRole())

                )

        );

    }

}