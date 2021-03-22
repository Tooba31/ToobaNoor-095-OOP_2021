package com.company;

public class L5hA1Runner {
    public static void main(String[] args) {
        Distance d1= new Distance(64, 5.4);
        Distance d2 = new Distance(68,5.8);
        Distance d3 = new Distance();
        Distance d4 = d1.Add(d2,d3);
        d4.display();
    }
}
