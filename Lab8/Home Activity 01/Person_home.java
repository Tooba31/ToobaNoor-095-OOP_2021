package com.company;

public class Person_home {
    protected String name;
    protected String address;
    protected String phone_num;
    protected String email_address;
    public Person_home(String name, String address, String phone_num, String email_address){
        this.name = name;
        this.address = address;
        this.phone_num = phone_num;
        this.email_address = email_address;
    }
    public void display(){
        System.out.println("Name: " + name + "\nAddress: " + address +
                "\nPhone Num: " + phone_num + "\nEmail Address: " + email_address);
    }
}
