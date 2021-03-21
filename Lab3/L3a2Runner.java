package com.company;

public class L3a2Runner {
public static void main(String[]args){
    Time t1 = new  Time();
    t1.checkHrs();
    t1.checkMin();
    t1.checkSec();
    t1.display();
    Time t2 = new Time( 11, 44,  55);
    t2.checkHrs();
    t2.checkMin();
    t2.checkSec();
    t2.display();
}
}
