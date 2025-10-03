package com.example.collection_framework;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
 
public class CopyOnWriteArrayListTest3 {
    public static void main(String args[]) {
 
        List<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
 
        copyOnWriteArrayList.add("ankit");
        copyOnWriteArrayList.add("javaMadeSoEasy");
 
 
        System.out.println("-------use iterator-------");
        Iterator<String> iterator = copyOnWriteArrayList.iterator();
        while (iterator.hasNext()) {
        	copyOnWriteArrayList.add("Temp");
               System.out.println(iterator.next());
        }
 
 
        System.out.println("-------use listIterator-------");
        ListIterator<String> listIterator = copyOnWriteArrayList.listIterator();
        while (listIterator.hasNext()) {
               System.out.println(listIterator.next());
        }
 
        System.out.println("-------use Enumeration-------");
        Enumeration<String> listEnum = Collections
                     .enumeration(copyOnWriteArrayList);
        while (listEnum.hasMoreElements()) {
               System.out.println(listEnum.nextElement());
        }
 
        System.out.println("-------use enhanced for loop-------");
        for (String string : copyOnWriteArrayList) {
               System.out.println(string);
        }
 
 
    }
}