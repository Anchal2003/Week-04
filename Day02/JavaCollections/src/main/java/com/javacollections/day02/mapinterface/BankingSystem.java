package com.javacollections.day02.mapinterface;

import java.util.*;
//Create a class bank to indicate the bank details
class Bank {
    //Create a HashMap to store the accounts
    private Map<Integer, Double> accounts = new HashMap<>();

    //Create a TreeMap to store the  Sorted accounts
    private TreeMap<Double, Integer> sortedAccounts = new TreeMap<>();

    //Create a Queue to store the withdrawal request
    private Queue<Integer> withdrawal = new LinkedList<>();

    //Create a method to create account
    public void createAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    //Create a method to request for withdrawal.
    public void requestWithdrawal(int accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            withdrawal.add(accountNumber);
        } else {
            System.out.println("Account not found: " + accountNumber);
        }
    }

    //Create a method to process withdrawal
    public void processWithdrawals() {
        while (!withdrawal.isEmpty()) {
            int accountNumber = withdrawal.poll();
            System.out.println("Processing withdrawal for account: " + accountNumber);
        }
    }

    //Create a method to display sorted account
    public void displaySortedAccount() {
        System.out.println("Accounts sorted by balance:");

        //use for loop
        for (var entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getValue() + " = " + entry.getKey());
        }
    }
}

//Create a class BankingSystem
public class BankingSystem {
    public static void main(String[] args) {
        //Create an object of Bank class
        Bank bankAccount = new Bank();

        //call the createAccount method
        bankAccount.createAccount(501654345, 50000);
        bankAccount.createAccount(626561102, 25000);
        bankAccount.createAccount(526546503, 45000);

        //call the requestWithdrawal method
        bankAccount.requestWithdrawal(526546503);

        //call the processWithdrawals method
        bankAccount.processWithdrawals();

        //call the displaySortedAccount method
        bankAccount.displaySortedAccount();
    }
}
