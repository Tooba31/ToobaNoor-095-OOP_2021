package com.company;

public class L4Ah1Runner {
    public static void main(String[] args) {
        Marks m=new Marks();
        m.setMarks_1(41);
        m.setMarks_2(37);
        m.setMarks_3(44);
        System.out.println("Marks_1 are: " + m.getMarks_1());
        System.out.println("Marks_2 are: " + m.getMarks_2());
        System.out.println("Marks_3 are: " + m.getMarks_3());
        int sum = m.CalculateSum();
        System.out.println("Total marks = " + sum);

    }
}
