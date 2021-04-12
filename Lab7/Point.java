package com.company;

public class Point {
    private double x_cordinate;
    private double y_cordinate;

    public Point(){
    }
    public Point(double x,double y){
        this.x_cordinate = x;
        this.y_cordinate = y;
    }
    public void setX_cordinate(double x_cordiante) {
        this.x_cordinate = x_cordinate;
    }
    public void setY_cordinate(double y_cordinate) {
        this.y_cordinate = y_cordinate;
    }
    public double getX_cordinate() {
        return x_cordinate;
    }
    public double getY_cordinate() {
        return y_cordinate;
    }
    public void display(){
        System.out.println("x-coordinate = " + x_cordinate + "\n y-coordinate = " + y_cordinate);
    }
}
