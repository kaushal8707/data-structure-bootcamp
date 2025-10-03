package com.example.collection_framework;


public class Emps 
{
  private Integer id;
  private String name;
  private Double salary;
public Emps(Integer id, String name, Double salary) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Double getSalary() {
	return salary;
}
public void setSalary(Double salary) {
	this.salary = salary;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
}
  
  
}
