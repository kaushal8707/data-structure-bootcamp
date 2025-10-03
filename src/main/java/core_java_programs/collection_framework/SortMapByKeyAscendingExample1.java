package com.example.collection_framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*Logic to Sort Map by key in Ascending order in java
Implement Comparator interface and override its compare method in java.
Obtain map.entrySet() in set, convert it into list (we have converted set to list because Collections�s sort method can accept only list type as parameter).
Call Collections.sort and pass list [i.e. listOfentrySet] as parameter.
Collections.sort internally calls Arrays.sort, 
Arrays.Sort() internally calls Merge Sort.
Merge sort calls overridden compare method of Comparator interface for comparison of keys.
Ultimately listOfentrySet will contain entry (key-value) pairs sorted on basis of keys in java.

 Must know fact :
If number of elements is less than 7 then Insertion Sort is used rather than Merge Sort. (because in case elements are less than 7 it offers better time complexity) 

*/
public class SortMapByKeyAscendingExample1 {
 
    public static void main(String...a){
        Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        map.put(4, 1);
        map.put(2, 1);
        map.put(3, 1);
        map.put(5, 1);
       
        Set<Entry<Integer, Integer>> entrySet = map.entrySet();
        List<Entry<Integer, Integer>> listOfentrySet = new ArrayList<Entry<Integer, Integer>>(entrySet);
   
        System.out.print("Before sorting by key : ");
        for(Entry<Integer, Integer> entry:listOfentrySet){
         System.out.print(entry.getKey()+"="+entry.getValue()+"  ");
        }
       
        Collections.sort(listOfentrySet, new SortByKeyAscending());
       
 
        System.out.print("\nAfter sorting by key(ascending): ");
        for(Entry<Integer, Integer> entry:listOfentrySet)
         System.out.print(entry.getKey()+"="+entry.getValue()+"  ");
       
       
    }
}


/*
n the above program replace SortByKeyAscending class with below SortByKeyDescending class.
class SortByKeyDescending implements Comparator<Map.Entry<Integer, Integer>>{
 
   @Override
   public int compare( Map.Entry<Integer,Integer> entry1, Map.Entry<Integer,Integer> entry2){
        return (entry2.getKey()).compareTo( entry1.getKey() );
   }
}
*/