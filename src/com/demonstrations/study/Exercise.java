package com.demonstrations.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

public class Exercise {
	private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
	
	public static void main(String[] args) {
		
	}
	
   public String findLongestWord(String sentence) {
        String longestWord = "";
        if(sentence.length() > 0 ){
            String[] words = sentence.split(" ");
            
            for(String word: words){
                if(word.length() > longestWord.length()){
                    longestWord = word;
                }
            }
        }
        return longestWord;
       
    }
   	
   /**
    * This method determines whether there's an element greater than a given number in an array.
    *
    * @param array The array to search through.
    * @param number The number to compare with the array elements.
    * @return True if there's an element greater than the given number in the array, false otherwise.
    */
   public boolean doesHaveElementGreaterThan(int[] array, int number) {
       for(int num: array){
           if(num > number){
               return true;
           }
       }
       return false;
   }
   
   /**
    * This method finds and returns the second largest element in the given array.
    * 
    * @param array the array in which to find the second largest element
    * @return the second largest element in the array
    */
    
   public int findSecondLargestElement(int[] array) {
      
	   if (array == null || array.length < 2) {
           return -1;
       }

       int largest = Integer.MIN_VALUE;
       int secondLargest = Integer.MIN_VALUE;

       for (int num : array) {
           if (num > largest) {
               secondLargest = largest;
               largest = num;
           } else if (num > secondLargest && num != largest) {
               secondLargest = num;
           }
       }

       if (secondLargest == Integer.MIN_VALUE) {
           return -1;
       }

       return secondLargest;
       
   }
   
   /**
    * This method checks if the input array is sorted in ascending order.
    * 
    * @param array the array to check
    * @return true if the array is sorted, false otherwise
    */
   public boolean isSorted(int[] array) {
	   if(array.length <= 1) {
		   return true;
	   }
       for(int i=0;i<array.length - 1;i++){
           if(array[i] > array[i + 1]){
               return false;
           }
       }
       
       return true;
       
   }
   
   /**
    * This method reverses an array.
    * 
    * @param array the array to reverse
    * @return a new array with elements in reverse order
    */
   public int[] reverseArray(int[] array) {
	   if(array.length < 1) {
		   return array;
	   }
	   int start = 0;
	   int end = array.length - 1;
	   int[] reversedArr = new int[array.length];
	   while(start <= end) {
		   reversedArr[start] = array[end];
		   reversedArr[end] = array[start];
		   start++;
		   end--;
	   }
	   return reversedArr;
	   
   }
   
   /**
    * This method returns all factors of a given number in an ArrayList.
    * 
    * @param number the number to find factors of
    * @return a List of factors of the number
    */
   public List<Integer> determineAllFactors(int number) {
	   List<Integer> factors = new ArrayList<>();
       if(number <= 0){
           return factors;
       }
       
       int count = 1;
       
       while(count <= number){
           if(number % count == 0){
               factors.add(count);
           }
           
           count++;
       }
       return factors;
   }
   
   /**
    * This method generates a list of multiples of a given number less than a specified limit.
    * 
    * @param number the number to find multiples of
    * @param limit the upper bound for the multiples
    * @return a List of multiples of the number less than the limit
    */
   public List<Integer> determineMultiples(int number, int limit) {
       
       List<Integer> multiples = new ArrayList<>();
       if(number <= 0 || limit <= 0){
           return multiples;
       }
       int count = 1;
       int multiple;
        while(count < limit){
           multiple = number * count;
           if(multiple >= limit){
               break;
           }
           multiples.add(multiple);
           count++;
       }
       return multiples;
   }
   
   /*
    * Word occurence in a sentence
    * 
    */
    
   public Map<String, Integer> wordCount(String sentence){
	   //An edge case; if the sentence is empty
	   if(sentence == null || sentence.equalsIgnoreCase("")) {
		   return new HashMap<String, Integer>();
	   }
	   //split the sentence into and array of words
	   String[] words = sentence.split(" ");
	   
	   //Map contains key-value pair with unique keys: We need to create a Map to match each word as key, to its count value 
	   Map<String, Integer> wordMap = new HashMap<>();
	   
	   //Looping through the array of words
	   for(String word: words) {
		   //Checking if the word already exists and get the count value using the word key
		   Integer occurence = wordMap.get(word);
		   //if the word key doesn't exist occurence value would be null, its first occurence should be 1
		   if(occurence == null) {
			   wordMap.put(word, 1);
		   }else {
			//if word key already exists, in
			   occurence +=  1;
			   wordMap.put(word, occurence);
		   }
	   }
	   return wordMap;
	   
	   
   }
   
   public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
   
   

   public boolean numericCheck(String strNum) {
       if (strNum == null) {
           return false; 
       }
       return pattern.matcher(strNum).matches();
   }
   
}
