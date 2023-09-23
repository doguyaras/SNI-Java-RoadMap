package com.springdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class MySqlCustomerDal implements ICustomerDal{

    @Value("${database.connectionString}")
    String connectionString;

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }
    @Override
    public void add() {
        System.out.println("Connection String: " +this.connectionString);
        System.out.println("MySql veritabanına eklendi.");

    }
}
