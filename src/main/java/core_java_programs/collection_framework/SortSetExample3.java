package com.example.collection_framework;
import java.util.TreeSet;
import java.util.Set;
 /*
TreeMap�s addAll method or constructor for sorting in java>
If elements are stored in stored in HashSet/ArrayList or any other class that implements Collection  we can use TreeSet�s addAll method or constructor for sorting.

 Let�s see Example in java >

 Collection-
        Collection<Integer> collection = new HashSet<Integer>();
        collection.add(3);
        collection.add(1);
        collection.add(2);

 TreeSet�s  addAll method -
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.addAll(collection);

 TreeSet�s constructor -
        Set<Integer> treeSet = new TreeSet<Integer>(collection);


Important Note : 
If any class that implements  Collection contains null  - If any class that implements  Collection contains null  and is converted into TreeSet than NullPointerException (RunTimeException) will be thrown in java.
If any class that implements List is converted into TreeSet -  Than that class�s duplicate elements will be lost, because any of the Set implementation ( TreeSet or may be any other class) does not allow to store duplicate elements in java.

*/
public class SortSetExample3 {
 
    public static void main(String...a){
        Set<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);
 
        System.out.println("treeSet : "+treeSet);
 
       
    }
}