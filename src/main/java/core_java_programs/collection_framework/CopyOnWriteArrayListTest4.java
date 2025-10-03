package com.example.collection_framework;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class CopyOnWriteArrayListTest4 {
    public static void main(String args[]) {
 
           List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
 
           System.out.println("\n--------add element to end of list");
           copyOnWriteArrayList.add("ankit");
           copyOnWriteArrayList.add("mittal");
           copyOnWriteArrayList.add("javaMadeSoEasy");
 
           System.out.println("copyOnWriteArrayList = "+copyOnWriteArrayList);
           System.out.println("copyOnWriteArrayList.isEmpty() = "+copyOnWriteArrayList.isEmpty());
 
           System.out.println("\n--------clear list - remove all elements from list");
           copyOnWriteArrayList.clear();
           
           System.out.println("copyOnWriteArrayList.isEmpty() = "+copyOnWriteArrayList.isEmpty());
 
           System.out.println("copyOnWriteArrayList = "+copyOnWriteArrayList);
 
           
    }
}
 