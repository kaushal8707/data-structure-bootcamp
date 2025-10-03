package com.example.collection_framework;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
 
public class TreeSetTest1
{
    public static void main(String args[]) {
         
        Set<String> treeSet=new TreeSet<String>();
        treeSet.add("javaMadeSoEasy");
        treeSet.add("ankit");
        
        System.out.println("-------use iterator-------");
           Iterator<String> iterator=treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
        System.out.println("-------use Enumeration-------");
           Enumeration<String> listEnum=Collections.enumeration(treeSet);    
     while(listEnum.hasMoreElements()){
        System.out.println(listEnum.nextElement());  
     }
     
     System.out.println("-------use enhanced for loop-------");
           for(String string:treeSet){
            System.out.println(string);
        }
        
     }
}
 