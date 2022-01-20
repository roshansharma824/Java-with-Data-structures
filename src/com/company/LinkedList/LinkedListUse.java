package com.company.LinkedList;

import java.util.Scanner;

public class LinkedListUse {
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
    public static int lengthLL(Node<Integer> head)
    {
        if (head == null)
        {
            return 0;
        }
        return (1 + lengthLL(head.next));
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

    public static Node<Integer> insert(Node<Integer> head,int data, int pos)
    {
        Node<Integer> newNode = new Node<>(data);
        if(pos==0)
        {
            newNode.next = head;
            return newNode;
        }


            Node<Integer> temp = head;
            int i = 0;
            while (i < pos - 1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            return head;

    }

    public static Node<Integer> deleteNode(Node<Integer> head,int pos)
    {
        if(head==null)
        {
            return head;
        }
        if(pos==0)
        {
            return head.next;
        }
        Node<Integer> temp = head;
        int i = 0;
        while(temp != null && (i<pos-1))
        {
            temp = temp.next;
            i++;
        }
        if(temp==null || temp.next==null)
        {
            return head;
        }
        temp.next = temp.next.next;
        return head;
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

    public static Node<Integer> mergeLL(Node<Integer> head1, Node<Integer> head2)
    {
        if (head1 == null)
        {
            return head2;
        }
        if(head2 == null)
        {
            return head1;
        }
        Node<Integer> head3 = null ;
        Node<Integer> t1 = head1 ;
        Node<Integer> t2 = head2;
        Node<Integer> t3 = null ;
        if(t1.data <= t2.data)
        {
            head3 = t1;
            t3 = t1;
            t1 = t1.next;
        }
        else
        {
            head3 = t2;
            t3 = t2;
            t2 = t2.next;
        }
        while (t1 != null && t2 != null)
        {
            if(t1.data <= t2.data)
            {
                t3.next = t1;
                t3 = t3.next;
                t1 = t1.next;

            }
            else
            {
                t3.next = t2;
                t3 = t3.next;
                t2 = t2.next;

            }

        }
        if (t1 == null)
        {
            t3.next = t2;
        }
        else
        {
            t3.next = t1;
        }
        return head3;

    }

    public static Node<Integer> mergeSort(Node<Integer> head)
    {
        if(head == null)
        {
            return null;
        }
        if(head.next == null)
        {
            return head;
        }
        Node<Integer> mid = midPoint(head);

        Node<Integer> h2 = mid.next;
        mid.next = null;

        Node<Integer> part1 = mergeSort(head);
        Node<Integer> part2 = mergeSort(h2);

        Node<Integer> ans = mergeLL(part1,part2);
        return ans;

    }

    public static void main(String[] args) {
//        Node<Integer> head = takeInput();
//        print(head);
//        head = insert(head,80,0);
//        print(head);
//        Node<Integer> mid = midPoint(head);
//        System.out.println(mid.data);
//
//        deleteNode(head,2);
//        print(head);
//        Node<Integer> n1 = new Node<>(10);
//        Node<Integer> n2 = new Node<>(20);
//        Node<Integer> n3 = new Node<>(30);
//
//        n1.next=n2;
//        n2.next=n3;
//
//        Node<Integer> head = n1;
//        print(head);
//        print(head);
//        Node<Integer> head1 = takeInput();
//        Node<Integer> head2 = takeInput();
//        Node<Integer> head3 = mergeLL(head1,head2);
//        print(head3);

        Node<Integer> head = takeInput();
        System.out.println(lengthLL(head));



    }
}
