package com.company;

public class L5cA2Runner {
    public static void main(String[]args){
        Complex C1 = new Complex(8, 11);
        Complex C2 = new Complex(4, 5);
        Complex C3 = new Complex();
        C3 = C1.Add(C2);
        C3.Show();
    }
}
