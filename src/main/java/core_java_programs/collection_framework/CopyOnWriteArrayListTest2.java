package com.example.collection_framework;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


public class CopyOnWriteArrayListTest2 {
    public static void main(String args[]) {
 
           List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
 
           System.out.println("--------add element to end of list");
           copyOnWriteArrayList.add("ankit");
           copyOnWriteArrayList.add("mittal");
           copyOnWriteArrayList.add("javaMadeSoEasy");
 
           System.out.println("copyOnWriteArrayList = "+copyOnWriteArrayList);
 
           System.out.println("\n--------add element at 1st index i.e. after ankit");
           copyOnWriteArrayList.add(1,"java");
           System.out.println("copyOnWriteArrayList = "+copyOnWriteArrayList);
 
           
    }
}