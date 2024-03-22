package com.example.chat.security;

import com.example.chat.dao.DataClass;
import com.example.chat.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class AuthManager implements AuthenticationManager {

    @Autowired
    DataClass dao;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        Customer customer = ;
    }
}
