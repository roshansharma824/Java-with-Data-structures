package com.company.LinkedList;

import java.util.Scanner;

public class ReverseLL {
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
    public static Node<Integer> reverseR(Node<Integer> head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        Node<Integer> finalHead = reverseR(head.next);
        Node<Integer> temp = finalHead;
        while (temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = head;
        head.next = null;

        return finalHead;
    }

    public static Node<Integer> reverseLLBetter(Node<Integer> head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        Node<Integer> reversedTail = head.next;
        Node<Integer> smallAns = reverseLLBetter(head.next);
        reversedTail.next = head;
        head.next = null;
        return smallAns;

    }

    public static DoubleNode reverseLLDoubleNode(Node<Integer> head)
    {
        if (head == null || head.next == null )
        {
            DoubleNode ans = new DoubleNode() ;
            ans.head = head;
            ans.tail = head;
            return ans;
        }
        DoubleNode smallAns = reverseLLDoubleNode(head.next);
        smallAns.tail.next = head;
        head.next = null;
        DoubleNode ans = new DoubleNode();
        ans.head = smallAns.head;
        ans.tail = head;
        return ans;
    }


    public static void main(String[] args) {
        Node<Integer> head = takeInput();
//        DoubleNode ans = reverseLLBetter(head);
//        print(ans.head);
        head = reverseLLBetter(head);
        print(head);

    }
}
