package com.practice.javaeight;

import java.util.List;
import java.util.stream.Collectors;

public class EPAMTest1 {

    //Question 1: Find the total balance of all savings accounts across all customers.

//Question 2: Find the average balance of all customers who have a checking account balance

//greater than a given threshold.

//double threshold = 5000.0;


    public static void main(String[] args) {

        double threshold = 5000.0; // example threshold value

        Customer customer1 = new Customer(1, "Alice");

        customer1.setAccounts(List.of(new Account("S123", 3000.0, Account.AccountType.SAVINGS),
                new Account("C456", 7000.0, Account.AccountType.CHECKING) ));

        Customer customer2 = new Customer(2, "Bob");

        customer2.setAccounts(List.of(new Account("S789", 5000.0, Account.AccountType.SAVINGS),
                new Account("C012", 4000.0, Account.AccountType.CHECKING)));

        List<Customer> customers = List.of(customer1, customer2);
        System.out.println(customers.get(0).getAccounts().get(0).getType());
        findAverage(customers);
        findTotalBalace(customers);

    }
//Question 2: Find the average balance of all customers who have a checking account balance

//greater than a given threshold.

    //double threshold = 5000.0;
    private static Double findAverage(List<Customer> customers){

        System.out.println(
                customers.stream().map(Customer::getAccounts).flatMap(accounts ->
                                accounts.stream().
                                        filter(account->account.getType().
                                        equals(Account.AccountType.CHECKING))).
                        collect(Collectors.averagingDouble(Account::getBalance)));


                List<Account> list = customers.stream().map(Customer::getAccounts).flatMap(accounts ->
                                accounts.stream().
                                        filter(account->account.getType().
                                                equals(Account.AccountType.CHECKING))).filter(account -> account.getBalance()>5000).
                        collect(Collectors.toList());
                for(Account account : list){
                    System.out.println(account.getBalance());
                }

                return  null;
    }

    //Question 1: Find the total balance of all savings accounts across all customers.
    private static Integer  findTotalBalace(List<Customer> customers){

        System.out.println(
                customers.stream().map(Customer::getAccounts).flatMap(accounts ->
                                accounts.stream().filter(account->account.getType().
                                        equals(Account.AccountType.SAVINGS))).
                        collect(Collectors.summarizingDouble(Account::getBalance)).getSum());
        return  null;
    }
}
