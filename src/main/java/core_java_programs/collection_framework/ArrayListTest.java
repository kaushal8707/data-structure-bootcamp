package com.example.collection_framework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String args[]) {
 
           // creates array with initial capacity of 10.
           List<String> arrayList = new ArrayList<String>();
 
           System.out.println("--------add element to end of list");
           arrayList.add("ankit");
           arrayList.add("mittal");
           arrayList.add("javaMadeSoEasy");
 
           System.out.println("arrayList = "+arrayList);
 
           System.out.println("--------add element at 1st index i.e. after ankit");
           arrayList.add(1,"java");
           System.out.println("arrayList = "+arrayList);
 
           
    }
}