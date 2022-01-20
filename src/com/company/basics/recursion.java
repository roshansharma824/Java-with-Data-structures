package com.company.basics;

public class recursion {
    static int fact(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        else
        {
            return  n*fact(n-1);
        }
    }
    static int fib(int n)
    {

        if (n<=1)
            return n;
        return fib(n-1)+fib(n-2);
    }
    static int pow(int x,int n)
    {
        if(n==1)
        {
            return x;
        }
        return x*pow(x,n-1);
    }
    static void printNumbers(int n)
    {
        if(n==1)
        {
            System.out.println(n+" ");
            return;
        }
        printNumbers(n-1);

        System.out.println(n+" ");
    }
    static int numberOfDigit(int n)
    {
        if(n<=9 && n>=0)
        {
            return 1;
        }
        else {


            return 1 + numberOfDigit(n % 10);
        }
    }
    public static void main(String ar[])
    {
        System.out.println(numberOfDigit(445));

//        printNumbers(4);
//        System.out.println(pow(3,3));
//        System.out.println("Factorial of 5 is :" +fact(5));
//        System.out.println("Factorial of 5 is :" +fib(3));
    }
}
