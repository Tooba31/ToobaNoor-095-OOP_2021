package com.company;

public class L7_hA3_Runner {
    public static void main(String[] args){
        Point p_1 = new Point(01,10);
        Point p_2 = new Point(05,50);
        Line l_1 = new Line(p_1,p_2);
        System.out.println("Length of line_1 is " + l_1.getLength());

        Point p_3 = new Point();
        p_3.setX_cordinate(9);
        p_3.setY_cordinate(5);
        Line l_2 = new Line(p_2,p_3);
        System.out.println("Length of line_2 is " + l_2.getLength());
    }
}
