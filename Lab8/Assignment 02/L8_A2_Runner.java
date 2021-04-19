package com.company;

public class L8_A2_Runner {
    public static void main(String[] args) {
        System.out.println("Computer 1 Details:");
        Computer c1 = new Computer(11,3200,10000,00);
        c1.display();
        System.out.println("Laptop 1 Details:");
        Laptop l1 = new Laptop(22,3200,10000,00,
                00,00,00,00);
        l1.display();

        System.out.println("Computer 2 Details:");
        Computer c2 = new Computer();
        c2.setWord_size(000);
        c2.setMemory_size(00);
        c2.setStorage_size(0000);
        c2.setSpeed(00);
        c2.display();

        System.out.println("\nLaptop 2 Details:");
        Laptop l2 = new Laptop();
        l2.setWord_size(000);
        l2.setMemory_size(000);
        l2.setStorage_size(000);
        l2.setSpeed(00);
        l2.setLength(0);
        l2.setWidth(00);
        l2.setHeight(00);
        l2.setWeight(00);
        l2.display();
    }
}