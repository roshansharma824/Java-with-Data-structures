package com.company.LinkedList;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String args[])
    {
        ArrayList<Integer> list1 = new ArrayList<>(5);
        ArrayList<String> list2 = new ArrayList<>();
        System.out.println(list1.size());
        list1.add(15);
        list1.add(20);
        list1.add(25);
        list1.add(2,50);
        System.out.println(list1.size());
        System.out.println(list1.get(2));
        for (int i=0;i<list1.size();i++)
        {
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();

        for (int elem : list1)
        {
            System.out.print(elem+" ");
        }
        System.out.println();


        list2.add("Geeks");
        list2.add("Geeks");
        list2.add("Geeks");
        list2.add("Geeks");
        list2.remove("Geeks");

        System.out.println(list2);


//        list1.remove(1);
//        list1.set(1,100);
//        for (int i=0;i<list1.size();i++)
//        {
//            System.out.print(list1.get(i)+" ");
//        }
//        System.out.println();
    }
}
