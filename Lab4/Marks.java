package com.company;

public class Marks {
    private int marks_1;
    private int marks_2;
    private int marks_3;
    public Marks(){
        marks_1 = 44;
        marks_2 = 33;
        marks_3 = 49;
    }
    public Marks(int m1,int m2,int m3) {
        this.marks_1 = m1;
        this.marks_2 = m2;
        this.marks_3 = m3;
    }
    public int getMarks_1() {
        return marks_1;
    }
    public void setMarks_1(int m1) {
        this.marks_1 = m1;
    }
    public int getMarks_2() {
        return marks_2;
    }
    public void setMarks_2(int m2) {
        this.marks_2 = m2;
    }
    public int getMarks_3() {
        return marks_3;
    }
    public void setMarks_3(int m3) {
        this.marks_3 = m3;
    }
    public int CalculateSum() {
        int sum = marks_1 + marks_2 + marks_3;
        return sum;
    }
    public void display(int sum){
        System.out.println("Total marks"+sum);
    }
}
