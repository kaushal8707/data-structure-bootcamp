package com.example.collection_framework;

import java.util.Map;
import java.util.TreeMap;

/*TreeMap�s putAll method or constructor >

 If elements are stored in HashMap or any other collection class that implements Map we can use TreeMap�s putAll method or constructor to sort map on basis of key in java.

 Let�s see Example in java >

 HashMap -
        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        hashMap.put(4, 1);
        hashMap.put(2, 1);
        hashMap.put(3, 1);

 TreeMap�s  putAll method -
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        treeMap.putAll(hashMap);

 TreeMap�s constructor -
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>(hashMap);


Important Note : 
If any class that implements  Map contains null key  - If any class that implements Map contains null key and is converted into TreeMap than NullPointerException (RunTimeException) will be thrown in java.
*/
public class SortMapByKeyAscendingExample2 {
 
    public static void main(String...a){
        Map<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        treeMap.put(4, 1);
        treeMap.put(2, 1);
        treeMap.put(3, 1);
        treeMap.put(5, 1);
 
        System.out.println("treeMap : "+treeMap);
 
       
    }
}