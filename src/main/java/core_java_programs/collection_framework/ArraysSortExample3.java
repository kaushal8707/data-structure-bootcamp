package com.example.collection_framework;

import java.util.Arrays;
/*
Arrays.Sort() internally uses Merge Sort in java.
Merge sort calls overridden compare method of Comparator interface for comparison of values
 (if any).

*/
public class ArraysSortExample3 {
	public static void main(String[] args) {
		 
        Employe emp1 = new Employe("sam", "4");
        Employe emp2 = new Employe("amy", "2");
        Employe emp3 = new Employe("brad", "1");

        Employe employeeArray[] = { emp1, emp2, emp3 };

        System.out.print(" employeeArray Before sorting : \n");
        for (Employe emp : employeeArray) {
               System.out.print(emp + "  ");
        }

        Arrays.sort(employeeArray, new ComparatorName());
        System.out.println("\n\n employeeArray after sorting on basis of "
                     + "name(ascending order) : ");
        for (Employe emp : employeeArray) {
               System.out.print(emp + "  ");
        }

        Arrays.sort(employeeArray, new ComparatorId());
        System.out.println("\n\n employeeArray after sorting on basis of "
                     + "id(ascending order) : ");
        for (Employe emp : employeeArray) {
               System.out.print(emp + "  ");
        }

 }
}
