package com.demonstration.study.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Functional {
	    /**
	     * This method filters out the odd numbers from a given list of integers.
	     * @param numbers This is the list of integers from which odd numbers are to be filtered out.
	     * @return List<Integer> This returns a list of odd integers.
	     */
	    public static List<Integer> filterOddNumbers(List<Integer> numbers) {
	        if(numbers.size()== 0){
	            return new ArrayList<Integer>();
	        }
	        return numbers.stream().filter(n->n%2 !=0).collect(Collectors.toList());
	        
	    }
	    
	    /**
	     * This method generates the cubes of the first n natural numbers.
	     * @param n The number of natural numbers for which cubes are to be calculated.
	     * @return List<Integer> This returns a list of cubes of the first n natural numbers.
	     */
	    public static List<Integer> getCubesOfFirstNNumbers(int n) {
	        if(n == 0){
	            return new ArrayList<Integer>();
	        }
	        return IntStream.rangeClosed(1,n).map(i->i * i * i).boxed().collect(Collectors.toList());
	    }
	    
	    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
	        if(courses == null) return List.of();
	        return courses.stream().map(String::length).collect(Collectors.toList());
	    }
	    
	    public static long sumOfSquares(List<Integer> numbers) {
	        
	        // Check if the list is null. If so, return 0.
	        if(numbers == null) return 0l;
	        // Stream over the list of numbers, find squares and sum them up
	        return numbers.stream().mapToLong(n->n*n).sum();
	    }
	    
	    public static int findMaxEvenNumber(List<Integer> numbers) {
	        if(numbers == null) return 0;
	        Optional<Integer> max = Optional.ofNullable(numbers.stream()
	                                    .filter(n->n%2==0)
	                                    .max(Integer::compare)
	                                    .orElse(0));
	        return max.get();
	                                    
	    }
	    
	    public static int findMaxEvenNumber2(List<Integer> numbers) {
	        if(numbers == null) return 0;
	        Optional<Integer> max = numbers.stream()
	                                    .filter(n->n%2==0)
	                                    .max(Integer::compare);
	                                    
	        return max.orElse(0);
	                                    
	    }
}
