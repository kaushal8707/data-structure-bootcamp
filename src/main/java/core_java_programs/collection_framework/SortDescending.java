package com.example.collection_framework;

import java.util.Comparator;

class SortDescending implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
           //using Comparator to sort array in descending order.
           return o2.compareTo(o1);
    }
}
 