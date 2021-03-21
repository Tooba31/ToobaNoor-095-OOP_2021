package com.company;

public class L4Ah2Runner {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setBalance(100000);
        acc1.withdrawCash(15000);
        acc1.depositCash(30000);

        double balance =acc1.getBalance();
        acc1.display();

        Account acc2 = new Account(100000);
        acc2.withdrawCash(7000);
        acc2.depositCash(10000);
        acc2.setBalance(balance);
        acc2.getBalance();
        acc2.display();
    }
}
