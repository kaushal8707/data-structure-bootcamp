package com.example.collection_framework;
import java.util.HashMap;
import java.util.Map;

public class ConcurrentAndHashMap {
    static Map<Integer,String> map=new HashMap<Integer,String>();

	public static void main(String[] args) 
	{
         map.put(1, "kaushal");
         System.out.println("concurrent Hash Map: "+map);
         map.put(1,"kanishk");
         System.out.println("concurrent Hash Map: "+map);
      
	}
	public static synchronized String functionalityofputIfAbsent(Integer key,String value)
	{
		if(!map.containsKey(key))
		{
			return map.put(key, value);
		}else
		{
			return map.get(key);
		}
	}

}
