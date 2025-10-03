package com.example.collection_framework;
//HashSet - making set unmodifiable using Collections.unmodifiableSet

import java.util.Collections; 
import java.util.HashSet;
import java.util.Set;

public class HashSetMakeUnModifiableTest {
    public static void main(String args[]) {
 
           // creates array with initial capacity of 10.
           Set<String> hashSet = new HashSet<String>();
 
           hashSet.add("ankit");
           hashSet.add("javaMadeSoEasy");
 
           // getting unmodifiable HashSet
           Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
           
           /*
            * Now any attempt to modify list will throw java.lang.UnsupportedOperationException
            */
           unmodifiableSet.add("mittal");
    }
}
 