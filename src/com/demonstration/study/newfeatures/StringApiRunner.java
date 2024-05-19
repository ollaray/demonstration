package com.demonstration.study.newfeatures;

public class StringApiRunner {

	public static void main(String[] args) {
		//isBlank()
		System.out.println("".isBlank());
		System.out.println(" A BC ".strip());
		System.out.println(" A B C ".stripLeading().replace(" ", "@"));
		System.out.println(" A B C ".stripTrailing().replace(" ", "@"));
		System.out.println(" A B C ".strip().replace(" ", "@"));
		
		"Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);
		
		
		System.out.println("UPPERCASE".transform(str -> str.substring(2, 7)).transform(String::toLowerCase));
		System.out.println("UPPERCASE".replace("UPPERCASE","LOWERCASE").transform(str -> str.toLowerCase()));
		
		System.out.println("My name is %s. My age is %d".formatted("David", 25));
		
	}

}
