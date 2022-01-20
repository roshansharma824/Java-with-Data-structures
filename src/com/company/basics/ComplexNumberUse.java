package com.company.basics;
class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void print() {
        System.out.println(real + " " + "+" + " " + imaginary + "i");
    }

    public void add(ComplexNumber c1) {
        this.real = this.real + c1.real;
        this.imaginary = this.imaginary + c1.imaginary;
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        int newReal = c1.real + c2.real;
        int newImaginary = c1.imaginary + c2.imaginary;
        ComplexNumber c = new ComplexNumber(newReal, newImaginary);
        return c;
    }

    public void multiply(ComplexNumber c1) {
        int newReal = this.real * c1.real;
        int newReal1 = this.imaginary * c1.imaginary;
        int newImaginary = this.real * c1.imaginary + this.imaginary * c1.real;
        this.real = newReal - newReal1;
        this.imaginary = newImaginary;
    }
}
public class ComplexNumberUse {
    public static void main(String args[])
    {
        ComplexNumber c1 = new ComplexNumber(3,4);
        c1.print();

        ComplexNumber c2 = new ComplexNumber(1,5);
        c1.add(c2);
        c1.print();
        c2.print();

        ComplexNumber c3 = new ComplexNumber(4,3);
        ComplexNumber c4 = new ComplexNumber(1,3);
        ComplexNumber c5 =  ComplexNumber.add(c3,c4);
        c5.print();

        ComplexNumber c6 = new ComplexNumber(4,3);
        ComplexNumber c7 = new ComplexNumber(1,3);
        c6.multiply(c7);
        c6.print();

    }

}
