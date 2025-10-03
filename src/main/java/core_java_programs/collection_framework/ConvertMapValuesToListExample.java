package com.example.collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class ConvertMapValuesToListExample {
    public static void main(String[] args) {
           Map<Integer, String> map = new HashMap<Integer, String>();
           map.put(1, "audi");
           map.put(2, "ferrari");
           map.put(3, "cft");
           
           //convert values in map to ArrayList
           //by passing values in map in constructor of ArrayList
           List<String> arrayList = new ArrayList<String>(map.values());
           System.out.println("arrayList containing values in map = "+arrayList);         
    }
}