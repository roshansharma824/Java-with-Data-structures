package com.company.stringsProblems;

public class PrintAllSubstrings {

    public static void printAllSubstrings(String str){

        for(int i=0; i<str.length(); i++){
            for (int j=i; j<str.length();j++){
                System.out.println(str.substring(i,j+1));
            }

        }

    }

    public static void main(String[] args) {

        printAllSubstrings("xyz");

//        String s = "xyz";
//        System.out.println(s.substring(0,1));

    }
}
