package com.company.basics;

public class SumOfArrayRecursively {
    public static int sum(int input[],int N)
    {
        if (N<=0)
        {
            return 0;
        }

        return (sum(input,N-1)+input[N-1]);

    }
    public static void main(String[] args) {
        int input[] ={1,2,3,4,5};
        System.out.println(sum(input, input.length));

    }
}
