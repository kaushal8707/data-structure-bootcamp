package com.example.collection_framework;
//Hashtable - making map unmodifiable using Collections.unmodifiableMap

import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;
 
public class HashtableTest4 {
     public static void main(String args[]){
            
           Map<Integer,String> hashtable=new Hashtable<Integer,String>();
    
           hashtable.put(11, "ankit");
           hashtable.put(21, "mittal");
           hashtable.put(31, "javaMadeSoEasy");
           
           //getting unmodifiable Hashtable
           Map<Integer,String> unmodifiableMap = Collections.unmodifiableMap(hashtable);
    
 
           /*
            * Now any attempt to modify map will throw java.lang.UnsupportedOperationException
            */
           unmodifiableMap.put(41,"java");
     }
 
}