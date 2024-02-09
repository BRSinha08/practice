package com.practice.javaeight;

import java.util.List;

public class Customer {

    private int customerId;

    private String name;

    private List<Account> accounts;

    // Constructor, getters, and setters


    public Customer(int customerId, String name) {

        this.customerId = customerId;

        this.name = name;

    }

    public Customer(int customerId, String name, List<Account> accounts) {

        this.customerId = customerId;

        this.name = name;

        this.accounts = accounts;

    }

    public int getCustomerId() {

        return customerId;

    }

    public void setCustomerId(int customerId) {

        this.customerId = customerId;

    }

    public String getName() {

        return name;

    }

    public void setName(String name) {

        this.name = name;

    }

    public List<Account> getAccounts() {

        return accounts;

    }

    public void setAccounts(List<Account> accounts) {

        this.accounts = accounts;

    }

}
