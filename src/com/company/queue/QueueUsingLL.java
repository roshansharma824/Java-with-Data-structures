package com.company.queue;
public class QueueUsingLL<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;

    public QueueUsingLL(){
        front = null;
        rear = null;
        size = 0;
    }
    int size(){
        return size;
    }
    boolean isEmpty(){
        return size==0;
    }
    
    void enqueue(T data){
        
        Node<T> newNode = new Node<>(data);
        
        if (rear == null){
            front = newNode;
            rear = newNode;
        }
        else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        
    }
    
    T dequeue() throws QueueFullException {
        
        if (size ==0){
            throw new QueueFullException();
        }
        T temp = front.data;
        front = front.next;
        if (size ==1){
            rear = null;
        }
        size--;
        
        return temp;
        
    }
    
    
}
