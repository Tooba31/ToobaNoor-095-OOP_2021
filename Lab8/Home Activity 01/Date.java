package com.company;

public class Date {
    protected int day;
    protected int month;
    protected  int year;

    public Date(int day,int month,int year){
        this.day = checkDay(day);
        this.month = checkMonth(month);
        this.year = year;
    }

    public int checkMonth(int M){
        if (M>0 && M <=12){
            return M;
        }
        else {
            System.out.println("Month is invalid "+M+" therefore set to 1");
            return 1;
        }
    }

    public int checkDay(int D){
        if (D>0 && D<=31){
            return D;
        }
        else if (month == 2 && D == 29 && (year%400 == 0 || (year%4 == 0 && year%100 != 0))){
            return D;
        }
        else {
            System.out.println("Day is invalid "+D+" therefore set to 1");
            return 1;
        }
    }
    public String display(){
        return (day+"-"+month+"-"+year);
    }
}

