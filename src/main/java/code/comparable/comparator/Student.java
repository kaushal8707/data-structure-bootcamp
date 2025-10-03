package com.java.core.selfdeveloped.comparable.comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student implements Comparable<Student> {
	private int id;
	private String name;
	
	//Sorting based on id (int)
	
	@Override
	public int compareTo(Student s) {
		if(this.id==s.id) {
			return 0;
		}else if(this.id>s.id) {
			return 1;
		}else {
			return -1;
		}
	}
	
	//Sorting based on name (String) 
	
//	@Override
//	public int compareTo(Student s) {
//		return this.name.compareTo(s.name); 
//	}
	
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student(23, "kaushal"),
										new Student(33, "raghav"),
										new Student(47, "manash"),
										new Student(57, "bhargav"));
		Collections.sort(list);
		list.forEach(System.out::println); 
	}
}
