package com.example.collection_framework;
//The iterators returned by the iterator() method of the collections returned by all three Map's
//�collection view methods" are fail-fast. Means any structural modification made to Hashtable like "
//		+ "adding or removing elements during Iteration will throw java.util.ConcurrentModificationException.

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
 
public class HashtableTest1 {
 public static void main(String args[]){
     
 
    Map<Integer,String> hashtable=new Hashtable<Integer,String>();
 
    hashtable.put(11, "ankit");
    hashtable.put(21, "javaMadeSoEasy");
    
 
    System.out.println("\n---1. Iterate on keys, by obtaining iterator on keySet---");
    //fail-fast
    Iterator<Integer> keyIterator=hashtable.keySet().iterator();
    while(keyIterator.hasNext()){
           hashtable.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(keyIterator.next());
    }
    
 
    System.out.println("\n---2. Iterate on values, by obtaining iterator on values---");
    //fail-fast
    Iterator<String> valueIterator=hashtable.values().iterator();
    while(valueIterator.hasNext()){
           hashtable.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(valueIterator.next());
    }
 
    System.out.println("\n---3. Iterate on entry, by obtaining iterator on entrySet---");
    //fail-fast
    Iterator<Entry<Integer, String>> entryIterator=hashtable.entrySet().iterator();  
    while(entryIterator.hasNext()){
           hashtable.put(4,"newEle1");//unComment to avoid ConcurrentModificationException
           System.out.println(entryIterator.next());
    }
 
 }
 
}