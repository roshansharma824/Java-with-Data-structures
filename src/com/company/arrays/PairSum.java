package com.company.arrays;

public class PairSum {

    public static void pairSum(int arr[],int sum){

        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j< arr.length; j++){

                if (sum == arr[i]+arr[j]){
                    if (arr[i]< arr[j]){
                        System.out.println("("+arr[i] +","+arr[j]+")");
                    }
                    else {
                        System.out.println("("+arr[j] +","+arr[i]+")");
                    }
                }

            }
        }

    }

    public static void main(String[] args) {

        int arr[] = {6,3,4,6,1,7,2,6};
        pairSum(arr,7);
    }
}
