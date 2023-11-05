package com.pradeep.spring_security.service;

import com.pradeep.spring_security.models.User;
import com.pradeep.spring_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //load user from db
        User user=this.repository.findByEmail(username).orElseThrow(()->
            new RuntimeException("User Not Found!")
        );

        return user;
    }
}
