package com.example.map_sort;

import java.util.Comparator;
import java.util.Map;

public class MapSortOnId implements Comparator<Map.Entry<Employee,Integer>>
{
    @Override
    public int compare(Map.Entry<Employee,Integer> entry1, Map.Entry<Employee,Integer> entry2)
    {
        return entry1.getKey().getId().compareTo(entry2.getKey().getId());
    }
}
