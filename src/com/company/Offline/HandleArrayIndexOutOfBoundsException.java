package com.company.Offline;

public class HandleArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int ar[] = {1,2,3,4,5};
        try
        {
            for (int i=0; i<=ar.length; i++)
            {
                System.out.print(ar[i]+" ");
            }
        }
        catch (ArrayIndexOutOfBoundsException a)
        {
            System.out.println("Array's 5th can't be excess");
        }
    }
}
