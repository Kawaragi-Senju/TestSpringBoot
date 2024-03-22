package com.example.chat.dao;

import com.example.chat.models.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataClass implements Dao {
    @Autowired
    JdbcTemplate jdbcTemplate;


    public void registration(String name, String email){
        Customer customer = new Customer();
        customer.setName(name);
        customer.setEmail(email);
        String query = "INSERT INTO customers(id, name, email) VALUES (?, ?, ?)";
        jdbcTemplate.update(query, 6, name, email);
    }

    @Override
    public Customer giveCustomerByName(String str) {
        String query = "SELECT* FROM customers WHERE name = ?";
        return jdbcTemplate.query(query, new RowMap(), str).get(0);
    }
}
