package com.example.collection_framework;
/*
TreeSet is sorted by natural order of elements in java.
In program 1 we used elements of Integer type, Integer class implements Comparable interface and overrides its compareTo() method. 
But, for using Employee as elements we it must implement Comparable interface and override its compareTo() method.

 Note : If we Employee don�t implement Comparable interface and override its compareTo() method than ClassCastException (RunTimeException) will be thrown. Because, internally TreeSet uses TreeMap for storing elements and TreeMap calls compare method for comparing elements, 
 while comparing elements casting to java.lang.Comparable will fail at runtime.
 
 */
import java.util.Set;
import java.util.TreeSet;

public class SortSetExample {
	 
    public static void main(String...a){
 
        Employee emp1=new Employee("sam","4");
        Employee emp2=new Employee("amy","2");
        Employee emp3=new Employee("brad","1");
 
        Set<Employee> treeSet = new TreeSet<Employee>();
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
 
        System.out.println("treeSet : "+treeSet);
 
       
    }
}