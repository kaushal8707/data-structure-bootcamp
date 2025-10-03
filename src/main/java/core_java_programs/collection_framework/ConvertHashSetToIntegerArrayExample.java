package com.example.collection_framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
 
public class ConvertHashSetToIntegerArrayExample {
  public static void main(String[] args) {
      Set<Integer> set = new HashSet<Integer>();
      set.add(1);
      set.add(2);
 
      //First, convert set to List
      //by passing set in constructor of ArrayList
      List<Integer> arrayList = new ArrayList<Integer>(set);
      
      //Create integerArray of ArrayList's size
      Integer[] integerArray = new Integer[arrayList.size()];
      //Use toArray method to convert ArrayList to Array
      arrayList.toArray(integerArray);
      
      //Let's display the integerArray
      System.out.println("Display the integerArray");
      for(int i=0; i<integerArray.length; i++){
           System.out.print(integerArray[i]+" ");
      }
      
  }
}
 
