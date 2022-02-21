package com.company.arrays;

public class SwapAlternate {

    public static int[] swapAlternate(int arr[]){
        for (int i=0; i< arr.length-1; i+=2){

                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;

        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,9,3,10};
        swapAlternate(arr);
        for (int i=0; i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
