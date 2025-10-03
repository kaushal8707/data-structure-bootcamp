package com.example.collection_framework;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMap_Example2 {

	public static void main(String[] args) 
	{
		ConcurrentMap<Integer, String> map=new ConcurrentHashMap<>();
		map.put(1,"Raghav");
		map.put(2,"Rajan");
		map.put(3,"madhu");

		
		//iterating over key using enhance-for loop
		Set<Integer> set=map.keySet();
		for(Integer integer:set)
		{
			System.out.println(integer);
			map.put(4, "Temp");
		}
		
        //Iterate over keys in java -using Iterator
		Iterator<Integer> iterator=map.keySet().iterator();
		while(iterator.hasNext())
		{
			System.out.println("Keys:"+iterator.next());
			map.put(5, "hytu");

		}
		
	}

}
