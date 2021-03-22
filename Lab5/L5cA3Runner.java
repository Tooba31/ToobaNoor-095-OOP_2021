package com.company;

public class L5cA3Runner {
    public static void main(String[] args)
    {
        Point p1 = new Point(100,80);
        Point p2 = new Point (50,20);
        Point p3 = new Point ();
        Point p4 = p1.Add(p2,p3);
        p4.display();
    }

}
