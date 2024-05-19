package com.demonstration.study.newfeatures;

import java.util.List;

public class TypeInferencesRunner {

	public static void main(String[] args) {
		List<String> names1 = List.of("Mary","Sandra");
		List<String> names2 = List.of("Ade","Bade");
		//The left side list declaration is getting complex, to solve this, we can use Type Inference using var keyword
		//List<List<String>> names = List.of(names1, names2);
		//Here Java Infers the type of a variable at compile time, introduced in Java 10, you can also add final to it
		//var can be used in loops as well
		//It can't be assigned null
		//var is not a keyword
		var names = List.of(names1, names2);
		names.stream().forEach(System.out::println);
	}

}
