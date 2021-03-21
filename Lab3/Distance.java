package com.company;

public class Distance {
    public int inches;
    public int feet;
    public Distance(){
        inches = 15; feet = 5;
    }
    public Distance(int i,int f){
        inches = i; feet = f;
    }
    public void display(){
        System.out.println("Distance in inches is "+inches+" and distance in feet is "+feet);
    }
}
