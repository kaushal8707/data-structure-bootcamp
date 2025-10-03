package com.practise.dsa.algo.queue.using_linked_list;

/**
 *
 * we are marking rear as a null explicitly because
 * after removing node from front while we remain one node
 *  and last node while we trying to remove bcz of [front=front.next] front->null
 *   but still rear will be pointing to last node(33) bcz of this [queue.isEmpty()]-> false in while condition bcz front->null, rear->33(not null)
 *   so bcz of rear not null again it will go inside while and try to call peek() method
 *   where trying to fetch [front.data] which is null so will throw Null Pointer Exception
 *   that's the reason while [front==rear] we are explicitly marking rear as null
 *
 *
 */
class Node {
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}
public class Queue {

    Node front=null;
    Node rear=null;
    private void add(int data) {

        Node newNode = new Node(data);

        if(isEmpty()) {
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }

    private int remove() {
        if(isEmpty()){
            System.out.println("Queue is empty !!");
            return -1;
        }

        if(front==rear) {
            rear=null;
        }

        Node temp = front;
        front=front.next;
        return temp.data;
    }

    private int peek() {
        if(isEmpty()){
            System.out.println("Queue is empty !!");
            return -1;
        }

        Node temp = front;
        return temp.data;
    }

    public boolean isEmpty() {
        return front==null && rear==null;
    }

    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.add(11);
        queue.add(22);
        queue.add(33);

        while (!queue.isEmpty()){
            System.out.println(queue.peek());
            queue.remove();
        }
    }
}
