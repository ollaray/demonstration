package com.demonstration.study.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		List<Employee> employees = 
				new ArrayList<Employee>(List.of(new Employee(101, 24, "Tayo"),new Employee(98, 25, "Johnson"),new Employee(112, 23, "Georgina"),
						new Employee(109, 24,"Thompson")));
		
		//Sorting the employees objects by making the employee class comparable
		//Collections.sort(employees);
		//System.out.println(employees);
		
		//Sorting employee objects by creating an employee comparator
		employees.sort(new EmployeeComparator());
		System.out.println(employees);
		
	}

}
