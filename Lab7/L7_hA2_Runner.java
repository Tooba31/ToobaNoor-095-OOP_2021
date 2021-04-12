package com.company;

public class L7_hA2_Runner {
    public static void main(String[] args) {
        Address a_1 = new Address(44,777,"Islamabad",45710);
        Person p_1 = new Person("Najaf",a_1,"0000-0000000");
        Book b_1 = new Book(p_1,"ABC", "XYZ");
        b_1.display();
        System.out.println("\n");

        Address a_2 = new Address();
        a_2.setStreet_num(45);
        a_2.setHouse_num(00);
        a_2.setCity("XYZ");
        a_2.setCityCode(45710);
        Person p_2 = new Person();
        p_2.setName("ABC2");
        p_2.setAddress(a_2);
        p_2.setContact_num("0000-0000000");
        Book b_2 = new Book();
        b_2.setAuthor(p_2);
        b_2.setBook_name("ABC3");
        b_2.setPublisher("XYZ2");
        b_2.display();
    }
}
