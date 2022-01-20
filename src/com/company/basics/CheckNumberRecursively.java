package com.company.basics;

public class CheckNumberRecursively {
    public static boolean searchNumber(int input[],int N,int x)
    {
        if (N<=0)
        {
            return false;
        }

        if (input[N-1]==x)
        {
            return true;
        }
        boolean b = searchNumber(input, N - 1, x);
        return b;


    }
    public static void main(String args[])
    {
        int input[] ={1,2,3,4,5};
        System.out.println(searchNumber(input,input.length,5));
    }
}
