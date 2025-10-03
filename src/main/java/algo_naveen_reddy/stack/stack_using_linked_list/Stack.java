package com.practise.dsa.algo.stack.stack_using_linked_list;

class Node
{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next=null;
    }
}

public class Stack {

    Node head = null;

    public void push(int data) {

        Node newNode = new Node(data);
        if(isEMPTY()){
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public boolean isEMPTY() {
        return head==null;
    }

    public int pop() {

        if(isEMPTY()){
            return -1;
        }
        Node top=head;
        head=head.next;
        return top.data;
    }

    public int peek() {

        if(isEMPTY()){
            return -1;
        }
        Node top=head;
        return top.data;
    }

    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(2);
        stack.push(4);
        stack.push(6);

        while(!stack.isEMPTY()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
}
