package com.company.Offline;

public class HandleArithmeticException {
    public static void main(String[] args) {
        try {
            System.out.println(5/0);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Number can not be divided by zero !");
        }
        finally {
            System.out.println("Program executed successfully!");
        }
    }
}
