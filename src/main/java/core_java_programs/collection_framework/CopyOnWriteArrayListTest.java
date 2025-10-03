package com.example.collection_framework;
//iterator returned by CopyOnWriteArrayList is fail-safe. Means any  
//structural modification made to CopyOnWriteArrayList like adding or 
//removing elements during Iteration won�t throw any Exception.

import java.util.Collections; 
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
 
public class CopyOnWriteArrayListTest {
    public static void main(String args[]) {
 
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
 
        copyOnWriteArrayList.add("ind");
        copyOnWriteArrayList.add("america");
 
           System.out.println("-------use iterator-------");
        // fail-safe 
        Iterator<String> iterator = copyOnWriteArrayList.iterator();
        while (iterator.hasNext()) {
               copyOnWriteArrayList.add("newEle1");
               System.out.println(iterator.next());
        }

        System.out.println(copyOnWriteArrayList+"????");

        System.out.println("-------use listIterator-------");
        // fail-safe
        ListIterator<String> listIterator = copyOnWriteArrayList.listIterator();
        while (listIterator.hasNext()) {
               copyOnWriteArrayList.add("newEle2");
               System.out.println(listIterator.next());
        }
 
        System.out.println("-------use Enumeration-------");
        // fail-safe
        Enumeration<String> listEnum = Collections
                     .enumeration(copyOnWriteArrayList);
        while (listEnum.hasMoreElements()) {
               copyOnWriteArrayList.add("newEle3");
               System.out.println(listEnum.nextElement());
        }
 
        System.out.println("-------use enhanced for loop-------");
        // fail-safe
        for (String string : copyOnWriteArrayList) {
               copyOnWriteArrayList.add("newEle");
                  System.out.println(string);
        }
 
 
    }
}
 
 