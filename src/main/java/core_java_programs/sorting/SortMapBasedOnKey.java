package com.example.sorting;

import java.util.*;

public class SortMapBasedOnKey
{
    public static void main(String[] args) {
        Map<String,Integer>map=new HashMap<String,Integer>();
        map.put("kaushal",124);
        map.put("rajesh",781);
        map.put("prasanna",445);
        map.put("avishek",995);
        Set<Map.Entry<String,Integer>> entry=map.entrySet();
        List<Map.Entry<String,Integer>> l=new ArrayList(entry);
        Collections.sort(l,new SortIdComparator());
        for(Map.Entry<String,Integer> e : l) {
            System.out.println(e.getKey()+"     "+e.getValue());
        }
        Collections.sort(l,(a,b)->a.getKey().compareTo(b.getKey()));
        for(Map.Entry<String,Integer> e : l) {
            System.out.println(e.getKey()+"     "+e.getValue());
        }
    }
}

class SortIdComparator implements Comparator<Map.Entry<String,Integer>>
{
    @Override
    public int compare(Map.Entry<String,Integer> o1,Map.Entry<String,Integer> o2)
    {
        return o1.getValue().compareTo(o2.getValue());
    }
}


