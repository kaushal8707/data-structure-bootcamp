package com.example.map_sort;

import java.util.*;

public class SortMapKeyAsCustomObject
{
    public static void main(String[] args) {
        Map<Employee,Integer> map=new HashMap<Employee,Integer>();
        map.put(new Employee(121,"asd",5678.90),4576);
        map.put(new Employee(987,"qwe",9980.99),4567);
        map.put(new Employee(435,"fgh",11111.1),8765);
        map.put(new Employee(690,"lkj",0909.11),987);

        Set<Map.Entry<Employee,Integer>> set=map.entrySet();
        List<Map.Entry<Employee,Integer>> list=new ArrayList<>(set);

        //sorting map based on Id
        System.out.println("sorting map based on Id");
        Collections.sort(list,new MapSortOnId());
        for(Map.Entry<Employee,Integer> entry : list)
        {
            System.out.println(entry);
        }

        //sorting map based on Salary
        System.out.println("sorting map based on Salary");
        Collections.sort(list,new MapSortOnSalary());
        for(Map.Entry<Employee,Integer> entry : list)
        {
            System.out.println(entry);
        }

        //sorting map based on values
        System.out.println("sorting map based on values");
        Collections.sort(list,new MapSortOnValues());
        for(Map.Entry<Employee,Integer> entry : list)
        {
            System.out.println(entry);
        }


    }
}
