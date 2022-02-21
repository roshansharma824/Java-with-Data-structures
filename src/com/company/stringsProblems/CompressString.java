package com.company.stringsProblems;

public class CompressString {
    public static String compressString(String str){

        String output = "" + str.charAt(0);
        if (str.length()<=1){
            return output;
        }
        int count = 1;
        for (int i=1; i<str.length();i++){
            if (str.charAt(i-1) == str.charAt(i)){
                count++;
                if (i == str.length()-1){
                    output = output + count;
                }
            }
            else {
                if (count > 1){
                    output = output + count;
                }
                output = output + str.charAt(i);
                count = 1;
            }
        }

        return output;
    }
    public static void main(String[] args) {
        System.out.println(compressString("aaabbccdsa"));
        System.out.println(compressString("aaabbcddeeeee"));
    }
}
