package com.java.core.selfdeveloped.comparable.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainApp {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee(11, "varun"),
											new Employee(44, "bhargav"),
											new Employee(77, "shefali"),
											new Employee(33, "talvar"));
		//Sorting based on Id
		Collections.sort(list, new IdComparator());
		
		list.forEach(System.out::println);
		
		System.out.println("<------------------------------------------------->"); 
		//Sorting based on name
		Collections.sort(list, new NameComparator());
		
		list.forEach(System.out::println);

		
	}

}
