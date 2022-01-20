package com.company.recursion2;
import java.util.Scanner;

public class ReturnKeypad {
    public class solution {
        public static String getString(int num)
        {
            switch(num) {
                case 2:
                    return "abc";
                case 3:
                    return "def";
                case 4:
                    return "ghi";
                case 5:
                    return "jkl";
                case 6:
                    return "mno";
                case 7 :
                    return "pqrs";
                case 8:
                    return "tuv";
                case 9 :
                    return "wxyz";
                default:
                    return "";
                // code block
            }

        }



        // Return a string array that contains all the possible strings
        public static String[] keypad(int n){

            if(n==0)
            {
                String ans[] = {""};
                return ans;
            }
            String smallAns[] = keypad(n/10);
            int num=n;
            int lastDigit = num%10;
            String helper = getString(lastDigit);
            String ans[] = new String[helper.length()*smallAns.length];

            int k=0;

            for(int i=0;i<helper.length();i++)
            {
                for(int j=0;j<smallAns.length;j++)
                {
                    ans[k]=smallAns[j]+helper.charAt(i);
                    k++;
                }
            }
            return ans;


            // Write your code here

        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input = s.nextInt();
        String output[] = solution.keypad(input);
        for(int i = 0; i < output.length; i++) {
            System.out.println(output[i]);
        }
    }
}


