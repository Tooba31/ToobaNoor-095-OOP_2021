package com.company;
import java.util.Scanner;

public class L6_A_Runner {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Perform given operations on the numbers: sum,multiply,divide,modulus,sin,cos,tan");
            System.out.println("Enter the numbers: ");
            System.out.print("Enter num1: ");
            double num1 = input.nextInt();
            System.out.print("Enter num2: ");
            double num2 = input.nextInt();
            System.out.println("Sum of num1 and num2 = " + Calculator.sum(num1, num2));
            System.out.println("Product of num1 and num2 = " + Calculator.multiply(num1, num2));
            System.out.println("Dividing num1 and num2 =" + Calculator.divide(num1,num2));
            System.out.println("Modulus of num1 and num2 = " + Calculator.modulus(num1,num2));
            System.out.println("sin of num1 = " + Calculator.sin(num1));
            System.out.println("sin of num2 = " + Calculator.sin(num2));
            System.out.println("cos of num1 = " + Calculator.cos(num1));
            System.out.println("cos of num2 = " + Calculator.cos(num2));
            System.out.println("tan of num1 = " + Calculator.tan(num1));
            System.out.println("tan of num2 = " + Calculator.tan(num2));
        }
}
