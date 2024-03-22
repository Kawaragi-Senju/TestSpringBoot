package com.example.chat.dao;

import com.example.chat.models.Customer;

public interface Dao {
    Customer giveCustomerByName(String str);
}
