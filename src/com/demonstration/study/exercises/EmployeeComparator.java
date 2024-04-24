package com.demonstration.study.exercises;

import java.util.Comparator;

//creating a comparator object: We would use this to compare Employee objects
public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getName().length(), o2.getName().length());
	}
	


}
