package com.company;

public class Student_home extends Person_home {
    protected String status;
    public Student_home(String name, String address, String phone_num, String email_address,String status){
        super(name,address,phone_num,email_address);
        this.status = status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public void display() {
        super.display();
        System.out.println("Status: " + status);
    }
}
