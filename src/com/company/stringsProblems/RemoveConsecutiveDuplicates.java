package com.company.stringsProblems;

public class RemoveConsecutiveDuplicates {

    public static String removeConsecutiveDuplicates(String str){

        if (str.length() == 0){
            return str;
        }
        String output = "" + str.charAt(0);
        for (int i=1; i< str.length();i++){
            if (str.charAt(i-1) != str.charAt(i)){
                output =  output + str.charAt(i);
            }
        }

        return output;
    }

    public static void main(String[] args) {

        System.out.println(removeConsecutiveDuplicates("aabccba"));

    }
}
