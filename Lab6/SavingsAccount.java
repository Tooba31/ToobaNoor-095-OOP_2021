package com.company;

public class SavingsAccount {

    public static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double s_b){
        this.savingsBalance = s_b;
    }
    public double calculateMonthlyInterestRate(){
        double monthlyInterestRate = (savingsBalance * annualInterestRate) /12;
        double totalBalance = monthlyInterestRate + savingsBalance;
        System.out.print("Total balance is ");
        return totalBalance;
    }
    public static double ModifyInterestRate(double m){
        annualInterestRate = m;
        return annualInterestRate;
    }
}
