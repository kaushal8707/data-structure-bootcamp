package com.practise.dsa.algo.stack;

import java.util.Stack;

public class StackInBuild {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push(11);
        stack.push(32);
        System.out.println("Available stack - "+stack);

        Object poppedElement = stack.pop();
        System.out.println("Popped Element - "+poppedElement);

        //push() - to insert record at top
        stack.push(41);
        stack.push(21);
        stack.push(39);

        System.out.println("Available stack - "+stack);

        //pop() - to take out top/last
        Object poppedEle = stack.pop();
        System.out.println("Popped Element - "+poppedEle);
        System.out.println("Available stack - "+stack);

        //peek() - to view the top/last element
        Object peekedElement = stack.peek();
        System.out.println("Peeked Element - "+peekedElement);
        System.out.println("Available stack - "+stack);

        stack.add(33);

        System.out.println("Available stack - "+stack);

        Object poppedEl = stack.pop();
        System.out.println("Popped Element - "+poppedEl);
        System.out.println("Available stack - "+stack);

        stack.add(2, 55);

        System.out.println("Available stack - "+stack);

    }
}
