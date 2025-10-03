package com.example.collection_framework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class temp {

	public static void main(String[] args) 
	{
		Emp emp1=new Emp("1212", "lavanya");
		Emp emp2=new Emp("6565", "qeqeq");
		Emp emp3=new Emp("34343", "adaa");
		Map<Integer,Emp> map=new HashMap<>();
		map.put(1,emp1);
		map.put(6,emp2);
		map.put(2,emp3);
        Collection<Entry<Integer, Emp>> col=map.entrySet();
        List<Entry<Integer, Emp>> l=new ArrayList<>(col);
        Collections.sort(l, new NameComparator()); 
		for(Entry<Integer, Emp> e:l)
		{
			System.out.println(e); 
		}
		
		

	}

}
