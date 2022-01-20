package com.company.basics;

public class methods {
//    static int logic(int x, int y)
//    {
//        int z;
//        if(x>y)
//        {
//            z=x+y;
//        }
//        else
//        {
//            z=(x+y)*5;
//        }
//        return z;
//    }
//    public static void main(String ar[])
//    {
//        methods obj1 = new methods();
//        int a=2;
//        int b=1;
//        System.out.println(obj1.logic(a,b));
//    }

    //Question No1
    static void multiplication(int n)
    {
        for ( int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
    public static void main(String ar[])
    {
         int n=2;
         multiplication(n);
    }


}
