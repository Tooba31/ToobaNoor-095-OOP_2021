package com.company;

public class L7_hA1_Runner {
    public static void main(String[] args) {
        Address a_1 = new Address(02,266,"Islamabad",45710);
        Person p_1 = new Person("Najaf", a_1, "0000-0000000");
        p_1.display();

        Address a2 = new Address();
        a_1.setStreet_num(04);
        a_1.setHouse_num(456);
        a_1.setCity("Islamabad");
        a_1.setCityCode(45710);
        Person p_2 = new Person("Khan", a_1, "0000-0000000");
        p_2.display();
    }
}
