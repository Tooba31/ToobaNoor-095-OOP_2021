package com.company;

public class Circle {
    public int radius;
    public double pi = 3.14;

    public Circle() {
        radius = 15;
    }

    public Circle(int r) {
        radius = r;
    }

    public double CalculateCircumference() {
        return (2 * radius * pi);
    }
}
