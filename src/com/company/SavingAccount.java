package com.company;

public class SavingAccount extends Account{
    @Override
    public void transferMoney(Account account, double amount) {
        account.setBalance(account.getBalance()+amount);
        this.setBalance(this.getBalance()-(amount+20));
    }
}
