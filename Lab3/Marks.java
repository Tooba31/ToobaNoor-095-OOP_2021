package com.company;

public class Marks {
    int marks1;
    int marks2;
    int marks3;

    public Marks(){
        marks1=99;
        marks2=88;
        marks3=77;
    }
    public Marks(int a , int b , int c){
        marks1=a;
        marks2=b;
        marks3=c;
    }
    public int calculateSum() {
        return (marks1+marks2+marks3);
    }
}
