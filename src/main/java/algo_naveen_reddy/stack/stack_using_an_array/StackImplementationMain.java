package com.practise.dsa.algo.stack.stack_using_an_array;

public class StackImplementationMain {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(7);

        int poppedOutElement = stack.pop();
        System.out.println("Popped out element - "+poppedOutElement);

        stack.push(1);

        int peekedUpElement = stack.peek();
        System.out.println("Peeked up element - "+peekedUpElement);

        stack.push(9);
        stack.print();

    }
}
