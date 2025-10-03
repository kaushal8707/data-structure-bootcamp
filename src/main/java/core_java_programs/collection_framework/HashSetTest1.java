package com.example.collection_framework;

//HashSet - synchronizing using Collections.synchronizedSet program. 
//
//
//Iterator on synchronizedSet won't be synchronized, so will have to
//synchronize set using synchronization block during iteration in java.
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest1 {
    public static void main(String args[]) {
 
           // creates array with initial capacity of 10.
           Set<String> hashSet = new HashSet<String>();
 
           hashSet.add("ankit");
           hashSet.add("javaMadeSoEasy");
 
           // getting synchronized HashSet
           Set<String> synchronizedSet = Collections.synchronizedSet(hashSet);
           
           
 
           // Iterator on synchronizedSet won't be synchronized, so will have to
           // synchronize set using synchronization block during iteration
           System.out.println("------- iterating on synchronized set -------");
           synchronized (synchronizedSet) {
                  Iterator<String> iterator = synchronizedSet.iterator();
                  while (iterator.hasNext()) {
                        System.out.println(iterator.next());

                  }
           }
    }
}