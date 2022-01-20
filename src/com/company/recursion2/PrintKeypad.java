package com.company.recursion2;

public class PrintKeypad {
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
    public static void keypad(int n,String output)
    {
        if (n==0)
        {
            System.out.println(output);
            return;
        }
        int num = n%10;
        String helper = getString(num);

        for (int i=0;i<helper.length();i++)
        {
            keypad(n/10,helper.charAt(i)+output);
        }


    }
    public static void main(String[] args) {
        keypad(234,"");

    }
}
