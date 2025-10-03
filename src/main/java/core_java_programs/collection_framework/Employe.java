package com.example.collection_framework;

class Employe{
    String name;
    String id;
   
    public Employe() {}
   
    public Employe(String name, String id) {
        this.name = name;
        this.id = id;
    }
   
   
    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", id=" + id  + '}';
    }
   
}