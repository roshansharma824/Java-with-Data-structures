package com.company.stringsProblems;

public class ReverseEachWord {

    public static String reverseEachWord(String str){
        String ans = "";
        int currentWordStart = 0;
        int currentWordEnd ;
        int i;
        for (i=0;i<str.length();i++){

            if (str.charAt(i) == ' '){
                currentWordEnd = i-1;
                String reverseWord = "";
                for (int j = currentWordStart;j<=currentWordEnd;j++){
                    reverseWord = str.charAt(j) + reverseWord;
                }
                ans += reverseWord+" ";
                currentWordStart = i+1;

            }

        }
        currentWordEnd = i-1;
        String reverseWord = "";
        for (int j = currentWordStart;j<=currentWordEnd;j++){
            reverseWord = str.charAt(j) + reverseWord;
        }
        ans += reverseWord;


        return ans;
    }

    public static void main(String[] args) {
        String str = "abc def ghi";

        System.out.println(reverseEachWord(str));
    }
}
