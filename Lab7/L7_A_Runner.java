package com.company;

public class L7_A_Runner {
    public static void main(String[] args) {
        System.out.println("Maximum 3 pizzas can be placed in a single order.");

        Pizza pizza_1 = new Pizza("Small",4,6,2);
        System.out.println(pizza_1.getDetails() + " for $" + pizza_1.Calculate_Cost());

        Pizza pizza_2 = new Pizza();
        pizza_2.setPizza_Size("Medium");
        pizza_2.setNum_of_Cheese_Toppings(10);
        pizza_2.setNum_of_Pepperoni_Toppings(10);
        pizza_2.setNum_of_Ham_Toppings(10);
        System.out.println(pizza_2.getDetails() + " for $." + pizza_2.Calculate_Cost());

        Pizza pizza_3 = new Pizza("Medium",10,10,8);
        System.out.println(pizza_3.getDetails() + " for $" + pizza_3.Calculate_Cost());

        PizzaOrder pizzaOrder_1 = new PizzaOrder(pizza_1);
        PizzaOrder pizzaOrder_2 = new PizzaOrder(pizza_2);
        PizzaOrder pizzaOrder_3 = new PizzaOrder(pizza_3);

        System.out.println("Your total bill is Rs." + PizzaOrder.Calculate_Total());
    }
}
