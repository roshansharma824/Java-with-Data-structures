package com.company.recursion2;

import java.util.Scanner;

public class BinarySearchRecursive {
    public static int helper(int input[],int si,int ei,int element)
    {
        if(si>ei)
            return -1;

        int mid=(si+ei)/2 ;
        if(element==input[mid])
            return mid;
        else if(element<input[mid])
            return helper(input,si,mid-1,element);
        else
            return helper(input,mid+1,ei,element);

    }

    // element - number to be searched
    public static int binarySearch(int input[], int element) {

        return helper(input,0,input.length-1,element);
        // Write your code here

    }
    static Scanner s = new Scanner(System.in);
    public static int[] takeInput() {
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int element = s.nextInt();
        System.out.println(binarySearch(input, element));
    }
}
