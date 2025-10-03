package com.example.collection_framework;
//iterator returned by ArrayList is fail-fast. Means any structural 
//modification made to ArrayList like adding or removing elements during
//Iteration will throw java.util.ConcurrentModificationException.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class ArrayListTest6 {
    public static void main(String args[]) {
 
        // creates array with initial capacity of 10.
        List<String> arrayList = new ArrayList<String>();
 
        arrayList.add("ankit");
        arrayList.add("javaMadeSoEasy");
 
        System.out.println("-------use iterator-------");
        // fail-fast
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
               arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(iterator.next());
        }
 
        System.out.println("-------use listIterator-------");
        // fail-fast
        ListIterator<String> listIterator = arrayList.listIterator();
        listIterator.next();
        listIterator.previous();
        while (listIterator.hasNext()) {
               arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(listIterator.next());
        }
 
 
        System.out.println("-------use Enumeration-------");
        // fail-fast
        Enumeration<String> listEnum = Collections.enumeration(arrayList);
        while (listEnum.hasMoreElements()) {
               arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(listEnum.nextElement());
        }
 
        System.out.println("-------use enhanced for loop-------");
           //enhanced for loop is fail-fast
        for (String string : arrayList) {
               arrayList.add("newEle"); // unComment to avoid ConcurrentModificationException
               System.out.println(string);
        }
 
 
 
    }
}