package com.demonstration.study.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Another way to implement comparator
class AscendingStudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}
	
}


public class StudentCollectionRunner {

	public static void main(String[] args) {
		List<Student> students = List.of(new Student(1, "Ade"),new Student(100, "Nkechi"), new Student(2, "Laura"));
		System.out.println(students);
		
		List<Student> studentsList = new ArrayList<>(students);
		//To be able to sort objects of the same type, that class creating the object must  implement comparable interface just like the Integer Class
		Collections.sort(studentsList);
		//Now it is sorted because the Student Class now implements the Comparable interface
		//System.out.println("ASC " +studentsList);
		
		Collections.sort(studentsList, new AscendingStudentComparator());
		//System.out.println("AscendingStudentComparator "+studentsList);
		
		studentsList.add(new Student(5, "Idowu"));
		studentsList.sort(new AscendingStudentComparator());
		System.out.println("AscendingStudentComparator From Array.sort "+studentsList);
	}

}
