package com.company;

public class Book extends Publication {
    protected double page_count;
    public Book(){
    }
    public Book(String Title,double Price,double Page_Count){
        super(Title,Price);
        this.page_count = Page_Count;
    }
    public void setPage_Count(double Page_Count) {
        this.page_count = Page_Count;
    }
    public double getPage_Count() {
        return page_count;
    }
    public void display() {
        super.display();
        System.out.println("Page count is " + page_count);
    }
}
