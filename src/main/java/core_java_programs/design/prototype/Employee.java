package com.example.design.prototype;

class Employee implements Prototype
{
    private String name;
    private int id;
    private String address;
    private long UAN;

    public Employee(String name, int id, String address, long UAN) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.UAN = UAN;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                ", UAN=" + UAN +
                '}';
    }

    @Override
    public Prototype getClone() {
        return new Employee(name,id,address,UAN);
    }
}
