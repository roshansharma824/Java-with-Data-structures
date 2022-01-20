package com.company.basics;

import java.util.Scanner;

public class twoDarray {
    public static int [][] takeInput()
    {

        System.out.println("Enter the rows");
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        System.out.println("Enter the number of column");
        int cols= s.nextInt();
        int array [][]=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)
            {
                array[i][j]=s.nextInt();
            }
        }
        return array;
    }
    public static int largestColsum(int array[][])
    {
        int largest = Integer.MIN_VALUE;
        int sum=0;
        for (int j=0;j< array[0].length;j++)
        {
            sum=0;
            for (int i=0;i< array.length;i++)
            {
                sum += array[i][j];
            }
            if (largest<sum)
            {
                largest=sum;
            }

        }
        return largest;
    }
    public static void printarray(int array[][])
    {
        for(int i=0;i<array.length;i++)
        {
            for (int j=0;j<array[i].length;j++)
            {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String ar[])
    {
        int array[][]=takeInput();
        //printarray(array);
        System.out.println(largestColsum(array));
    }
}
