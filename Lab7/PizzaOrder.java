package com.company;

public class PizzaOrder {
    static Pizza[] p_1 = new Pizza[9];
    private static int p_o = 0;
    public PizzaOrder(Pizza pizza){
        p_1[p_o] = pizza;
        p_o++;
    }
    public static double Calculate_Total() {
        double Bill = 0;
        for(int x = 0; x < p_o; x++){
            double Bill_1 = p_1[x].Calculate_Cost();
            Bill = Bill + Bill_1;
        }
        return Bill;
    }
}
