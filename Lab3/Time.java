package com.company;

public class Time {
    public int hrs;
    public int min;
    public int sec;
    public Time(){
        hrs= 11;
        min= 44;
        sec= 55;
    }
    public Time(int h, int m, int s){
        hrs =h;
        min =m;
        sec =s;
    }
    public void checkHrs(){
        if (hrs>24){
            System.out.println( " Invalid hour");
        }
    }
    public void checkMin(){
        if (min>60){
            System.out.println( " Invalid hour");
        }
    }
    public void checkSec(){
        if (sec>60){
            System.out.println( " Invalid hour");
        }
    }
    public void display(){
        System.out.println("Time in hrs is "+hrs+", Time in min is"+min+" and Time in sec is"+sec);
    }
}
