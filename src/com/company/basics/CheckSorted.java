package com.company.basics;

public class CheckSorted {
    public static boolean checkSorted(int intput[])
    {
        if (intput.length<=1)
        {
            return true;
        }
        int smallInput[] = new int[intput.length-1];
        for (int i=1; i<intput.length;i++)
        {
            smallInput[i-1]=intput[i];
        }
        boolean smallAns = checkSorted(smallInput);
        if (!smallAns)
        {
            return false;
        }
        if (intput[0]<=intput[1])
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean checkSorted_2(int input[])
    {
        if(input.length<=1)
        {
            return true;
        }
        if (input[0]>input[1])
        {
            return false;
        }
        int smallInput[] = new int[input.length-1];
        for (int i=1; i<input.length;i++)
        {
            smallInput[i-1]=input[i];
        }
        boolean smallAns = checkSorted_2(smallInput);
        return smallAns;
    }
    private static boolean checkSortedBetter(int input[],int startIndex)
    {
        if (startIndex>=input.length-1)
        {
            return true;
        }
        if (input[startIndex]>input[startIndex+1])
        {
            return false;
        }
        return checkSortedBetter(input,startIndex+1);
    }
    public static boolean checkSortedBetter(int input[])
    {
        return checkSortedBetter(input,0);
    }
    public static void main(String[] args) {

        int input[] ={1,2,3,4,5};
        System.out.println( checkSorted(input));
        System.out.println(checkSorted_2(input));
        System.out.println(checkSortedBetter(input));

    }
}
