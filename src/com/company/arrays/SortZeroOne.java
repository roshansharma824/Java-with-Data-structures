package com.company.arrays;

public class SortZeroOne {
    public static void sortZeroOne(int arr[]){

        int i=0,j = arr.length-1;
        while (i< arr.length){
            if (i<j){
                if (arr[i] == 0){
                    i++;
                    continue;
                }
                if (arr[j] == 1){
                    j--;
                    continue;
                }
                if (arr[i] !=0 && arr[j] !=1 ){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            else {
                break;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {0 ,1 ,1 ,0 ,1 ,0 ,0 ,1 ,0 ,0};
        sortZeroOne(arr);

        for (int i=0; i< arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
