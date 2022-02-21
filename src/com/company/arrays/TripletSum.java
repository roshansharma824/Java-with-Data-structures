package com.company.arrays;

public class TripletSum {

    public static void tripletSum(int arr[],int sum){
        int count =0;

        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                for (int k=j+1; k<arr.length; k++){

                    if ((arr[i]+arr[j]+arr[k]) == sum){
                        System.out.println("("+arr[i]+","+arr[j]+","+arr[k]+")");
                        count++;
                    }

                }
            }
        }

        System.out.println(count);

    }

    public static void main(String[] args) {
        int arr[] = {2, -5, 8 ,-6, 0, 5, 10, 11 ,-3};
        tripletSum(arr,10);
    }
}
