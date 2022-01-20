package com.company.LinkedList;

import java.util.Scanner;

public class SwapTwoNode {
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
    public static Node<Integer> swapTwoNode(Node<Integer> head , int i ,int j)
    {
        Node<Integer> temp = head,prev=null,p1=null,p2=null,c1=null,c2=null;
        int pos = 0;
        while (temp != null)
        {
            if (pos == i)
            {
                p1 = prev;
                c1 = temp;
            }
            if(pos == j)
            {
                p2 = prev;
                c2 = temp;
            }
            prev = temp;
            temp = temp.next;
            pos++;
        }

        if(p1!=null)
        {
            p1.next = c2;
        }
        else
        {
            head = c2;
        }
        if (p2!=null)
        {
            p2.next = c1;
        }
        else
        {
            head = c1;
        }
        Node<Integer> temp1 = c2.next;
        c2.next = c1.next;
        c1.next = temp1;
        return head;
    }

    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        head = swapTwoNode(head,2,4);
        print(head);
    }
}
