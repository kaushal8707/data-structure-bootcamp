package com.example.collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class ConvertMapKeysToListExample {
    public static void main(String[] args) {
           Map<Integer, String> map = new HashMap<Integer, String>();
           map.put(1, "audi");
           map.put(2, "bmw");
           map.put(3, "ferrari");
           
           //convert keys in map to ArrayList
           //by passing keys in map in constructor of ArrayList
           List<Integer> arrayList = new ArrayList<Integer>(map.keySet());
           System.out.println("arrayList containing keys in map = "+arrayList);    
    }
}