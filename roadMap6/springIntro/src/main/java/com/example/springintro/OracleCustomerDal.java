package com.example.springintro;

public class OracleCustomerDal implements ICustomerDal{
    String connectionString;

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    @Override
    public void add() {
        System.out.println("Connection Sstring: "+this.connectionString);
        System.out.println("Oracle veritabanına eklendi.");
    }
}
