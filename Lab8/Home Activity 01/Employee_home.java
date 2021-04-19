package com.company;

public class Employee_home extends Person_home{
    protected String office;
    protected double salary;
    protected Date hired_date;
    public Employee_home(String name, String address, String phone_number, String email_address, String office,
                      double salary,Date hired_date){
        super(name,address,phone_number,email_address);
        this.office = office;
        this.salary = salary;
        this.hired_date = hired_date;
    }
    public void display(){
        super.display();
        System.out.println("Office: " + office + "\n Salary: " + salary + "\n " +
                "Date of Hire: " + hired_date.display());
    }
}
