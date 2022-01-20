package com.company.basics;

public class FirstIndexOfNumber {
    public static int firstOccurrenceOfX(int input[],int startIndex,int x)
    {
        if (input.length<=startIndex)
        {
            return -1;
        }
        if (input[startIndex]==x)
        {
            return startIndex;
        }
        return firstOccurrenceOfX(input,startIndex+1,x);
    }
    public static int lastOccurrenceOfX(int input[],int lastIndex,int x)
    {
        if (lastIndex==-1)
        {
            return -1;
        }
        if (input[lastIndex]==x)
        {
            return lastIndex;
        }
        return lastOccurrenceOfX(input,lastIndex-1,x);
    }
    public static void allIndex(int input[],int startIndex, int x)
    {
        if (input.length<=startIndex)
        {
            return;
        }
        if (x==input[startIndex])
        {
            System.out.print(startIndex+" ");
        }
        allIndex(input,startIndex+1,x);
    }
    public static void main(String[] args) {
        int input[] = {1,2,5,3,2,4,3,9,3};
        System.out.println(firstOccurrenceOfX(input,0,3));
        System.out.println(lastOccurrenceOfX(input, input.length-1,1));
        allIndex(input,0,3);

    }
}

