package com.company.Offline;

public class HandleClassCastException {
    public static void main(String[] args) {
        try {
            Object o = new Object();

            String s = (String)o;
            System.out.println(s);
        }
        catch (ClassCastException c)
        {
            System.out.println("Parent class can't be cast in child class");
        }
    }
}
