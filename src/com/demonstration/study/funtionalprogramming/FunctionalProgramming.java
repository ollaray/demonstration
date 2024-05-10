package com.demonstration.study.funtionalprogramming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//In the stream API we two kinds of operations: 1. Intermediate Operations(operates on the stream and returns a stream) 
//and then Terminal Operations(Consumes the stream of elements)

public class FunctionalProgramming {
	//Functional Programming Approach
	public static void printWithFP(List<String> list) {
		//Introducing stream: convert the list to a stream of values. -> is called lambda expression
		list.stream().forEach(
				e -> System.out.println(e)
				);
	}
	
	//Using filtering
	public static void printWithFiltering(List<String> list) {
		list.stream()
			.filter(e -> !e.endsWith("at"))
			.forEach(e -> System.out.println(e));
	}
	//using filtering
	public static void oddNum(List<Integer> list) {
		list.stream()
			.filter(x -> (x % 2) != 0)
			.forEach(x -> System.out.println(x));
	}

	public static void evenNum(List<Integer> numbers) {
		numbers.stream()
				.filter(x -> (x % 2) == 0)					//Intermediate operation in on a stream of numbers; after filtering you still have another stream
				.forEach(x -> System.out.println(x));
	}
	
	public static void sum(List<Integer> numbers) {
		//This works too
		//int sum = numbers.stream().collect(Collectors.summingInt(Integer::intValue));
		//or this
		//int sum = numbers.stream().reduce(0, Integer::sum);
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		
		System.out.println(sum);
	}
	
	//find the sum of odd numbers in a list
	public static void sumOfOddNums(List<Integer> numbers) {
		int sum = numbers.stream()
						 .filter(x -> (x % 2) == 1)
						 .reduce(0, (x, y) -> x + y);
		System.out.println(sum);
		
	}
	//Further explanation
	public static void sumNumbers(List<Integer> numbers) {
		//We want to show that lambda expressions can be multi-lined. If you have only one line you don't need a return stmt and {}
		int sum = numbers.stream()
						 .reduce(0, 								//reduce is a terminal operation of streams.
								 (x, y) ->{ 
									 System.out.println(x+ " "+y +" => "+ (x + y));
									 return x + y;
								 }
								 
								 );
		System.out.println(sum);
		
	}
	public static void arrStream(String[] str) {
		System.out.println(Stream.of(Arrays.asList(str)));
	}
	//sorting
	public static void functionalSort() {
		List<Integer> numbers = List.of(3,5,8,215,45,4,7);
		numbers.stream()
				.sorted()
				.forEach(e->System.out.println(e));	
	}
	//Distinct
	public static List<Integer> functionalDistinct(List<Integer> numbers) {
		//List<Integer> numbers = List.of(3,5,3,215,45,5,7);
		List<Integer> distinctNumbers = numbers.stream().distinct().toList();
		return distinctNumbers;
	}
	
	public static void functionalDistinctVoid() {
		List<Integer> numbers = List.of(3,5,3,215,45,5,7);
		numbers.stream().distinct().forEach(e->System.out.println(e));
	}
	//sorted & distinct
	public static List<Integer> funcSortedDistinct(List<Integer> numbers){
		return  numbers.stream().distinct().sorted().toList();
	}
	public static void funcSortedDistinctVoid(){
		List<Integer> numbers = List.of(3,5,3,215,45,5,7);
		numbers.stream().distinct().sorted().forEach(e->System.out.println(e));
	}
	
	//Map
	public static List<Integer> funcDistinctMapSquareList(List<Integer> numbers) {
		return numbers.stream().distinct().map(e->e * e).toList();
	}
	
	public static void funcDistinctMapSquareListVoid() {
		List<Integer> numbers = List.of(3,5,3,215,45,5,7);
		numbers.stream().distinct().map(e->(int)Math.pow(e, 2)).forEach(e->System.out.println(e));
		//or numbers.stream().distinct().map(e-> e * e).forEach(e->System.out.println(e));
	}
	//IntStream
	public static void funcIntStream() {
		IntStream.range(1, 10).map(e->e * e).forEach(e->System.out.println(e));
	}
	//String to lowercase
	public static void funcLowerCase() {
		List.of("Apple","Ant","Bat").stream().map(e->e.toLowerCase()).forEach(e->System.out.println(e));
	}
	
	//Print String length
	public static void funcPrintStringLength() {
		List.of("Apple","Ant","Bat").stream().map(e->e.length()).forEach(e->System.out.println(e));
	}
	
	//IntStream Again: Terminal Operation
	public static void funcIntStreamAdd() {
		Integer num = IntStream.range(1, 11).reduce(0, (e1, e2)->e1 + e2);
		System.out.println(num);
	}
	
	//Maximum number in a list
	public static void funcMaxNumList() {
		Integer n = List.of(23,12,34,53).stream().max((e1,e2)->Integer.compare(e1,e2)).get();
		System.out.println(n);
		//or Optional<Integer> n = List.of(23,12,34,53).stream().max((e1,e2)->Integer.compare(e1,e2));
		//or Optional<Integer> n = Optional.ofNullable(List.of(23,12,34,53).stream().max((e1,e2)->Integer.compare(e1,e2)).get());
	}
	//Minimum number in a list
	public static void funcMinNumList() {
		Integer n = List.of(23,12,34,53).stream().min((e1,e2)->Integer.compare(e1,e2)).get();
		System.out.println(n);
		//or Optional<Integer> n = List.of(23,12,34,53).stream().min((e1,e2)->Integer.compare(e1,e2));
		//or Optional<Integer> n = Optional.ofNullable(List.of(23,12,34,53).stream().min((e1,e2)->Integer.compare(e1,e2)).get());
	}
	
	//Collect toList()
	public static void funcCollectToList() {
		List<Integer> n = List.of(23,12,34,53).stream().filter(e -> e % 2 != 0).collect(Collectors.toList());
		System.out.println(n);
	}
	
	//List of the first 10 numbers
	public static void funcListFirstNum() {
		//IntStream.range will return and IntPipeline it needs to be boxed to a stream so you can call the collect on it.
		List<Integer> n = IntStream.range(1, 11).map(e->e * 1).boxed().collect(Collectors.toList());
		System.out.println(n);
	}
	
	
	//Functional Interface
	
	//Check Null
	public static void checkNull() {
		String[] words = new String[10];
		Optional<String> checkNull = Optional.ofNullable(words[5]);
		if(checkNull.isPresent()) {
			String word = words[5].toLowerCase();
			System.out.println(word);
		}
			System.out.println("Word not present");
	}
	
}
