package com.company.Offline;

public class HandleNullPointerException {
    public static void main(String[] args) {
        String name = null;

        try{
            if(name.length() > 3)
            {
                System.out.println("Right name");
            }
            else
            {
                System.out.println("Not a name");
            }
        }
        catch (NullPointerException e)
        {
            System.out.println("Name can not null");
        }
    }
}
