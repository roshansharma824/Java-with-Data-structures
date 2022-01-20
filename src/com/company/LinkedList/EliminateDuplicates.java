package com.company.LinkedList;

import java.util.Map;
import java.util.Scanner;

public class EliminateDuplicates {
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
    public static Node<Integer> eliminateDuplicates(Node<Integer> head)
    {
        if(head==null)
            return head;
        if(head.next==null)
            return head;
        Node<Integer> t1=head,t2=head.next;
        while(t2!=null){
            if(t1.data.equals(t2.data))
            {
                t2=t2.next;
            }
            else{
                t1.next=t2;
                t1=t1.next;
            }
        }

        t1.next=null;
        return head;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = eliminateDuplicates(head);
        print(head);
    }
}
