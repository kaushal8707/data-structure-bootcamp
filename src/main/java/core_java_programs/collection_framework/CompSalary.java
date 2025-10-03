package com.example.collection_framework;

import java.util.Comparator;


public class CompSalary implements Comparator<Emps>
{
   @Override
   public int compare(Emps e1,Emps e2)
   {
	   return e2.getSalary().compareTo(e1.getSalary());  
   }
}
