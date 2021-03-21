package com.company;

public class L3a1Runner {
    public static void main(String[]args){
        Marks m1 = new Marks();
        System.out.println(m1.calculateSum());
        Marks m2 = new Marks(55,85,45);
        System.out.println(m2.calculateSum());
    }
}
