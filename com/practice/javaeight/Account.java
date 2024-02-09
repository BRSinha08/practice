package com.practice.javaeight;

public class Account {

    private String accountNumber;

    private double balance;

    private AccountType type;

    // Constructor, getters, and setters


    public Account(String accountNumber, double balance, AccountType type) {

        this.accountNumber = accountNumber;

        this.balance = balance;

        this.type = type;

    }

    public String getAccountNumber() {

        return accountNumber;

    }

    public void setAccountNumber(String accountNumber) {

        this.accountNumber = accountNumber;

    }

    public double getBalance() {

        return balance;

    }

    public void setBalance(double balance) {

        this.balance = balance;

    }

    public AccountType getType() {

        return type;

    }

    public void setType(AccountType type) {

        this.type = type;

    }

    enum AccountType {

        SAVINGS,

        CHECKING

    }

}
