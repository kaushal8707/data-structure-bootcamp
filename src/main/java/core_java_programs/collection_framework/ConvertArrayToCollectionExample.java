package com.example.collection_framework;
import java.util.Arrays;
import java.util.Collection;
 
public class ConvertArrayToCollectionExample {
  public static void main(String[] args) {
      String stringArray[] = {"a", "b"};
 
      //convert Array to Collection
      Collection<String> collection = Arrays.asList(stringArray);
 
      //Display Collection
      System.out.println(collection);
  }
}