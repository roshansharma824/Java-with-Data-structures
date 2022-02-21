package com.company.stringsProblems;

public class ReverseStringWordWise {

    public static String reverseStringWordWise(String str){
        String reverseString = "";
        for (int i=0; i<str.length();i++){
            reverseString = str.charAt(i) + reverseString;
        }

        int currentWordStart=0;
        String ans = "";
        int i;
        for (i=0; i<reverseString.length();i++){
            if (reverseString.charAt(i) == ' '){
                int currentWordEnd = i-1;
                String reverseWord = "";
                for (int j=currentWordStart;j<=currentWordEnd;j++){
                    reverseWord = reverseString.charAt(j) + reverseWord;
                }
                ans += reverseWord + " ";
                currentWordStart = i+1;
            }
        }
        int currentWordEnd = i-1;
        String reverseWord = "";
        for (int j=currentWordStart;j<=currentWordEnd;j++){
            reverseWord = reverseString.charAt(j) + reverseWord;
        }
        ans += reverseWord + " ";


        return ans;
    }

    public static void main(String[] args) {
        System.out.println(reverseStringWordWise("abc f s coding ninjas"));
    }
}
