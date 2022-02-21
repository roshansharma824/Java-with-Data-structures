package com.company.arrays;

public class FindDuplicate {


    public static int findDuplicate(int[] arr){

        int sumOfAllNaturalNumber,sum=0,n= arr.length;
        for (int i=0; i< arr.length;i++){
            sum += arr[i];
        }

        sumOfAllNaturalNumber = ((n-1)*(n-2))/2;

        return sum - sumOfAllNaturalNumber;

    }

    public static void main(String[] args) {

        int[] arr = {0,7,2,5,4,7,1,3,6};
        System.out.println(findDuplicate(arr));

    }
}
