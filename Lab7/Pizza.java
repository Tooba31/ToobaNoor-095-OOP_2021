package com.company;

public class Pizza {
    private String pizza_size;
    private int num_of_Cheese_Toppings;
    private int num_of_Pepperoni_Toppings;
    private int num_of_Ham_Toppings;

    public Pizza(){
    }
    public Pizza(String Pizza_Size, int Cheese_Toppings, int Pepperoni_Toppings, int Ham_Toppings){
        this.pizza_size = Pizza_Size;
        this.num_of_Cheese_Toppings = Cheese_Toppings;
        this.num_of_Pepperoni_Toppings = Pepperoni_Toppings;
        this.num_of_Ham_Toppings = Ham_Toppings;
    }
    public void setPizza_Size(String Pizza_Size) {
        this.pizza_size = Pizza_Size;
    }
    public String getPizza_Size() {
        return pizza_size;
    }
    public void setNum_of_Cheese_Toppings(int Num_of_Cheese_Toppings) {
        this.num_of_Cheese_Toppings = Num_of_Cheese_Toppings;
    }
    public int getNum_of_Cheese_Toppings() {
        return num_of_Cheese_Toppings;
    }
    public void setNum_of_Pepperoni_Toppings(int Num_of_Pepperoni_Toppings) {
        this.num_of_Pepperoni_Toppings = Num_of_Pepperoni_Toppings;
    }
    public int getNum_of_Pepperoni_Toppings() {
        return num_of_Pepperoni_Toppings;
    }
    public void setNum_of_Ham_Toppings(int Num_of_Ham_Toppings) {
        this.num_of_Ham_Toppings = Num_of_Ham_Toppings;
    }
    public int getNum_of_Ham_Toppings() {
        return num_of_Ham_Toppings;
    }
    public double Calculate_Cost(){
        if (pizza_size == "Small"){
            double pizza_Cost = 10 + ((2 * num_of_Cheese_Toppings) + (2 * num_of_Pepperoni_Toppings)
                    + (2 * num_of_Ham_Toppings));
            return pizza_Cost;
        }
        else if(pizza_size == "Medium"){
            double pizza_Cost = 12 + ((2 * num_of_Cheese_Toppings) + (2 * num_of_Pepperoni_Toppings)
                    + (2 * num_of_Ham_Toppings));
            return pizza_Cost;
        }
        else if(pizza_size == "Large"){
            double pizza_Cost = 14 + ((2 * num_of_Cheese_Toppings) + (2 * num_of_Pepperoni_Toppings)
                    + (2 * num_of_Ham_Toppings));
            return pizza_Cost;
        }
        return 0;
    }
    public String getDetails(){
        return ("You have ordered a " + pizza_size + " pizza with " + num_of_Cheese_Toppings +
                " cheese toppings," + num_of_Pepperoni_Toppings + " pepperoni toppings and "
                + num_of_Ham_Toppings + " ham toppings");
    }
}
