package com.example.collection_framework;
//iterator returned by TreeSet is fail-fast. Means any structural 
//modification made to TreeSet like adding or removing elements during 
//Iteration will throw java.util.ConcurrentModificationException.

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
 
public class TreeSetTest {
    public static void main(String args[]) {
 
           Set<String> treeSet = new TreeSet<String>();
           treeSet.add("ankit");
           treeSet.add("javaMadeSoEasy");
 
        System.out.println("-------use iterator-------");
           // fail-fast
           Iterator<String> iterator = treeSet.iterator();
           while (iterator.hasNext()) {
                  treeSet.add("newElement1"); // unComment to avoid
                                                      // ConcurrentModificationException
                  System.out.println(iterator.next());
           }
 
           System.out.println("-------use Enumeration-------");
           // fail-fast
           Enumeration<String> listEnum = Collections.enumeration(treeSet);
           while (listEnum.hasMoreElements()) {
                  treeSet.add("newElement2"); // unComment to avoid
                                                     // ConcurrentModificationException
                  System.out.println(listEnum.nextElement());
           }
 
           System.out.println("-------use enhanced for loop-------");
           // enhanced for loop is fail-fast
           for (String string : treeSet) {
                  treeSet.add("newElement3");// unComment to avoid
                                                      // ConcurrentModificationException
                  System.out.println(string);
           }
 
    }
}