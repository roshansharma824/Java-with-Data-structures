package com.company.Stack;

public class StackUsingLL<T> {

    private Node<T> head;
    private int size;

    public StackUsingLL(){
        head = null;
        size = 0;
    }
    public int size(){
        return size;
    }

    public T top() throws StackEmptyException {
        if (size == 0){
            throw new StackEmptyException();
        }
        return head.data;
    }

    public boolean isEmpty(){
       return (size == 0);
    }

    public void push(T element){
            Node<T> newNode = new Node<>(element);
            newNode.next = head;
            head = newNode;

        size++;
    }

    public T pop() throws StackEmptyException {
        if (size == 0){

            throw new StackEmptyException();
        }
        T temp = head.data;
        head = head.next;
        size--;
        return temp;
    }
}
