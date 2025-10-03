package com.practise.dsa.algo.stack.stack_using_an_array;

public class Stack {

    int rStack[]=new int[5];
    int size;
    int top;

    Stack(){
        size=rStack.length;
        top=-1;
    }

    public void push(int data) {
        //first you will increment top bcz default is -1 and array store from index 0
        if(top < size-1){
            rStack[++top]=data;
        }else{
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {

        return rStack[top--];
    }

    public void print() {
        for(int i:rStack){
            System.out.print(i+" ");
        }
    }

    public int peek() {
        return rStack[top];
    }
}
