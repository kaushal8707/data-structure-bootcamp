package com.example.collection_framework;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
 

public class SortSetExample2 {
 
    public static void main(String...a){
        Set<Integer> treeSet = new TreeSet<Integer>(new Comparator<Integer>() {
                  @Override
                  public int compare(Integer o1, Integer o2) {
                        //using Comparator to sort elements in descending order.
                        return o2.compareTo(o1);
                  }
           });
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
 
        System.out.println("treeSet : "+treeSet);
 
       
    }
}