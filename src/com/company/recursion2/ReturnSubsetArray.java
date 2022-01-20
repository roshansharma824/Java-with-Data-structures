package com.company.recursion2;

import java.util.Scanner;

public class ReturnSubsetArray {
    public static int[][] subsets(int input[],int si)
    {
        if(si>=input.length)
        {
            int ans[][]=new int[1][0];
            return ans;
        }
        int[][] smallans=subsets(input,si+1);
        int[][] ans=new int[smallans.length*2][];
        int k=0;
        for(int i=0;i<smallans.length;i++){
            ans[i]=new int[smallans[i].length];
            for(int j=0;j<smallans[i].length;j++){
                ans[i][j]=smallans[i][j];
            }
            k++;
        }
        for(int i=0;i<smallans.length;i++)
        { ans[k+i]=new int[smallans[i].length+1];
            ans[k+i][0]=input[si];
            for(int j=1;j<=smallans[i].length;j++)
            {
                ans[i+k][j]=smallans[i][j-1];
            }

        }
        return ans;


    }

    // Return a 2D array that contains all the subsets
    public static int[][] subsets(int input[]) {
        return subsets(input,0);

        // Write your code here

    }
    public static int[] takeInput() {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = takeInput();
        int output[][] = subsets(input);
        for(int i = 0; i < output.length; i++) {
            for(int j = 0; j < output[i].length; j++) {
                System.out.print(output[i][j] + " ");
            }
            System.out.println();
        }
    }
}
