package com.company.LinkedList;

import java.util.Scanner;

public class Palindrome {
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
    public static Node<Integer> midPoint(Node<Integer> head)
    {
        if(head == null)
        {
            return head;
        }
        Node<Integer> slow = head;
        Node<Integer> fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public static boolean palindrome(Node<Integer> head)
    {
        if (head == null || head.next == null)
        {
            return true;
        }
        Node<Integer> h1 = head;
        Node<Integer> mid = midPoint(h1);
        Node<Integer> h2 = mid.next;
        mid.next = null;
        h2 = reverseLLBetter(h2);
        while (h1 != null && h2 != null)
        {
            if (h1.data == h2.data)
            {
                h1 = h1.next;
                h2 = h2.next;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Node<Integer> head = takeInput();
        System.out.println(palindrome(head));
        print(head);

    }
}
