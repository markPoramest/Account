package com.company;

public class Main {

    public static void main(String[] args) {
        SavingAccount account1 = new SavingAccount(1000, 0);

        SavingAccount account2 = new SavingAccount(1123, 20000);
        account2.setAnnualInterestRate(4.5);
        Person person = new Person("Yuttaphong", "Somsakul");
        person.setAge(20);
        person.setBDate(new Date(8, "June", 2002));
        account2.setObjPerson(person);

        account2.withdraw(2500);
        account2.deposit(3000);
        account2.transferMoney(account1, 5000);

    }
}
