package com.company.LinkedList;

import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(30);
        list.addFirst(5);
        list.add(2,20);
        System.out.println(list.size());
        for (int element: list) {
            System.out.print(element + " ");
        }
    }
}
