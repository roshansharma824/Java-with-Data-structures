package com.company.basics;

public class quickSort {
    public static void QuickSort(int[] input,int si,int ei)
    {
        if(si>=ei)
        {
            return;
        }
        int pivotPos = partition(input,si,ei);
        QuickSort(input,si,pivotPos-1);
        QuickSort(input,pivotPos+1,ei);
    }
    public static int partition(int[] input,int si,int ei)
    {
        int pivot = input[si];
        int count=0;
        for(int i = si+1; i<=ei;i++)
        {
            if(input[i]<=pivot)
            {
                count++;
            }
        }
        int pivotPos=count+si;
        input[si]=input[pivotPos];
        input[pivotPos]=pivot;
        int i=si,j=ei;
        while(i<pivotPos && j>pivotPos)
        {
            if(input[i]<=input[pivotPos])
            {
                i++;
            }
            else if(input[j]>pivot)
            {
                j--;
            }
            else
            {
                int temp1 = input[i];
                input[i]=input[j];
                input[j]=temp1;
                i++;
                j--;
            }
        }
        return pivotPos;
    }
    public static void main(String args[])
    {
        int[] input={9,6,2,5,2,6,3};
        int n=input.length;
        QuickSort(input,0,n-1);
        for (int i=0; i<n;i++)
        {
            System.out.print(input[i]+" ");
        }
    }

}
