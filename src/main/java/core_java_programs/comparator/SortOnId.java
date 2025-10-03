package com.example.comparator;

import java.util.Comparator;

public class SortOnId implements Comparator<Employee>
{
    @Override
    public int compare(Employee emp1,Employee emp2)
    {
        return emp1.getId().compareTo(emp2.getId());
    }
}
