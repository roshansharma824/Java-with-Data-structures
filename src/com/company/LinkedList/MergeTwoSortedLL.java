package com.company.LinkedList;

public class MergeTwoSortedLL {
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
    public static void main(String[] args) {
//        Node<Integer> head = takeInput();

    }
}
