package com.company;
import java.util.Scanner;
public class L5A_Runner {
    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(51,34);
        Fraction f3 = f1.Ratio(f2);
        f3.display();
        Scanner input = new Scanner(System.in);
        System.out.println("Get first number : ");
        int Num1= input.nextInt();
        System.out.println("Get second number: ");
        int Num2 = input.nextInt();

        Fraction f4 = new Fraction(Num1,Num2);
        System.out.println("Are two Fractions equal? "+ f1.equals(f4,f2));
    }
}
