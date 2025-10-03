package com.example.collection_framework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
 
public class ConvertMapKeysToListJava8Example {
    public static void main(String[] args) {
           Map<Integer, String> map = new HashMap<Integer, String>();
           map.put(1, "audi");
           map.put(2, "bmw");
           map.put(3, "ferrari");
           
           //convert keys in map to ArrayList in java 8 using streams
           List<Object> list = map.keySet().stream().collect(Collectors.toList());
           System.out.println("arrayList containing keys in map = "+list);
           
    }
}