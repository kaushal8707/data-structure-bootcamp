package com.example.collection_framework;

import java.util.Comparator;
import java.util.Map.Entry;


public class NameComparator implements Comparator<Entry<Integer,Emp>>
{

	@Override
	public int compare(Entry<Integer, Emp> entry1, Entry<Integer, Emp> entry2) {
		
		return entry1.getValue().id.compareTo(entry2.getValue().id); 
	}
  
}
