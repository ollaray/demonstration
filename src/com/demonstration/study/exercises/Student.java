package com.demonstration.study.exercises;

public class Student extends Person {
	
	private String matricNo;
	private String department;
	private String course;
	private String year;
	
	public Student() {}
	
	
	public Student(String matricNo, String department, String course, String year, String name, String height, double weight, int age) {
		super(name,height,weight,age);
		this.matricNo = matricNo;
		this.department = department;
		this.course = course;
		this.year = year;
	}


	public String getMatricNo() {
		return matricNo;
	}

	public void setMatricNo(String matricNo) {
		this.matricNo = matricNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	public void reads() {
		System.out.println("Student reads");
	}
	
	public void examination() {
		System.out.println("Student writes exams");
	}
	
	public void fees() {
		System.out.println("Pays School Fees");
	}
}
