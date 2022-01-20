package com.company.LinkedList;

import java.util.Scanner;

public class EvenAfterOdd {
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
    public static Node<Integer> evenAfterOdd(Node<Integer> head)
    {
        if (head == null || head.next == null)
        {
            return head;
        }
        Node<Integer> eh=null , et=null , oh=null , ot=null;
        while (head != null)
        {
            if(head.data%2 == 0)
            {
                if (eh == null)
                {
                    eh = head;
                    et = head;
                }
                else
                {
                    et.next = head;
                    et = et.next;
                }
            }
            else
            {
                if(oh == null)
                {
                    oh = head;
                    ot = head;
                }
                else
                {
                    ot.next = head;
                    ot = ot.next;
                }
            }
            head = head.next;
        }
        if(oh!=null){
            ot.next=eh;
        }
        else{
            return eh;
        }
        if(eh!=null){
            et.next=null;
        }
        return oh;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = evenAfterOdd(head);
        print(head);

    }
}
