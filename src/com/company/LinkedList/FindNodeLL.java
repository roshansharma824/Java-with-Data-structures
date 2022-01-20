package com.company.LinkedList;

import java.util.Scanner;

public class FindNodeLL {
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
    public static int findNode(Node<Integer> head,int elem)
    {
        if (head == null)
        {
            return -1;
        }
        int pos = 0;

        while (head != null)
        {
            if (head.data == elem )
            {
                return pos;
            }
            else
            {
                head = head.next;
                pos++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        int pos = findNode(head,6);
        System.out.println(pos);

    }
}
