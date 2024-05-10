package com.demonstration.study.funtionalprogramming;

import java.util.function.Predicate;

public class Predicated {
	/*
	 * A Predicate is a functional interface, which accepts an argument and returns a boolean. Usually, 
	 * it is used to apply in a filter for a collection of objects.
	 */
	
	
	//A simple Predicate
	public static void simplePredicate() {
		Predicate<Integer> lessThan = i -> (i < 18);
		System.out.println(lessThan.test(15));
	}
	
	// Java program to illustrate Predicate Chaining 
	public static void predicateChaining() {
		Predicate<Integer> greaterThanTen = e -> (e > 10);
		
		Predicate<Integer> lessThanTwenty = e -> (e < 20);
		boolean result = greaterThanTen.and(lessThanTwenty).test(17);
		System.out.println(result);
		
		boolean res = greaterThanTen.or(lessThanTwenty).negate().test(15);
		System.out.println(res);
		
		boolean rs = greaterThanTen.and(lessThanTwenty).negate().test(15);
		System.out.println(rs);
	}
}
