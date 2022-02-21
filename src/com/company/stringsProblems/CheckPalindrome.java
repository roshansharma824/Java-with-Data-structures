package com.company.stringsProblems;

public class CheckPalindrome {

    public static boolean checkPalindrome(String str){
        boolean check = true;

        int j=str.length()-1;
        for (int i=0; i<str.length(); i++){
            if(i>j){
                break;
            }
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            j--;
        }

        return check;

    }

    public static void main(String[] args) {
        String str = "aabbba";
        System.out.println(checkPalindrome(str));
    }
}
