package com.pradeep.spring_security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppConfig {

//    @Bean
//    public UserDetailsService userDetailsService()
//    {
//        UserDetails user1=  User.builder()
//                .username("pradeep")
//                .password(passwordEncoder().encode("pradeep123")).roles("admin")
//                .build();
//
//        UserDetails user2=  User.builder()
//                .username("xyz")
//                .password(passwordEncoder().encode("xyz")).roles("admin")
//                .build();
//
//
//        return new InMemoryUserDetailsManager(user1,user2);
//
//    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }



}
