package com.company.basics;

public class SelectionSort {
    public static void selectionSort(int[] input)
    {
        for(int i=0; i<input.length-1;i++)
        {
            int min=input[i];
            int minIndex = i;
            for(int j=i+1;j<input.length;j++)
            {
                if(min>input[j])
                {
                    min=input[j];
                    minIndex=j;
                }
            }
            if(minIndex!=i)
            {
                input[minIndex]=input[i];
                input[i]=min;
            }
        }
    }
    public static void main(String[] args)
    {
        int[] input={2,5,2,4,6,7,2,5,6};
        selectionSort(input);
        for(int i=0;i<input.length;i++)
        {
            System.out.print(input[i]+" ");
        }
        System.out.println();

    }
}
