package com.company.recursion2;

public class ReturnSubsetsSumtoK {

    private int[][] returnSubset(int arr[],int k, int si){

        if (si == arr.length){
            if (k==0){
                return new int [1][0];
            }else{
                return new int[0][0];
            }
        }

        int temp1[][] = returnSubset(arr,k-arr[si],si+1);

        int temp2[][] = returnSubset(arr, k, si+1);

        int output[][] = new int[temp1.length+ temp2.length][];

        int r=0;
        for (int i=0;i< temp2.length; i++){
            output[r] = new int[temp2[i].length];
            for (int j=0;j< temp2[i].length;j++){
                output[r][j] = temp2[i][j];
            }
            r++;
        }

        for (int i=0;i< temp1.length;i++){
            output[r] = new int[temp1[i].length+1];
            output[r][0] = arr[si];
            for (int j=0;j< temp1[i].length+1;j++){
                output[r][j+1] = temp1[i][j];
            }
            r++;
        }
        return output;
    }



    public static void main(String[] args) {

    }
}
