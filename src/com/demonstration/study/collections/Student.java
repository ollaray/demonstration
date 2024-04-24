package com.demonstration.study.collections;

//To be able to sort, you need to be able to compare and to compare, objects of the same class, the comparable interface must be implemented

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return id +" "+name;
	}

	@Override
	public int compareTo(Student student) {
		//Using the ids to compare
		return Integer.compare(this.id, student.id);
	}
	
}
