package com.example.collection_framework;

import java.util.Comparator;


public class CompName implements Comparator<Emps>
{
   @Override
   public int compare(Emps e1,Emps e2)
   {
	   return e2.getName().compareTo(e1.getName());
   }
}