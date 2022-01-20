package com.company.basics;

public class varargs {
//    static int sum(int a, int b)
//    {
//        return a+b;
//    }
    static int sum(int x,int ...arr)
    {
        int result=x ;
        for(int a: arr)
        {
            result +=a;
        }
        return result;
    }
    public static void main(String ar[])
    {
        System.out.println(sum(1));
        System.out.println("the sum of 4 and 5 is :"+sum(4,5,5,6,7,4));
    }
}
