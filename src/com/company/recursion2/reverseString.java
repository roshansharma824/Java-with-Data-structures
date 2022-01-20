package com.company.recursion2;

public class reverseString {



    public static String reverseString(String s)
    {
        if (s.isEmpty()){
            return s;
        }
        //Calling function recursively
        return reverseString(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {

        StringBuilder s = new StringBuilder(reverseString("ABCD"));
        System.out.println(s);

    }
}
