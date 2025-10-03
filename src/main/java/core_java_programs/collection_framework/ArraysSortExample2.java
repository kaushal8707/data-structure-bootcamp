package com.example.collection_framework;

import java.util.Arrays;

public class ArraysSortExample2 {
 
    public static void main(String...a){
 
        Integer intArray[]={2,3,1};
       
        System.out.print("Array before sorting : ");
        for(int i: intArray){
           System.out.print(i+" ");
        }
 
        Arrays.sort(intArray, new SortDescending());
       
        System.out.print("\nArray after sorting in descending order : ");
        for(int i: intArray){
           System.out.print(i+" ");
        }
 
 
       
    }
}