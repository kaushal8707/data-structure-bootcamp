package com.example.collection_framework;

import java.util.Comparator;


class ComparatorName implements Comparator<Employe>{
    @Override
    public int compare(Employe obj1, Employe obj2) {
       //sort Employee on basis of name(ascending order)
       return obj1.name.compareTo(obj2.name);
    }
   
}
 