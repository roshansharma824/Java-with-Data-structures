package com.company.recursion2;

import java.util.Scanner;

public class StairCase {
    public static int staircase(int n){
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        int way1 = staircase(n-1);
        int way2 = staircase(n-2);
        int way3 = staircase(n-3);
        return way1+way2+way3;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(staircase(n));
    }
}
