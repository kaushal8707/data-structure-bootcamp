package com.example.collection_framework;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
public class CopyOnWriteArrayListTest1 {
    public static void main(String args[]) {
 
           // creates array with initial capacity of 10.
           List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
 
           copyOnWriteArrayList.add("ankit");
           copyOnWriteArrayList.add("mittal");
           copyOnWriteArrayList.add("javaMadeSoEasy");
 
           System.out.println("copyOnWriteArrayList = "+copyOnWriteArrayList);
           
           System.out.println("\n--------get element at 1st index i.e. mittal");
           System.out.println("element at 1st index = "+copyOnWriteArrayList.get(1));
           
           System.out.println("\n--------contains element  ");
           System.out.println("copyOnWriteArrayList.contains = "+copyOnWriteArrayList.contains("mittal"));  
 
           
           System.out.println("\n--------Remove element at 1st index i.e. mittal");
           copyOnWriteArrayList.remove(1);  
 
           System.out.println("copyOnWriteArrayList = "+copyOnWriteArrayList);
 
           System.out.println("\n---------Remove ankit from list");
           copyOnWriteArrayList.remove("ankit");
 
           System.out.println("copyOnWriteArrayList = "+copyOnWriteArrayList);
 
           System.out.println("\n---------Set newVal at 0th index");
           copyOnWriteArrayList.set(0,"newVal"); //javaMadeSoEasy will be replace by newVal
           System.out.println("copyOnWriteArrayList = "+copyOnWriteArrayList);
           
           
           
           
           
    }
}