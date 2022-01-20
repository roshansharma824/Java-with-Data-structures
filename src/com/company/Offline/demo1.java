package com.company.Offline;

import static java.lang.Byte.*;

public class demo1 {
    int n1 , n2;
//    demo1()
//    {
//
//    }

    demo1(int k1, int k2)
    {
        n1 = k1;
        n2 = k2;
    }
    void display()
    {
        System.out.println(n1+n2);
    }

    public static void main(String[] args) {
        demo1 obj1 = new demo1(5,2);
        obj1.display();
//        demo1 obj2 = new demo1();
        int n1 = 10;
        n1 = (byte)n1;
    }

}
