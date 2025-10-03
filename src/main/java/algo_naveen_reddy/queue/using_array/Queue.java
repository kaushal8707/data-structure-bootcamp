package com.practise.dsa.algo.queue.using_array;

public class Queue {
    int front;
    int rear;
    int size;
    int arr[]=new int[4];

    Queue(){
        front=0;
        rear=-1;
        size=0;
    }

    public void enqueue(int data) {

        rear++;
        arr[rear]=data;
        size++;
    }

    public int dequeue() {
        int data = arr[front];
        front++;
        size--;
        return data;
    }

    public int peek() {
        int data = arr[front];
        return data;
    }

    public void printQueue() {
        for(int i=front; i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
