package com.example.chat.service;

import com.example.chat.dao.DataClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomersBaseService {

    @Autowired
    DataClass dataClass;


    public void userRegistration(String name, String email){
        dataClass.registration(name, email);
    }
}