package com.example.collection_framework;
/*
 * TreeMap is sorted by natural order of keys in java.
In program 3 we used Integer as key, Integer class implements Comparable interface and overrides its compareTo() method. 
But, for using Employee as key we it must implement Comparable interface and override its compareTo() method in java.

 Note : If we Employee don�t implement Comparable interface and override its compareTo() method than ClassCastException (RunTimeException) will be thrown. Because, internally TreeMap calls compare method for comparing keys , while comparing keys casting to java.lang.Comparable will fail at runtime.*/
 
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKeyAscendingExample {
	 
    public static void main(String...a){
 
        Employee emp1=new Employee("sam","4");
        Employee emp2=new Employee("amy","2");
        Employee emp3=new Employee("brad","1");
 
        Map<Employee, Integer> treeMap = new TreeMap<Employee, Integer>();
        treeMap.put(emp1, 1);
        treeMap.put(emp2, 1);
        treeMap.put(emp3, 1);
        
        System.out.println("treeMap : "+treeMap);
 
       
    }
}