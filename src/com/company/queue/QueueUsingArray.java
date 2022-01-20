package com.company.queue;

public class QueueUsingArray {

    private int data[];
    private int front; // index at which front element is stored
    private int rear;  // index at which rear element is stored
    private int size;

    public QueueUsingArray(){
        data = new int[10];
        front = -1;
        rear = -1;
        size = 0;
    }
    public QueueUsingArray(int capacity){
        data = new int[capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public int front() throws QueueFullException {
        if (size==0){
            throw new QueueFullException();
        }
        return data[front];
    }

    public void enqueue(int element) throws QueueFullException {
        if (size == data.length){
            doubleCapacity();
        }
        if (size==0){
            front = 0;
        }
        size++;
        rear = (rear+1)% data.length;
//        rear++;
//        if (rear == data.length){
//            rear = 0;
//        }
        data[rear] = element;
    }

    private void doubleCapacity() {
        int temp[] = data;
        data = new int[2* temp.length];
        int index = 0;
        for (int i = front;i< temp.length;i++){
            data[index] = temp[i];
            index++;
        }
        for (int i = 0;i<front;i++){
            data[index] = temp[i];
            index++;
        }
        front = 0;
        rear = temp.length-1;


    }

    public int dequeue() throws QueueFullException {
        if (size == 0){
            throw new QueueFullException();
        }
        int temp = data[front];
        front = (front + 1)% data.length;
//        front++;
//        if (front == data.length){
//            front = 0;
//        }
        size--;
        if (size==0){
            front = -1;
            rear = -1;
        }

        return temp;
    }
}
