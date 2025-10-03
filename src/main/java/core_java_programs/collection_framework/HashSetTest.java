package com.example.collection_framework;


import java.util.HashSet; 
import java.util.Set;
 
public class HashSetTest {
    public static void main(String args[]) {
 
           System.out.println("-----1. create Set---");
           Set<String> hashSet = new HashSet<String>();
 
           System.out.println("\n-----2. adding elements in Set---");
           hashSet.add("ankit");
           hashSet.add("JavaMadeSoEasy");
 
           System.out.println("hashSet ="+hashSet);
           
           System.out.println("\n------3. contains element  ");
           System.out.println("hashSet.contains = "+hashSet.contains("ankit"));
 
           System.out.println("\n------4. Remove element at 1st index i.e. mittal");
           hashSet.remove("ankit");  
           System.out.println(hashSet);
 
           System.out.println("hashSet ="+hashSet);
 
 
    }
}