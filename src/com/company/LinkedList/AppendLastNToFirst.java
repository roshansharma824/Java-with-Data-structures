package com.company.LinkedList;


import java.util.Scanner;

public class AppendLastNToFirst {

    public static Node<Integer> takeInput()
    {
        Node<Integer> head = null, tail = null;
        Scanner s = new Scanner(System.in);
        int data = s.nextInt();
        while(data != -1)
        {
            Node<Integer> newNode = new Node<>(data);
            if(head==null)
            {
                head=newNode;
                tail=newNode;
            }
            else
            {
                tail.next = newNode;
                tail = newNode; //tail = tail.next;
            }
            data = s.nextInt();
        }
        return head;
    }
    public static void print(Node<Integer> head)
    {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static int lengthLL(Node<Integer> head)
    {
        if (head == null)
        {
            return 0;
        }
        return (1 + lengthLL(head.next));
    }
    public static Node<Integer> appendLastNToFirst(Node<Integer> head, int k)
    {
        if(head == null)
        {
            return head;
        }
        Node<Integer> newHead = null;
        Node<Integer> newTail = null;
        Node<Integer> tail = head;
        int l = lengthLL(head);
        int count = 1;
        k = k%l;

        while (tail.next != null)
        {
            if(count == l-k)
            {
                newTail = tail;
            }
            if(count == l-k+1)
            {
                newHead = tail;
            }
            tail = tail.next;
            count++;
        }

        newTail.next = null;
        tail.next = head;
        return newHead;


    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        Node<Integer> newHead = appendLastNToFirst(head,4);
        print(newHead);
    }
}
