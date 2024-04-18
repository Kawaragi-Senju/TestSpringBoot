package com.example.chat.service;

import com.example.chat.dao.Dao;
import com.example.chat.security.CustomerDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

public class UserDetailsServImpl implements UserDetailsService {
    @Autowired
    Dao dao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new CustomerDetails(dao.giveCustomerByName(username));
    }
}