package com.practise.dsa.algo.linkedlist;

import java.util.LinkedList;

public class LinkedListInBuild {
    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        //push()  /**  push method will add elements at top/start of linked list like stack*/
        list.push(5);
        list.push(2);
        list.push(9);
        list.push(1);
        list.push(7);

        //add()  /**  add method will add elements at end of linked list*/
        list.add(33);
        //insert at first
        list.addFirst(11);
        //insert at last
        list.addLast(22);
        System.out.println("Linked List : "+list);

        //pop()  /**  pop method return element from top/start linked list and it will remove from list as well*/
        Integer popedElement = (Integer) list.pop();
        System.out.println("Popped Element - "+popedElement);

        //peek()  /**  peek return element from top/start linked list and it not remove from list*/
        Integer peekedElement = (Integer) list.peek();
        System.out.println("peeked Element - "+peekedElement);

        System.out.println("List available -"+list);

        //remove() - will remove element's from start/top of list
        System.out.println("remove() -> "+list.remove());

        System.out.println("poll() -> "+list.poll());

        System.out.println("Linked List : "+list);

        // add element 44 at place of 5 it uses method linkBefore
        list.add(list.indexOf(5), 44);

        System.out.println("Linked List : "+list);
    }
}
