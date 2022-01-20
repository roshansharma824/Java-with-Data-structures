package com.company.LinkedList;

import java.util.Scanner;

public class DeleteEveryNnodes {
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
    public static Node<Integer> deleteEveryNnodes(Node<Integer> head, int m, int n)
    {
        if (head == null)
        {
            return head;
        }
        if (m == 0)
        {
            return null;
        }
        if (n == 0)
        {
            return head;
        }

        int count;
        Node<Integer> curr = head, temp = head;
        while (curr != null)
        {
            for (count = 1;count<m && curr!=null; count++)
            {
                curr = curr.next;
            }
            if (curr == null)
            {
                return head;
            }
            temp = curr.next;
            for (count=1;count<n && temp!=null; count++)
            {
                temp = temp.next;
            }
            curr.next = temp;
            curr = temp;
        }
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = deleteEveryNnodes(head,2,3);
        print(head);
    }
}
