package com.company;

public class L8_hA_Runner{
    public static void main(String[] args) {

        System.out.println("Student Details:");
        Student_home s1 = new Student_home("Tooba","House # ***-*,Street # **, PWD, Islamabad","****-*******",
                "*******@gmail.com","Student");
        s1.display();

        System.out.println();
        System.out.println("Employee Details:");
        Date d1 = new Date(03,02,2020);
        Employee_home e1 = new Employee_home("Noor","House # ***-*,Street # **,PWD,Islamabad",
                "****-*******", "****@gmail.com","XYZ",50000,d1);
        e1.display();

        System.out.println();
        System.out.println("Faculty Details:");
        Date d2 = new Date(25,06,2001);
        Faculty f1 = new Faculty("Liaqat","House # ***-*,Street # ***,Islamabad",
                "****-*******", "******@gmail.com","XYZ_2",
                100000,d2,8,"Professor");
        f1.display();

        System.out.println();
        System.out.println("Staff Details");
        Staff staff_1 = new Staff("Ali","House # ****-*, Street # *** ,Islamabad",
                "****-*******","********@gmail.com","XYZ_3",
                60000,d2,"Assistant Professor");
        staff_1.display();
    }
}

