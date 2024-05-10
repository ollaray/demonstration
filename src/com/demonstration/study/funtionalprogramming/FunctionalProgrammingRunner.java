package com.demonstration.study.funtionalprogramming;

import java.util.ArrayList;
import java.util.List;

public class FunctionalProgrammingRunner {


	public static void main(String[] args) {
		List<String> list = List.of("Apple","Bat","Cat","Dog","Mat","Spat");	
		List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10));
		List<Integer> num = List.of(3,5,3,215,45,5,7);
		//FunctionalProgramming.printWithFP(list);
		//FunctionalProgramming.printWithFiltering(list);
		
		//System.out.println("Odd Numbers: ");
		//FunctionalProgramming.oddNum(numbers);
		//System.out.println("Even Numbers: ");
		//FunctionalProgramming.evenNum(numbers);
		//FunctionalProgramming.sum(numbers);
		//FunctionalProgramming.sumOfOddNums(numbers);
		//FunctionalProgramming.sumNumbers(numbers);
		//String[] arr = {"Apple","Ball", "Call", "Cow"};
		//FunctionalProgramming.arrStream(arr);
		//FunctionalProgramming.functionalSort();
		
		//List<Integer> values = FunctionalProgramming.funcDistinctMapSquareList(num);
		//System.out.println(values);
		//FunctionalProgramming.funcIntStream();
		//FunctionalProgramming.funcLowerCase();
		//FunctionalProgramming.funcPrintStringLength();
		//FunctionalProgramming.funcIntStreamAdd();
		FunctionalProgramming.funcCollectToList();
	}

	private static void printBasic(List<String> list) {
		for(String words: list) {
			System.out.println(words);
		}
	}
}
