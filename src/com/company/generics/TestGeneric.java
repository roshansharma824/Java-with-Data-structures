package com.company.generics;

public class TestGeneric implements PrintInterface {
    public int a;
    public TestGeneric(int a)
    {
        this.a=a;
    }
    public void print()
    {
        System.out.println(a);
    }

}
