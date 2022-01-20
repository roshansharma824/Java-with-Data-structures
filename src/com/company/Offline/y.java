package com.company.Offline;

import java.util.Scanner;

public class y extends x{
    int n1,n2;
   
    public void sum()
    {
        Scanner s = new Scanner(System.in);
        super.sum();
        n1 = 30;
        n2 = 40;
        System.out.println(n1+n2);
        System.out.println(super.n1);
        char a ;
        a = s.next().charAt(0);

    }
    public static void main(String ar[])
    {
        y obj1 = new y();
        obj1.sum();



    }
}











