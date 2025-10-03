package com.example.logic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Sapient3_Program
{
    public static void main(String[] args) {
        List<Student> list= Arrays.asList(new Student(5,"zrtt",12),
                new Student(1,"raj",56),
                new Student(2,"hansh",23),
                new Student(3,"komal",34),
                new Student(4,"raghu",45)
                );
        //average score of all students.....
        double avg_score=list.stream().collect(Collectors.summarizingInt(Student::getAge))
                .getAverage();
        System.out.println(avg_score);

        //convert list to map and sort basd on name and score
        Map<String,Integer> map=list.stream().collect(Collectors.toMap(Student::getName,Student::getAge));
       //sorting based on score
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue))
                .collect(Collectors.toList())
                .forEach(a->System.out.println(a.getKey()+"     "+a.getValue()));
        System.out.println("================================");
        //sorting based on Name
        map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey))
                .collect(Collectors.toList())
                .forEach(a->System.out.println(a.getKey()+"     "+a.getValue()));

    }
}
