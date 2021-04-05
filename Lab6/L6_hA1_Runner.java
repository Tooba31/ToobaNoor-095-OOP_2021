package com.company;

public class L6_hA1_Runner {
    public static void main(String [] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        saver1.ModifyInterestRate(0.03);
        System.out.println("Total balance of saver1 = " + saver1.calculateMonthlyInterestRate());
        saver2.ModifyInterestRate(0.03);
        System.out.println("Total balance fof saver2 = " + saver2.calculateMonthlyInterestRate());
        saver1.ModifyInterestRate(0.04);
        System.out.println("Total balance of saver1 = " + saver1.calculateMonthlyInterestRate());
        saver2.ModifyInterestRate(0.04);
        System.out.println("Total balance of saver2 = " + saver2.calculateMonthlyInterestRate());
    }
}
