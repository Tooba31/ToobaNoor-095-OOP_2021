package com.company;

public class Line {
    private Point startPoint;
    private Point endPoint;
    public Line(Point sP, Point eP){
        this.startPoint = sP;
        this.endPoint = eP;
    }
    public double getLength(){
        return (Math.sqrt(Math.pow((endPoint.getX_cordinate() - startPoint.getX_cordinate()),2)
                + (Math.pow((endPoint.getY_cordinate() - startPoint.getY_cordinate()),2))));
    }
}
