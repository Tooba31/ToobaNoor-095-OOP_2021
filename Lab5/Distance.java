package com.company;

public class Distance {
    private double inch;
    private double feet;
    public Distance(){
        inch = 64;
        feet = 5.4;
    }
    public Distance(double i, double f){
        inch = i;
        feet = f;
    }
    public void setInch(double i){
        inch = i;
    }
    public void setFeet(double f){
        feet = f;
    }
    public double getInch() {
        return inch;
    }
    public double getFeet() {
        return feet;
    }
    public Distance Add(Distance d1, Distance d2){
        Distance d_new = new Distance(inch+ d1.inch + d2.inch, feet+ d1.feet + d2.feet);
        return d_new;
    }
    public void display(){
        System.out.println(inch);
        System.out.println(feet);
    }
}
