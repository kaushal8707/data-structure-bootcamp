package com.example.collection_framework;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMap_Example1 
{
	public static void main(String[] args) 
	{
		ConcurrentMap<Integer, String> map=new ConcurrentHashMap<>();
		map.put(1, "kaushal");
		System.out.println("Map: "+map);
		map.putIfAbsent(1, "kanishk");
		System.out.println("Map:  "+map);
		map.putIfAbsent(2, "Bhai");
		System.out.println("Map: "+map);
	}

}
