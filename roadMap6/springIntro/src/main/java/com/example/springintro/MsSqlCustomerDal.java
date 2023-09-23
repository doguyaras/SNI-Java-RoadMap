package com.example.springintro;

public class MsSqlCustomerDal implements ICustomerDal{
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
        System.out.println("MsSql veritabanına eklendi.");
    }
}
