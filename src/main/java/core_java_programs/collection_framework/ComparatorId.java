package com.example.collection_framework;

import java.util.Comparator;

class ComparatorId implements Comparator<Employe>{
    @Override
    public int compare(Employe obj1, Employe obj2) {
       //sort Employee on basis of id(ascending order)
       return obj1.id.compareTo(obj2.id);
    }
   
}