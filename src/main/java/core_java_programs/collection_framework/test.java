package com.example.collection_framework;

import java.util.Arrays;

public class test {
 
	public static void main(String[] args) 
	{
		Emps emp1=new Emps(111, "gjfhg", 487.445);
		Emps emp2=new Emps(5656, "vvxvx", 674.445);
		Emps emp3=new Emps(234, "addaa", 121.445);
		
		Emps eArr[]={emp1,emp2,emp3};
		Arrays.sort(eArr, new CompId()); 
		for(Emps e1:eArr)
		{
			System.out.println(e1); 
		}
		System.out.println();
		Arrays.sort(eArr, new CompName()); 
		for(Emps e1:eArr)
		{
			System.out.println(e1); 
		}
		System.out.println();
		Arrays.sort(eArr, new CompSalary()); 
		for(Emps e1:eArr)
		{
			System.out.println(e1); 
		}

	}

}
