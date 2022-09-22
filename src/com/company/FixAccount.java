package com.company;

public class FixAccount extends Account{
    @Override
    public void transferMoney(Account account, double amount) {
        System.out.println("Transferring money from Fix Account was not allowed");
    }
}

