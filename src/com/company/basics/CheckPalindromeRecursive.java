package com.company.basics;

public class CheckPalindromeRecursive {
    public static boolean checkPalindromeRecursive(String s,int i,int j)
    {
        if(i==j)
        {
            return true ;
        }
         if (s.charAt(i)!=s.charAt(j))
         {
             return false;
         }
         if(i<j+1)
         {
             return checkPalindromeRecursive(s,i+1,j-1);
         }
         return true;
    }
    public static void main(String[] args) {
        String s = "ninin";
        System.out.println(checkPalindromeRecursive(s,0,s.length()-1));
    }
}
