package com.example.chat.dao;

import com.example.chat.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class DataClass {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public void registration(String name, String email){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        String query = "INSERT INTO customers(id, name, email) VALUES (?, ?, ?)";
        jdbcTemplate.update(query, 6, name, email);
    }
}
