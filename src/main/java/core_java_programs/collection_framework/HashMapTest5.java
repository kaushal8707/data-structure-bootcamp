package com.example.collection_framework;
//HashMap - synchronizing map using Collections.synchronizedMap
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class HashMapTest5 {
    public static void main(String args[]) {
 
           // creates array with initial capacity of 10.
        Map<Integer,String> hashMap=new HashMap<Integer,String>();
 
        hashMap.put(11, "ankit");
        hashMap.put(21, "javaMadeSoEasy");
 
           // getting synchronized HashMap
           Map synchronizedMap = Collections.synchronizedMap(hashMap);
           System.out.println(synchronizedMap);
 
    }
}