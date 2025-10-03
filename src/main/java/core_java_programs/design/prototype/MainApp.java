package com.example.design.prototype;

public class MainApp
{
    public static void main(String[] args) {

        Employee employee=new Employee("annu",647,"bangalore",87634567);
        System.out.println("Employee Records: "+employee);

        Employee copyRecord= (Employee) employee.getClone();
        System.out.println("Employee Records: "+employee);

    }
}
