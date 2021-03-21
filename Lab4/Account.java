package com.company;

public class Account {
    private double balance;

    public Account() {
        balance = 55000;
    }

    public Account( double a) {
        balance = a;
    }

    public void withdrawCash(double w) {
        setBalance(getBalance() - w);
    }

    public void depositCash(double d) {
        setBalance(getBalance() + d);
    }

    public void display() {
        System.out.println("Account balance is  " + getBalance());
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
