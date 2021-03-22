package com.company;

public class Complex {
    private double real;
    private double imag;
    public Complex() {
        real = 0.0;
        imag = 0.0;
    }
    public Complex (double r, double i) {
        real = r;
        imag = i;
    }
    public Complex Add (Complex b)
    {
        Complex c_new = new Complex (real + b.real, imag+ b.imag);
        return c_new;
    }
    public void Show ()
    {
        System.out.println( real + imag);
    }

}
