package com.example.logic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sapient4_Program
{
    public static void main(String[] args)
    {
        List<Student> list= Arrays.asList(new Student(5,"zrtt",12),
                new Student(1,"raj",56),
                new Student(2,"hansh",23),
                new Student(3,"komal",34),
                new Student(4,"raghu",45)
        );
        int max=list.stream().collect(Collectors.summarizingInt(Student::getAge)).
                getMax();
        System.out.println(max);
    }
}
