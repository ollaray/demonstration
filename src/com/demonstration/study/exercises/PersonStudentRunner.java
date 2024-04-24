package com.demonstration.study.exercises;

public class PersonStudentRunner {
   static String matricNo = "111111"; 
   static String department = "Computer Science"; 
   static String course = "Computer Science";
   static String year = "1998";
   static String name = "Brian James"; 
   static String height = "194cm"; 
   static double weight = 120; 
   static int age = 49;
   
	public static void main(String[] args) {
		//here the student object only has access to the parent (Parent) methods even though it is acting like a student
		//Person student = new Student();
		//student.getName();
		
		//here the student object only has access to both the parent (Parent) and its own methods
		//Student student = new Student(matricNo,department,course,year,name,height,weight,age);
	
	}

}
