package com.company.basics;

public class jaggedArrays {
    public static void main(String args[])
    {
        int arr[][] = new int[4][];
        System.out.println(arr);
        System.out.println(arr[0]);
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = new int[i+2];
            System.out.println(arr[i]);
        }
//        for (int i=0;i< arr.length;i++)
//        {
//            for (int j=0;j<arr[i].length;j++)
//            {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        int arr2[][] = new int[4][];
        arr2[0] = new int[3];
        arr2[1] = new int[1];
        arr2[2] = new int[0];
        arr2[3] = new int[2];
        for (int i=0;i< arr2.length;i++)
        {
            for (int j=0;j<arr2[i].length;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
