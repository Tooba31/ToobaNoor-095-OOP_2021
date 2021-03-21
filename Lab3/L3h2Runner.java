package com.company;

public class L3h2Runner {
    public static void main(String[] args) {
        Account acc = new Account();
        System.out.println("Your net balance is " + acc.balance);
        System.out.println("Your balance after withdraw is " + acc.withdraw(1000));
        System.out.println("Your balance after deposit is " + acc.deposit(500));
    }
}
