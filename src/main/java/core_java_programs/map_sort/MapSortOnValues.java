package com.example.map_sort;
import java.util.Comparator;
import java.util.Map;

public class MapSortOnValues implements Comparator<Map.Entry<Employee,Integer>>
{
    @Override
    public int compare(Map.Entry<Employee,Integer> entry1, Map.Entry<Employee,Integer> entry2)
    {
        return entry1.getValue().compareTo(entry2.getValue());
    }
}