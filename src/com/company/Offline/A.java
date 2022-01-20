package com.company.Offline;

public class A {
    void disp1()
    {
        System.out.println("Class A called");
    }

    public static void main(String[] args) {
        A obj1 = new A();
        obj1.disp1();
        Object obj2 = new A();
        ((A) obj2).disp1();

    }
}
