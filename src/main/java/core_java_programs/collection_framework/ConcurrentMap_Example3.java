package com.example.collection_framework;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMap_Example3 
{
	public static void main(String[] args) 
	{
	  ConcurrentMap<Integer,String>	map=new ConcurrentHashMap<Integer, String>();
	  map.put(1,"adad");
	  map.put(2,"khkf");
	  map.put(3,"fsvs");
	  map.put(4,"trew");
	  
	  //Iterating map over values using foeach loop
	  Collection<String> collection=map.values();
	  for(String s:collection)
	  {
		  System.out.println(s+"  "); 
	  }
	  System.out.println("--------------");
	  //Iterating map over values using Iterator
	  Iterator<String> itr=map.values().iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next()); 
	  }
	  
	  System.out.println("-------------------------");
	  Set<Entry<Integer,String>> set=map.entrySet();
	  for(Entry<Integer,String> entry:set)
	  {
		  System.out.println(entry);
	  }  

	}
}
