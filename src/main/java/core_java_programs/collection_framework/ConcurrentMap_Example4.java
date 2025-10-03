package com.example.collection_framework;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMap_Example4 {

	public static void main(String[] args) {
		  ConcurrentMap<Integer,String> concurrentMap=new ConcurrentHashMap();
          concurrentMap.put(1,"kaushal");
          concurrentMap.put(2,"raju");
          concurrentMap.put(3,"kanishk");
          
          Iterator<Entry<Integer,String>> entryitr=concurrentMap.entrySet().iterator();
          while(entryitr.hasNext())
          {
        	  System.out.println(entryitr.next()+"   ");
          }
          System.out.println("============================");
         Set<Entry<Integer,String>> entrySet= concurrentMap.entrySet();
        // System.out.println(entrySet);
         //Iteration using enhanced for loop.
          for(Entry<Integer,String> entry: entrySet)
          {
        	  System.out.print("Keys: "+entry.getKey());
        	  System.out.print("Values: "+entry.getValue());
              concurrentMap.put(4,"mohann");


          }
	}

}
