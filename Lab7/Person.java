package com.company;

public class Person {
    private String name;
    private Address address;
    private String contact_num;

    public Person(){
    }
    public Person(String n, Address a, String c){
        this.name = n;
        this.address = a;
        this.contact_num = c;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
    public void setContact_num(String contact_num) {
        this.contact_num = contact_num;
    }
    public String getContact_num() {
        return contact_num;
    }
    public void display(){
        System.out.println("Name: " + name + "\n Contact number: " + contact_num);
        address.display();
    }
}
