package com.example.collection_framework;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
 
 
/*
 *TreeMap is sorted by natural order of keys, but we will implement Comparator interface to change the behaviour to sort TreeMap in descending order of keys.
Comparator interface has been used in form of anonymous inner class in java.
 */
public class SortMapByKeyAscendingExample3 {
 
    public static void main(String...a){
        Map<Integer,Integer> treeMap = new TreeMap<Integer,Integer>(new Comparator<Integer>(){
                  @Override
                  public int compare(Integer o1, Integer o2) {
                        //using Comparator to sort map in descending order of keys.
                        return o2.compareTo(o1);
                  }
           });
        treeMap.put(4, 1);
        treeMap.put(2, 1);
        treeMap.put(3, 1);
        treeMap.put(5, 1);
       
        System.out.println("treeMap : "+treeMap);
 
       
    }
}