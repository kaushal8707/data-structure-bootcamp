package com.example.collection_framework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertIntegerArrayToSetExample {

	public static void main(String[] args) {

		Integer arrInt[]={5,4,1,9};
		List<Integer> list=(List) Arrays.asList(arrInt);
		Set<Integer> set=new HashSet<Integer>(list);
		for(Integer i:set)
		{
			System.out.println(i);
		}
		
				
	}

}
