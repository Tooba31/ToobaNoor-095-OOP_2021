package com.company;

public class Fraction {
    private int Num1;
    private int Num2;
    public Fraction(){
        Num1 = 10;
        Num2 = 20;
    }
    public Fraction(int x, int y){
        Num1 = x;
        Num2 = y;
    }
    public void setNum1(int x) {
        this.Num1 = x;
    }
    public void setNum2(int y) {
        this.Num2 = y;
    }
    public int getNum1() {
        return Num1;
    }
    public int getNum2() {
        return Num2;
    }
    public int HCF(int a, int b){
        int HCF = 1;
        for (int i = 1; i <= Num1 && i <= Num2; ++i) {
            if (Num1 % i  == 0 && Num2 % i == 0) {
                HCF= i;
            }
        }
        return HCF;
    }
    public Fraction Ratio(Fraction f){
        Fraction f_new = new Fraction(f.Num1 / f.HCF(f.getNum1(), f.getNum2()),
                f.Num2 / f.HCF(f.getNum1(), f.getNum2()));
        return f_new;
    }
    public void display(){
        System.out.println(Num1 + ":" + Num2);
    }
    public boolean equals(Fraction f1, Fraction f2) {
        if (Ratio(f1) != Ratio(f2)) {
            return false;
        }
        else {
            return true;
        }
    }
}
