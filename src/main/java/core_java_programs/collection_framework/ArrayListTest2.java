package com.example.collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String args[]) {
 
           // creates array with initial capacity of 10.
           List<String> arrayList = new ArrayList<String>();
 
           arrayList.add("ankit");
           arrayList.add("mittal");
           arrayList.add("javaMadeSoEasy");
 
           System.out.println("arrayList = "+arrayList);
           
           System.out.println("\n--------get element at 1st index i.e. mittal");
           System.out.println("element at 1st index = "+arrayList.get(1));   
           
           System.out.println("\n--------contains element  ");
           System.out.println("arrayList.contains = "+arrayList.contains("mittal")); 
 
           
           System.out.println("\n--------Remove element at 1st index i.e. mittal");
           arrayList.remove(1);
 
           System.out.println("arrayList = "+arrayList);
 
           System.out.println("\n---------Remove ankit from list");
           arrayList.remove("ankit");
           arrayList.add("fdgd");
           System.out.println("arrayList = "+arrayList);
 
           System.out.println("\n---------Set newVal at 0th index");
           arrayList.set(0,"newVal"); //javaMadeSoEasy will be replace by newVal
           System.out.println("arrayList = "+arrayList);
           
           
           
           
           
    }
}
 