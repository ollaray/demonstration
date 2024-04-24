package com.demonstration.study.exercises;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
	private int id;
	private int age;
	private String name;
	
	public Employee(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Name= "+this.name +" Age= "+this.age+" id= "+this.id;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return Integer.compare(this.id, o.id);
	}
	
}
