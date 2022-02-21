package com.company.stringsProblems;

public class CheckPermutation {

    public static Boolean checkPermutation(String s, String t){

        int freq[] = new int[256];
        if (s.length() != t.length()){
            return false;
        }

        for (int i=0; i<s.length();i++){
            char ch = s.charAt(i);

            freq[ch]++;
        }
        for (int i=0; i<t.length();i++){
            char ch = t.charAt(i);

            freq[ch]--;
        }

        for (int i=0; i< freq.length; i++ ){
            if (freq[i] != 0 ){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkPermutation("abad","bada"));

//        String s = "abad";
//        for (int i=0; i<s.length();i++){
//            char ch = s.charAt(i);
//            int index = Integer.parseInt(String.valueOf(ch));
//            int d = Integer.parseInt(s);
//
//            System.out.println(d);
//        }

    }
}
