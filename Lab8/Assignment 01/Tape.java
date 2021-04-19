package com.company;

public class Tape extends Publication{
    protected String play_time;
    public Tape(){
    }
    public Tape(String Title,double Price,String Play_Time){
        super(Title,Price);
        this.play_time = Play_Time;
    }
    public void setPlay_Time(String Play_Time) {
        this.play_time = Play_Time;
    }
    public String getPlay_Time() {
        return play_time;
    }
    public void display() {
        super.display();
        System.out.println("Play time in minutes is " + play_time);
    }
}
