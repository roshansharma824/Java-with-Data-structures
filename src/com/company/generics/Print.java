package com.company.generics;



public class Print {
    public static <T extends  PrintInterface> void print(T a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer a[] = new Integer[10];

        for (int i=0;i<10;i++)
        {
            a[i]=i+1;
        }

        String s[] = new String[10];
        for (int i=0;i<10;i++)
        {
            s[i]="abc";
        }
//        print(a);
//        print(s);

        TestGeneric t[] = new TestGeneric[10];
        for (int i=0;i<10;i++)
        {
            t[i]= new TestGeneric(10);
        }
        print(t);

    }
}
