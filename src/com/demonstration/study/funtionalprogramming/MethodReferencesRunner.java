package com.demonstration.study.funtionalprogramming;

import java.util.List;

public class MethodReferencesRunner {

	public static void main(String[] args) {
		List.of("Ant","Bat","Cat","Dog","Elephant")
			.stream()
			.map(s -> s.length())
			.forEach(e->MethodReferencesRunner.print(e));
		
		//Static Method Reference
		List.of("Ant","Bat","Cat","Dog","Elephant")
			.stream()
			.map(String::length)
			.forEach(MethodReferencesRunner::print);
		
		Integer max = List.of(23, 45, 67, 34).stream()
											.filter(MethodReferencesRunner::isEven)
											.max(Integer::compare)
											.orElse(0);
		System.out.println(max);
											
						
	}

	
	public static void print(Integer number) {
		System.out.println(number);
	}
	
	public static boolean isEven(Integer num) {
		return num % 2 == 0;
	}
	

}
