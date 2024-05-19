package com.demonstration.study.newfeatures;

import java.util.List;
import java.util.function.Predicate;

public class PredicateNotRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(3,4,5,67,89,2,8);
		
//		Predicate<Integer> evenNumberPredicate = number -> number % 2 == 0;
//		numbers.stream()
//				.filter(evenNumberPredicate.negate())
//				.forEach(System.out::println);
		//Try another way
		numbers.stream()
				.filter(Predicate.not(PredicateNotRunner::isEven))
				.forEach(System.out::println);
	}
	
	private static boolean isEven(Integer number) {
		return number % 2 == 0;
	}

}
