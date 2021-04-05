package com.company;

public class Calculator {
        public static double num1;
        public static double num2;
        public static double sum(double num1, double num2){
            return (num1 + num2);
        }
        public static double multiply(double num1, double num2){
            return (num1 * num2);
        }
        public static double divide(double num1, double num2){
            return (num1 / num2);
        }
        public static double modulus(double num1, double num2){
            return (num1 % num2);
        }
        public static double sin(double S){
            return (Math.sin(S));
        }
        public static double cos(double C){
            return (Math.cos(C));
        }
        public static double tan(double T){
            return (Math.tan(T));
        }
}
