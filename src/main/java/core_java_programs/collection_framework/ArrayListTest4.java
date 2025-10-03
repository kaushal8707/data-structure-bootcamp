package com.example.collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest4 {
    public static void main(String args[]) {
 
           // creates array with initial capacity of 10.
           List<String> arrayList = new ArrayList<String>();
 
           System.out.println("--------add element to end of list");
           arrayList.add("ankit");
           arrayList.add("mittal");
           arrayList.add("javaMadeSoEasy");
 
           System.out.println("arrayList = "+arrayList);
           System.out.println("arrayList.isEmpty() = "+arrayList.isEmpty());
 
           System.out.println("\n--------clear list - remove all elements from list");
           arrayList.clear();
           
           System.out.println("arrayList.isEmpty() = "+arrayList.isEmpty());
 
           System.out.println("arrayList = "+arrayList);
 
           
    }
}