package com.company.recursion2;

public class CheckSorted {

    public static boolean checkSorted(int input[]){
        if (input.length<=1){
            return true;
        }
        if(input[0]>input[1]){
            return false;
        }

        int[] smallInput = new int[input.length-1];

        for (int i=1; i< input.length;i++){
            smallInput[i-1] = input[i];
        }

        boolean smallAns = checkSorted(smallInput);

        return smallAns;


    }

    public static void main(String[] args) {
        int [] input = {1,2,5,4,6};
        System.out.println(checkSorted(input));
    }
}
