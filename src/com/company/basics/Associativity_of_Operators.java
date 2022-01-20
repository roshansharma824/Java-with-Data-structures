package com.company.basics;

public class Associativity_of_Operators {
    public static void main(String ar[])
    {
        //int a = 6*5-34/2;
        /*
            = 30-34/2
            =30-17
            =13
         */
        //int b = 60/5-34*2;
        /*
           = 12-34*2
           = 12-68
           = -58
         */

        //System.out.println(a);
        //System.out.println(b);
        // Precedence & Associativity

        int x = 5;
        int y = 3;
        int z = (x-y)/2;
        System.out.println(z);

    }
}
